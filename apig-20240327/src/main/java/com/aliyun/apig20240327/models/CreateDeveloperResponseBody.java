// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateDeveloperResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public CreateDeveloperResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateDeveloperResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeveloperResponseBody self = new CreateDeveloperResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeveloperResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDeveloperResponseBody setData(CreateDeveloperResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDeveloperResponseBodyData getData() {
        return this.data;
    }

    public CreateDeveloperResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDeveloperResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDeveloperResponseBodyData extends TeaModel {
        /**
         * <p>The developer ID. You can use this ID to locate the developer in API operations such as SetHiMarketDeveloperStatus and DeleteHiMarketDeveloper.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-xxxxxxxx</p>
         */
        @NameInMap("developerId")
        public String developerId;

        public static CreateDeveloperResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeveloperResponseBodyData self = new CreateDeveloperResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDeveloperResponseBodyData setDeveloperId(String developerId) {
            this.developerId = developerId;
            return this;
        }
        public String getDeveloperId() {
            return this.developerId;
        }

    }

}
