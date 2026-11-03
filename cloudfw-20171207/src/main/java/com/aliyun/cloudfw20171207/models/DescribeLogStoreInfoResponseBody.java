// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeLogStoreInfoResponseBody extends TeaModel {
    /**
     * <p>The information list.</p>
     */
    @NameInMap("InfoList")
    public java.util.List<DescribeLogStoreInfoResponseBodyInfoList> infoList;

    /**
     * <p>The number of times the user can switch the log mode.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LogModifyQuota")
    public Integer logModifyQuota;

    /**
     * <p>The name of the Simple Log Service Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-logstore</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The log version. Valid values: 1: one Logstore. 2: two Logstores.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LogVersion")
    public Integer logVersion;

    /**
     * <p>The name of the Simple Log Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>project-xxx-cn-hangzhou</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The available log storage capacity. Unit: bytes.</p>
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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C6C3B72B********E95FB0A161</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The total log storage capacity purchased by the user.</p>
     * 
     * <strong>example:</strong>
     * <p>50000000</p>
     */
    @NameInMap("TotalQuota")
    public Long totalQuota;

    /**
     * <p>The storage duration of logs. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The used storage capacity. Unit: bytes.</p>
     * <blockquote>
     * <p>The statistics of Simple Log Service have a delay of about two hours.</p>
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
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-logstore</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The maximum number of shards supported for elastic scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaxSplitShard")
        public Integer maxSplitShard;

        /**
         * <p>The name of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudfirewall-project-14151892848****-cn-hangzhou</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The storage capacity threshold. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>50000000</p>
         */
        @NameInMap("Quota")
        public Long quota;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of shards currently in use.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Shard")
        public Integer shard;

        /**
         * <p>The site to which the Logstore belongs. Valid values: cn: the Chinese mainland. intl: outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Site")
        public String site;

        /**
         * <p>The storage duration of logs. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The volume of stored logs. Unit: bytes.</p>
         * 
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
