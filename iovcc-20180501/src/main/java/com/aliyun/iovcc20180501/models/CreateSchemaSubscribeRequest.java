// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateSchemaSubscribeRequest extends TeaModel {
    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("SubscribeList")
    public String subscribeList;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    public static CreateSchemaSubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemaSubscribeRequest self = new CreateSchemaSubscribeRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchemaSubscribeRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public CreateSchemaSubscribeRequest setSubscribeList(String subscribeList) {
        this.subscribeList = subscribeList;
        return this;
    }
    public String getSubscribeList() {
        return this.subscribeList;
    }

    public CreateSchemaSubscribeRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateSchemaSubscribeRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

}
