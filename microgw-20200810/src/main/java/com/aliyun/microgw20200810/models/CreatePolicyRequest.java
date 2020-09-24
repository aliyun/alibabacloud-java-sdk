// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    // A short description of struct
    @NameInMap("data")
    public CreatePolicyRequestData data;

    public static CreatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyRequest self = new CreatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyRequest setData(CreatePolicyRequestData data) {
        this.data = data;
        return this;
    }
    public CreatePolicyRequestData getData() {
        return this.data;
    }

    public static class CreatePolicyRequestData extends TeaModel {
        // aliasName
        @NameInMap("aliasName")
        public String aliasName;

        // content
        @NameInMap("content")
        public String content;

        // gatewayId
        @NameInMap("gatewayId")
        public Long gatewayId;

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

        public static CreatePolicyRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyRequestData self = new CreatePolicyRequestData();
            return TeaModel.build(map, self);
        }

        public CreatePolicyRequestData setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public CreatePolicyRequestData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreatePolicyRequestData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public CreatePolicyRequestData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreatePolicyRequestData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreatePolicyRequestData setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public CreatePolicyRequestData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
