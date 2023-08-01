// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListEcsNotInClusterResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about ECS instances.</p>
     */
    @NameInMap("EcsEntityList")
    public ListEcsNotInClusterResponseBodyEcsEntityList ecsEntityList;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListEcsNotInClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEcsNotInClusterResponseBody self = new ListEcsNotInClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEcsNotInClusterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEcsNotInClusterResponseBody setEcsEntityList(ListEcsNotInClusterResponseBodyEcsEntityList ecsEntityList) {
        this.ecsEntityList = ecsEntityList;
        return this;
    }
    public ListEcsNotInClusterResponseBodyEcsEntityList getEcsEntityList() {
        return this.ecsEntityList;
    }

    public ListEcsNotInClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEcsNotInClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The elastic IP address (EIP) associated with the ECS instance.</p>
         */
        @NameInMap("Eip")
        public String eip;

        /**
         * <p>Indicates whether the ECS instance has expired. Valid values:</p>
         * <br>
         * <p>*   **true**: The ECS instance has expired.</p>
         * <p>*   **false**: The ECS instance has not expired.</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The private IP address of the ECS instance.</p>
         */
        @NameInMap("InnerIp")
        public String innerIp;

        /**
         * <p>The ID of the ECS instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the ECS instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The size of memory. Unit: bytes.</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The private IP address of the ECS instance.</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The public IP address of the ECS instance.</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <p>The ID of the region where the ECS instance is located.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the ECS instance. Valid values:</p>
         * <br>
         * <p>*   **Pending**: The ECS instance is being created.</p>
         * <p>*   **Running**: The ECS instance is running.</p>
         * <p>*   **Starting**: The ECS instance is being started.</p>
         * <p>*   **Stopping**: The ECS instance is being stopped.</p>
         * <p>*   **Stopped**: The ECS instance is stopped.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity build(java.util.Map<String, ?> map) throws Exception {
            ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity self = new ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity();
            return TeaModel.build(map, self);
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class ListEcsNotInClusterResponseBodyEcsEntityList extends TeaModel {
        @NameInMap("EcsEntity")
        public java.util.List<ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity> ecsEntity;

        public static ListEcsNotInClusterResponseBodyEcsEntityList build(java.util.Map<String, ?> map) throws Exception {
            ListEcsNotInClusterResponseBodyEcsEntityList self = new ListEcsNotInClusterResponseBodyEcsEntityList();
            return TeaModel.build(map, self);
        }

        public ListEcsNotInClusterResponseBodyEcsEntityList setEcsEntity(java.util.List<ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity> ecsEntity) {
            this.ecsEntity = ecsEntity;
            return this;
        }
        public java.util.List<ListEcsNotInClusterResponseBodyEcsEntityListEcsEntity> getEcsEntity() {
            return this.ecsEntity;
        }

    }

}
