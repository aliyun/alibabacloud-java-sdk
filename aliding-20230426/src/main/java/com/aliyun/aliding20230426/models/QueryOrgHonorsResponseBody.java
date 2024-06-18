// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryOrgHonorsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("openHonors")
    public java.util.List<QueryOrgHonorsResponseBodyOpenHonors> openHonors;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryOrgHonorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrgHonorsResponseBody self = new QueryOrgHonorsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrgHonorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryOrgHonorsResponseBody setOpenHonors(java.util.List<QueryOrgHonorsResponseBodyOpenHonors> openHonors) {
        this.openHonors = openHonors;
        return this;
    }
    public java.util.List<QueryOrgHonorsResponseBodyOpenHonors> getOpenHonors() {
        return this.openHonors;
    }

    public QueryOrgHonorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryOrgHonorsResponseBodyOpenHonors extends TeaModel {
        @NameInMap("honorDesc")
        public String honorDesc;

        /**
         * <strong>example:</strong>
         * <p>21658579</p>
         */
        @NameInMap("honorId")
        public Long honorId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxx.ali-cdn.com/jfejfi.jpg">https://xxxx.ali-cdn.com/jfejfi.jpg</a></p>
         */
        @NameInMap("honorImgUrl")
        public String honorImgUrl;

        @NameInMap("honorName")
        public String honorName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxx.ali-cdn.com/jfejfi.jpg">https://xxxx.ali-cdn.com/jfejfi.jpg</a></p>
         */
        @NameInMap("honorPendantImgUrl")
        public String honorPendantImgUrl;

        public static QueryOrgHonorsResponseBodyOpenHonors build(java.util.Map<String, ?> map) throws Exception {
            QueryOrgHonorsResponseBodyOpenHonors self = new QueryOrgHonorsResponseBodyOpenHonors();
            return TeaModel.build(map, self);
        }

        public QueryOrgHonorsResponseBodyOpenHonors setHonorDesc(String honorDesc) {
            this.honorDesc = honorDesc;
            return this;
        }
        public String getHonorDesc() {
            return this.honorDesc;
        }

        public QueryOrgHonorsResponseBodyOpenHonors setHonorId(Long honorId) {
            this.honorId = honorId;
            return this;
        }
        public Long getHonorId() {
            return this.honorId;
        }

        public QueryOrgHonorsResponseBodyOpenHonors setHonorImgUrl(String honorImgUrl) {
            this.honorImgUrl = honorImgUrl;
            return this;
        }
        public String getHonorImgUrl() {
            return this.honorImgUrl;
        }

        public QueryOrgHonorsResponseBodyOpenHonors setHonorName(String honorName) {
            this.honorName = honorName;
            return this;
        }
        public String getHonorName() {
            return this.honorName;
        }

        public QueryOrgHonorsResponseBodyOpenHonors setHonorPendantImgUrl(String honorPendantImgUrl) {
            this.honorPendantImgUrl = honorPendantImgUrl;
            return this;
        }
        public String getHonorPendantImgUrl() {
            return this.honorPendantImgUrl;
        }

    }

}
