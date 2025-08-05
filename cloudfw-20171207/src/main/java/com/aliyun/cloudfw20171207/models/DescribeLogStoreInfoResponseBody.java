// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeLogStoreInfoResponseBody extends TeaModel {
    /**
     * <p>The name of the SLS LogStore in the log service.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-logstore</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

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

    public DescribeLogStoreInfoResponseBody setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
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

}
