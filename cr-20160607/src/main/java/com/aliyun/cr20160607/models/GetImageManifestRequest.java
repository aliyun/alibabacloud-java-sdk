// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class GetImageManifestRequest extends TeaModel {
    @NameInMap("SchemaVersion")
    public Integer schemaVersion;

    public static GetImageManifestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageManifestRequest self = new GetImageManifestRequest();
        return TeaModel.build(map, self);
    }

    public GetImageManifestRequest setSchemaVersion(Integer schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public Integer getSchemaVersion() {
        return this.schemaVersion;
    }

}
