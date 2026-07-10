// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryVerifyInvokeSatisticResponseBody extends TeaModel {
    /**
     * <p>The response code. <strong>200</strong> indicates a successful response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The list of returned data.</p>
     */
    @NameInMap("Items")
    public java.util.List<QueryVerifyInvokeSatisticResponseBodyItems> items;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2FA2C773-47DB-4156-B1EE-5B047321A939</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the response is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static QueryVerifyInvokeSatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVerifyInvokeSatisticResponseBody self = new QueryVerifyInvokeSatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVerifyInvokeSatisticResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVerifyInvokeSatisticResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryVerifyInvokeSatisticResponseBody setItems(java.util.List<QueryVerifyInvokeSatisticResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<QueryVerifyInvokeSatisticResponseBodyItems> getItems() {
        return this.items;
    }

    public QueryVerifyInvokeSatisticResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryVerifyInvokeSatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVerifyInvokeSatisticResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryVerifyInvokeSatisticResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryVerifyInvokeSatisticResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class QueryVerifyInvokeSatisticResponseBodyItemsData extends TeaModel {
        /**
         * <p>The count of the statistical value.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("StatisticsCount")
        public String statisticsCount;

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        @NameInMap("StatisticsType")
        public String statisticsType;

        public static QueryVerifyInvokeSatisticResponseBodyItemsData build(java.util.Map<String, ?> map) throws Exception {
            QueryVerifyInvokeSatisticResponseBodyItemsData self = new QueryVerifyInvokeSatisticResponseBodyItemsData();
            return TeaModel.build(map, self);
        }

        public QueryVerifyInvokeSatisticResponseBodyItemsData setStatisticsCount(String statisticsCount) {
            this.statisticsCount = statisticsCount;
            return this;
        }
        public String getStatisticsCount() {
            return this.statisticsCount;
        }

        public QueryVerifyInvokeSatisticResponseBodyItemsData setStatisticsType(String statisticsType) {
            this.statisticsType = statisticsType;
            return this;
        }
        public String getStatisticsType() {
            return this.statisticsType;
        }

    }

    public static class QueryVerifyInvokeSatisticResponseBodyItems extends TeaModel {
        /**
         * <p>The list of statistics data.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryVerifyInvokeSatisticResponseBodyItemsData> data;

        /**
         * <p>The statistics date.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16</p>
         */
        @NameInMap("StatisticsDate")
        public String statisticsDate;

        public static QueryVerifyInvokeSatisticResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            QueryVerifyInvokeSatisticResponseBodyItems self = new QueryVerifyInvokeSatisticResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public QueryVerifyInvokeSatisticResponseBodyItems setData(java.util.List<QueryVerifyInvokeSatisticResponseBodyItemsData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryVerifyInvokeSatisticResponseBodyItemsData> getData() {
            return this.data;
        }

        public QueryVerifyInvokeSatisticResponseBodyItems setStatisticsDate(String statisticsDate) {
            this.statisticsDate = statisticsDate;
            return this;
        }
        public String getStatisticsDate() {
            return this.statisticsDate;
        }

    }

}
