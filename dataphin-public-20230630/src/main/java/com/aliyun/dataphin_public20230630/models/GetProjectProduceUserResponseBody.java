// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetProjectProduceUserResponseBody extends TeaModel {
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
    public GetProjectProduceUserResponseBodyUser user;

    public static GetProjectProduceUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectProduceUserResponseBody self = new GetProjectProduceUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectProduceUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProjectProduceUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetProjectProduceUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProjectProduceUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectProduceUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetProjectProduceUserResponseBody setUser(GetProjectProduceUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetProjectProduceUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetProjectProduceUserResponseBodyUser extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123131</p>
         */
        @NameInMap("Id")
        public String id;

        public static GetProjectProduceUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetProjectProduceUserResponseBodyUser self = new GetProjectProduceUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetProjectProduceUserResponseBodyUser setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
