// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyFindByIsvTypeRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("IsvType")
    public String isvType;

    public static CompanyFindByIsvTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        CompanyFindByIsvTypeRequest self = new CompanyFindByIsvTypeRequest();
        return TeaModel.build(map, self);
    }

    public CompanyFindByIsvTypeRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public CompanyFindByIsvTypeRequest setIsvType(String isvType) {
        this.isvType = isvType;
        return this;
    }
    public String getIsvType() {
        return this.isvType;
    }

}
