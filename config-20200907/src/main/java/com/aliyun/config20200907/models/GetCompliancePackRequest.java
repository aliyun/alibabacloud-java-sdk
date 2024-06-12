// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetCompliancePackRequest extends TeaModel {
    /**
     * <p>The ID of the compliance package.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](https://help.aliyun.com/document_detail/263332.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    public static GetCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCompliancePackRequest self = new GetCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public GetCompliancePackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

}
