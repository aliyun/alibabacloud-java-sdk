// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyProfileRequest extends TeaModel {
    @NameInMap("CompanyIdKeyParam")
    public java.util.Map<String, ?> companyIdKeyParam;

    @NameInMap("SqlId")
    public Integer sqlId;

    public static GetCompanyProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyProfileRequest self = new GetCompanyProfileRequest();
        return TeaModel.build(map, self);
    }

    public GetCompanyProfileRequest setCompanyIdKeyParam(java.util.Map<String, ?> companyIdKeyParam) {
        this.companyIdKeyParam = companyIdKeyParam;
        return this;
    }
    public java.util.Map<String, ?> getCompanyIdKeyParam() {
        return this.companyIdKeyParam;
    }

    public GetCompanyProfileRequest setSqlId(Integer sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public Integer getSqlId() {
        return this.sqlId;
    }

}
