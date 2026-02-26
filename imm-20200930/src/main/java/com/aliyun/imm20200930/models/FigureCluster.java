// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FigureCluster extends TeaModel {
    /**
     * <p>The average age.</p>
     * 
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("AverageAge")
    public Float averageAge;

    /**
     * <p>The cover image.</p>
     */
    @NameInMap("Cover")
    public File cover;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:10:52.83948013+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The custom ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <p>The custom labels. You can search for clusters by label.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;: &quot;examplebucket&quot;}</p>
     */
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset001</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The number of faces.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FaceCount")
    public Long faceCount;

    /**
     * <p>The gender.</p>
     * 
     * <strong>example:</strong>
     * <p>female</p>
     */
    @NameInMap("Gender")
    public String gender;

    /**
     * <p>The number of images.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ImageCount")
    public Long imageCount;

    /**
     * <p>The maximum age.</p>
     * 
     * <strong>example:</strong>
     * <p>44</p>
     */
    @NameInMap("MaxAge")
    public Float maxAge;

    /**
     * <p>The version of the metadata lock. A metadata lock version can be obtained by using a get or list operation. If you include the MetaLockVersion parameter in a request to update the cluster, the server checks consistency between the MetaLockVersion parameter value sent in the request and the one on the server side and updates the cluster only when they are consistent. This parameter prevents update conflicts in concurrent scenarios. The initial version is 0. The version is automatically increased by 1 after each successful update.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MetaLockVersion")
    public Long metaLockVersion;

    /**
     * <p>The minimum age.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("MinAge")
    public Float minAge;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Cluster-ae6e3472-999e-410b-b54e-cd5dba****</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The type of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>figure-cluster</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>102321002****</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The name of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:10:52.83948013+08:00</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The number of videos.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
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

    public FigureCluster setMetaLockVersion(Long metaLockVersion) {
        this.metaLockVersion = metaLockVersion;
        return this;
    }
    public Long getMetaLockVersion() {
        return this.metaLockVersion;
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
