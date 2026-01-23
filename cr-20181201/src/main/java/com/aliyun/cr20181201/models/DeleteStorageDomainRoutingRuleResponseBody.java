// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteStorageDomainRoutingRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The request ID</p>
     * 
     * <strong>example:</strong>
     * <p>D4978DCC-ECBD-40B0-A714-EE6959B*****</p>
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

    public static DeleteStorageDomainRoutingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageDomainRoutingRuleResponseBody self = new DeleteStorageDomainRoutingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStorageDomainRoutingRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteStorageDomainRoutingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteStorageDomainRoutingRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
