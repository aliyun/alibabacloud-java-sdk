// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class LaunchShortMessageAppraiseRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Acid")
    public String acid;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    @NameInMap("ContactType")
    public Integer contactType;

    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    public static LaunchShortMessageAppraiseRequest build(java.util.Map<String, ?> map) throws Exception {
        LaunchShortMessageAppraiseRequest self = new LaunchShortMessageAppraiseRequest();
        return TeaModel.build(map, self);
    }

    public LaunchShortMessageAppraiseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public LaunchShortMessageAppraiseRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public LaunchShortMessageAppraiseRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public LaunchShortMessageAppraiseRequest setContactType(Integer contactType) {
        this.contactType = contactType;
        return this;
    }
    public Integer getContactType() {
        return this.contactType;
    }

    public LaunchShortMessageAppraiseRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

}
