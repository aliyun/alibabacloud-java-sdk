// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryPartnerProduceListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPageNum")
    public Long currentPageNum;

    @NameInMap("Data")
    public java.util.List<QueryPartnerProduceListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>1A13ABB5-7649-5031-B55C-D2E38F9F189D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>34</p>
     */
    @NameInMap("TotalItemNum")
    public Long totalItemNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPageNum")
    public Long totalPageNum;

    public static QueryPartnerProduceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPartnerProduceListResponseBody self = new QueryPartnerProduceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPartnerProduceListResponseBody setCurrentPageNum(Long currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Long getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryPartnerProduceListResponseBody setData(java.util.List<QueryPartnerProduceListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryPartnerProduceListResponseBodyData> getData() {
        return this.data;
    }

    public QueryPartnerProduceListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryPartnerProduceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPartnerProduceListResponseBody setTotalItemNum(Long totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Long getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryPartnerProduceListResponseBody setTotalPageNum(Long totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Long getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryPartnerProduceListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>P20211216204717000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>esp.cdn</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <strong>example:</strong>
         * <p>18600000001</p>
         */
        @NameInMap("mobile")
        public String mobile;

        public static QueryPartnerProduceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPartnerProduceListResponseBodyData self = new QueryPartnerProduceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPartnerProduceListResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryPartnerProduceListResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryPartnerProduceListResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

    }

}
