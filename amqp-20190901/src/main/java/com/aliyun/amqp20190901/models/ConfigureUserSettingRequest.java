// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ConfigureUserSettingRequest extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PutType")
    public String putType;

    public static ConfigureUserSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureUserSettingRequest self = new ConfigureUserSettingRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureUserSettingRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ConfigureUserSettingRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public ConfigureUserSettingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigureUserSettingRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ConfigureUserSettingRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ConfigureUserSettingRequest setPutType(String putType) {
        this.putType = putType;
        return this;
    }
    public String getPutType() {
        return this.putType;
    }

}
