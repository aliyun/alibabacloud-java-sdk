// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateShadowSchemaRequest extends TeaModel {
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

    public static CreateShadowSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShadowSchemaRequest self = new CreateShadowSchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreateShadowSchemaRequest setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    public CreateShadowSchemaRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CreateShadowSchemaRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateShadowSchemaRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateShadowSchemaRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
