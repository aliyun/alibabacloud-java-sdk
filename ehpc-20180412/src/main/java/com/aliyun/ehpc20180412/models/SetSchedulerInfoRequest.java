// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetSchedulerInfoRequest extends TeaModel {
    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The information about PBS schedulers.</p>
     */
    @NameInMap("PbsInfo")
    public java.util.List<SetSchedulerInfoRequestPbsInfo> pbsInfo;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>You can call the [ListRegions](~~188593~~) operation to obtain the IDs of regions supported by Elastic High Performance Computing (E-HPC).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scheduler information.</p>
     */
    @NameInMap("Scheduler")
    public java.util.List<SetSchedulerInfoRequestScheduler> scheduler;

    /**
     * <p>The information about Slurm schedulers.</p>
     */
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
        /**
         * <p>The user that can use the queue. Separate multiple users with commas (`,`).</p>
         * <br>
         * <p>If you specify users, you must specify the PbsInfo.N.AclLimit.N.Queue parameter.</p>
         */
        @NameInMap("AclUsers")
        public String aclUsers;

        /**
         * <p>AclLimit specifies the queue that has limits when it is used. Valid values of N: 0 to 100.</p>
         * <br>
         * <p>If you set `PbsInfo.N.AclLimit.N.Queue` to `workq` and `PbsInfo.N.AclLimit.N.AclUsers` to `user1,user2`, workq can be used only by user1 and user2.</p>
         */
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
        /**
         * <p>The maximum number of vCPUs that can be used for nodes in a queue.</p>
         */
        @NameInMap("Cpus")
        public Integer cpus;

        /**
         * <p>The maximum number of jobs that can be submitted to the cluster. If the total number of running jobs and queuing jobs exceeds the value, no more jobs can be submitted.</p>
         */
        @NameInMap("MaxJobs")
        public Integer maxJobs;

        /**
         * <p>The maximum memory resources that can be used in a queue. Units:</p>
         * <br>
         * <p>*   gb</p>
         * <p>*   mb</p>
         * <p>*   kb</p>
         */
        @NameInMap("Mem")
        public String mem;

        /**
         * <p>The maximum number of nodes that can be used in a queue.</p>
         */
        @NameInMap("Nodes")
        public Integer nodes;

        /**
         * <p>PbsInfo specifies the number of PBS schedulers that can be configured in the cluster. Valid values of N: 0 to 100.</p>
         * <br>
         * <p>ResourceLimit specifies the maximum number of queue resources that can be used. Valid values of N: 0 to 100.</p>
         * <br>
         * <p>Queue specifies the name of the queue that is used to run jobs.</p>
         * <br>
         * <p>If one of the User, Cpus, Nodes, and Mem parameters is set in ResourceLimit, you must specify the Queue parameter.</p>
         */
        @NameInMap("Queue")
        public String queue;

        /**
         * <p>The name of the user that runs jobs.</p>
         */
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

        public SetSchedulerInfoRequestPbsInfoResourceLimit setMaxJobs(Integer maxJobs) {
            this.maxJobs = maxJobs;
            return this;
        }
        public Integer getMaxJobs() {
            return this.maxJobs;
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
        /**
         * <p>The information about limits on the queue.</p>
         */
        @NameInMap("AclLimit")
        public java.util.List<SetSchedulerInfoRequestPbsInfoAclLimit> aclLimit;

        /**
         * <p>The retention period of jobs. After the retention period is exceeded, job data is deleted. Unit: days.\</p>
         * <p>Valid values: 1 to 30.\</p>
         * <p>Default value: 14.</p>
         */
        @NameInMap("JobHistoryDuration")
        public Integer jobHistoryDuration;

        /**
         * <p>The information about the nodes that are used by cluster users.</p>
         */
        @NameInMap("ResourceLimit")
        public java.util.List<SetSchedulerInfoRequestPbsInfoResourceLimit> resourceLimit;

        /**
         * <p>PbsInfo specifies the number of PBS schedulers that can be configured in the cluster. Valid values of N: 0 to 100.</p>
         * <br>
         * <p>SchedInterval specifies the scheduling period. Unit: seconds.</p>
         * <br>
         * <p>A scheduling period is the interval between two consecutive running jobs. If you set SchedInterval to 60, another job can be run 60 seconds after a job starts running.</p>
         * <br>
         * <p>Default value: 60.</p>
         */
        @NameInMap("SchedInterval")
        public Integer schedInterval;

        /**
         * <p>The maximum number of jobs that can be scheduled in the cluster. If the total number of running jobs and queuing jobs exceeds the value, no more jobs can be submitted. Default value: 20000.</p>
         */
        @NameInMap("SchedMaxJobs")
        public Integer schedMaxJobs;

        /**
         * <p>The maximum number of queuing jobs that can be scheduled in the cluster. If the number of queuing jobs exceeds the value, no more jobs can be submitted. Default value: 10000.</p>
         */
        @NameInMap("SchedMaxQueuedJobs")
        public Integer schedMaxQueuedJobs;

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

        public SetSchedulerInfoRequestPbsInfo setSchedMaxJobs(Integer schedMaxJobs) {
            this.schedMaxJobs = schedMaxJobs;
            return this;
        }
        public Integer getSchedMaxJobs() {
            return this.schedMaxJobs;
        }

        public SetSchedulerInfoRequestPbsInfo setSchedMaxQueuedJobs(Integer schedMaxQueuedJobs) {
            this.schedMaxQueuedJobs = schedMaxQueuedJobs;
            return this;
        }
        public Integer getSchedMaxQueuedJobs() {
            return this.schedMaxQueuedJobs;
        }

    }

    public static class SetSchedulerInfoRequestScheduler extends TeaModel {
        /**
         * <p>The name of the scheduler. Valid values:</p>
         * <br>
         * <p>*   pbs</p>
         * <p>*   pbs19</p>
         * <p>*   slurm</p>
         * <p>*   slurm19</p>
         * <p>*   slurm20</p>
         * <br>
         * <p>>  If you set Scheduler.N.SchedName to pbs or pbs19, you must specify at least one of the PbsInfo.N.SchedInterval, PbsInfo.N.JobHistoryDuration, PbsInfo.N.ResourceLimit, and PbsInfo.N.AclLimit parameters. If you set Scheduler.N.SchedName to slurm, slurm19, or slurm20, you must specify at least one of the SlurmInfo.N.SchedInterval and SlurmInfo.N.BackfillInterval parameters.</p>
         */
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
        /**
         * <p>The backfill scheduling period. Unit: seconds.</p>
         * <br>
         * <p>Default value: 60.</p>
         */
        @NameInMap("BackfillInterval")
        public Integer backfillInterval;

        /**
         * <p>SlurmInfo specifies the number of Slurm schedulers that can be configured in the cluster. Valid values of N: 0 to 100.</p>
         * <br>
         * <p>SchedInterval specifies the scheduling period. Unit: seconds.</p>
         * <br>
         * <p>Default value: 60.</p>
         */
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
