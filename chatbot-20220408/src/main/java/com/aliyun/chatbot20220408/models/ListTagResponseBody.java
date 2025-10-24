// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListTagResponseBody extends TeaModel {
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
    public java.util.List<ListTagResponseBodyTagGroups> tagGroups;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResponseBody self = new ListTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTagResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResponseBody setTagGroups(java.util.List<ListTagResponseBodyTagGroups> tagGroups) {
        this.tagGroups = tagGroups;
        return this;
    }
    public java.util.List<ListTagResponseBodyTagGroups> getTagGroups() {
        return this.tagGroups;
    }

    public ListTagResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTagResponseBodyTagGroups extends TeaModel {
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
         * <p>54545</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

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

        /**
         * <strong>example:</strong>
         * <p>标签1</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static ListTagResponseBodyTagGroups build(java.util.Map<String, ?> map) throws Exception {
            ListTagResponseBodyTagGroups self = new ListTagResponseBodyTagGroups();
            return TeaModel.build(map, self);
        }

        public ListTagResponseBodyTagGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTagResponseBodyTagGroups setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public ListTagResponseBodyTagGroups setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListTagResponseBodyTagGroups setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListTagResponseBodyTagGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTagResponseBodyTagGroups setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListTagResponseBodyTagGroups setModifyUserId(Long modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public Long getModifyUserId() {
            return this.modifyUserId;
        }

        public ListTagResponseBodyTagGroups setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public ListTagResponseBodyTagGroups setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
