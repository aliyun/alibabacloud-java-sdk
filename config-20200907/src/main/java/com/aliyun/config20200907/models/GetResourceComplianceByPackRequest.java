// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceByPackRequest extends TeaModel {
    /**
     * <p>The ID of the compliance package.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](~~263332~~).</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    public static GetResourceComplianceByPackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceByPackRequest self = new GetResourceComplianceByPackRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceByPackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

}
