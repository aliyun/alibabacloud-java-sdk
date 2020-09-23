// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterTagsRequest extends TeaModel {
    // 标签列表。
    @NameInMap("body")
    public java.util.List<ModifyClusterTagsRequestBody> body;

    public static ModifyClusterTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterTagsRequest self = new ModifyClusterTagsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterTagsRequest setBody(java.util.List<ModifyClusterTagsRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ModifyClusterTagsRequestBody> getBody() {
        return this.body;
    }

    public static class ModifyClusterTagsRequestBody extends TeaModel {
        // 标签名。
        @NameInMap("key")
        public String key;

        // 标签值
        @NameInMap("value")
        public String value;

        public static ModifyClusterTagsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterTagsRequestBody self = new ModifyClusterTagsRequestBody();
            return TeaModel.build(map, self);
        }

        public ModifyClusterTagsRequestBody setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyClusterTagsRequestBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
