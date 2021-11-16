// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachinesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("edge_machines")
    public java.util.List<DescribeEdgeMachinesResponseBodyEdgeMachines> edgeMachines;

    // page info
    @NameInMap("page_info")
    public DescribeEdgeMachinesResponseBodyPageInfo pageInfo;

    public static DescribeEdgeMachinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMachinesResponseBody self = new DescribeEdgeMachinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMachinesResponseBody setEdgeMachines(java.util.List<DescribeEdgeMachinesResponseBodyEdgeMachines> edgeMachines) {
        this.edgeMachines = edgeMachines;
        return this;
    }
    public java.util.List<DescribeEdgeMachinesResponseBodyEdgeMachines> getEdgeMachines() {
        return this.edgeMachines;
    }

    public DescribeEdgeMachinesResponseBody setPageInfo(DescribeEdgeMachinesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeEdgeMachinesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static class DescribeEdgeMachinesResponseBodyEdgeMachines extends TeaModel {
        // actvite time
        @NameInMap("active_time")
        public String activeTime;

        // created time
        @NameInMap("created")
        public String created;

        // edge machine id
        @NameInMap("edge_machine_id")
        public String edgeMachineId;

        // hostname
        @NameInMap("hostname")
        public String hostname;

        // life state
        @NameInMap("life_state")
        public String lifeState;

        // model
        @NameInMap("model")
        public String model;

        // name of edgemachine
        @NameInMap("name")
        public String name;

        // online state
        @NameInMap("online_state")
        public String onlineState;

        // sn
        @NameInMap("sn")
        public String sn;

        // update time
        @NameInMap("updated")
        public String updated;

        public static DescribeEdgeMachinesResponseBodyEdgeMachines build(java.util.Map<String, ?> map) throws Exception {
            DescribeEdgeMachinesResponseBodyEdgeMachines self = new DescribeEdgeMachinesResponseBodyEdgeMachines();
            return TeaModel.build(map, self);
        }

        public DescribeEdgeMachinesResponseBodyEdgeMachines setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public DescribeEdgeMachinesResponseBodyEdgeMachines setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public DescribeEdgeMachinesResponseBodyEdgeMachines setEdgeMachineId(String edgeMachineId) {
            this.edgeMachineId = edgeMachineId;
            return this;
        }
        public String getEdgeMachineId() {
            return this.edgeMachineId;
        }

        public DescribeEdgeMachinesResponseBodyEdgeMachines setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DescribeEdgeMachinesResponseBodyEdgeMachines setLifeState(String lifeState) {
            this.lifeState = lifeState;
            return this;
        }
        public String getLifeState() {
            return this.lifeState;
        }

        public DescribeEdgeMachinesResponseBodyEdgeMachines setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeEdgeMachinesResponseBodyEdgeMachines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEdgeMachinesResponseBodyEdgeMachines setOnlineState(String onlineState) {
            this.onlineState = onlineState;
            return this;
        }
        public String getOnlineState() {
            return this.onlineState;
        }

        public DescribeEdgeMachinesResponseBodyEdgeMachines setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public DescribeEdgeMachinesResponseBodyEdgeMachines setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

    public static class DescribeEdgeMachinesResponseBodyPageInfo extends TeaModel {
        // page number
        @NameInMap("page_number")
        public Integer pageNumber;

        // page size
        @NameInMap("page_size")
        public Integer pageSize;

        // total count
        @NameInMap("total_count")
        public Integer totalCount;

        public static DescribeEdgeMachinesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEdgeMachinesResponseBodyPageInfo self = new DescribeEdgeMachinesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEdgeMachinesResponseBodyPageInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeEdgeMachinesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeEdgeMachinesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
