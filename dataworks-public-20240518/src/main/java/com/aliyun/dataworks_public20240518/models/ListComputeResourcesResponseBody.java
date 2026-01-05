// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListComputeResourcesResponseBody extends TeaModel {
    /**
     * <p>Pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListComputeResourcesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. Used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7C352CB7-CD88-50CF-9D0D-E81BDF02XXXX</p>
     */
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
        /**
         * <p>The category of the added compute resource. Different types have different subtypes with corresponding parameter constraints. Examples: InstanceMode: The instance mode. UrlMode: The connection string mode.</p>
         * 
         * <strong>example:</strong>
         * <p>{\n    \&quot;clusterIdentifier\&quot;: \&quot;c-da123456\&quot;,\n    \&quot;database\&quot;: \&quot;testdb\&quot;,\n    \&quot;loginMode\&quot;:\&quot;Anonymous\&quot;,\n    \&quot;defaultFS\&quot;:\&quot;127.0.0.1\&quot;,\n    \&quot;envType\&quot;: \&quot;Prod\&quot;\n}</p>
         */
        @NameInMap("ConnectionProperties")
        public Object connectionProperties;

        /**
         * <p>The specific connection configuration details for the computing resource, including the connection address, access identity, and environment information. envType, which specifies the computing resource environment, is a property of this object. Valid values:</p>
         * <ul>
         * <li>Dev</li>
         * <li>Prod Different types of computing resources have different attribute specifications under different configuration modes (ConnectionPropertiesMode).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UrlMode</p>
         */
        @NameInMap("ConnectionPropertiesMode")
        public String connectionPropertiesMode;

        /**
         * <p>The creation time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1624387842781448</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1648711113000</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The unique identifier of the computing resource.</p>
         * 
         * <strong>example:</strong>
         * <p>home_feed</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The computing resource ID, which is the unique identifier for the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>8649832502405358603</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The last modified time of the computing resource (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1624387842781448</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The modifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1648711113000</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>Specifies whether it is the default compute resource.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Details of a single computing resource.</p>
         */
        @NameInMap("ComputeResource")
        public java.util.List<ListComputeResourcesResponseBodyPagingInfoComputeResourcesComputeResource> computeResource;

        /**
         * <p>The name of the computing resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cal_all_vemg_workflow_parallel</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the computing resource.</p>
         * 
         * <strong>example:</strong>
         * <p>hologres</p>
         */
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
        /**
         * <p>The list of computing resources. Each element is a computing resource group that contains information about the development environment (if any) and the production environment.</p>
         */
        @NameInMap("ComputeResources")
        public java.util.List<ListComputeResourcesResponseBodyPagingInfoComputeResources> computeResources;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
