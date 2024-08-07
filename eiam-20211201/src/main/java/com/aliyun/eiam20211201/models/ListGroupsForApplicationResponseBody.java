// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForApplicationResponseBody extends TeaModel {
    /**
     * <p>The group IDs.</p>
     */
    @NameInMap("Groups")
    public java.util.List<ListGroupsForApplicationResponseBodyGroups> groups;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListGroupsForApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForApplicationResponseBody self = new ListGroupsForApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsForApplicationResponseBody setGroups(java.util.List<ListGroupsForApplicationResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<ListGroupsForApplicationResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public ListGroupsForApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupsForApplicationResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupsForApplicationResponseBodyGroups extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>group_miu8e4t4d7i4u7uwezgr54xxxx</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        public static ListGroupsForApplicationResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForApplicationResponseBodyGroups self = new ListGroupsForApplicationResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsForApplicationResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

}
