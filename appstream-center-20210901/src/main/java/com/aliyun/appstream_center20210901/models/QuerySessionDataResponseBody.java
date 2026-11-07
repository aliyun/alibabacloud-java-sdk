// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QuerySessionDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NO_DATA</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("IndexData")
    public java.util.List<QuerySessionDataResponseBodyIndexData> indexData;

    /**
     * <strong>example:</strong>
     * <p>The parameter DateFormat is invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D4A13D91-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QuerySessionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionDataResponseBody self = new QuerySessionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySessionDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySessionDataResponseBody setIndexData(java.util.List<QuerySessionDataResponseBodyIndexData> indexData) {
        this.indexData = indexData;
        return this;
    }
    public java.util.List<QuerySessionDataResponseBodyIndexData> getIndexData() {
        return this.indexData;
    }

    public QuerySessionDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySessionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySessionDataResponseBodyIndexData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Hh")
        public String hh;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Mi")
        public String mi;

        /**
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("SessionCntMi")
        public Long sessionCntMi;

        /**
         * <strong>example:</strong>
         * <p>20261106</p>
         */
        @NameInMap("StatDate")
        public String statDate;

        public static QuerySessionDataResponseBodyIndexData build(java.util.Map<String, ?> map) throws Exception {
            QuerySessionDataResponseBodyIndexData self = new QuerySessionDataResponseBodyIndexData();
            return TeaModel.build(map, self);
        }

        public QuerySessionDataResponseBodyIndexData setHh(String hh) {
            this.hh = hh;
            return this;
        }
        public String getHh() {
            return this.hh;
        }

        public QuerySessionDataResponseBodyIndexData setMi(String mi) {
            this.mi = mi;
            return this;
        }
        public String getMi() {
            return this.mi;
        }

        public QuerySessionDataResponseBodyIndexData setSessionCntMi(Long sessionCntMi) {
            this.sessionCntMi = sessionCntMi;
            return this;
        }
        public Long getSessionCntMi() {
            return this.sessionCntMi;
        }

        public QuerySessionDataResponseBodyIndexData setStatDate(String statDate) {
            this.statDate = statDate;
            return this;
        }
        public String getStatDate() {
            return this.statDate;
        }

    }

}
