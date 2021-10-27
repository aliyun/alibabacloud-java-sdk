// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFacesRequest extends TeaModel {
    @NameInMap("SourceImageType")
    public String sourceImageType;

    @NameInMap("SourceImageValue")
    public String sourceImageValue;

    @NameInMap("TargetImageType")
    public String targetImageType;

    @NameInMap("TargetImageValue")
    public String targetImageValue;

    public static CompareFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareFacesRequest self = new CompareFacesRequest();
        return TeaModel.build(map, self);
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

    public CompareFacesRequest setTargetImageType(String targetImageType) {
        this.targetImageType = targetImageType;
        return this;
    }
    public String getTargetImageType() {
        return this.targetImageType;
    }

    public CompareFacesRequest setTargetImageValue(String targetImageValue) {
        this.targetImageValue = targetImageValue;
        return this;
    }
    public String getTargetImageValue() {
        return this.targetImageValue;
    }

}
