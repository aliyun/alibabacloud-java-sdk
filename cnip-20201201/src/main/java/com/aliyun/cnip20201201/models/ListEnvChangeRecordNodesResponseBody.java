// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeRecordNodesResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEnvChangeRecordNodesResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    public static ListEnvChangeRecordNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeRecordNodesResponseBody self = new ListEnvChangeRecordNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeRecordNodesResponseBody setData(ListEnvChangeRecordNodesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvChangeRecordNodesResponseBodyData getData() {
        return this.data;
    }

    public ListEnvChangeRecordNodesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListEnvChangeRecordNodesResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public static class ListEnvChangeRecordNodesResponseBodyDataList extends TeaModel {
        // 节点
        @NameInMap("privateIP")
        public String privateIP;

        // 节点类型
        @NameInMap("identifier")
        public String identifier;

        // cpu
        @NameInMap("cpu")
        public String cpu;

        // 内存
        @NameInMap("memory")
        public String memory;

        // 系统盘起始
        @NameInMap("name")
        public String name;

        // 系统盘结束
        @NameInMap("capacity")
        public String capacity;

        // 标签
        @NameInMap("label")
        public java.util.Map<String, ?> label;

        // 污点
        @NameInMap("taints")
        public java.util.Map<String, ?> taints;

        public static ListEnvChangeRecordNodesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvChangeRecordNodesResponseBodyDataList self = new ListEnvChangeRecordNodesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvChangeRecordNodesResponseBodyDataList setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }
        public String getPrivateIP() {
            return this.privateIP;
        }

        public ListEnvChangeRecordNodesResponseBodyDataList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListEnvChangeRecordNodesResponseBodyDataList setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public ListEnvChangeRecordNodesResponseBodyDataList setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public ListEnvChangeRecordNodesResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvChangeRecordNodesResponseBodyDataList setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public ListEnvChangeRecordNodesResponseBodyDataList setLabel(java.util.Map<String, ?> label) {
            this.label = label;
            return this;
        }
        public java.util.Map<String, ?> getLabel() {
            return this.label;
        }

        public ListEnvChangeRecordNodesResponseBodyDataList setTaints(java.util.Map<String, ?> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.Map<String, ?> getTaints() {
            return this.taints;
        }

    }

    public static class ListEnvChangeRecordNodesResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvChangeRecordNodesResponseBodyDataList> list;

        public static ListEnvChangeRecordNodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvChangeRecordNodesResponseBodyData self = new ListEnvChangeRecordNodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvChangeRecordNodesResponseBodyData setList(java.util.List<ListEnvChangeRecordNodesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvChangeRecordNodesResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
