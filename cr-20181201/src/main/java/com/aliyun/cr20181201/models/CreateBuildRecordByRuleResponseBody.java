// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateBuildRecordByRuleResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BuildRecordId")
    public String buildRecordId;

    @NameInMap("Code")
    public String code;

    public static CreateBuildRecordByRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildRecordByRuleResponseBody self = new CreateBuildRecordByRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBuildRecordByRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CreateBuildRecordByRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBuildRecordByRuleResponseBody setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    public CreateBuildRecordByRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
