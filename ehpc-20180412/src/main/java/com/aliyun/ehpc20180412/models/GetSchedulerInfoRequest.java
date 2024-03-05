// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetSchedulerInfoRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID of the cluster.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The detailed settings of the scheduler.</p>
     */
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
        /**
         * <p>The scheduler name. Valid values:</p>
         * <br>
         * <p>*   pbs</p>
         * <p>*   pbs19</p>
         * <p>*   slurm</p>
         * <p>*   slurm19</p>
         * <p>*   slurm20</p>
         * <br>
         * <p>Valid values of N: 0 to 100.</p>
         */
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
