// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgModelTrainJobInfoDTO extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("ImageUrl")
    public java.util.List<String> imageUrl;

    @NameInMap("InferenceJobList")
    public java.util.List<Personalizedtxt2imgInferenceJobInfoDTO> inferenceJobList;

    @NameInMap("JobStatus")
    public String jobStatus;

    @NameInMap("Name")
    public String name;

    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("id")
    public String id;

    public static Personalizedtxt2imgModelTrainJobInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgModelTrainJobInfoDTO self = new Personalizedtxt2imgModelTrainJobInfoDTO();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgModelTrainJobInfoDTO setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Personalizedtxt2imgModelTrainJobInfoDTO setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public Personalizedtxt2imgModelTrainJobInfoDTO setImageUrl(java.util.List<String> imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public java.util.List<String> getImageUrl() {
        return this.imageUrl;
    }

    public Personalizedtxt2imgModelTrainJobInfoDTO setInferenceJobList(java.util.List<Personalizedtxt2imgInferenceJobInfoDTO> inferenceJobList) {
        this.inferenceJobList = inferenceJobList;
        return this;
    }
    public java.util.List<Personalizedtxt2imgInferenceJobInfoDTO> getInferenceJobList() {
        return this.inferenceJobList;
    }

    public Personalizedtxt2imgModelTrainJobInfoDTO setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public Personalizedtxt2imgModelTrainJobInfoDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Personalizedtxt2imgModelTrainJobInfoDTO setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public Personalizedtxt2imgModelTrainJobInfoDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
