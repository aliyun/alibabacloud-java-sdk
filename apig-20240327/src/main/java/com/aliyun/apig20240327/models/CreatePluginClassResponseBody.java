// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePluginClassResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public CreatePluginClassResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>880F8DC9-1CD9-5A83-AA54-AD2D3B7D2466</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreatePluginClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginClassResponseBody self = new CreatePluginClassResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePluginClassResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePluginClassResponseBody setData(CreatePluginClassResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePluginClassResponseBodyData getData() {
        return this.data;
    }

    public CreatePluginClassResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePluginClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePluginClassResponseBodyData extends TeaModel {
        /**
         * <p>The plugin class ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pls-csqmjxxxxxxx</p>
         */
        @NameInMap("pluginClassId")
        public String pluginClassId;

        public static CreatePluginClassResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePluginClassResponseBodyData self = new CreatePluginClassResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePluginClassResponseBodyData setPluginClassId(String pluginClassId) {
            this.pluginClassId = pluginClassId;
            return this;
        }
        public String getPluginClassId() {
            return this.pluginClassId;
        }

    }

}
