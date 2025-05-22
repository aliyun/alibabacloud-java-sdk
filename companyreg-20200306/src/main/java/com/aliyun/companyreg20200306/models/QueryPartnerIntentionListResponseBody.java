// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryPartnerIntentionListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CurrentPageNum")
    public Long currentPageNum;

    @NameInMap("Data")
    public java.util.List<QueryPartnerIntentionListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>78E9DC76-7DFD-5975-99B0-4A95E8A92F5D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>319</p>
     */
    @NameInMap("TotalItemNum")
    public Long totalItemNum;

    /**
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("TotalPageNum")
    public Long totalPageNum;

    public static QueryPartnerIntentionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPartnerIntentionListResponseBody self = new QueryPartnerIntentionListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPartnerIntentionListResponseBody setCurrentPageNum(Long currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Long getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryPartnerIntentionListResponseBody setData(java.util.List<QueryPartnerIntentionListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryPartnerIntentionListResponseBodyData> getData() {
        return this.data;
    }

    public QueryPartnerIntentionListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryPartnerIntentionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPartnerIntentionListResponseBody setTotalItemNum(Long totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Long getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryPartnerIntentionListResponseBody setTotalPageNum(Long totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Long getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryPartnerIntentionListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>I20211117092704000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <strong>example:</strong>
         * <p>esp.wangwen</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <strong>example:</strong>
         * <p>18700000003</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        public static QueryPartnerIntentionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPartnerIntentionListResponseBodyData self = new QueryPartnerIntentionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPartnerIntentionListResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryPartnerIntentionListResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryPartnerIntentionListResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

    }

}
