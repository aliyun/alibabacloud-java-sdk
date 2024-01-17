// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyApiMarketInstanceAttributeRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceAttributes")
    public String instanceAttributes;

    public static ModifyApiMarketInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiMarketInstanceAttributeRequest self = new ModifyApiMarketInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApiMarketInstanceAttributeRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public ModifyApiMarketInstanceAttributeRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyApiMarketInstanceAttributeRequest setInstanceAttributes(String instanceAttributes) {
        this.instanceAttributes = instanceAttributes;
        return this;
    }
    public String getInstanceAttributes() {
        return this.instanceAttributes;
    }

}
