// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20171204.models;

import com.aliyun.tea.*;

public class UpdateTrailResponseBody extends TeaModel {
    @NameInMap("MnsTopicArn")
    public String mnsTopicArn;

    @NameInMap("SlsProjectArn")
    public String slsProjectArn;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("EventRW")
    public String eventRW;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HomeRegion")
    public String homeRegion;

    @NameInMap("OssKeyPrefix")
    public String ossKeyPrefix;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("SlsWriteRoleArn")
    public String slsWriteRoleArn;

    @NameInMap("TrailRegion")
    public String trailRegion;

    @NameInMap("Name")
    public String name;

    public static UpdateTrailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrailResponseBody self = new UpdateTrailResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrailResponseBody setMnsTopicArn(String mnsTopicArn) {
        this.mnsTopicArn = mnsTopicArn;
        return this;
    }
    public String getMnsTopicArn() {
        return this.mnsTopicArn;
    }

    public UpdateTrailResponseBody setSlsProjectArn(String slsProjectArn) {
        this.slsProjectArn = slsProjectArn;
        return this;
    }
    public String getSlsProjectArn() {
        return this.slsProjectArn;
    }

    public UpdateTrailResponseBody setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public UpdateTrailResponseBody setEventRW(String eventRW) {
        this.eventRW = eventRW;
        return this;
    }
    public String getEventRW() {
        return this.eventRW;
    }

    public UpdateTrailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTrailResponseBody setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
        return this;
    }
    public String getHomeRegion() {
        return this.homeRegion;
    }

    public UpdateTrailResponseBody setOssKeyPrefix(String ossKeyPrefix) {
        this.ossKeyPrefix = ossKeyPrefix;
        return this;
    }
    public String getOssKeyPrefix() {
        return this.ossKeyPrefix;
    }

    public UpdateTrailResponseBody setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
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

    public UpdateTrailResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
