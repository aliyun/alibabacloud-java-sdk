// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyDisableOneRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Id")
    public Long id;

    public static CompanyDisableOneRequest build(java.util.Map<String, ?> map) throws Exception {
        CompanyDisableOneRequest self = new CompanyDisableOneRequest();
        return TeaModel.build(map, self);
    }

    public CompanyDisableOneRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public CompanyDisableOneRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
