// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ConvertFlowDSLInput extends TeaModel {
    /**
     * <p>工作流DSL的来源配置，支持inline和base64两种格式</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dslSource")
    public ConvertFlowDSLInputDslSource dslSource;

    /**
     * <p>DSL转换的可选配置参数</p>
     */
    @NameInMap("options")
    public ConvertFlowDSLInputOptions options;

    public static ConvertFlowDSLInput build(java.util.Map<String, ?> map) throws Exception {
        ConvertFlowDSLInput self = new ConvertFlowDSLInput();
        return TeaModel.build(map, self);
    }

    public ConvertFlowDSLInput setDslSource(ConvertFlowDSLInputDslSource dslSource) {
        this.dslSource = dslSource;
        return this;
    }
    public ConvertFlowDSLInputDslSource getDslSource() {
        return this.dslSource;
    }

    public ConvertFlowDSLInput setOptions(ConvertFlowDSLInputOptions options) {
        this.options = options;
        return this;
    }
    public ConvertFlowDSLInputOptions getOptions() {
        return this.options;
    }

    public static class ConvertFlowDSLInputDslSource extends TeaModel {
        /**
         * <p>DSL内容，可以是原始JSON字符串，或根据encoding字段指定的编码格式</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;app&quot;:{&quot;name&quot;:&quot;My Flow&quot;}}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>DSL内容的编码方式。不填表示内容为原始字符串；base64表示内容经过Base64编码；base64+gzip表示内容经过gzip压缩后再Base64编码</p>
         * 
         * <strong>example:</strong>
         * <p>base64</p>
         */
        @NameInMap("encoding")
        public String encoding;

        /**
         * <p>源DSL的提供商类型，如：dify、n8n、zapier等</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dify</p>
         */
        @NameInMap("provider")
        public String provider;

        public static ConvertFlowDSLInputDslSource build(java.util.Map<String, ?> map) throws Exception {
            ConvertFlowDSLInputDslSource self = new ConvertFlowDSLInputDslSource();
            return TeaModel.build(map, self);
        }

        public ConvertFlowDSLInputDslSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ConvertFlowDSLInputDslSource setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public ConvertFlowDSLInputDslSource setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

    }

    public static class ConvertFlowDSLInputOptions extends TeaModel {
        /**
         * <p>是否执行兼容性检查，默认为true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("compatibilityCheck")
        public Boolean compatibilityCheck;

        public static ConvertFlowDSLInputOptions build(java.util.Map<String, ?> map) throws Exception {
            ConvertFlowDSLInputOptions self = new ConvertFlowDSLInputOptions();
            return TeaModel.build(map, self);
        }

        public ConvertFlowDSLInputOptions setCompatibilityCheck(Boolean compatibilityCheck) {
            this.compatibilityCheck = compatibilityCheck;
            return this;
        }
        public Boolean getCompatibilityCheck() {
            return this.compatibilityCheck;
        }

    }

}
