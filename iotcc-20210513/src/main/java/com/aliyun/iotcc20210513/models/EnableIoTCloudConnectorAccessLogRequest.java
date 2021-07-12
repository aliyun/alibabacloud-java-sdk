// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class EnableIoTCloudConnectorAccessLogRequest extends TeaModel {
    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("AccessLogSlsProject")
    public String accessLogSlsProject;

    @NameInMap("AccessLogSlsLogStore")
    public String accessLogSlsLogStore;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    public static EnableIoTCloudConnectorAccessLogRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableIoTCloudConnectorAccessLogRequest self = new EnableIoTCloudConnectorAccessLogRequest();
        return TeaModel.build(map, self);
    }

    public EnableIoTCloudConnectorAccessLogRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public EnableIoTCloudConnectorAccessLogRequest setAccessLogSlsProject(String accessLogSlsProject) {
        this.accessLogSlsProject = accessLogSlsProject;
        return this;
    }
    public String getAccessLogSlsProject() {
        return this.accessLogSlsProject;
    }

    public EnableIoTCloudConnectorAccessLogRequest setAccessLogSlsLogStore(String accessLogSlsLogStore) {
        this.accessLogSlsLogStore = accessLogSlsLogStore;
        return this;
    }
    public String getAccessLogSlsLogStore() {
        return this.accessLogSlsLogStore;
    }

    public EnableIoTCloudConnectorAccessLogRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableIoTCloudConnectorAccessLogRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public EnableIoTCloudConnectorAccessLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
