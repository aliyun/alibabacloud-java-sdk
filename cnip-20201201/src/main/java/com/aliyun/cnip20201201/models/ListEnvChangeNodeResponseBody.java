// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeNodeResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEnvChangeNodeResponseBodyData data;

    public static ListEnvChangeNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeNodeResponseBody self = new ListEnvChangeNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeNodeResponseBody setData(ListEnvChangeNodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvChangeNodeResponseBodyData getData() {
        return this.data;
    }

    public static class ListEnvChangeNodeResponseBodyDataList extends TeaModel {
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

        public static ListEnvChangeNodeResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvChangeNodeResponseBodyDataList self = new ListEnvChangeNodeResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvChangeNodeResponseBodyDataList setPrivateIP(String privateIP) {
            this.privateIP = privateIP;
            return this;
        }
        public String getPrivateIP() {
            return this.privateIP;
        }

        public ListEnvChangeNodeResponseBodyDataList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListEnvChangeNodeResponseBodyDataList setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public ListEnvChangeNodeResponseBodyDataList setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public ListEnvChangeNodeResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvChangeNodeResponseBodyDataList setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public ListEnvChangeNodeResponseBodyDataList setLabel(java.util.Map<String, ?> label) {
            this.label = label;
            return this;
        }
        public java.util.Map<String, ?> getLabel() {
            return this.label;
        }

        public ListEnvChangeNodeResponseBodyDataList setTaints(java.util.Map<String, ?> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.Map<String, ?> getTaints() {
            return this.taints;
        }

    }

    public static class ListEnvChangeNodeResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvChangeNodeResponseBodyDataList> list;

        public static ListEnvChangeNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvChangeNodeResponseBodyData self = new ListEnvChangeNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvChangeNodeResponseBodyData setList(java.util.List<ListEnvChangeNodeResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvChangeNodeResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
