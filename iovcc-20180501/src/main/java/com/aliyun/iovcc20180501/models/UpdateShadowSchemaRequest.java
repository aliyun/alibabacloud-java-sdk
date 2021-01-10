// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateShadowSchemaRequest extends TeaModel {
    @NameInMap("DeviceModelId")
    public String deviceModelId;

    @NameInMap("AuthType")
    public String authType;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Schema")
    public String schema;

    @NameInMap("Id")
    public String id;

    public static UpdateShadowSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateShadowSchemaRequest self = new UpdateShadowSchemaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateShadowSchemaRequest setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    public UpdateShadowSchemaRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public UpdateShadowSchemaRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateShadowSchemaRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateShadowSchemaRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public UpdateShadowSchemaRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
