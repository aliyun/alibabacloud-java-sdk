// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConvertableEcuResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The ECS instances that can be imported to the cluster.</p>
     */
    @NameInMap("InstanceList")
    public ListConvertableEcuResponseBodyInstanceList instanceList;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListConvertableEcuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConvertableEcuResponseBody self = new ListConvertableEcuResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConvertableEcuResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListConvertableEcuResponseBody setInstanceList(ListConvertableEcuResponseBodyInstanceList instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public ListConvertableEcuResponseBodyInstanceList getInstanceList() {
        return this.instanceList;
    }

    public ListConvertableEcuResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConvertableEcuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConvertableEcuResponseBodyInstanceListInstance extends TeaModel {
        /**
         * <p>The number of CPU cores of the ECS instance.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The ID of the elastic compute units (ECU).</p>
         */
        @NameInMap("EcuId")
        public String ecuId;

        /**
         * <p>The elastic IP address (EIP) associated with the ECS instance. The EIP can be changed.</p>
         */
        @NameInMap("Eip")
        public String eip;

        /**
         * <p>Indicates whether the ECS instance has expired.</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The private IP address of the ECS instance. This parameter is valid only when the ECS instance is deployed in a VPC.</p>
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
         * <p>The size of memory for the ECS instance.</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The private IP address of the ECS instance. This parameter is valid only when the ECS instance is deployed in a VPC.</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The public IP address of the ECS instance. This IP address can be used only by the ECS instance.</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <p>The ID of the region where the ECS instance is located.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <br>
         * <p>*   Pending: The instance is being created.</p>
         * <p>*   Running: The instance is running.</p>
         * <p>*   Starting: The instance is being started.</p>
         * <p>*   Stopping: The instance is being stopped.</p>
         * <p>*   Stopped: The instance is stopped.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static ListConvertableEcuResponseBodyInstanceListInstance build(java.util.Map<String, ?> map) throws Exception {
            ListConvertableEcuResponseBodyInstanceListInstance self = new ListConvertableEcuResponseBodyInstanceListInstance();
            return TeaModel.build(map, self);
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class ListConvertableEcuResponseBodyInstanceList extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<ListConvertableEcuResponseBodyInstanceListInstance> instance;

        public static ListConvertableEcuResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ListConvertableEcuResponseBodyInstanceList self = new ListConvertableEcuResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public ListConvertableEcuResponseBodyInstanceList setInstance(java.util.List<ListConvertableEcuResponseBodyInstanceListInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<ListConvertableEcuResponseBodyInstanceListInstance> getInstance() {
            return this.instance;
        }

    }

}
