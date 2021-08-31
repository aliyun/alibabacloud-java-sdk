// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateRepoBuildRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BuildRuleId")
    public String buildRuleId;

    public static UpdateRepoBuildRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepoBuildRuleResponseBody self = new UpdateRepoBuildRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRepoBuildRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateRepoBuildRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public UpdateRepoBuildRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRepoBuildRuleResponseBody setBuildRuleId(String buildRuleId) {
        this.buildRuleId = buildRuleId;
        return this;
    }
    public String getBuildRuleId() {
        return this.buildRuleId;
    }

}
