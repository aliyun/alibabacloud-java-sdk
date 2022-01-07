// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSQLReviewOriginSQLRequest extends TeaModel {
    @NameInMap("OrderActionDetail")
    public ListSQLReviewOriginSQLRequestOrderActionDetail orderActionDetail;

    @NameInMap("OrderId")
    public Long orderId;

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
        @NameInMap("PageNumber")
        public Integer pageNumber;

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
        @NameInMap("CheckStatusResult")
        public String checkStatusResult;

        @NameInMap("FileId")
        public Long fileId;

        @NameInMap("Page")
        public ListSQLReviewOriginSQLRequestOrderActionDetailPage page;

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
