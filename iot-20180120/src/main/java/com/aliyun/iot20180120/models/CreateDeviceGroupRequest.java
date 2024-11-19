// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceGroupRequest extends TeaModel {
    /**
     * <p>The description of the group. The description must be 1 to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Group test</p>
     */
    @NameInMap("GroupDesc")
    public String groupDesc;

    /**
     * <p>The name of the group. The alias must be 4 to 30 characters in length, and can contain letters, digits, and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the parent group.</p>
     * <p>If you need to create a first-level group, do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>SuperGroupId1</p>
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
