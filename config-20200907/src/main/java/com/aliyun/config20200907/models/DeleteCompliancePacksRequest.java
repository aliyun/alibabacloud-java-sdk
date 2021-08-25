// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteCompliancePacksRequest extends TeaModel {
    @NameInMap("CompliancePackIds")
    public String compliancePackIds;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteCompliancePacksRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCompliancePacksRequest self = new DeleteCompliancePacksRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCompliancePacksRequest setCompliancePackIds(String compliancePackIds) {
        this.compliancePackIds = compliancePackIds;
        return this;
    }
    public String getCompliancePackIds() {
        return this.compliancePackIds;
    }

    public DeleteCompliancePacksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
