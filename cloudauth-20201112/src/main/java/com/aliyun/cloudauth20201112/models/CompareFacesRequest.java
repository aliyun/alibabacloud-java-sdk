// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class CompareFacesRequest extends TeaModel {
    @NameInMap("SourceImageUrl")
    public String sourceImageUrl;

    @NameInMap("SourceImageBase64")
    public String sourceImageBase64;

    @NameInMap("TargetImageUrl")
    public String targetImageUrl;

    @NameInMap("TargetImageBase64")
    public String targetImageBase64;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    public static CompareFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareFacesRequest self = new CompareFacesRequest();
        return TeaModel.build(map, self);
    }

    public CompareFacesRequest setSourceImageUrl(String sourceImageUrl) {
        this.sourceImageUrl = sourceImageUrl;
        return this;
    }
    public String getSourceImageUrl() {
        return this.sourceImageUrl;
    }

    public CompareFacesRequest setSourceImageBase64(String sourceImageBase64) {
        this.sourceImageBase64 = sourceImageBase64;
        return this;
    }
    public String getSourceImageBase64() {
        return this.sourceImageBase64;
    }

    public CompareFacesRequest setTargetImageUrl(String targetImageUrl) {
        this.targetImageUrl = targetImageUrl;
        return this;
    }
    public String getTargetImageUrl() {
        return this.targetImageUrl;
    }

    public CompareFacesRequest setTargetImageBase64(String targetImageBase64) {
        this.targetImageBase64 = targetImageBase64;
        return this;
    }
    public String getTargetImageBase64() {
        return this.targetImageBase64;
    }

    public CompareFacesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CompareFacesRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
