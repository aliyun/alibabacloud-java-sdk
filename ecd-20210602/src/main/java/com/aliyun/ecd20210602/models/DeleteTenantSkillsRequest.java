// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteTenantSkillsRequest extends TeaModel {
    /**
     * <p>The skill channel. Valid values:</p>
     * <ul>
     * <li>ENTERPRISE: Enterprise edition.</li>
     * <li>BUSINESS: Business edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("SkillChannel")
    public String skillChannel;

    /**
     * <p>The list of skill IDs.</p>
     */
    @NameInMap("SkillIds")
    public java.util.List<String> skillIds;

    public static DeleteTenantSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantSkillsRequest self = new DeleteTenantSkillsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTenantSkillsRequest setSkillChannel(String skillChannel) {
        this.skillChannel = skillChannel;
        return this;
    }
    public String getSkillChannel() {
        return this.skillChannel;
    }

    public DeleteTenantSkillsRequest setSkillIds(java.util.List<String> skillIds) {
        this.skillIds = skillIds;
        return this;
    }
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

}
