// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialFindOneRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("MaterialId")
    public Long materialId;

    public static MaterialFindOneRequest build(java.util.Map<String, ?> map) throws Exception {
        MaterialFindOneRequest self = new MaterialFindOneRequest();
        return TeaModel.build(map, self);
    }

    public MaterialFindOneRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public MaterialFindOneRequest setMaterialId(Long materialId) {
        this.materialId = materialId;
        return this;
    }
    public Long getMaterialId() {
        return this.materialId;
    }

}
