// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDeviceGroupTagsRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("TagString")
    public String tagString;

    public static SetDeviceGroupTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceGroupTagsRequest self = new SetDeviceGroupTagsRequest();
        return TeaModel.build(map, self);
    }

    public SetDeviceGroupTagsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetDeviceGroupTagsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetDeviceGroupTagsRequest setTagString(String tagString) {
        this.tagString = tagString;
        return this;
    }
    public String getTagString() {
        return this.tagString;
    }

}
