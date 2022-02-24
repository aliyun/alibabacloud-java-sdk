// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyProfileShrinkRequest extends TeaModel {
    @NameInMap("CompanyIdKeyParam")
    public String companyIdKeyParamShrink;

    @NameInMap("SqlId")
    public Integer sqlId;

    public static GetCompanyProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyProfileShrinkRequest self = new GetCompanyProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetCompanyProfileShrinkRequest setCompanyIdKeyParamShrink(String companyIdKeyParamShrink) {
        this.companyIdKeyParamShrink = companyIdKeyParamShrink;
        return this;
    }
    public String getCompanyIdKeyParamShrink() {
        return this.companyIdKeyParamShrink;
    }

    public GetCompanyProfileShrinkRequest setSqlId(Integer sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public Integer getSqlId() {
        return this.sqlId;
    }

}
