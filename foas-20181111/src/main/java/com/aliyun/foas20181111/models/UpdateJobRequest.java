// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    @NameInMap("clusterId")
    public String clusterId;

    @NameInMap("code")
    public String code;

    @NameInMap("description")
    public String description;

    @NameInMap("engineVersion")
    public String engineVersion;

    @NameInMap("folderId")
    public Long folderId;

    @NameInMap("packages")
    public String packages;

    @NameInMap("planJson")
    public String planJson;

    @NameInMap("properties")
    public String properties;

    @NameInMap("queueName")
    public String queueName;

    public static UpdateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobRequest self = new UpdateJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateJobRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateJobRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public UpdateJobRequest setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public UpdateJobRequest setPackages(String packages) {
        this.packages = packages;
        return this;
    }
    public String getPackages() {
        return this.packages;
    }

    public UpdateJobRequest setPlanJson(String planJson) {
        this.planJson = planJson;
        return this;
    }
    public String getPlanJson() {
        return this.planJson;
    }

    public UpdateJobRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public UpdateJobRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
