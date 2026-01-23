// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateStorageDomainRoutingRuleResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D4978DCC-ECBD-40B0-A714-EE6959*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Request status ID</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateStorageDomainRoutingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStorageDomainRoutingRuleResponseBody self = new UpdateStorageDomainRoutingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStorageDomainRoutingRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateStorageDomainRoutingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateStorageDomainRoutingRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
