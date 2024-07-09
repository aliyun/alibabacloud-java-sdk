// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListReleaseVersionsRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The type of the version.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>stable</li>
     * <li>beta</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>stable</p>
     */
    @NameInMap("releaseType")
    public String releaseType;

    /**
     * <p>The version of Serverless Spark.</p>
     * 
     * <strong>example:</strong>
     * <p>esr-2.1 (Spark 3.3.1, Scala 2.12, Java Runtime)</p>
     */
    @NameInMap("releaseVersion")
    public String releaseVersion;

    /**
     * <p>The status of the version. Valid values:</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ONLINE</li>
     * <li>OFFLINE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ONLINE</p>
     */
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
