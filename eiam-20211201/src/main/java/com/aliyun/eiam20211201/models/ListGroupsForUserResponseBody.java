// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForUserResponseBody extends TeaModel {
    /**
     * <p>The list of groups.</p>
     */
    @NameInMap("Groups")
    public java.util.List<ListGroupsForUserResponseBodyGroups> groups;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of matched entries. The maximum number of entries returned per page is specified by the PageSize parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListGroupsForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForUserResponseBody self = new ListGroupsForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsForUserResponseBody setGroups(java.util.List<ListGroupsForUserResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<ListGroupsForUserResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public ListGroupsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupsForUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupsForUserResponseBodyGroups extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The source ID of the group member relationship. For self-managed groups, the default value is the instance ID. For other types, the value corresponds to the enterprise ID of the source. For example, if the source is DingTalk, the value is the corpId of the DingTalk enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("GroupMemberRelationSourceId")
        public String groupMemberRelationSourceId;

        /**
         * <p>The source type of the group member relationship. Valid values:</p>
         * <ul>
         * <li>build_in: Self-managed.</li>
         * <li>ding_talk: Imported from DingTalk.</li>
         * <li>ad: Imported from AD.</li>
         * <li>ldap: Imported from LDAP.</li>
         * <li>we_com: Imported from WeCom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>build_in</p>
         */
        @NameInMap("GroupMemberRelationSourceType")
        public String groupMemberRelationSourceType;

        public static ListGroupsForUserResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForUserResponseBodyGroups self = new ListGroupsForUserResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsForUserResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListGroupsForUserResponseBodyGroups setGroupMemberRelationSourceId(String groupMemberRelationSourceId) {
            this.groupMemberRelationSourceId = groupMemberRelationSourceId;
            return this;
        }
        public String getGroupMemberRelationSourceId() {
            return this.groupMemberRelationSourceId;
        }

        public ListGroupsForUserResponseBodyGroups setGroupMemberRelationSourceType(String groupMemberRelationSourceType) {
            this.groupMemberRelationSourceType = groupMemberRelationSourceType;
            return this;
        }
        public String getGroupMemberRelationSourceType() {
            return this.groupMemberRelationSourceType;
        }

    }

}
