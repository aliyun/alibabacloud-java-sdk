// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class LivenessDetectRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("MediaCategory")
    public String mediaCategory;

    @NameInMap("MediaUrl")
    public String mediaUrl;

    @NameInMap("MediaFile")
    public String mediaFile;

    public static LivenessDetectRequest build(java.util.Map<String, ?> map) throws Exception {
        LivenessDetectRequest self = new LivenessDetectRequest();
        return TeaModel.build(map, self);
    }

    public LivenessDetectRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public LivenessDetectRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public LivenessDetectRequest setMediaCategory(String mediaCategory) {
        this.mediaCategory = mediaCategory;
        return this;
    }
    public String getMediaCategory() {
        return this.mediaCategory;
    }

    public LivenessDetectRequest setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }
    public String getMediaUrl() {
        return this.mediaUrl;
    }

    public LivenessDetectRequest setMediaFile(String mediaFile) {
        this.mediaFile = mediaFile;
        return this;
    }
    public String getMediaFile() {
        return this.mediaFile;
    }

}
