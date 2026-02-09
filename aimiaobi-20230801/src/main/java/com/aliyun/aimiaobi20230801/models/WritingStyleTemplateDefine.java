// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class WritingStyleTemplateDefine extends TeaModel {
    @NameInMap("Example")
    public java.util.List<WritingStyleTemplateDefineExample> example;

    @NameInMap("Fields")
    public java.util.List<WritingStyleTemplateField> fields;

    public static WritingStyleTemplateDefine build(java.util.Map<String, ?> map) throws Exception {
        WritingStyleTemplateDefine self = new WritingStyleTemplateDefine();
        return TeaModel.build(map, self);
    }

    public WritingStyleTemplateDefine setExample(java.util.List<WritingStyleTemplateDefineExample> example) {
        this.example = example;
        return this;
    }
    public java.util.List<WritingStyleTemplateDefineExample> getExample() {
        return this.example;
    }

    public WritingStyleTemplateDefine setFields(java.util.List<WritingStyleTemplateField> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<WritingStyleTemplateField> getFields() {
        return this.fields;
    }

    public static class WritingStyleTemplateDefineExample extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>topic</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Value")
        public String value;

        public static WritingStyleTemplateDefineExample build(java.util.Map<String, ?> map) throws Exception {
            WritingStyleTemplateDefineExample self = new WritingStyleTemplateDefineExample();
            return TeaModel.build(map, self);
        }

        public WritingStyleTemplateDefineExample setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public WritingStyleTemplateDefineExample setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
