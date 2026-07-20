// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCompanyRequest extends TeaModel {
    /**
     * <p>The company ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51001</p>
     */
    @NameInMap("CompanyId")
    public Long companyId;

    public static DeleteCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCompanyRequest self = new DeleteCompanyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCompanyRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

}
