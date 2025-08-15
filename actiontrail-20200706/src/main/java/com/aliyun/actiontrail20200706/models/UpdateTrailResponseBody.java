// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class UpdateTrailResponseBody extends TeaModel {
    /**
     * <p>The read/write type of the events to be delivered.</p>
     * 
     * <strong>example:</strong>
     * <p>Write</p>
     */
    @NameInMap("EventRW")
    public String eventRW;

    /**
     * <p>The home region of the trail.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("HomeRegion")
    public String homeRegion;

    /**
     * <p>ARN of the Big Data Compute Service project for tracking delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:odps:cn-hangzhou:151266687691****:project/actiontrail_****</p>
     */
    @NameInMap("MaxComputeProjectArn")
    public String maxComputeProjectArn;

    /**
     * <p>The ARN of the role that Operation Audit assumes when delivering operation events to the Big Data Compute Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::151266687691****:role/aliyunserviceroleforactiontrail</p>
     */
    @NameInMap("MaxComputeWriteRoleArn")
    public String maxComputeWriteRoleArn;

    /**
     * <p>The name of the trail.</p>
     * 
     * <strong>example:</strong>
     * <p>trail-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>audit-log</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The prefix of the log files to be stored in the destination OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>at-product-account-audit-B</p>
     */
    @NameInMap("OssKeyPrefix")
    public String ossKeyPrefix;

    /**
     * <p>The ARN of the RAM role that is assumed by ActionTrail to deliver events to the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::***:role/aliyunserviceroleforactiontrail</p>
     */
    @NameInMap("OssWriteRoleArn")
    public String ossWriteRoleArn;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2599A180-5236-44D8-9490-50B6F4F8BA35</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ARN of the Log Service project to which events are to be delivered.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:log:cn-hangzhou:151266687691****:project/test-project</p>
     */
    @NameInMap("SlsProjectArn")
    public String slsProjectArn;

    /**
     * <p>The ARN of the RAM role that is assumed by ActionTrail is to deliver events to the Log Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::***:role/aliyunserviceroleforactiontrail</p>
     */
    @NameInMap("SlsWriteRoleArn")
    public String slsWriteRoleArn;

    /**
     * <p>The one or more regions from which the trail delivers events.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("TrailRegion")
    public String trailRegion;

    public static UpdateTrailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrailResponseBody self = new UpdateTrailResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrailResponseBody setEventRW(String eventRW) {
        this.eventRW = eventRW;
        return this;
    }
    public String getEventRW() {
        return this.eventRW;
    }

    public UpdateTrailResponseBody setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
        return this;
    }
    public String getHomeRegion() {
        return this.homeRegion;
    }

    public UpdateTrailResponseBody setMaxComputeProjectArn(String maxComputeProjectArn) {
        this.maxComputeProjectArn = maxComputeProjectArn;
        return this;
    }
    public String getMaxComputeProjectArn() {
        return this.maxComputeProjectArn;
    }

    public UpdateTrailResponseBody setMaxComputeWriteRoleArn(String maxComputeWriteRoleArn) {
        this.maxComputeWriteRoleArn = maxComputeWriteRoleArn;
        return this;
    }
    public String getMaxComputeWriteRoleArn() {
        return this.maxComputeWriteRoleArn;
    }

    public UpdateTrailResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTrailResponseBody setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public UpdateTrailResponseBody setOssKeyPrefix(String ossKeyPrefix) {
        this.ossKeyPrefix = ossKeyPrefix;
        return this;
    }
    public String getOssKeyPrefix() {
        return this.ossKeyPrefix;
    }

    public UpdateTrailResponseBody setOssWriteRoleArn(String ossWriteRoleArn) {
        this.ossWriteRoleArn = ossWriteRoleArn;
        return this;
    }
    public String getOssWriteRoleArn() {
        return this.ossWriteRoleArn;
    }

    public UpdateTrailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTrailResponseBody setSlsProjectArn(String slsProjectArn) {
        this.slsProjectArn = slsProjectArn;
        return this;
    }
    public String getSlsProjectArn() {
        return this.slsProjectArn;
    }

    public UpdateTrailResponseBody setSlsWriteRoleArn(String slsWriteRoleArn) {
        this.slsWriteRoleArn = slsWriteRoleArn;
        return this;
    }
    public String getSlsWriteRoleArn() {
        return this.slsWriteRoleArn;
    }

    public UpdateTrailResponseBody setTrailRegion(String trailRegion) {
        this.trailRegion = trailRegion;
        return this;
    }
    public String getTrailRegion() {
        return this.trailRegion;
    }

}
