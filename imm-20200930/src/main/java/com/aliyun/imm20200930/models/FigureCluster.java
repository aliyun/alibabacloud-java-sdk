// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FigureCluster extends TeaModel {
    @NameInMap("AverageAge")
    public Float averageAge;

    @NameInMap("Cover")
    public File cover;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CustomId")
    public String customId;

    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("FaceCount")
    public Long faceCount;

    @NameInMap("Gender")
    public String gender;

    @NameInMap("ImageCount")
    public Long imageCount;

    @NameInMap("MaxAge")
    public Float maxAge;

    @NameInMap("MinAge")
    public Float minAge;

    @NameInMap("Name")
    public String name;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("VideoCount")
    public Long videoCount;

    public static FigureCluster build(java.util.Map<String, ?> map) throws Exception {
        FigureCluster self = new FigureCluster();
        return TeaModel.build(map, self);
    }

    public FigureCluster setAverageAge(Float averageAge) {
        this.averageAge = averageAge;
        return this;
    }
    public Float getAverageAge() {
        return this.averageAge;
    }

    public FigureCluster setCover(File cover) {
        this.cover = cover;
        return this;
    }
    public File getCover() {
        return this.cover;
    }

    public FigureCluster setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public FigureCluster setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public FigureCluster setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public FigureCluster setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public FigureCluster setFaceCount(Long faceCount) {
        this.faceCount = faceCount;
        return this;
    }
    public Long getFaceCount() {
        return this.faceCount;
    }

    public FigureCluster setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public FigureCluster setImageCount(Long imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Long getImageCount() {
        return this.imageCount;
    }

    public FigureCluster setMaxAge(Float maxAge) {
        this.maxAge = maxAge;
        return this;
    }
    public Float getMaxAge() {
        return this.maxAge;
    }

    public FigureCluster setMinAge(Float minAge) {
        this.minAge = minAge;
        return this;
    }
    public Float getMinAge() {
        return this.minAge;
    }

    public FigureCluster setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FigureCluster setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public FigureCluster setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public FigureCluster setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public FigureCluster setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public FigureCluster setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public FigureCluster setVideoCount(Long videoCount) {
        this.videoCount = videoCount;
        return this;
    }
    public Long getVideoCount() {
        return this.videoCount;
    }

}
