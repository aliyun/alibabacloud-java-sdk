// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceValiditySchemaRequest extends TeaModel {
    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeDeviceValiditySchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceValiditySchemaRequest self = new DescribeDeviceValiditySchemaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceValiditySchemaRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public DescribeDeviceValiditySchemaRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public DescribeDeviceValiditySchemaRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
