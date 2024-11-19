// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupInfoRequest extends TeaModel {
    /**
     * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/93356.html">QueryDeviceGroupList</a> operation to query the <strong>GroupId</strong> parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tDQvBJqbUyHs****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The type of the group.</p>
     * <p>Set the value to <strong>LINK_PLATFORM_DYNAMIC</strong>. This value indicates a dynamic group. If you do not specify this parameter, a static group is queried by default.</p>
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
     * <p>iot-cn-0pp1n8t****</p>
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
