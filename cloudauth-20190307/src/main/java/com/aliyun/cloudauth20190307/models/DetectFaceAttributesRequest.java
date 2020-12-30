// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DetectFaceAttributesRequest extends TeaModel {
    @NameInMap("MaterialValue")
    public String materialValue;

    @NameInMap("BizType")
    public String bizType;

    public static DetectFaceAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceAttributesRequest self = new DetectFaceAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DetectFaceAttributesRequest setMaterialValue(String materialValue) {
        this.materialValue = materialValue;
        return this;
    }
    public String getMaterialValue() {
        return this.materialValue;
    }

    public DetectFaceAttributesRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
