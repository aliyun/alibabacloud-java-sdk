// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateDataModelAttributesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Attributes")
    public String attributes;

    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("ModelId")
    public String modelId;

    public static UpdateDataModelAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataModelAttributesRequest self = new UpdateDataModelAttributesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataModelAttributesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateDataModelAttributesRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public UpdateDataModelAttributesRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public UpdateDataModelAttributesRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

}
