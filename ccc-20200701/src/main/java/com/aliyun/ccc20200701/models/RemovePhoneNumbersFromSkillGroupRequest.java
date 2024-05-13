// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemovePhoneNumbersFromSkillGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static RemovePhoneNumbersFromSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePhoneNumbersFromSkillGroupRequest self = new RemovePhoneNumbersFromSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemovePhoneNumbersFromSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemovePhoneNumbersFromSkillGroupRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

    public RemovePhoneNumbersFromSkillGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
