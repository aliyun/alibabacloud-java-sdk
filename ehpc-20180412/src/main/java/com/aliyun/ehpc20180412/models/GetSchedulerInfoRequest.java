// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetSchedulerInfoRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Scheduler")
    public java.util.List<GetSchedulerInfoRequestScheduler> scheduler;

    public static GetSchedulerInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSchedulerInfoRequest self = new GetSchedulerInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSchedulerInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetSchedulerInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSchedulerInfoRequest setScheduler(java.util.List<GetSchedulerInfoRequestScheduler> scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public java.util.List<GetSchedulerInfoRequestScheduler> getScheduler() {
        return this.scheduler;
    }

    public static class GetSchedulerInfoRequestScheduler extends TeaModel {
        @NameInMap("SchedName")
        public String schedName;

        public static GetSchedulerInfoRequestScheduler build(java.util.Map<String, ?> map) throws Exception {
            GetSchedulerInfoRequestScheduler self = new GetSchedulerInfoRequestScheduler();
            return TeaModel.build(map, self);
        }

        public GetSchedulerInfoRequestScheduler setSchedName(String schedName) {
            this.schedName = schedName;
            return this;
        }
        public String getSchedName() {
            return this.schedName;
        }

    }

}
