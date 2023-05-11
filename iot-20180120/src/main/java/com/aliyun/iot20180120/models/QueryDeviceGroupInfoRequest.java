// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupInfoRequest extends TeaModel {
    /**
     * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
     * <br>
     * <p>You can call the [QueryDeviceGroupList](~~93356~~) operation to query the **GroupId** parameter.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of the group.</p>
     * <br>
     * <p>Set the value to **LINK_PLATFORM_DYNAMIC**. This value indicates a dynamic group. If you do not specify this parameter, a static group is queried by default.</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryDeviceGroupInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupInfoRequest self = new QueryDeviceGroupInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupInfoRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryDeviceGroupInfoRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public QueryDeviceGroupInfoRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
