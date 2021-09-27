// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductVersionPackageRequest extends TeaModel {
    @NameInMap("packageUID")
    public String packageUID;

    @NameInMap("platform")
    public String platform;

    @NameInMap("packageType")
    public String packageType;

    @NameInMap("packageContentType")
    public String packageContentType;

    @NameInMap("oldProductVersionUID")
    public String oldProductVersionUID;

    @NameInMap("withURL")
    public Boolean withURL;

    public static GetProductVersionPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPackageRequest self = new GetProductVersionPackageRequest();
        return TeaModel.build(map, self);
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

    public GetProductVersionPackageRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public GetProductVersionPackageRequest setPackageContentType(String packageContentType) {
        this.packageContentType = packageContentType;
        return this;
    }
    public String getPackageContentType() {
        return this.packageContentType;
    }

    public GetProductVersionPackageRequest setOldProductVersionUID(String oldProductVersionUID) {
        this.oldProductVersionUID = oldProductVersionUID;
        return this;
    }
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

    public GetProductVersionPackageRequest setWithURL(Boolean withURL) {
        this.withURL = withURL;
        return this;
    }
    public Boolean getWithURL() {
        return this.withURL;
    }

}
