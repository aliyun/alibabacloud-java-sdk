// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListComputeResourcesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListComputeResourcesResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListComputeResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComputeResourcesResponseBody self = new ListComputeResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComputeResourcesResponseBody setPagingInfo(ListComputeResourcesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListComputeResourcesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListComputeResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource extends TeaModel {
        @NameInMap("ConnectionProperties")
        public Object connectionProperties;

        @NameInMap("ConnectionPropertiesMode")
        public String connectionPropertiesMode;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("WhetherDefault")
        public Boolean whetherDefault;

        public static ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource build(java.util.Map<String, ?> map) throws Exception {
            ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource self = new ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource();
            return TeaModel.build(map, self);
        }

        public ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource setConnectionProperties(Object connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public Object getConnectionProperties() {
            return this.connectionProperties;
        }

        public ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource setConnectionPropertiesMode(String connectionPropertiesMode) {
            this.connectionPropertiesMode = connectionPropertiesMode;
            return this;
        }
        public String getConnectionPropertiesMode() {
            return this.connectionPropertiesMode;
        }

        public ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource setWhetherDefault(Boolean whetherDefault) {
            this.whetherDefault = whetherDefault;
            return this;
        }
        public Boolean getWhetherDefault() {
            return this.whetherDefault;
        }

    }

    public static class ListComputeResourcesResponseBodyPagingInfoComputeResources extends TeaModel {
        @NameInMap("ComputeResource")
        public java.util.List<ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource> computeResource;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static ListComputeResourcesResponseBodyPagingInfoComputeResources build(java.util.Map<String, ?> map) throws Exception {
            ListComputeResourcesResponseBodyPagingInfoComputeResources self = new ListComputeResourcesResponseBodyPagingInfoComputeResources();
            return TeaModel.build(map, self);
        }

        public ListComputeResourcesResponseBodyPagingInfoComputeResources setComputeResource(java.util.List<ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource> computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public java.util.List<ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource> getComputeResource() {
            return this.computeResource;
        }

        public ListComputeResourcesResponseBodyPagingInfoComputeResources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComputeResourcesResponseBodyPagingInfoComputeResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListComputeResourcesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("ComputeResources")
        public java.util.List<ListComputeResourcesResponseBodyPagingInfoComputeResources> computeResources;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListComputeResourcesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListComputeResourcesResponseBodyPagingInfo self = new ListComputeResourcesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListComputeResourcesResponseBodyPagingInfo setComputeResources(java.util.List<ListComputeResourcesResponseBodyPagingInfoComputeResources> computeResources) {
            this.computeResources = computeResources;
            return this;
        }
        public java.util.List<ListComputeResourcesResponseBodyPagingInfoComputeResources> getComputeResources() {
            return this.computeResources;
        }

        public ListComputeResourcesResponseBodyPagingInfo setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListComputeResourcesResponseBodyPagingInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListComputeResourcesResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
