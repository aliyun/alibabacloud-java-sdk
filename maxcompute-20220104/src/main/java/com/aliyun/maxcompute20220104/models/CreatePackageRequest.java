// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreatePackageRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("isInstall")
    public Boolean isInstall;

    public static CreatePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePackageRequest self = new CreatePackageRequest();
        return TeaModel.build(map, self);
    }

    public CreatePackageRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreatePackageRequest setIsInstall(Boolean isInstall) {
        this.isInstall = isInstall;
        return this;
    }
    public Boolean getIsInstall() {
        return this.isInstall;
    }

}
