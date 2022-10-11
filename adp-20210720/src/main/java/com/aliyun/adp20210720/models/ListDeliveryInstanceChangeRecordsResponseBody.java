// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListDeliveryInstanceChangeRecordsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListDeliveryInstanceChangeRecordsResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    public static ListDeliveryInstanceChangeRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryInstanceChangeRecordsResponseBody self = new ListDeliveryInstanceChangeRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeliveryInstanceChangeRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeliveryInstanceChangeRecordsResponseBody setData(java.util.List<ListDeliveryInstanceChangeRecordsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDeliveryInstanceChangeRecordsResponseBodyData> getData() {
        return this.data;
    }

    public ListDeliveryInstanceChangeRecordsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo extends TeaModel {
        @NameInMap("capacity")
        public String capacity;

        @NameInMap("cpu")
        public String cpu;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("label")
        public java.util.Map<String, ?> label;

        @NameInMap("memory")
        public String memory;

        @NameInMap("name")
        public String name;

        @NameInMap("privateIP")
        public String privateIP;

        @NameInMap("taints")
        public java.util.Map<String, ?> taints;

        public static ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo self = new ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo();
            return TeaModel.build(map, self);
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo setLabel(java.util.Map<String, ?> label) {
            this.label = label;
            return this;
        }
        public java.util.Map<String, ?> getLabel() {
            return this.label;
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }
        public String getPrivateIP() {
            return this.privateIP;
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo setTaints(java.util.Map<String, ?> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.Map<String, ?> getTaints() {
            return this.taints;
        }

    }

    public static class ListDeliveryInstanceChangeRecordsResponseBodyData extends TeaModel {
        @NameInMap("deliverableUID")
        public String deliverableUID;

        @NameInMap("envChangeRecords")
        public java.util.Map<String, ?> envChangeRecords;

        @NameInMap("envNodeInfo")
        public java.util.List<ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo> envNodeInfo;

        @NameInMap("envPackageConfig")
        public String envPackageConfig;

        @NameInMap("originDeliverableUID")
        public String originDeliverableUID;

        @NameInMap("uid")
        public String uid;

        public static ListDeliveryInstanceChangeRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryInstanceChangeRecordsResponseBodyData self = new ListDeliveryInstanceChangeRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyData setDeliverableUID(String deliverableUID) {
            this.deliverableUID = deliverableUID;
            return this;
        }
        public String getDeliverableUID() {
            return this.deliverableUID;
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyData setEnvChangeRecords(java.util.Map<String, ?> envChangeRecords) {
            this.envChangeRecords = envChangeRecords;
            return this;
        }
        public java.util.Map<String, ?> getEnvChangeRecords() {
            return this.envChangeRecords;
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyData setEnvNodeInfo(java.util.List<ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo> envNodeInfo) {
            this.envNodeInfo = envNodeInfo;
            return this;
        }
        public java.util.List<ListDeliveryInstanceChangeRecordsResponseBodyDataEnvNodeInfo> getEnvNodeInfo() {
            return this.envNodeInfo;
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyData setEnvPackageConfig(String envPackageConfig) {
            this.envPackageConfig = envPackageConfig;
            return this;
        }
        public String getEnvPackageConfig() {
            return this.envPackageConfig;
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyData setOriginDeliverableUID(String originDeliverableUID) {
            this.originDeliverableUID = originDeliverableUID;
            return this;
        }
        public String getOriginDeliverableUID() {
            return this.originDeliverableUID;
        }

        public ListDeliveryInstanceChangeRecordsResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
