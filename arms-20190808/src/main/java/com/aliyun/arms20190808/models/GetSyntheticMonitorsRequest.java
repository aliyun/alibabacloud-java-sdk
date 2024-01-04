// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticMonitorsRequest extends TeaModel {
    /**
     * <p>The query conditions.</p>
     */
    @NameInMap("Filter")
    public GetSyntheticMonitorsRequestFilter filter;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetSyntheticMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticMonitorsRequest self = new GetSyntheticMonitorsRequest();
        return TeaModel.build(map, self);
    }

    public GetSyntheticMonitorsRequest setFilter(GetSyntheticMonitorsRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public GetSyntheticMonitorsRequestFilter getFilter() {
        return this.filter;
    }

    public GetSyntheticMonitorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class GetSyntheticMonitorsRequestFilter extends TeaModel {
        /**
         * <p>The type of the monitoring point. Valid values: 1: PC. 2: mobile device.</p>
         */
        @NameInMap("MonitorCategory")
        public Integer monitorCategory;

        /**
         * <p>The network type. Valid values: 1: private network. 2: Internet.</p>
         */
        @NameInMap("Network")
        public Integer network;

        /**
         * <p>The type of the monitoring task. Valid values:</p>
         * <br>
         * <p>1: ICMP. 2: TCP. 3: DNS. 4: HTTP. 5: website speed. 6: file download.</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        public static GetSyntheticMonitorsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticMonitorsRequestFilter self = new GetSyntheticMonitorsRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetSyntheticMonitorsRequestFilter setMonitorCategory(Integer monitorCategory) {
            this.monitorCategory = monitorCategory;
            return this;
        }
        public Integer getMonitorCategory() {
            return this.monitorCategory;
        }

        public GetSyntheticMonitorsRequestFilter setNetwork(Integer network) {
            this.network = network;
            return this;
        }
        public Integer getNetwork() {
            return this.network;
        }

        public GetSyntheticMonitorsRequestFilter setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

}
