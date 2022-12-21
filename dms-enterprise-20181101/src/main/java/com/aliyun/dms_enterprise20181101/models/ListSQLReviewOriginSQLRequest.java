// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLReviewOriginSQLRequest extends TeaModel {
    // The parameters that are used to filter SQL statements involved in the ticket.
    @NameInMap("OrderActionDetail")
    public ListSQLReviewOriginSQLRequestOrderActionDetail orderActionDetail;

    // The ID of the ticket for the SQL review. You can call the [CreateSQLReviewOrder](~~257777~~) operation to query the ID of the ticket.
    @NameInMap("OrderId")
    public Long orderId;

    // The ID of the tenant. You can call the [GetUserActiveTenant](https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant) or [ListUserTenants](https://www.alibabacloud.com/help/en/data-management-service/latest/listusertenants) operation to query the ID of the tenant.
    @NameInMap("Tid")
    public Long tid;

    public static ListSQLReviewOriginSQLRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSQLReviewOriginSQLRequest self = new ListSQLReviewOriginSQLRequest();
        return TeaModel.build(map, self);
    }

    public ListSQLReviewOriginSQLRequest setOrderActionDetail(ListSQLReviewOriginSQLRequestOrderActionDetail orderActionDetail) {
        this.orderActionDetail = orderActionDetail;
        return this;
    }
    public ListSQLReviewOriginSQLRequestOrderActionDetail getOrderActionDetail() {
        return this.orderActionDetail;
    }

    public ListSQLReviewOriginSQLRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ListSQLReviewOriginSQLRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class ListSQLReviewOriginSQLRequestOrderActionDetailPage extends TeaModel {
        // The number of the page to return.
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // The number of entries to return on each page.
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListSQLReviewOriginSQLRequestOrderActionDetailPage build(java.util.Map<String, ?> map) throws Exception {
            ListSQLReviewOriginSQLRequestOrderActionDetailPage self = new ListSQLReviewOriginSQLRequestOrderActionDetailPage();
            return TeaModel.build(map, self);
        }

        public ListSQLReviewOriginSQLRequestOrderActionDetailPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSQLReviewOriginSQLRequestOrderActionDetailPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListSQLReviewOriginSQLRequestOrderActionDetail extends TeaModel {
        // The review status of the SQL statement. Valid values:
        // 
        // *   **new**: The SQL statement is pending for analysis.
        // *   **unknown**: The SQL statement failed to be parsed.
        // *   **check_not_pass**: The SQL statement failed the review.
        // *   **check_pass**: The SQL statement passed the review.
        // *   **force_pass**: The SQL statement passed the review by manual effort.
        // *   **force_not_pass**: The SQL statement failed the review by manual effort.
        @NameInMap("CheckStatusResult")
        public String checkStatusResult;

        // The ID of the file.
        @NameInMap("FileId")
        public Long fileId;

        // The paging settings.
        @NameInMap("Page")
        public ListSQLReviewOriginSQLRequestOrderActionDetailPage page;

        // The optimization suggestion for the SQL statement. Valid values:
        // 
        // *   **MUST_IMPROVE**: The SQL statement must be improved.
        // *   **POTENTIAL_ISSUE**: The SQL statement contains potential issues.
        // *   **SUGGEST_IMPROVE**: We recommend that you improve the SQL statement.
        // *   **USE_DMS_TOOLKIT**: We recommend that you change schemas without locking tables.
        // *   **USE_DMS_DML_UNLOCK**: We recommend that you change data without locking tables.
        // *   **TABLE_INDEX_SUGGEST**: We recommend that you use SQL statements that use indexes.
        @NameInMap("SQLReviewResult")
        public String SQLReviewResult;

        public static ListSQLReviewOriginSQLRequestOrderActionDetail build(java.util.Map<String, ?> map) throws Exception {
            ListSQLReviewOriginSQLRequestOrderActionDetail self = new ListSQLReviewOriginSQLRequestOrderActionDetail();
            return TeaModel.build(map, self);
        }

        public ListSQLReviewOriginSQLRequestOrderActionDetail setCheckStatusResult(String checkStatusResult) {
            this.checkStatusResult = checkStatusResult;
            return this;
        }
        public String getCheckStatusResult() {
            return this.checkStatusResult;
        }

        public ListSQLReviewOriginSQLRequestOrderActionDetail setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public ListSQLReviewOriginSQLRequestOrderActionDetail setPage(ListSQLReviewOriginSQLRequestOrderActionDetailPage page) {
            this.page = page;
            return this;
        }
        public ListSQLReviewOriginSQLRequestOrderActionDetailPage getPage() {
            return this.page;
        }

        public ListSQLReviewOriginSQLRequestOrderActionDetail setSQLReviewResult(String SQLReviewResult) {
            this.SQLReviewResult = SQLReviewResult;
            return this;
        }
        public String getSQLReviewResult() {
            return this.SQLReviewResult;
        }

    }

}
