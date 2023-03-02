// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryPartnerIntentionListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Long currentPageNum;

    @NameInMap("Data")
    public java.util.List<QueryPartnerIntentionListResponseBodyData> data;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Long totalItemNum;

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
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizType")
        public String bizType;

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
