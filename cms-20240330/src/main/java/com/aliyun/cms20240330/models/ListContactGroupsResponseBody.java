// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListContactGroupsResponseBody extends TeaModel {
    @NameInMap("contactGroups")
    public java.util.List<ListContactGroupsResponseBodyContactGroups> contactGroups;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListContactGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContactGroupsResponseBody self = new ListContactGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContactGroupsResponseBody setContactGroups(java.util.List<ListContactGroupsResponseBodyContactGroups> contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public java.util.List<ListContactGroupsResponseBodyContactGroups> getContactGroups() {
        return this.contactGroups;
    }

    public ListContactGroupsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListContactGroupsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListContactGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContactGroupsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListContactGroupsResponseBodyContactGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("contactGroupId")
        public String contactGroupId;

        @NameInMap("contactIds")
        public java.util.List<String> contactIds;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("workspace")
        public String workspace;

        public static ListContactGroupsResponseBodyContactGroups build(java.util.Map<String, ?> map) throws Exception {
            ListContactGroupsResponseBodyContactGroups self = new ListContactGroupsResponseBodyContactGroups();
            return TeaModel.build(map, self);
        }

        public ListContactGroupsResponseBodyContactGroups setContactGroupId(String contactGroupId) {
            this.contactGroupId = contactGroupId;
            return this;
        }
        public String getContactGroupId() {
            return this.contactGroupId;
        }

        public ListContactGroupsResponseBodyContactGroups setContactIds(java.util.List<String> contactIds) {
            this.contactIds = contactIds;
            return this;
        }
        public java.util.List<String> getContactIds() {
            return this.contactIds;
        }

        public ListContactGroupsResponseBodyContactGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListContactGroupsResponseBodyContactGroups setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
