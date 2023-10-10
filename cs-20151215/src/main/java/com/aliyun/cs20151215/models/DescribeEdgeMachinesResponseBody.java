// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachinesResponseBody extends TeaModel {
    /**
     * <p>The list of cloud-native boxes.</p>
     */
    @NameInMap("edge_machines")
    public java.util.List<DescribeEdgeMachinesResponseBodyEdgeMachines> edgeMachines;

    /**
     * <p>The paging information.</p>
     */
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
        /**
         * <p>The time when the cloud-native box was activated.</p>
         */
        @NameInMap("active_time")
        public String activeTime;

        /**
         * <p>The time when the cloud-native box was created.</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>The device ID.</p>
         */
        @NameInMap("edge_machine_id")
        public String edgeMachineId;

        /**
         * <p>The `hostname` of the cloud-native box.</p>
         */
        @NameInMap("hostname")
        public String hostname;

        /**
         * <p>The lifecycle of the cloud-native box.</p>
         */
        @NameInMap("life_state")
        public String lifeState;

        /**
         * <p>The model of the cloud-native box.</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>The machine name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The status of the cloud-native box.</p>
         */
        @NameInMap("online_state")
        public String onlineState;

        /**
         * <p>The serial number.</p>
         */
        @NameInMap("sn")
        public String sn;

        /**
         * <p>The time when the cloud-native box was last updated.</p>
         */
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
        /**
         * <p>The page number.</p>
         * <br>
         * <p>Default value: 1.</p>
         */
        @NameInMap("page_number")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * <br>
         * <p>Default value: 10.</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>The total number of pages returned.</p>
         */
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
