// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyActivateOneRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Id")
    public String id;

    public static CompanyActivateOneRequest build(java.util.Map<String, ?> map) throws Exception {
        CompanyActivateOneRequest self = new CompanyActivateOneRequest();
        return TeaModel.build(map, self);
    }

    public CompanyActivateOneRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public CompanyActivateOneRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
