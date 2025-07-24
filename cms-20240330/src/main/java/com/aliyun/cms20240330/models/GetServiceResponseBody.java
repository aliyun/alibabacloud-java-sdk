// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>264C3E89-BE6E-5F82-A484-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("service")
    public GetServiceResponseBodyService service;

    public static GetServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceResponseBody self = new GetServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceResponseBody setService(GetServiceResponseBodyService service) {
        this.service = service;
        return this;
    }
    public GetServiceResponseBodyService getService() {
        return this.service;
    }

    public static class GetServiceResponseBodyService extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;language&quot;:&quot;java&quot;}</p>
         */
        @NameInMap("attributes")
        public String attributes;

        /**
         * <strong>example:</strong>
         * <p>2025-05-13T03:32:55Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>by6rjzro2j@0fe8dfa799e5906</p>
         */
        @NameInMap("pid")
        public String pid;

        /**
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>cwzxvuc6uo@4bc6b15ad81f166174ffb</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("serviceStatus")
        public String serviceStatus;

        /**
         * <strong>example:</strong>
         * <p>TRACE</p>
         */
        @NameInMap("serviceType")
        public String serviceType;

        /**
         * <strong>example:</strong>
         * <p>default-cms-1106439496876715-cn-hangzhou</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static GetServiceResponseBodyService build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyService self = new GetServiceResponseBodyService();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyService setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public GetServiceResponseBodyService setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetServiceResponseBodyService setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetServiceResponseBodyService setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetServiceResponseBodyService setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetServiceResponseBodyService setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetServiceResponseBodyService setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetServiceResponseBodyService setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceResponseBodyService setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public GetServiceResponseBodyService setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetServiceResponseBodyService setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
