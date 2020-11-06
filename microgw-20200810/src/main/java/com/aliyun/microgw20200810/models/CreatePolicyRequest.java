// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
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

    public static CreatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyRequest self = new CreatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreatePolicyRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreatePolicyRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public CreatePolicyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreatePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePolicyRequest setPolicyGroup(String policyGroup) {
        this.policyGroup = policyGroup;
        return this;
    }
    public String getPolicyGroup() {
        return this.policyGroup;
    }

    public CreatePolicyRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
