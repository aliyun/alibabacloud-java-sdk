// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20171204.models;

import com.aliyun.tea.*;

public class CreateTrailRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssKeyPrefix")
    public String ossKeyPrefix;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("SlsProjectArn")
    public String slsProjectArn;

    @NameInMap("SlsWriteRoleArn")
    public String slsWriteRoleArn;

    @NameInMap("EventRW")
    public String eventRW;

    @NameInMap("TrailRegion")
    public String trailRegion;

    @NameInMap("MnsTopicArn")
    public String mnsTopicArn;

    @NameInMap("IsOrganizationTrail")
    public Boolean isOrganizationTrail;

    public static CreateTrailRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrailRequest self = new CreateTrailRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTrailRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateTrailRequest setOssKeyPrefix(String ossKeyPrefix) {
        this.ossKeyPrefix = ossKeyPrefix;
        return this;
    }
    public String getOssKeyPrefix() {
        return this.ossKeyPrefix;
    }

    public CreateTrailRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public CreateTrailRequest setSlsProjectArn(String slsProjectArn) {
        this.slsProjectArn = slsProjectArn;
        return this;
    }
    public String getSlsProjectArn() {
        return this.slsProjectArn;
    }

    public CreateTrailRequest setSlsWriteRoleArn(String slsWriteRoleArn) {
        this.slsWriteRoleArn = slsWriteRoleArn;
        return this;
    }
    public String getSlsWriteRoleArn() {
        return this.slsWriteRoleArn;
    }

    public CreateTrailRequest setEventRW(String eventRW) {
        this.eventRW = eventRW;
        return this;
    }
    public String getEventRW() {
        return this.eventRW;
    }

    public CreateTrailRequest setTrailRegion(String trailRegion) {
        this.trailRegion = trailRegion;
        return this;
    }
    public String getTrailRegion() {
        return this.trailRegion;
    }

    public CreateTrailRequest setMnsTopicArn(String mnsTopicArn) {
        this.mnsTopicArn = mnsTopicArn;
        return this;
    }
    public String getMnsTopicArn() {
        return this.mnsTopicArn;
    }

    public CreateTrailRequest setIsOrganizationTrail(Boolean isOrganizationTrail) {
        this.isOrganizationTrail = isOrganizationTrail;
        return this;
    }
    public Boolean getIsOrganizationTrail() {
        return this.isOrganizationTrail;
    }

}
