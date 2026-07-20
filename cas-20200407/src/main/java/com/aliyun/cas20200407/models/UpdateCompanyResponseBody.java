// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateCompanyResponseBody extends TeaModel {
    /**
     * <p>The company ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51001</p>
     */
    @NameInMap("CompanyId")
    public Long companyId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C2BAAB19-BCEB-569B-BE08-7C728344A79C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCompanyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCompanyResponseBody self = new UpdateCompanyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCompanyResponseBody setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public UpdateCompanyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
