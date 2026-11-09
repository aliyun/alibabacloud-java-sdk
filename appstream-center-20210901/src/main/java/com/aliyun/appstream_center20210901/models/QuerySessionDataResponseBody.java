// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QuerySessionDataResponseBody extends TeaModel {
    /**
     * <p>The return code. This parameter is empty if the request is successful and data is found. If the query result is empty, NO_DATA is returned. If the request fails, the corresponding error code is returned. For example, if the format of the statistical parameter is invalid, InvalidParameter.DateFormat is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>NO_DATA</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of session trend data, sorted in ascending order by hour and minute. If there is no session data on the specified date, an empty array is returned, and the return code is NO_DATA.</p>
     */
    @NameInMap("IndexData")
    public java.util.List<QuerySessionDataResponseBodyIndexData> indexData;

    /**
     * <p>The return message. This parameter is empty if the request is successful. If the request fails, the corresponding error description is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter DateFormat is invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, used to locate call records and troubleshoot issues. The example value is partially desensitized.</p>
     * 
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
         * <p>The hour to which the session data belongs. Valid values: 00 to 23 (full hours).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Hh")
        public String hh;

        /**
         * <p>The minute to which the session data belongs, aggregated in 10-minute intervals. Valid values: 00 to 50 (specifically 00, 10, 20, 30, 40, and 50).</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Mi")
        public String mi;

        /**
         * <p>The total number of sessions within the hour and minute interval (10-minute granularity).</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("SessionCntMi")
        public Long sessionCntMi;

        /**
         * <p>The statistical date to which the session data belongs, in the yyyyMMdd format, which is the same as the StatDate request parameter.</p>
         * 
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
