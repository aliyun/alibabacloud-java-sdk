// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindApplicationToEdgeInstanceRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("ApplicationVersion")
    public String applicationVersion;

    public static BindApplicationToEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindApplicationToEdgeInstanceRequest self = new BindApplicationToEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BindApplicationToEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BindApplicationToEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BindApplicationToEdgeInstanceRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public BindApplicationToEdgeInstanceRequest setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
        return this;
    }
    public String getApplicationVersion() {
        return this.applicationVersion;
    }

}
