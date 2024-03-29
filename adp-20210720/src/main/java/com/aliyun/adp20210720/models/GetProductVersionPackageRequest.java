// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductVersionPackageRequest extends TeaModel {
    @NameInMap("foundationReferenceUID")
    public String foundationReferenceUID;

    @NameInMap("oldFoundationReferenceUID")
    public String oldFoundationReferenceUID;

    @NameInMap("oldProductVersionUID")
    public String oldProductVersionUID;

    @NameInMap("packageContentType")
    public String packageContentType;

    @NameInMap("packageType")
    public String packageType;

    @NameInMap("packageUID")
    public String packageUID;

    @NameInMap("platform")
    public String platform;

    @NameInMap("withURL")
    public Boolean withURL;

    public static GetProductVersionPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPackageRequest self = new GetProductVersionPackageRequest();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPackageRequest setFoundationReferenceUID(String foundationReferenceUID) {
        this.foundationReferenceUID = foundationReferenceUID;
        return this;
    }
    public String getFoundationReferenceUID() {
        return this.foundationReferenceUID;
    }

    public GetProductVersionPackageRequest setOldFoundationReferenceUID(String oldFoundationReferenceUID) {
        this.oldFoundationReferenceUID = oldFoundationReferenceUID;
        return this;
    }
    public String getOldFoundationReferenceUID() {
        return this.oldFoundationReferenceUID;
    }

    public GetProductVersionPackageRequest setOldProductVersionUID(String oldProductVersionUID) {
        this.oldProductVersionUID = oldProductVersionUID;
        return this;
    }
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

    public GetProductVersionPackageRequest setPackageContentType(String packageContentType) {
        this.packageContentType = packageContentType;
        return this;
    }
    public String getPackageContentType() {
        return this.packageContentType;
    }

    public GetProductVersionPackageRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public GetProductVersionPackageRequest setPackageUID(String packageUID) {
        this.packageUID = packageUID;
        return this;
    }
    public String getPackageUID() {
        return this.packageUID;
    }

    public GetProductVersionPackageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GetProductVersionPackageRequest setWithURL(Boolean withURL) {
        this.withURL = withURL;
        return this;
    }
    public Boolean getWithURL() {
        return this.withURL;
    }

}
