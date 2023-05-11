// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDeviceGroupTagsRequest extends TeaModel {
    /**
     * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of the group.</p>
     * <br>
     * <p>You do not need to configure this parameter.</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The ID of the instance. On the **Overview** page in the IoT Platform console, you can view the **ID** of the instance.</p>
     * <br>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>>*   If the **Overview** page or instance ID is not displayed in the IoT Platform console, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information about the instance, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The tag data in the JSON format. The TagString parameter specifies multiple tags in the format of key-value pairs. You must specify **tagKey** and **tagValue** for each tag.</p>
     * <br>
     * <p>*   **tagKey**: the tag key. The key must be 2 to 30 characters in length, and can contain letters, digits, and periods (.).</p>
     * <p>*   **tagValue**: the tag value. Each value can contain letters, digits, underscores (\_), and hyphens (-). The value must be 1 to 128 characters in length.</p>
     * <br>
     * <p>Separate multiple tags with commas (,). Example: `[{"tagKey":"h1","tagValue":"rr"},{"tagKey":"7h","tagValue":"rr"}]`</p>
     * <br>
     * <p>If you specify a new value for an existing tag, the new tag value overwrites the original value.</p>
     * <br>
     * <p>If you want to delete a tag, you do not need to specify the key and value for the tag.</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>**Important** `abc` is a key that is reserved by IoT Platform. You cannot set **tagKey** to abc. If you set `tagKey` to abc, the abc tag is automatically filtered when you query tags.</p>
     */
    @NameInMap("TagString")
    public String tagString;

    public static SetDeviceGroupTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceGroupTagsRequest self = new SetDeviceGroupTagsRequest();
        return TeaModel.build(map, self);
    }

    public SetDeviceGroupTagsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetDeviceGroupTagsRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public SetDeviceGroupTagsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetDeviceGroupTagsRequest setTagString(String tagString) {
        this.tagString = tagString;
        return this;
    }
    public String getTagString() {
        return this.tagString;
    }

}
