// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePluginClassResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreatePluginClassResponseBodyData data;

    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
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
