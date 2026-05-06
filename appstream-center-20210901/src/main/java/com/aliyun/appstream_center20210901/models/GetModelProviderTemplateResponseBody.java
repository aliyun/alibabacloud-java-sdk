// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetModelProviderTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetModelProviderTemplateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetModelProviderTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelProviderTemplateResponseBody self = new GetModelProviderTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelProviderTemplateResponseBody setData(GetModelProviderTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetModelProviderTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetModelProviderTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetModelProviderTemplateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;api&quot;: &quot;openai-completions&quot;,
         *     &quot;apiKey&quot;: &quot;sk-xxxx&quot;,
         *     &quot;baseUrl&quot;: &quot;<a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a>&quot;
         * }</p>
         */
        @NameInMap("Config")
        public String config;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableWuyingProxy")
        public Boolean enableWuyingProxy;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("ProviderName")
        public String providerName;

        /**
         * <strong>example:</strong>
         * <p>mpt-xxxx</p>
         */
        @NameInMap("ProviderTemplateId")
        public String providerTemplateId;

        public static GetModelProviderTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetModelProviderTemplateResponseBodyData self = new GetModelProviderTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetModelProviderTemplateResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetModelProviderTemplateResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetModelProviderTemplateResponseBodyData setEnableWuyingProxy(Boolean enableWuyingProxy) {
            this.enableWuyingProxy = enableWuyingProxy;
            return this;
        }
        public Boolean getEnableWuyingProxy() {
            return this.enableWuyingProxy;
        }

        public GetModelProviderTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetModelProviderTemplateResponseBodyData setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public GetModelProviderTemplateResponseBodyData setProviderTemplateId(String providerTemplateId) {
            this.providerTemplateId = providerTemplateId;
            return this;
        }
        public String getProviderTemplateId() {
            return this.providerTemplateId;
        }

    }

}
