// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetSchedulerInfoRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PbsInfo")
    public java.util.List<SetSchedulerInfoRequestPbsInfo> pbsInfo;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Scheduler")
    public java.util.List<SetSchedulerInfoRequestScheduler> scheduler;

    @NameInMap("SlurmInfo")
    public java.util.List<SetSchedulerInfoRequestSlurmInfo> slurmInfo;

    public static SetSchedulerInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSchedulerInfoRequest self = new SetSchedulerInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetSchedulerInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SetSchedulerInfoRequest setPbsInfo(java.util.List<SetSchedulerInfoRequestPbsInfo> pbsInfo) {
        this.pbsInfo = pbsInfo;
        return this;
    }
    public java.util.List<SetSchedulerInfoRequestPbsInfo> getPbsInfo() {
        return this.pbsInfo;
    }

    public SetSchedulerInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetSchedulerInfoRequest setScheduler(java.util.List<SetSchedulerInfoRequestScheduler> scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public java.util.List<SetSchedulerInfoRequestScheduler> getScheduler() {
        return this.scheduler;
    }

    public SetSchedulerInfoRequest setSlurmInfo(java.util.List<SetSchedulerInfoRequestSlurmInfo> slurmInfo) {
        this.slurmInfo = slurmInfo;
        return this;
    }
    public java.util.List<SetSchedulerInfoRequestSlurmInfo> getSlurmInfo() {
        return this.slurmInfo;
    }

    public static class SetSchedulerInfoRequestPbsInfoAclLimit extends TeaModel {
        @NameInMap("AclUsers")
        public String aclUsers;

        @NameInMap("Queue")
        public String queue;

        public static SetSchedulerInfoRequestPbsInfoAclLimit build(java.util.Map<String, ?> map) throws Exception {
            SetSchedulerInfoRequestPbsInfoAclLimit self = new SetSchedulerInfoRequestPbsInfoAclLimit();
            return TeaModel.build(map, self);
        }

        public SetSchedulerInfoRequestPbsInfoAclLimit setAclUsers(String aclUsers) {
            this.aclUsers = aclUsers;
            return this;
        }
        public String getAclUsers() {
            return this.aclUsers;
        }

        public SetSchedulerInfoRequestPbsInfoAclLimit setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class SetSchedulerInfoRequestPbsInfoResourceLimit extends TeaModel {
        @NameInMap("Cpus")
        public Integer cpus;

        @NameInMap("Mem")
        public String mem;

        @NameInMap("Nodes")
        public Integer nodes;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("User")
        public String user;

        public static SetSchedulerInfoRequestPbsInfoResourceLimit build(java.util.Map<String, ?> map) throws Exception {
            SetSchedulerInfoRequestPbsInfoResourceLimit self = new SetSchedulerInfoRequestPbsInfoResourceLimit();
            return TeaModel.build(map, self);
        }

        public SetSchedulerInfoRequestPbsInfoResourceLimit setCpus(Integer cpus) {
            this.cpus = cpus;
            return this;
        }
        public Integer getCpus() {
            return this.cpus;
        }

        public SetSchedulerInfoRequestPbsInfoResourceLimit setMem(String mem) {
            this.mem = mem;
            return this;
        }
        public String getMem() {
            return this.mem;
        }

        public SetSchedulerInfoRequestPbsInfoResourceLimit setNodes(Integer nodes) {
            this.nodes = nodes;
            return this;
        }
        public Integer getNodes() {
            return this.nodes;
        }

        public SetSchedulerInfoRequestPbsInfoResourceLimit setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public SetSchedulerInfoRequestPbsInfoResourceLimit setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class SetSchedulerInfoRequestPbsInfo extends TeaModel {
        @NameInMap("AclLimit")
        public java.util.List<SetSchedulerInfoRequestPbsInfoAclLimit> aclLimit;

        @NameInMap("JobHistoryDuration")
        public Integer jobHistoryDuration;

        @NameInMap("ResourceLimit")
        public java.util.List<SetSchedulerInfoRequestPbsInfoResourceLimit> resourceLimit;

        @NameInMap("SchedInterval")
        public Integer schedInterval;

        public static SetSchedulerInfoRequestPbsInfo build(java.util.Map<String, ?> map) throws Exception {
            SetSchedulerInfoRequestPbsInfo self = new SetSchedulerInfoRequestPbsInfo();
            return TeaModel.build(map, self);
        }

        public SetSchedulerInfoRequestPbsInfo setAclLimit(java.util.List<SetSchedulerInfoRequestPbsInfoAclLimit> aclLimit) {
            this.aclLimit = aclLimit;
            return this;
        }
        public java.util.List<SetSchedulerInfoRequestPbsInfoAclLimit> getAclLimit() {
            return this.aclLimit;
        }

        public SetSchedulerInfoRequestPbsInfo setJobHistoryDuration(Integer jobHistoryDuration) {
            this.jobHistoryDuration = jobHistoryDuration;
            return this;
        }
        public Integer getJobHistoryDuration() {
            return this.jobHistoryDuration;
        }

        public SetSchedulerInfoRequestPbsInfo setResourceLimit(java.util.List<SetSchedulerInfoRequestPbsInfoResourceLimit> resourceLimit) {
            this.resourceLimit = resourceLimit;
            return this;
        }
        public java.util.List<SetSchedulerInfoRequestPbsInfoResourceLimit> getResourceLimit() {
            return this.resourceLimit;
        }

        public SetSchedulerInfoRequestPbsInfo setSchedInterval(Integer schedInterval) {
            this.schedInterval = schedInterval;
            return this;
        }
        public Integer getSchedInterval() {
            return this.schedInterval;
        }

    }

    public static class SetSchedulerInfoRequestScheduler extends TeaModel {
        @NameInMap("SchedName")
        public String schedName;

        public static SetSchedulerInfoRequestScheduler build(java.util.Map<String, ?> map) throws Exception {
            SetSchedulerInfoRequestScheduler self = new SetSchedulerInfoRequestScheduler();
            return TeaModel.build(map, self);
        }

        public SetSchedulerInfoRequestScheduler setSchedName(String schedName) {
            this.schedName = schedName;
            return this;
        }
        public String getSchedName() {
            return this.schedName;
        }

    }

    public static class SetSchedulerInfoRequestSlurmInfo extends TeaModel {
        @NameInMap("BackfillInterval")
        public Integer backfillInterval;

        @NameInMap("SchedInterval")
        public Integer schedInterval;

        public static SetSchedulerInfoRequestSlurmInfo build(java.util.Map<String, ?> map) throws Exception {
            SetSchedulerInfoRequestSlurmInfo self = new SetSchedulerInfoRequestSlurmInfo();
            return TeaModel.build(map, self);
        }

        public SetSchedulerInfoRequestSlurmInfo setBackfillInterval(Integer backfillInterval) {
            this.backfillInterval = backfillInterval;
            return this;
        }
        public Integer getBackfillInterval() {
            return this.backfillInterval;
        }

        public SetSchedulerInfoRequestSlurmInfo setSchedInterval(Integer schedInterval) {
            this.schedInterval = schedInterval;
            return this;
        }
        public Integer getSchedInterval() {
            return this.schedInterval;
        }

    }

}
