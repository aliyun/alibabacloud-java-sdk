// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateDeviceGroupRequest extends TeaModel {
    /**
     * <p>The description of the group. The description must be 1 to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test2</p>
     */
    @NameInMap("GroupDesc")
    public String groupDesc;

    /**
     * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>W16X8Tvdosec****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of the group.</p>
     * <p>If you set the value to <strong>LINK_PLATFORM_DYNAMIC</strong>, a dynamic group is queried. If you do not specify this parameter, a static group is queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>LINK_PLATFORM_DYNAMIC</p>
     */
    @NameInMap("GroupType")
    public String groupType;

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

    public static UpdateDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceGroupRequest self = new UpdateDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceGroupRequest setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }
    public String getGroupDesc() {
        return this.groupDesc;
    }

    public UpdateDeviceGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateDeviceGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public UpdateDeviceGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
