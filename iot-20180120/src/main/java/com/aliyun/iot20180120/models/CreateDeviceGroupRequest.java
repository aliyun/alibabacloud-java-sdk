// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceGroupRequest extends TeaModel {
    /**
     * <p>The description of the group. The description must be 1 to 100 characters in length.</p>
     */
    @NameInMap("GroupDesc")
    public String groupDesc;

    /**
     * <p>The name of the group. The alias must be 4 to 30 characters in length, and can contain letters, digits, and underscores (\_).</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <br>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the parent group.</p>
     * <br>
     * <p>If you need to create a first-level group, do not specify this parameter.</p>
     */
    @NameInMap("SuperGroupId")
    public String superGroupId;

    public static CreateDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceGroupRequest self = new CreateDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceGroupRequest setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }
    public String getGroupDesc() {
        return this.groupDesc;
    }

    public CreateDeviceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateDeviceGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateDeviceGroupRequest setSuperGroupId(String superGroupId) {
        this.superGroupId = superGroupId;
        return this;
    }
    public String getSuperGroupId() {
        return this.superGroupId;
    }

}
