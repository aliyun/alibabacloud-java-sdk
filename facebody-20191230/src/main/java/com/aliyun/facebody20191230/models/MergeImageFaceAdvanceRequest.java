// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MergeImageFaceAdvanceRequest extends TeaModel {
    @NameInMap("AddWatermark")
    public Boolean addWatermark;

    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("MergeInfos")
    public java.util.List<MergeImageFaceAdvanceRequestMergeInfos> mergeInfos;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("WatermarkType")
    public String watermarkType;

    public static MergeImageFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeImageFaceAdvanceRequest self = new MergeImageFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public MergeImageFaceAdvanceRequest setAddWatermark(Boolean addWatermark) {
        this.addWatermark = addWatermark;
        return this;
    }
    public Boolean getAddWatermark() {
        return this.addWatermark;
    }

    public MergeImageFaceAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public MergeImageFaceAdvanceRequest setMergeInfos(java.util.List<MergeImageFaceAdvanceRequestMergeInfos> mergeInfos) {
        this.mergeInfos = mergeInfos;
        return this;
    }
    public java.util.List<MergeImageFaceAdvanceRequestMergeInfos> getMergeInfos() {
        return this.mergeInfos;
    }

    public MergeImageFaceAdvanceRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public MergeImageFaceAdvanceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public MergeImageFaceAdvanceRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public static class MergeImageFaceAdvanceRequestMergeInfos extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("TemplateFaceID")
        public String templateFaceID;

        public static MergeImageFaceAdvanceRequestMergeInfos build(java.util.Map<String, ?> map) throws Exception {
            MergeImageFaceAdvanceRequestMergeInfos self = new MergeImageFaceAdvanceRequestMergeInfos();
            return TeaModel.build(map, self);
        }

        public MergeImageFaceAdvanceRequestMergeInfos setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public MergeImageFaceAdvanceRequestMergeInfos setTemplateFaceID(String templateFaceID) {
            this.templateFaceID = templateFaceID;
            return this;
        }
        public String getTemplateFaceID() {
            return this.templateFaceID;
        }

    }

}
