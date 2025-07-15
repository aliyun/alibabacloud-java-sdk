// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageGroupsResponseBody extends TeaModel {
    /**
     * <p>Details about the groups.</p>
     */
    @NameInMap("GroupList")
    public java.util.List<ListLiveMessageGroupsResponseBodyGroupList> groupList;

    /**
     * <p>Indicates whether the current page is followed by another page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Hasmore")
    public Boolean hasmore;

    /**
     * <p>The starting page number for the next query. This parameter is returned only if the value of Hasmore is true.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("NextpageToken")
    public String nextpageToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B5D95365-5A46-1A6A-BBF5-C7B6BDED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLiveMessageGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageGroupsResponseBody self = new ListLiveMessageGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageGroupsResponseBody setGroupList(java.util.List<ListLiveMessageGroupsResponseBodyGroupList> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<ListLiveMessageGroupsResponseBodyGroupList> getGroupList() {
        return this.groupList;
    }

    public ListLiveMessageGroupsResponseBody setHasmore(Boolean hasmore) {
        this.hasmore = hasmore;
        return this;
    }
    public Boolean getHasmore() {
        return this.hasmore;
    }

    public ListLiveMessageGroupsResponseBody setNextpageToken(String nextpageToken) {
        this.nextpageToken = nextpageToken;
        return this;
    }
    public String getNextpageToken() {
        return this.nextpageToken;
    }

    public ListLiveMessageGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLiveMessageGroupsResponseBodyGroupList extends TeaModel {
        /**
         * <p>The list of the IDs of the group administrators.</p>
         */
        @NameInMap("AdminList")
        public java.util.List<String> adminList;

        /**
         * <p>The time when the group was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1698299727</p>
         */
        @NameInMap("Createtime")
        public Long createtime;

        /**
         * <p>The ID of the group creator.</p>
         * 
         * <strong>example:</strong>
         * <p>user_77</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>Indicates whether the group is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

        /**
         * <p>The ID of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>cU9MeBqf****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The additional information about the group.</p>
         * 
         * <strong>example:</strong>
         * <p>testgroupinfo</p>
         */
        @NameInMap("GroupInfo")
        public String groupInfo;

        /**
         * <p>The name of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>mytestgroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static ListLiveMessageGroupsResponseBodyGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveMessageGroupsResponseBodyGroupList self = new ListLiveMessageGroupsResponseBodyGroupList();
            return TeaModel.build(map, self);
        }

        public ListLiveMessageGroupsResponseBodyGroupList setAdminList(java.util.List<String> adminList) {
            this.adminList = adminList;
            return this;
        }
        public java.util.List<String> getAdminList() {
            return this.adminList;
        }

        public ListLiveMessageGroupsResponseBodyGroupList setCreatetime(Long createtime) {
            this.createtime = createtime;
            return this;
        }
        public Long getCreatetime() {
            return this.createtime;
        }

        public ListLiveMessageGroupsResponseBodyGroupList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListLiveMessageGroupsResponseBodyGroupList setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public ListLiveMessageGroupsResponseBodyGroupList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListLiveMessageGroupsResponseBodyGroupList setGroupInfo(String groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public String getGroupInfo() {
            return this.groupInfo;
        }

        public ListLiveMessageGroupsResponseBodyGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
