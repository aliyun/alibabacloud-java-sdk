// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MergeImageFaceRequest extends TeaModel {
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
    public String imageURL;

    @NameInMap("MergeInfos")
    public java.util.List<MergeImageFaceRequestMergeInfos> mergeInfos;

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

    public static MergeImageFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeImageFaceRequest self = new MergeImageFaceRequest();
        return TeaModel.build(map, self);
    }

    public MergeImageFaceRequest setAddWatermark(Boolean addWatermark) {
        this.addWatermark = addWatermark;
        return this;
    }
    public Boolean getAddWatermark() {
        return this.addWatermark;
    }

    public MergeImageFaceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public MergeImageFaceRequest setMergeInfos(java.util.List<MergeImageFaceRequestMergeInfos> mergeInfos) {
        this.mergeInfos = mergeInfos;
        return this;
    }
    public java.util.List<MergeImageFaceRequestMergeInfos> getMergeInfos() {
        return this.mergeInfos;
    }

    public MergeImageFaceRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public MergeImageFaceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public MergeImageFaceRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public static class MergeImageFaceRequestMergeInfos extends TeaModel {
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

        public static MergeImageFaceRequestMergeInfos build(java.util.Map<String, ?> map) throws Exception {
            MergeImageFaceRequestMergeInfos self = new MergeImageFaceRequestMergeInfos();
            return TeaModel.build(map, self);
        }

        public MergeImageFaceRequestMergeInfos setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public MergeImageFaceRequestMergeInfos setTemplateFaceID(String templateFaceID) {
            this.templateFaceID = templateFaceID;
            return this;
        }
        public String getTemplateFaceID() {
            return this.templateFaceID;
        }

    }

}
