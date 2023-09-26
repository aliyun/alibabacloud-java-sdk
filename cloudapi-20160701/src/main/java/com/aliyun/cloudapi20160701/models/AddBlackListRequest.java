// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class AddBlackListRequest extends TeaModel {
    @NameInMap("BlackContent")
    public String blackContent;

    @NameInMap("BlackType")
    public String blackType;

    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static AddBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBlackListRequest self = new AddBlackListRequest();
        return TeaModel.build(map, self);
    }

    public AddBlackListRequest setBlackContent(String blackContent) {
        this.blackContent = blackContent;
        return this;
    }
    public String getBlackContent() {
        return this.blackContent;
    }

    public AddBlackListRequest setBlackType(String blackType) {
        this.blackType = blackType;
        return this;
    }
    public String getBlackType() {
        return this.blackType;
    }

    public AddBlackListRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddBlackListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
