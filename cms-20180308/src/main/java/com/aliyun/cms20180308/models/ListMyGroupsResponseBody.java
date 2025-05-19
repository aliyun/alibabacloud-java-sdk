// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListMyGroupsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public ListMyGroupsResponseBodyResources resources;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static ListMyGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMyGroupsResponseBody self = new ListMyGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMyGroupsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListMyGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMyGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMyGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMyGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMyGroupsResponseBody setResources(ListMyGroupsResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public ListMyGroupsResponseBodyResources getResources() {
        return this.resources;
    }

    public ListMyGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMyGroupsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListMyGroupsResponseBodyResourcesResourceContactGroupsContactGroup extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListMyGroupsResponseBodyResourcesResourceContactGroupsContactGroup build(java.util.Map<String, ?> map) throws Exception {
            ListMyGroupsResponseBodyResourcesResourceContactGroupsContactGroup self = new ListMyGroupsResponseBodyResourcesResourceContactGroupsContactGroup();
            return TeaModel.build(map, self);
        }

        public ListMyGroupsResponseBodyResourcesResourceContactGroupsContactGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListMyGroupsResponseBodyResourcesResourceContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        public java.util.List<ListMyGroupsResponseBodyResourcesResourceContactGroupsContactGroup> contactGroup;

        public static ListMyGroupsResponseBodyResourcesResourceContactGroups build(java.util.Map<String, ?> map) throws Exception {
            ListMyGroupsResponseBodyResourcesResourceContactGroups self = new ListMyGroupsResponseBodyResourcesResourceContactGroups();
            return TeaModel.build(map, self);
        }

        public ListMyGroupsResponseBodyResourcesResourceContactGroups setContactGroup(java.util.List<ListMyGroupsResponseBodyResourcesResourceContactGroupsContactGroup> contactGroup) {
            this.contactGroup = contactGroup;
            return this;
        }
        public java.util.List<ListMyGroupsResponseBodyResourcesResourceContactGroupsContactGroup> getContactGroup() {
            return this.contactGroup;
        }

    }

    public static class ListMyGroupsResponseBodyResourcesResource extends TeaModel {
        @NameInMap("BindUrl")
        public String bindUrl;

        @NameInMap("BindUrls")
        public String bindUrls;

        @NameInMap("ContactGroups")
        public ListMyGroupsResponseBodyResourcesResourceContactGroups contactGroups;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("Type")
        public String type;

        public static ListMyGroupsResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            ListMyGroupsResponseBodyResourcesResource self = new ListMyGroupsResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public ListMyGroupsResponseBodyResourcesResource setBindUrl(String bindUrl) {
            this.bindUrl = bindUrl;
            return this;
        }
        public String getBindUrl() {
            return this.bindUrl;
        }

        public ListMyGroupsResponseBodyResourcesResource setBindUrls(String bindUrls) {
            this.bindUrls = bindUrls;
            return this;
        }
        public String getBindUrls() {
            return this.bindUrls;
        }

        public ListMyGroupsResponseBodyResourcesResource setContactGroups(ListMyGroupsResponseBodyResourcesResourceContactGroups contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public ListMyGroupsResponseBodyResourcesResourceContactGroups getContactGroups() {
            return this.contactGroups;
        }

        public ListMyGroupsResponseBodyResourcesResource setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMyGroupsResponseBodyResourcesResource setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListMyGroupsResponseBodyResourcesResource setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListMyGroupsResponseBodyResourcesResource setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListMyGroupsResponseBodyResourcesResource setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListMyGroupsResponseBodyResourcesResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMyGroupsResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<ListMyGroupsResponseBodyResourcesResource> resource;

        public static ListMyGroupsResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListMyGroupsResponseBodyResources self = new ListMyGroupsResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListMyGroupsResponseBodyResources setResource(java.util.List<ListMyGroupsResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<ListMyGroupsResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
