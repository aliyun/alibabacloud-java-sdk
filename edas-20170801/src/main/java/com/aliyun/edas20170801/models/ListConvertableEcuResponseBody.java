// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConvertableEcuResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceList")
    public ListConvertableEcuResponseBodyInstanceList instanceList;

    @NameInMap("Code")
    public Integer code;

    public static ListConvertableEcuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConvertableEcuResponseBody self = new ListConvertableEcuResponseBody();
        return TeaModel.build(map, self);
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

    public ListConvertableEcuResponseBody setInstanceList(ListConvertableEcuResponseBodyInstanceList instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public ListConvertableEcuResponseBodyInstanceList getInstanceList() {
        return this.instanceList;
    }

    public ListConvertableEcuResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListConvertableEcuResponseBodyInstanceListInstance extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("EcuId")
        public String ecuId;

        @NameInMap("InnerIp")
        public String innerIp;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Eip")
        public String eip;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("PublicIp")
        public String publicIp;

        public static ListConvertableEcuResponseBodyInstanceListInstance build(java.util.Map<String, ?> map) throws Exception {
            ListConvertableEcuResponseBodyInstanceListInstance self = new ListConvertableEcuResponseBodyInstanceListInstance();
            return TeaModel.build(map, self);
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

        public ListConvertableEcuResponseBodyInstanceListInstance setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListConvertableEcuResponseBodyInstanceListInstance setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
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
