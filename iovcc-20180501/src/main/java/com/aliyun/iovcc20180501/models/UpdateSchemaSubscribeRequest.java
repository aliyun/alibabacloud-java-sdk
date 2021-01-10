// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateSchemaSubscribeRequest extends TeaModel {
    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("SubscribeList")
    public String subscribeList;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    public static UpdateSchemaSubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemaSubscribeRequest self = new UpdateSchemaSubscribeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSchemaSubscribeRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public UpdateSchemaSubscribeRequest setSubscribeList(String subscribeList) {
        this.subscribeList = subscribeList;
        return this;
    }
    public String getSubscribeList() {
        return this.subscribeList;
    }

    public UpdateSchemaSubscribeRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateSchemaSubscribeRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

}
