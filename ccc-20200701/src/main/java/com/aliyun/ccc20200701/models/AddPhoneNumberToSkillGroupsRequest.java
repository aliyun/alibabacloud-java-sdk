// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddPhoneNumberToSkillGroupsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0101234****</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;skillgroup1@ccc-test&quot;,&quot;skillgroup2@ccc-test&quot;]</p>
     */
    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    public static AddPhoneNumberToSkillGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPhoneNumberToSkillGroupsRequest self = new AddPhoneNumberToSkillGroupsRequest();
        return TeaModel.build(map, self);
    }

    public AddPhoneNumberToSkillGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddPhoneNumberToSkillGroupsRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public AddPhoneNumberToSkillGroupsRequest setSkillGroupIdList(String skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

}
