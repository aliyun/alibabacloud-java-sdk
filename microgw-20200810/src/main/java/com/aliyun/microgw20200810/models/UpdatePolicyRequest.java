// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdatePolicyRequest extends TeaModel {
    // PolicyUpdateDTO
    @NameInMap("data")
    public UpdatePolicyRequestData data;

    public static UpdatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyRequest self = new UpdatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyRequest setData(UpdatePolicyRequestData data) {
        this.data = data;
        return this;
    }
    public UpdatePolicyRequestData getData() {
        return this.data;
    }

    public static class UpdatePolicyRequestData extends TeaModel {
        // aliasName
        @NameInMap("aliasName")
        public String aliasName;

        // content
        @NameInMap("content")
        public String content;

        // id
        @NameInMap("id")
        public Long id;

        // name
        @NameInMap("name")
        public String name;

        // policyGroup
        @NameInMap("policyGroup")
        public String policyGroup;

        // type
        @NameInMap("type")
        public Long type;

        public static UpdatePolicyRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolicyRequestData self = new UpdatePolicyRequestData();
            return TeaModel.build(map, self);
        }

        public UpdatePolicyRequestData setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public UpdatePolicyRequestData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdatePolicyRequestData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdatePolicyRequestData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdatePolicyRequestData setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public UpdatePolicyRequestData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
