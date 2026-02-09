// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetPluginAttachmentResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response payload.</p>
     */
    @NameInMap("data")
    public GetPluginAttachmentResponseBodyData data;

    /**
     * <p>The status message.</p>
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
     * <p>C61E30D3-579A-5B43-994E-31E02EDC9129</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetPluginAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPluginAttachmentResponseBody self = new GetPluginAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPluginAttachmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPluginAttachmentResponseBody setData(GetPluginAttachmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPluginAttachmentResponseBodyData getData() {
        return this.data;
    }

    public GetPluginAttachmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPluginAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPluginAttachmentResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the plug-in is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The environment information.</p>
         */
        @NameInMap("environmentInfo")
        public EnvironmentInfo environmentInfo;

        /**
         * <p>The instance information.</p>
         */
        @NameInMap("gatewayInfo")
        public GatewayInfo gatewayInfo;

        /**
         * <p>The information about the parent resource to which the plug-in is attached.</p>
         */
        @NameInMap("parentResourceInfo")
        public ParentResourceInfo parentResourceInfo;

        /**
         * <p>The attachment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-d05f1tmm1hku195dd8j0</p>
         */
        @NameInMap("pluginAttachmentId")
        public String pluginAttachmentId;

        /**
         * <p>The plug-in type information.</p>
         */
        @NameInMap("pluginClassInfo")
        public PluginClassInfo pluginClassInfo;

        /**
         * <p>The Base64-encoded configurations of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>cHJlcGVuZDoKLSByb2xlOiBzeXN0ZW0KICBjb250ZW50OiDor7fkvb/nlKjoi7Hor63lm57nrZTpl67popgKYXBwZW5kOgotIHJvbGU6IHVzZXIKICBjb250ZW50OiDmr4/mrKHlm57nrZTlrozpl67popjvvIzlsJ3or5Xov5vooYzlj43pl64K</p>
         */
        @NameInMap("pluginConfig")
        public String pluginConfig;

        /**
         * <p>The plug-in ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-cvo8ub6m1hkvgv03r3k0</p>
         */
        @NameInMap("pluginId")
        public String pluginId;

        /**
         * <p>The resource information.</p>
         */
        @NameInMap("resourceInfos")
        public java.util.List<ResourceInfo> resourceInfos;

        public static GetPluginAttachmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPluginAttachmentResponseBodyData self = new GetPluginAttachmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPluginAttachmentResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetPluginAttachmentResponseBodyData setEnvironmentInfo(EnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }
        public EnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        public GetPluginAttachmentResponseBodyData setGatewayInfo(GatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }
        public GatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        public GetPluginAttachmentResponseBodyData setParentResourceInfo(ParentResourceInfo parentResourceInfo) {
            this.parentResourceInfo = parentResourceInfo;
            return this;
        }
        public ParentResourceInfo getParentResourceInfo() {
            return this.parentResourceInfo;
        }

        public GetPluginAttachmentResponseBodyData setPluginAttachmentId(String pluginAttachmentId) {
            this.pluginAttachmentId = pluginAttachmentId;
            return this;
        }
        public String getPluginAttachmentId() {
            return this.pluginAttachmentId;
        }

        public GetPluginAttachmentResponseBodyData setPluginClassInfo(PluginClassInfo pluginClassInfo) {
            this.pluginClassInfo = pluginClassInfo;
            return this;
        }
        public PluginClassInfo getPluginClassInfo() {
            return this.pluginClassInfo;
        }

        public GetPluginAttachmentResponseBodyData setPluginConfig(String pluginConfig) {
            this.pluginConfig = pluginConfig;
            return this;
        }
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        public GetPluginAttachmentResponseBodyData setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public GetPluginAttachmentResponseBodyData setResourceInfos(java.util.List<ResourceInfo> resourceInfos) {
            this.resourceInfos = resourceInfos;
            return this;
        }
        public java.util.List<ResourceInfo> getResourceInfos() {
            return this.resourceInfos;
        }

    }

}
