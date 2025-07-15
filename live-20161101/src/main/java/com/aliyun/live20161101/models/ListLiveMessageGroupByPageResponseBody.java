// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageGroupByPageResponseBody extends TeaModel {
    /**
     * <p>The list of groups.</p>
     */
    @NameInMap("GroupList")
    public java.util.List<ListLiveMessageGroupByPageResponseBodyGroupList> groupList;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B5D95365-5A46-1A6A-BBF5-C7B6BDED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLiveMessageGroupByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageGroupByPageResponseBody self = new ListLiveMessageGroupByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageGroupByPageResponseBody setGroupList(java.util.List<ListLiveMessageGroupByPageResponseBodyGroupList> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<ListLiveMessageGroupByPageResponseBodyGroupList> getGroupList() {
        return this.groupList;
    }

    public ListLiveMessageGroupByPageResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLiveMessageGroupByPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLiveMessageGroupByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveMessageGroupByPageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLiveMessageGroupByPageResponseBodyGroupList extends TeaModel {
        /**
         * <p>The list of administrators.</p>
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
         * <p>The ID of the user who created the group.</p>
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
         * <p>The ID of the interactive messaging group.</p>
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

        public static ListLiveMessageGroupByPageResponseBodyGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveMessageGroupByPageResponseBodyGroupList self = new ListLiveMessageGroupByPageResponseBodyGroupList();
            return TeaModel.build(map, self);
        }

        public ListLiveMessageGroupByPageResponseBodyGroupList setAdminList(java.util.List<String> adminList) {
            this.adminList = adminList;
            return this;
        }
        public java.util.List<String> getAdminList() {
            return this.adminList;
        }

        public ListLiveMessageGroupByPageResponseBodyGroupList setCreatetime(Long createtime) {
            this.createtime = createtime;
            return this;
        }
        public Long getCreatetime() {
            return this.createtime;
        }

        public ListLiveMessageGroupByPageResponseBodyGroupList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListLiveMessageGroupByPageResponseBodyGroupList setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public ListLiveMessageGroupByPageResponseBodyGroupList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListLiveMessageGroupByPageResponseBodyGroupList setGroupInfo(String groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public String getGroupInfo() {
            return this.groupInfo;
        }

        public ListLiveMessageGroupByPageResponseBodyGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
