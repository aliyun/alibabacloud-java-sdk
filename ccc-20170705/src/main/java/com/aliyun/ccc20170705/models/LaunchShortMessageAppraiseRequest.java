// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class LaunchShortMessageAppraiseRequest extends TeaModel {
    @NameInMap("Acid")
    public String acid;

    @NameInMap("ContactType")
    public Integer contactType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static LaunchShortMessageAppraiseRequest build(java.util.Map<String, ?> map) throws Exception {
        LaunchShortMessageAppraiseRequest self = new LaunchShortMessageAppraiseRequest();
        return TeaModel.build(map, self);
    }

    public LaunchShortMessageAppraiseRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public LaunchShortMessageAppraiseRequest setContactType(Integer contactType) {
        this.contactType = contactType;
        return this;
    }
    public Integer getContactType() {
        return this.contactType;
    }

    public LaunchShortMessageAppraiseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public LaunchShortMessageAppraiseRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public LaunchShortMessageAppraiseRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
