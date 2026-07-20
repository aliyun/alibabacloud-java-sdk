// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCompanyRequest extends TeaModel {
    /**
     * <p>The company ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51001</p>
     */
    @NameInMap("CompanyId")
    public Long companyId;

    public static GetCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyRequest self = new GetCompanyRequest();
        return TeaModel.build(map, self);
    }

    public GetCompanyRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

}
