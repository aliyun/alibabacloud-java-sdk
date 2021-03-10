// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("TimeoutConfig")
    public String timeoutConfig;

    @NameInMap("RolloutConfig")
    public String rolloutConfig;

    @NameInMap("JobId")
    public String jobId;

    public static UpdateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobRequest self = new UpdateJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public UpdateJobRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public UpdateJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateJobRequest setTimeoutConfig(String timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
        return this;
    }
    public String getTimeoutConfig() {
        return this.timeoutConfig;
    }

    public UpdateJobRequest setRolloutConfig(String rolloutConfig) {
        this.rolloutConfig = rolloutConfig;
        return this;
    }
    public String getRolloutConfig() {
        return this.rolloutConfig;
    }

    public UpdateJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
