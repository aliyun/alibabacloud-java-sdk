// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    @NameInMap("apiType")
    public String apiType;

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

    @NameInMap("jobName")
    public String jobName;

    @NameInMap("jobType")
    public String jobType;

    @NameInMap("packages")
    public String packages;

    @NameInMap("planJson")
    public String planJson;

    @NameInMap("properties")
    public String properties;

    @NameInMap("queueName")
    public String queueName;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public CreateJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateJobRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateJobRequest setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public CreateJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CreateJobRequest setPackages(String packages) {
        this.packages = packages;
        return this;
    }
    public String getPackages() {
        return this.packages;
    }

    public CreateJobRequest setPlanJson(String planJson) {
        this.planJson = planJson;
        return this;
    }
    public String getPlanJson() {
        return this.planJson;
    }

    public CreateJobRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public CreateJobRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
