// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeLogStoreInfoResponseBody extends TeaModel {
    @NameInMap("InfoList")
    public java.util.List<DescribeLogStoreInfoResponseBodyInfoList> infoList;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LogModifyQuota")
    public Integer logModifyQuota;

    /**
     * <p>The name of the SLS LogStore in the log service.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-logstore</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LogVersion")
    public Integer logVersion;

    /**
     * <p>The Project name of the log service.</p>
     * 
     * <strong>example:</strong>
     * <p>project-xxx-cn-hangzhou</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Available log storage capacity. Unit: Byte.</p>
     * 
     * <strong>example:</strong>
     * <p>50000000</p>
     */
    @NameInMap("Quota")
    public Long quota;

    /**
     * <p>The region ID for log delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>C6C3B72B********E95FB0A161</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>用户进行日志修改所产生的任务id。</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>50000000</p>
     */
    @NameInMap("TotalQuota")
    public Long totalQuota;

    /**
     * <p>Log storage duration. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>Used storage capacity. Unit: Byte.</p>
     * <blockquote>
     * <p>The statistics of the log service have a delay of approximately two hours.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Used")
    public Long used;

    public static DescribeLogStoreInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreInfoResponseBody self = new DescribeLogStoreInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreInfoResponseBody setInfoList(java.util.List<DescribeLogStoreInfoResponseBodyInfoList> infoList) {
        this.infoList = infoList;
        return this;
    }
    public java.util.List<DescribeLogStoreInfoResponseBodyInfoList> getInfoList() {
        return this.infoList;
    }

    public DescribeLogStoreInfoResponseBody setLogModifyQuota(Integer logModifyQuota) {
        this.logModifyQuota = logModifyQuota;
        return this;
    }
    public Integer getLogModifyQuota() {
        return this.logModifyQuota;
    }

    public DescribeLogStoreInfoResponseBody setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public DescribeLogStoreInfoResponseBody setLogVersion(Integer logVersion) {
        this.logVersion = logVersion;
        return this;
    }
    public Integer getLogVersion() {
        return this.logVersion;
    }

    public DescribeLogStoreInfoResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeLogStoreInfoResponseBody setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

    public DescribeLogStoreInfoResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLogStoreInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogStoreInfoResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeLogStoreInfoResponseBody setTotalQuota(Long totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public Long getTotalQuota() {
        return this.totalQuota;
    }

    public DescribeLogStoreInfoResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public DescribeLogStoreInfoResponseBody setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

    public static class DescribeLogStoreInfoResponseBodyInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx-logstore</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaxSplitShard")
        public Integer maxSplitShard;

        /**
         * <strong>example:</strong>
         * <p>cloudfirewall-project-14151892848****-cn-hangzhou</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>50000000</p>
         */
        @NameInMap("Quota")
        public Long quota;

        /**
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Shard")
        public Integer shard;

        /**
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Site")
        public String site;

        /**
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <strong>example:</strong>
         * <p>21852955752</p>
         */
        @NameInMap("Used")
        public Long used;

        public static DescribeLogStoreInfoResponseBodyInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogStoreInfoResponseBodyInfoList self = new DescribeLogStoreInfoResponseBodyInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeLogStoreInfoResponseBodyInfoList setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeLogStoreInfoResponseBodyInfoList setMaxSplitShard(Integer maxSplitShard) {
            this.maxSplitShard = maxSplitShard;
            return this;
        }
        public Integer getMaxSplitShard() {
            return this.maxSplitShard;
        }

        public DescribeLogStoreInfoResponseBodyInfoList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeLogStoreInfoResponseBodyInfoList setQuota(Long quota) {
            this.quota = quota;
            return this;
        }
        public Long getQuota() {
            return this.quota;
        }

        public DescribeLogStoreInfoResponseBodyInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeLogStoreInfoResponseBodyInfoList setShard(Integer shard) {
            this.shard = shard;
            return this;
        }
        public Integer getShard() {
            return this.shard;
        }

        public DescribeLogStoreInfoResponseBodyInfoList setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public DescribeLogStoreInfoResponseBodyInfoList setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeLogStoreInfoResponseBodyInfoList setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

}
