// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DetectFaceAttributesRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("MaterialValue")
    @Validation(required = true)
    public String materialValue;

    public static DetectFaceAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceAttributesRequest self = new DetectFaceAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DetectFaceAttributesRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DetectFaceAttributesRequest setMaterialValue(String materialValue) {
        this.materialValue = materialValue;
        return this;
    }
    public String getMaterialValue() {
        return this.materialValue;
    }

}
