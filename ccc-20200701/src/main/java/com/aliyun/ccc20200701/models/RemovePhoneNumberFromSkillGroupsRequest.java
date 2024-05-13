// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemovePhoneNumberFromSkillGroupsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    public static RemovePhoneNumberFromSkillGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemovePhoneNumberFromSkillGroupsRequest self = new RemovePhoneNumberFromSkillGroupsRequest();
        return TeaModel.build(map, self);
    }

    public RemovePhoneNumberFromSkillGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemovePhoneNumberFromSkillGroupsRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public RemovePhoneNumberFromSkillGroupsRequest setSkillGroupIdList(String skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

}
