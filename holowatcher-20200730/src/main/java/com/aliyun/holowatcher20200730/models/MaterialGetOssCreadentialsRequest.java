// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialGetOssCreadentialsRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Type")
    public String type;

    public static MaterialGetOssCreadentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        MaterialGetOssCreadentialsRequest self = new MaterialGetOssCreadentialsRequest();
        return TeaModel.build(map, self);
    }

    public MaterialGetOssCreadentialsRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public MaterialGetOssCreadentialsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
