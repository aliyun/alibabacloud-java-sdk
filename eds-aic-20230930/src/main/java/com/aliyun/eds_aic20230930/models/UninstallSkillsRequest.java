// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UninstallSkillsRequest extends TeaModel {
    /**
     * <p>The list of cloud phone instance IDs. You can specify 1 to 200 instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The list of skill IDs. You can specify 1 to 10 skill IDs.</p>
     */
    @NameInMap("SkillIds")
    public java.util.List<String> skillIds;

    public static UninstallSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallSkillsRequest self = new UninstallSkillsRequest();
        return TeaModel.build(map, self);
    }

    public UninstallSkillsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public UninstallSkillsRequest setSkillIds(java.util.List<String> skillIds) {
        this.skillIds = skillIds;
        return this;
    }
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

}
