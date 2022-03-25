// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialCreateOnePictureRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Params")
    public String params;

    public static MaterialCreateOnePictureRequest build(java.util.Map<String, ?> map) throws Exception {
        MaterialCreateOnePictureRequest self = new MaterialCreateOnePictureRequest();
        return TeaModel.build(map, self);
    }

    public MaterialCreateOnePictureRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public MaterialCreateOnePictureRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
