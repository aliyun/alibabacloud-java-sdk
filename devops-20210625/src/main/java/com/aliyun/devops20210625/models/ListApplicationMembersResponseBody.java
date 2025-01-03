// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListApplicationMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pages")
    public Long pages;

    @NameInMap("records")
    public java.util.List<ListApplicationMembersResponseBodyRecords> records;

    /**
     * <strong>example:</strong>
     * <p>FC93CE1A-8D7A-13A9-8306-7465DE2E5C0F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListApplicationMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMembersResponseBody self = new ListApplicationMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationMembersResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListApplicationMembersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApplicationMembersResponseBody setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public ListApplicationMembersResponseBody setRecords(java.util.List<ListApplicationMembersResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListApplicationMembersResponseBodyRecords> getRecords() {
        return this.records;
    }

    public ListApplicationMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationMembersResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListApplicationMembersResponseBodyRecordsRoleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>开发者</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>developer</p>
         */
        @NameInMap("name")
        public String name;

        public static ListApplicationMembersResponseBodyRecordsRoleList build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationMembersResponseBodyRecordsRoleList self = new ListApplicationMembersResponseBodyRecordsRoleList();
            return TeaModel.build(map, self);
        }

        public ListApplicationMembersResponseBodyRecordsRoleList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListApplicationMembersResponseBodyRecordsRoleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListApplicationMembersResponseBodyRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>http://</p>
         */
        @NameInMap("avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>成语描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>成员1</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>1332695887xxxxxx</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("roleList")
        public java.util.List<ListApplicationMembersResponseBodyRecordsRoleList> roleList;

        /**
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("type")
        public String type;

        public static ListApplicationMembersResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationMembersResponseBodyRecords self = new ListApplicationMembersResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListApplicationMembersResponseBodyRecords setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public ListApplicationMembersResponseBodyRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationMembersResponseBodyRecords setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListApplicationMembersResponseBodyRecords setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListApplicationMembersResponseBodyRecords setRoleList(java.util.List<ListApplicationMembersResponseBodyRecordsRoleList> roleList) {
            this.roleList = roleList;
            return this;
        }
        public java.util.List<ListApplicationMembersResponseBodyRecordsRoleList> getRoleList() {
            return this.roleList;
        }

        public ListApplicationMembersResponseBodyRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
