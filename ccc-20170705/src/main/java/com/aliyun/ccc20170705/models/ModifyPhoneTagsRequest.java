// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyPhoneTagsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServiceTag")
    public String serviceTag;

    @NameInMap("SkillGroupIdList")
    public java.util.List<String> skillGroupIdList;

    public static ModifyPhoneTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneTagsRequest self = new ModifyPhoneTagsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPhoneTagsRequest setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
        return this;
    }
    public String getServiceTag() {
        return this.serviceTag;
    }

    public ModifyPhoneTagsRequest setSkillGroupIdList(java.util.List<String> skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public java.util.List<String> getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

}
