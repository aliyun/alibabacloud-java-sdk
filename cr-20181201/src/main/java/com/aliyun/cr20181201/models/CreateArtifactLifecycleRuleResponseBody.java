// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateArtifactLifecycleRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

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
