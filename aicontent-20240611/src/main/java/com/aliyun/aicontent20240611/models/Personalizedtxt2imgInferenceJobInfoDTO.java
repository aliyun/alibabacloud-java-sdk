// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgInferenceJobInfoDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("createUserId")
    public String createUserId;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("jobStatus")
    public String jobStatus;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("resultImageUrl")
    public java.util.List<String> resultImageUrl;

    public static Personalizedtxt2imgInferenceJobInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgInferenceJobInfoDTO self = new Personalizedtxt2imgInferenceJobInfoDTO();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgInferenceJobInfoDTO setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public Personalizedtxt2imgInferenceJobInfoDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Personalizedtxt2imgInferenceJobInfoDTO setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public Personalizedtxt2imgInferenceJobInfoDTO setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public Personalizedtxt2imgInferenceJobInfoDTO setResultImageUrl(java.util.List<String> resultImageUrl) {
        this.resultImageUrl = resultImageUrl;
        return this;
    }
    public java.util.List<String> getResultImageUrl() {
        return this.resultImageUrl;
    }

}
