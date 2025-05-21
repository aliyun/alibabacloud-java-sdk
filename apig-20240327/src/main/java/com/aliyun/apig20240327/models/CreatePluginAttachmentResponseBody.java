// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePluginAttachmentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreatePluginAttachmentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EBCB8485-24F9-54CD-B258-CB15FDB27677</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreatePluginAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginAttachmentResponseBody self = new CreatePluginAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePluginAttachmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePluginAttachmentResponseBody setData(CreatePluginAttachmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePluginAttachmentResponseBodyData getData() {
        return this.data;
    }

    public CreatePluginAttachmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePluginAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePluginAttachmentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pa-cvs7jpmm1hkgihaqv4a0</p>
         */
        @NameInMap("pluginAttachmentId")
        public String pluginAttachmentId;

        public static CreatePluginAttachmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePluginAttachmentResponseBodyData self = new CreatePluginAttachmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePluginAttachmentResponseBodyData setPluginAttachmentId(String pluginAttachmentId) {
            this.pluginAttachmentId = pluginAttachmentId;
            return this;
        }
        public String getPluginAttachmentId() {
            return this.pluginAttachmentId;
        }

    }

}
