// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFacesRequest extends TeaModel {
    @NameInMap("TargetImageType")
    public String targetImageType;

    @NameInMap("SourceImageType")
    public String sourceImageType;

    @NameInMap("SourceImageValue")
    public String sourceImageValue;

    @NameInMap("TargetImageValue")
    public String targetImageValue;

    @NameInMap("BizType")
    public String bizType;

    public static CompareFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareFacesRequest self = new CompareFacesRequest();
        return TeaModel.build(map, self);
    }

    public CompareFacesRequest setTargetImageType(String targetImageType) {
        this.targetImageType = targetImageType;
        return this;
    }
    public String getTargetImageType() {
        return this.targetImageType;
    }

    public CompareFacesRequest setSourceImageType(String sourceImageType) {
        this.sourceImageType = sourceImageType;
        return this;
    }
    public String getSourceImageType() {
        return this.sourceImageType;
    }

    public CompareFacesRequest setSourceImageValue(String sourceImageValue) {
        this.sourceImageValue = sourceImageValue;
        return this;
    }
    public String getSourceImageValue() {
        return this.sourceImageValue;
    }

    public CompareFacesRequest setTargetImageValue(String targetImageValue) {
        this.targetImageValue = targetImageValue;
        return this;
    }
    public String getTargetImageValue() {
        return this.targetImageValue;
    }

    public CompareFacesRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
