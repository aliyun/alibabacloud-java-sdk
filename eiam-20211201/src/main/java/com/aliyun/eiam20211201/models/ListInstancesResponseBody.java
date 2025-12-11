// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The information of instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstancesDefaultEndpoint extends TeaModel {
        /**
         * <p>The endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>example-xxx.aliyunidaas.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The status of the endpoint. Valid values:</p>
         * <ul>
         * <li>resolved</li>
         * <li>unresolved</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>resolved</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListInstancesResponseBodyInstancesDefaultEndpoint build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesDefaultEndpoint self = new ListInstancesResponseBodyInstancesDefaultEndpoint();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesDefaultEndpoint setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListInstancesResponseBodyInstancesDefaultEndpoint setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>The time when the instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1550115455000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The default endpoint of the instance.</p>
         */
        @NameInMap("DefaultEndpoint")
        public ListInstancesResponseBodyInstancesDefaultEndpoint defaultEndpoint;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_eypq6ljgyeuwmlw672sulxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>sase</p>
         */
        @NameInMap("ManagedServiceCode")
        public String managedServiceCode;

        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>creating</li>
         * <li>running</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyInstances setDefaultEndpoint(ListInstancesResponseBodyInstancesDefaultEndpoint defaultEndpoint) {
            this.defaultEndpoint = defaultEndpoint;
            return this;
        }
        public ListInstancesResponseBodyInstancesDefaultEndpoint getDefaultEndpoint() {
            return this.defaultEndpoint;
        }

        public ListInstancesResponseBodyInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstances setManagedServiceCode(String managedServiceCode) {
            this.managedServiceCode = managedServiceCode;
            return this;
        }
        public String getManagedServiceCode() {
            return this.managedServiceCode;
        }

        public ListInstancesResponseBodyInstances setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
