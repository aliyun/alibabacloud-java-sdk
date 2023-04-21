// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MergeImageFaceRequest extends TeaModel {
    @NameInMap("AddWatermark")
    public Boolean addWatermark;

    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("MergeInfos")
    public java.util.List<MergeImageFaceRequestMergeInfos> mergeInfos;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("TemplateId")
    public String templateId;

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

    public static class MergeImageFaceRequestMergeInfos extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

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
