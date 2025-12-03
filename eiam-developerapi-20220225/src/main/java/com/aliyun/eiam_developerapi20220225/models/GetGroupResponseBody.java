// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetGroupResponseBody extends TeaModel {
    /**
     * <p>The time when the group was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1652085686179</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The group description.</p>
     * 
     * <strong>example:</strong>
     * <p>description_demo</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The external ID of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>group_ufdsasn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("groupExternalId")
    public String groupExternalId;

    /**
     * <p>The group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>group_ufdsasn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The group name.</p>
     * 
     * <strong>example:</strong>
     * <p>name_test</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>The source ID of the group.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("groupSourceId")
    public String groupSourceId;

    /**
     * <p>The source type of the group. Valid values: build_in, ding_talk, ad, and ldap.</p>
     * 
     * <strong>example:</strong>
     * <p>build_in</p>
     */
    @NameInMap("groupSourceType")
    public String groupSourceType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The time when the group was last updated. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1652085686179</p>
     */
    @NameInMap("updateTime")
    public Long updateTime;

    public static GetGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupResponseBody self = new GetGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetGroupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetGroupResponseBody setGroupExternalId(String groupExternalId) {
        this.groupExternalId = groupExternalId;
        return this;
    }
    public String getGroupExternalId() {
        return this.groupExternalId;
    }

    public GetGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetGroupResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public GetGroupResponseBody setGroupSourceId(String groupSourceId) {
        this.groupSourceId = groupSourceId;
        return this;
    }
    public String getGroupSourceId() {
        return this.groupSourceId;
    }

    public GetGroupResponseBody setGroupSourceType(String groupSourceType) {
        this.groupSourceType = groupSourceType;
        return this;
    }
    public String getGroupSourceType() {
        return this.groupSourceType;
    }

    public GetGroupResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetGroupResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
