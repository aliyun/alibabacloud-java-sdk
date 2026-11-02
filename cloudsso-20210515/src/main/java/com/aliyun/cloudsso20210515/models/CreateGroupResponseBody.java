// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateGroupResponseBody extends TeaModel {
    /**
     * <p>The user group information.</p>
     */
    @NameInMap("Group")
    public CreateGroupResponseBodyGroup group;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20E9650E-EC23-593E-933F-EA0D280D040C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupResponseBody self = new CreateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupResponseBody setGroup(CreateGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public CreateGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public CreateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateGroupResponseBodyGroup extends TeaModel {
        /**
         * <p>The time when the user group was created. The time is in UTC and follows the RFC 3339 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-01T02:38:27Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>g-00jqzghi2n3o5hkh****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the user group. Valid values:</p>
         * <ul>
         * <li>Manual: The user group is manually created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("ProvisionType")
        public String provisionType;

        /**
         * <p>The time when the user group was updated. The time is in UTC and follows the RFC 3339 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-01T02:38:27Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static CreateGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupResponseBodyGroup self = new CreateGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public CreateGroupResponseBodyGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateGroupResponseBodyGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateGroupResponseBodyGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateGroupResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateGroupResponseBodyGroup setProvisionType(String provisionType) {
            this.provisionType = provisionType;
            return this;
        }
        public String getProvisionType() {
            return this.provisionType;
        }

        public CreateGroupResponseBodyGroup setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
