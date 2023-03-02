// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryPartnerProduceListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Long currentPageNum;

    @NameInMap("Data")
    public java.util.List<QueryPartnerProduceListResponseBodyData> data;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Long totalItemNum;

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
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizType")
        public String bizType;

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
