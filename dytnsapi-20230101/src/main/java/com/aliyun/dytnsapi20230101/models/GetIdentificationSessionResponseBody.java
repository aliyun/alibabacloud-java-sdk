// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class GetIdentificationSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetIdentificationSessionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD******177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIdentificationSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentificationSessionResponseBody self = new GetIdentificationSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentificationSessionResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetIdentificationSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIdentificationSessionResponseBody setData(GetIdentificationSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIdentificationSessionResponseBodyData getData() {
        return this.data;
    }

    public GetIdentificationSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIdentificationSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIdentificationSessionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static GetIdentificationSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIdentificationSessionResponseBodyData self = new GetIdentificationSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIdentificationSessionResponseBodyData setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public GetIdentificationSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
