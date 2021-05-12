// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateSnapshotRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("productName")
    public String productName;

    @NameInMap("productVersion")
    public String productVersion;

    @NameInMap("productVersionDesc")
    public String productVersionDesc;

    @NameInMap("updateKey")
    public String updateKey;

    public static UpdateSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotRequest self = new UpdateSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSnapshotRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public UpdateSnapshotRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public UpdateSnapshotRequest setProductVersionDesc(String productVersionDesc) {
        this.productVersionDesc = productVersionDesc;
        return this;
    }
    public String getProductVersionDesc() {
        return this.productVersionDesc;
    }

    public UpdateSnapshotRequest setUpdateKey(String updateKey) {
        this.updateKey = updateKey;
        return this;
    }
    public String getUpdateKey() {
        return this.updateKey;
    }

}
