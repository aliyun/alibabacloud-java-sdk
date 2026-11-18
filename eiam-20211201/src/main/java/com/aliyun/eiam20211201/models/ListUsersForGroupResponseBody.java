// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of matched entries. The maximum number of entries returned on a single page is specified by the PageSize parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The list of account object information.</p>
     */
    @NameInMap("Users")
    public java.util.List<ListUsersForGroupResponseBodyUsers> users;

    public static ListUsersForGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForGroupResponseBody self = new ListUsersForGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersForGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersForGroupResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUsersForGroupResponseBody setUsers(java.util.List<ListUsersForGroupResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUsersForGroupResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUsersForGroupResponseBodyUsers extends TeaModel {
        /**
         * <p>The source ID of the group member relationship. For the self-managed type, the default value is the instance ID. For other types, the value corresponds to the enterprise ID of the source. For example, if the source is DingTalk, the value is the corpId of the DingTalk enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("GroupMemberRelationSourceId")
        public String groupMemberRelationSourceId;

        /**
         * <p>The source type of the group member relationship. Valid values:</p>
         * <ul>
         * <li>build_in: self-managed</li>
         * <li>ding_talk: imported from DingTalk</li>
         * <li>ad: imported from AD</li>
         * <li>ldap: imported from LDAP</li>
         * <li>we_com: imported from WeCom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>build_in</p>
         */
        @NameInMap("GroupMemberRelationSourceType")
        public String groupMemberRelationSourceType;

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListUsersForGroupResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersForGroupResponseBodyUsers self = new ListUsersForGroupResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersForGroupResponseBodyUsers setGroupMemberRelationSourceId(String groupMemberRelationSourceId) {
            this.groupMemberRelationSourceId = groupMemberRelationSourceId;
            return this;
        }
        public String getGroupMemberRelationSourceId() {
            return this.groupMemberRelationSourceId;
        }

        public ListUsersForGroupResponseBodyUsers setGroupMemberRelationSourceType(String groupMemberRelationSourceType) {
            this.groupMemberRelationSourceType = groupMemberRelationSourceType;
            return this;
        }
        public String getGroupMemberRelationSourceType() {
            return this.groupMemberRelationSourceType;
        }

        public ListUsersForGroupResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
