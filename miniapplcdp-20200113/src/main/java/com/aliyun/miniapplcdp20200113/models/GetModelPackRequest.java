// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetModelPackRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    public static GetModelPackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelPackRequest self = new GetModelPackRequest();
        return TeaModel.build(map, self);
    }

    public GetModelPackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetModelPackRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

}
