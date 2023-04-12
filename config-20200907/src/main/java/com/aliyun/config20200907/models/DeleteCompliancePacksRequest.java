// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteCompliancePacksRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the value is unique among different requests. The value of this parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the compliance package. Separate multiple compliance package IDs with commas (,).</p>
     * <br>
     * <p>For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](~~263332~~).</p>
     */
    @NameInMap("CompliancePackIds")
    public String compliancePackIds;

    /**
     * <p>Specifies whether to delete the rules in the compliance package. Valid values:</p>
     * <br>
     * <p>*   true: deletes the rules.</p>
     * <p>*   false: retains the rules. This is the default value.</p>
     */
    @NameInMap("DeleteRule")
    public Boolean deleteRule;

    public static DeleteCompliancePacksRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCompliancePacksRequest self = new DeleteCompliancePacksRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCompliancePacksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteCompliancePacksRequest setCompliancePackIds(String compliancePackIds) {
        this.compliancePackIds = compliancePackIds;
        return this;
    }
    public String getCompliancePackIds() {
        return this.compliancePackIds;
    }

    public DeleteCompliancePacksRequest setDeleteRule(Boolean deleteRule) {
        this.deleteRule = deleteRule;
        return this;
    }
    public Boolean getDeleteRule() {
        return this.deleteRule;
    }

}
