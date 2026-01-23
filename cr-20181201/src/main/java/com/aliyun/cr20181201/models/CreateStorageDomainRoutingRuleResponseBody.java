// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateStorageDomainRoutingRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
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
     * <p>C8E90AB5-0A96-5D12-9E59-11EE463*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crsdr-n6pbhgjx*****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>Identification of whether the request is successful or not</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateStorageDomainRoutingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageDomainRoutingRuleResponseBody self = new CreateStorageDomainRoutingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStorageDomainRoutingRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateStorageDomainRoutingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStorageDomainRoutingRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public CreateStorageDomainRoutingRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
