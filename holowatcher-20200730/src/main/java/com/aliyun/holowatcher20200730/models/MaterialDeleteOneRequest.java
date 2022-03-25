// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialDeleteOneRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Id")
    public String id;

    public static MaterialDeleteOneRequest build(java.util.Map<String, ?> map) throws Exception {
        MaterialDeleteOneRequest self = new MaterialDeleteOneRequest();
        return TeaModel.build(map, self);
    }

    public MaterialDeleteOneRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public MaterialDeleteOneRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
