// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactLifecycleRuleResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AA66379-B880-5123-9F6A-96BB25D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cralr-b6thg027zmk1****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    public static CreateArtifactLifecycleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactLifecycleRuleResponseBody self = new CreateArtifactLifecycleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateArtifactLifecycleRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateArtifactLifecycleRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CreateArtifactLifecycleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateArtifactLifecycleRuleResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
