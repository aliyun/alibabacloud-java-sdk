// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticMonitorsRequest extends TeaModel {
    @NameInMap("Filter")
    public GetSyntheticMonitorsRequestFilter filter;

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
        @NameInMap("MonitorCategory")
        public Integer monitorCategory;

        @NameInMap("Network")
        public Integer network;

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
