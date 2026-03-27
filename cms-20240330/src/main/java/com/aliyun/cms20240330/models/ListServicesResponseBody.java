// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    /**
     * <p>Maximum number of results to return, with a maximum value of 200</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Pagination token</p>
     * 
     * <strong>example:</strong>
     * <p>2-ba4d-4b9f-aa24-dcb067a30f1c</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>List of service information.</p>
     */
    @NameInMap("services")
    public java.util.List<ListServicesResponseBodyServices> services;

    /**
     * <p>Total count</p>
     * 
     * <strong>example:</strong>
     * <p>66</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServicesResponseBody self = new ListServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServicesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServicesResponseBody setServices(java.util.List<ListServicesResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListServicesResponseBodyServices> getServices() {
        return this.services;
    }

    public ListServicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServicesResponseBodyServices extends TeaModel {
        /**
         * <p>Extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;language&quot;:&quot;java&quot;}</p>
         */
        @NameInMap("attributes")
        public String attributes;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-01T02:23:59Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Service description, valid only when serviceType=RUM.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace api monitor test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Display name, valid only when serviceType=RUM.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>Historical compatible ARMS application ID</p>
         * 
         * <strong>example:</strong>
         * <p>kgcsf@192197e828d51aa</p>
         */
        @NameInMap("pid")
        public String pid;

        /**
         * <strong>example:</strong>
         * <p>rg-aekxxzuad5zzzz</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Service ID</p>
         * 
         * <strong>example:</strong>
         * <p>jm2pl0yoqf@d4905cb11a4f218dfb0a8</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>Service name</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <p>Service status, valid only when serviceType=RUM.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("serviceStatus")
        public String serviceStatus;

        /**
         * <p>Service type</p>
         * 
         * <strong>example:</strong>
         * <p>TRACE</p>
         */
        @NameInMap("serviceType")
        public String serviceType;

        /**
         * <p>Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1192928460540589-cn-hangzhou</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListServicesResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyServices self = new ListServicesResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyServices setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public ListServicesResponseBodyServices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServicesResponseBodyServices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListServicesResponseBodyServices setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListServicesResponseBodyServices setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public ListServicesResponseBodyServices setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListServicesResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServicesResponseBodyServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListServicesResponseBodyServices setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public ListServicesResponseBodyServices setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListServicesResponseBodyServices setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
