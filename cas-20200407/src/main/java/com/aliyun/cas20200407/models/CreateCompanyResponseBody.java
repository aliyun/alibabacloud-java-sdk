// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCompanyResponseBody extends TeaModel {
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
     * <p>838603C0-72A1-5070-A2E6-16E43861DB71</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCompanyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCompanyResponseBody self = new CreateCompanyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCompanyResponseBody setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public CreateCompanyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
