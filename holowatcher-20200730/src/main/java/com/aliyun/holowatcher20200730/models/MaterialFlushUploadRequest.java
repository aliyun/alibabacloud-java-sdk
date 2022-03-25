// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialFlushUploadRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("MaterialId")
    public Long materialId;

    @NameInMap("Value")
    public Long value;

    public static MaterialFlushUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        MaterialFlushUploadRequest self = new MaterialFlushUploadRequest();
        return TeaModel.build(map, self);
    }

    public MaterialFlushUploadRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public MaterialFlushUploadRequest setMaterialId(Long materialId) {
        this.materialId = materialId;
        return this;
    }
    public Long getMaterialId() {
        return this.materialId;
    }

    public MaterialFlushUploadRequest setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
