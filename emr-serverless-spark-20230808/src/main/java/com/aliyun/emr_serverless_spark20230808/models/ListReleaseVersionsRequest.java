// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListReleaseVersionsRequest extends TeaModel {
    @NameInMap("regionId")
    public String regionId;

    @NameInMap("releaseType")
    public String releaseType;

    @NameInMap("releaseVersion")
    public String releaseVersion;

    @NameInMap("releaseVersionStatus")
    public String releaseVersionStatus;

    public static ListReleaseVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReleaseVersionsRequest self = new ListReleaseVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListReleaseVersionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListReleaseVersionsRequest setReleaseType(String releaseType) {
        this.releaseType = releaseType;
        return this;
    }
    public String getReleaseType() {
        return this.releaseType;
    }

    public ListReleaseVersionsRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public ListReleaseVersionsRequest setReleaseVersionStatus(String releaseVersionStatus) {
        this.releaseVersionStatus = releaseVersionStatus;
        return this;
    }
    public String getReleaseVersionStatus() {
        return this.releaseVersionStatus;
    }

}
