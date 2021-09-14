// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class PublishScreenWithSnapshotRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("ScreenId")
    public Integer screenId;

    @NameInMap("NeedToken")
    public Boolean needToken;

    @NameInMap("Password")
    public String password;

    @NameInMap("AuthTime")
    public Integer authTime;

    @NameInMap("SnapshotId")
    public Integer snapshotId;

    @NameInMap("CreateSnapshot")
    public Boolean createSnapshot;

    public static PublishScreenWithSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishScreenWithSnapshotRequest self = new PublishScreenWithSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public PublishScreenWithSnapshotRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public PublishScreenWithSnapshotRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public PublishScreenWithSnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PublishScreenWithSnapshotRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public PublishScreenWithSnapshotRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public PublishScreenWithSnapshotRequest setScreenId(Integer screenId) {
        this.screenId = screenId;
        return this;
    }
    public Integer getScreenId() {
        return this.screenId;
    }

    public PublishScreenWithSnapshotRequest setNeedToken(Boolean needToken) {
        this.needToken = needToken;
        return this;
    }
    public Boolean getNeedToken() {
        return this.needToken;
    }

    public PublishScreenWithSnapshotRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public PublishScreenWithSnapshotRequest setAuthTime(Integer authTime) {
        this.authTime = authTime;
        return this;
    }
    public Integer getAuthTime() {
        return this.authTime;
    }

    public PublishScreenWithSnapshotRequest setSnapshotId(Integer snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public Integer getSnapshotId() {
        return this.snapshotId;
    }

    public PublishScreenWithSnapshotRequest setCreateSnapshot(Boolean createSnapshot) {
        this.createSnapshot = createSnapshot;
        return this;
    }
    public Boolean getCreateSnapshot() {
        return this.createSnapshot;
    }

}
