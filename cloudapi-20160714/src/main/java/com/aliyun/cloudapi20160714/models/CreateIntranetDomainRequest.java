// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateIntranetDomainRequest extends TeaModel {
    /**
     * <p>The custom domain name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateIntranetDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntranetDomainRequest self = new CreateIntranetDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntranetDomainRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateIntranetDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
