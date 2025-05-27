// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class CreateLabSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("LabSession")
    public CreateLabSessionResponseBodyLabSession labSession;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9ADC729B-...</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateLabSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLabSessionResponseBody self = new CreateLabSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLabSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLabSessionResponseBody setLabSession(CreateLabSessionResponseBodyLabSession labSession) {
        this.labSession = labSession;
        return this;
    }
    public CreateLabSessionResponseBodyLabSession getLabSession() {
        return this.labSession;
    }

    public CreateLabSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLabSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLabSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateLabSessionResponseBodyLabSession extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>875</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Url")
        public String url;

        public static CreateLabSessionResponseBodyLabSession build(java.util.Map<String, ?> map) throws Exception {
            CreateLabSessionResponseBodyLabSession self = new CreateLabSessionResponseBodyLabSession();
            return TeaModel.build(map, self);
        }

        public CreateLabSessionResponseBodyLabSession setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateLabSessionResponseBodyLabSession setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
