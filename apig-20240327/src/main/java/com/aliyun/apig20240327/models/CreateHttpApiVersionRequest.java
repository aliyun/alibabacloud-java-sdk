// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiVersionRequest extends TeaModel {
    @NameInMap("versionConfig")
    public HttpApiVersionConfig versionConfig;

    public static CreateHttpApiVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpApiVersionRequest self = new CreateHttpApiVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpApiVersionRequest setVersionConfig(HttpApiVersionConfig versionConfig) {
        this.versionConfig = versionConfig;
        return this;
    }
    public HttpApiVersionConfig getVersionConfig() {
        return this.versionConfig;
    }

}
