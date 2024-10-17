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
     * <p>The ID of the SQL review ticket. You can call the <a href="https://help.aliyun.com/document_detail/257777.html">CreateSQLReviewOrder</a> operation to query the ticket ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123321</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The tenant ID. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * <ul>
         * <li><strong>new</strong>: The SQL statement was waiting to be reviewed.</li>
         * <li><strong>unknown</strong>: The SQL statement cannot be parsed.</li>
         * <li><strong>check_not_pass</strong>: The SQL statement failed to pass the review.</li>
         * <li><strong>check_pass</strong>: The SQL statement passed the review.</li>
         * <li><strong>force_pass</strong>: The SQL statement passed the manual review.</li>
         * <li><strong>force_not_pass</strong>: The SQL statement failed to pass the manual review.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>check_not_pass</p>
         */
        @NameInMap("CheckStatusResult")
        public String checkStatusResult;

        /**
         * <p>The ID of the file that contains the SQL statements to be reviewed.</p>
         * 
         * <strong>example:</strong>
         * <p>123345</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("Page")
        public ListSQLReviewOriginSQLRequestOrderActionDetailPage page;

        /**
         * <p>The optimization suggestion for the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>MUST_IMPROVE</strong>: The SQL statement must be optimized.</li>
         * <li><strong>POTENTIAL_ISSUE</strong>: The SQL statement contains potential issues.</li>
         * <li><strong>SUGGEST_IMPROVE</strong>: We recommend that you optimize the SQL statement.</li>
         * <li><strong>USE_DMS_TOOLKIT</strong>: We recommend that you change schemas without locking tables.</li>
         * <li><strong>USE_DMS_DML_UNLOCK</strong>: We recommend that you change data without locking tables.</li>
         * <li><strong>TABLE_INDEX_SUGGEST</strong>: We recommend that you optimize indexes for the SQL statement.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MUST_IMPROVE</p>
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
