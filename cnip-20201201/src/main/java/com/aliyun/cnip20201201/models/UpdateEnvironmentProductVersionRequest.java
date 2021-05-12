// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentProductVersionRequest extends TeaModel {
    @NameInMap("compatibleVersions")
    public String compatibleVersions;

    @NameInMap("oldProductVersion")
    public String oldProductVersion;

    @NameInMap("oldProductVersionUID")
    public String oldProductVersionUID;

    @NameInMap("productName")
    public String productName;

    @NameInMap("productUID")
    public String productUID;

    @NameInMap("productVersion")
    public String productVersion;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static UpdateEnvironmentProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentProductVersionRequest self = new UpdateEnvironmentProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentProductVersionRequest setCompatibleVersions(String compatibleVersions) {
        this.compatibleVersions = compatibleVersions;
        return this;
    }
    public String getCompatibleVersions() {
        return this.compatibleVersions;
    }

    public UpdateEnvironmentProductVersionRequest setOldProductVersion(String oldProductVersion) {
        this.oldProductVersion = oldProductVersion;
        return this;
    }
    public String getOldProductVersion() {
        return this.oldProductVersion;
    }

    public UpdateEnvironmentProductVersionRequest setOldProductVersionUID(String oldProductVersionUID) {
        this.oldProductVersionUID = oldProductVersionUID;
        return this;
    }
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

    public UpdateEnvironmentProductVersionRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public UpdateEnvironmentProductVersionRequest setProductUID(String productUID) {
        this.productUID = productUID;
        return this;
    }
    public String getProductUID() {
        return this.productUID;
    }

    public UpdateEnvironmentProductVersionRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public UpdateEnvironmentProductVersionRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
