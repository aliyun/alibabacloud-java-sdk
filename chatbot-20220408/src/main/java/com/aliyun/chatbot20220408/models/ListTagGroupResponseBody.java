// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListTagGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>xxxXxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagGroups")
    public java.util.List<ListTagGroupResponseBodyTagGroups> tagGroups;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTagGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagGroupResponseBody self = new ListTagGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTagGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagGroupResponseBody setTagGroups(java.util.List<ListTagGroupResponseBodyTagGroups> tagGroups) {
        this.tagGroups = tagGroups;
        return this;
    }
    public java.util.List<ListTagGroupResponseBodyTagGroups> getTagGroups() {
        return this.tagGroups;
    }

    public ListTagGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTagGroupResponseBodyTagGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>32323</p>
         */
        @NameInMap("CreateUserId")
        public Long createUserId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <strong>example:</strong>
         * <p>232323</p>
         */
        @NameInMap("DefaultTagId")
        public Long defaultTagId;

        /**
         * <strong>example:</strong>
         * <p>标签1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>7562321</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ModifyUserId")
        public Long modifyUserId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ModifyUserName")
        public String modifyUserName;

        public static ListTagGroupResponseBodyTagGroups build(java.util.Map<String, ?> map) throws Exception {
            ListTagGroupResponseBodyTagGroups self = new ListTagGroupResponseBodyTagGroups();
            return TeaModel.build(map, self);
        }

        public ListTagGroupResponseBodyTagGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTagGroupResponseBodyTagGroups setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public ListTagGroupResponseBodyTagGroups setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListTagGroupResponseBodyTagGroups setDefaultTagId(Long defaultTagId) {
            this.defaultTagId = defaultTagId;
            return this;
        }
        public Long getDefaultTagId() {
            return this.defaultTagId;
        }

        public ListTagGroupResponseBodyTagGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListTagGroupResponseBodyTagGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTagGroupResponseBodyTagGroups setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListTagGroupResponseBodyTagGroups setModifyUserId(Long modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public Long getModifyUserId() {
            return this.modifyUserId;
        }

        public ListTagGroupResponseBodyTagGroups setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

    }

}
