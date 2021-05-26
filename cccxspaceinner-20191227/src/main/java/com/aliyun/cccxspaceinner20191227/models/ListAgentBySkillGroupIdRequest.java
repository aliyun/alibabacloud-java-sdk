// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class ListAgentBySkillGroupIdRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("SkillGroupId")
    public Long skillGroupId;

    public static ListAgentBySkillGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentBySkillGroupIdRequest self = new ListAgentBySkillGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentBySkillGroupIdRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListAgentBySkillGroupIdRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public ListAgentBySkillGroupIdRequest setSkillGroupId(Long skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public Long getSkillGroupId() {
        return this.skillGroupId;
    }

}
