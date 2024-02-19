// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyUserWhiteListValueByTypeRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uid")
    public Long uid;

    @NameInMap("Value")
    public String value;

    public static ModifyUserWhiteListValueByTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserWhiteListValueByTypeRequest self = new ModifyUserWhiteListValueByTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserWhiteListValueByTypeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyUserWhiteListValueByTypeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyUserWhiteListValueByTypeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ModifyUserWhiteListValueByTypeRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public ModifyUserWhiteListValueByTypeRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
