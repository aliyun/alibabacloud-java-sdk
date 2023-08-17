// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryWabaBusinessInfoResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business information about the WABA.</p>
     */
    @NameInMap("Data")
    public QueryWabaBusinessInfoResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryWabaBusinessInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWabaBusinessInfoResponseBody self = new QueryWabaBusinessInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWabaBusinessInfoResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryWabaBusinessInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryWabaBusinessInfoResponseBody setData(QueryWabaBusinessInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryWabaBusinessInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryWabaBusinessInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryWabaBusinessInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryWabaBusinessInfoResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the business platform.</p>
         */
        @NameInMap("BusinessId")
        public String businessId;

        /**
         * <p>The name of the business platform.</p>
         */
        @NameInMap("BusinessName")
        public String businessName;

        /**
         * <p>The verification status.</p>
         */
        @NameInMap("VerificationStatus")
        public String verificationStatus;

        /**
         * <p>The industry.</p>
         */
        @NameInMap("Vertical")
        public String vertical;

        public static QueryWabaBusinessInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryWabaBusinessInfoResponseBodyData self = new QueryWabaBusinessInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryWabaBusinessInfoResponseBodyData setBusinessId(String businessId) {
            this.businessId = businessId;
            return this;
        }
        public String getBusinessId() {
            return this.businessId;
        }

        public QueryWabaBusinessInfoResponseBodyData setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public QueryWabaBusinessInfoResponseBodyData setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

        public QueryWabaBusinessInfoResponseBodyData setVertical(String vertical) {
            this.vertical = vertical;
            return this;
        }
        public String getVertical() {
            return this.vertical;
        }

    }

}
