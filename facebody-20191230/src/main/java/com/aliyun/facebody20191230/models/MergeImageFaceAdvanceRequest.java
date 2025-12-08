// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MergeImageFaceAdvanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AddWatermark")
    public Boolean addWatermark;

    /**
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/MergeImageFace/MergeImageFace-1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/MergeImageFace/MergeImageFace-1.png</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("MergeInfos")
    public java.util.List<MergeImageFaceAdvanceRequestMergeInfos> mergeInfos;

    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6cd509ea-54fa-4730-8e9d-c94cadcda048</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="http://invi-label.oss-cn-shanghai.aliyuncs.com/label/temp/faceswap/ref/ref.jpg">http://invi-label.oss-cn-shanghai.aliyuncs.com/label/temp/faceswap/ref/ref.jpg</a></p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        /**
         * <strong>example:</strong>
         * <p>6cd509ea-54fa-4730-8e9d-c94cadcda048_0</p>
         */
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
