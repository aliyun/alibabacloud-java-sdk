// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdatePolicyRequest extends TeaModel {
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

    public static UpdatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyRequest self = new UpdatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public UpdatePolicyRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdatePolicyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdatePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePolicyRequest setPolicyGroup(String policyGroup) {
        this.policyGroup = policyGroup;
        return this;
    }
    public String getPolicyGroup() {
        return this.policyGroup;
    }

    public UpdatePolicyRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
