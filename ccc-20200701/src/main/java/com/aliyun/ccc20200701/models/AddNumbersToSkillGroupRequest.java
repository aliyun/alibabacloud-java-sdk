// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddNumbersToSkillGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NumberList")
    public String numberList;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static AddNumbersToSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddNumbersToSkillGroupRequest self = new AddNumbersToSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddNumbersToSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddNumbersToSkillGroupRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

    public AddNumbersToSkillGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
