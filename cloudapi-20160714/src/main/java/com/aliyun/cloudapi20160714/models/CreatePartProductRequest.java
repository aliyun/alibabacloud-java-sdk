// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreatePartProductRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("CateSecondId")
    public java.util.List<Long> cateSecondId;

    public static CreatePartProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePartProductRequest self = new CreatePartProductRequest();
        return TeaModel.build(map, self);
    }

    public CreatePartProductRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreatePartProductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePartProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePartProductRequest setCateSecondId(java.util.List<Long> cateSecondId) {
        this.cateSecondId = cateSecondId;
        return this;
    }
    public java.util.List<Long> getCateSecondId() {
        return this.cateSecondId;
    }

}
