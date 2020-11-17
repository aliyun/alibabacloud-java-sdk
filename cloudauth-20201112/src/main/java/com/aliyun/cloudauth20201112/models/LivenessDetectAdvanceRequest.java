// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class LivenessDetectAdvanceRequest extends TeaModel {
    @NameInMap("MediaFileObject")
    @Validation(required = true)
    public java.io.InputStream mediaFileObject;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("MediaCategory")
    public String mediaCategory;

    @NameInMap("MediaUrl")
    public String mediaUrl;

    public static LivenessDetectAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        LivenessDetectAdvanceRequest self = new LivenessDetectAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public LivenessDetectAdvanceRequest setMediaFileObject(java.io.InputStream mediaFileObject) {
        this.mediaFileObject = mediaFileObject;
        return this;
    }
    public java.io.InputStream getMediaFileObject() {
        return this.mediaFileObject;
    }

    public LivenessDetectAdvanceRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public LivenessDetectAdvanceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public LivenessDetectAdvanceRequest setMediaCategory(String mediaCategory) {
        this.mediaCategory = mediaCategory;
        return this;
    }
    public String getMediaCategory() {
        return this.mediaCategory;
    }

    public LivenessDetectAdvanceRequest setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }
    public String getMediaUrl() {
        return this.mediaUrl;
    }

}
