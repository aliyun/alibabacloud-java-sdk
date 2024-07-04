// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateIndexResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Forbidden</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateIndexResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Invalid input, variable name is missing</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-7734-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexResponseBody self = new CreateIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIndexResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateIndexResponseBody setData(CreateIndexResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateIndexResponseBodyData getData() {
        return this.data;
    }

    public CreateIndexResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIndexResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateIndexResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateIndexResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>jkurxhju6b</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateIndexResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexResponseBodyData self = new CreateIndexResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateIndexResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
