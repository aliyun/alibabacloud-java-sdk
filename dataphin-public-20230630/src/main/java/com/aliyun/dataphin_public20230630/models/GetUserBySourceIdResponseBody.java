// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUserBySourceIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("User")
    public GetUserBySourceIdResponseBodyUser user;

    public static GetUserBySourceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserBySourceIdResponseBody self = new GetUserBySourceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserBySourceIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserBySourceIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserBySourceIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserBySourceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserBySourceIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserBySourceIdResponseBody setUser(GetUserBySourceIdResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserBySourceIdResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetUserBySourceIdResponseBodyUser extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>23231231</p>
         */
        @NameInMap("Id")
        public String id;

        public static GetUserBySourceIdResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserBySourceIdResponseBodyUser self = new GetUserBySourceIdResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserBySourceIdResponseBodyUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserBySourceIdResponseBodyUser setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
