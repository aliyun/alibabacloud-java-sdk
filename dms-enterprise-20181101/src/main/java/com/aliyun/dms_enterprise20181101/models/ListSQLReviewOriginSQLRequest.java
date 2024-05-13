// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLReviewOriginSQLRequest extends TeaModel {
    /**
     * <p>The parameters that are used to filter SQL statements involved in the ticket.</p>
     */
    @NameInMap("OrderActionDetail")
    public ListSQLReviewOriginSQLRequestOrderActionDetail orderActionDetail;

    /**
     * <p>The ID of the ticket for the SQL review. You can call the [CreateSQLReviewOrder](https://help.aliyun.com/document_detail/257777.html) operation to query the ID of the ticket.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/465818.html) operation to query the ID of the tenant.</p>
     */
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
        /**
         * <p>The number of the page to return.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries to return on each page.</p>
         */
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
        /**
         * <p>The review status of the SQL statement. Valid values:</p>
         * <br>
         * <p>*   **new**: The SQL statement is pending for analysis.</p>
         * <p>*   **unknown**: The SQL statement failed to be parsed.</p>
         * <p>*   **check_not_pass**: The SQL statement failed the review.</p>
         * <p>*   **check_pass**: The SQL statement passed the review.</p>
         * <p>*   **force_pass**: The SQL statement passed the review by manual effort.</p>
         * <p>*   **force_not_pass**: The SQL statement failed the review by manual effort.</p>
         */
        @NameInMap("CheckStatusResult")
        public String checkStatusResult;

        /**
         * <p>The ID of the file.</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The paging settings.</p>
         */
        @NameInMap("Page")
        public ListSQLReviewOriginSQLRequestOrderActionDetailPage page;

        /**
         * <p>The optimization suggestion for the SQL statement. Valid values:</p>
         * <br>
         * <p>*   **MUST_IMPROVE**: The SQL statement must be improved.</p>
         * <p>*   **POTENTIAL_ISSUE**: The SQL statement contains potential issues.</p>
         * <p>*   **SUGGEST_IMPROVE**: We recommend that you improve the SQL statement.</p>
         * <p>*   **USE_DMS_TOOLKIT**: We recommend that you change schemas without locking tables.</p>
         * <p>*   **USE_DMS_DML_UNLOCK**: We recommend that you change data without locking tables.</p>
         * <p>*   **TABLE_INDEX_SUGGEST**: We recommend that you use SQL statements that use indexes.</p>
         */
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
