// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoBuildRecordStatusResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BuildStatus")
    public String buildStatus;

    @NameInMap("Code")
    public String code;

    public static GetRepoBuildRecordStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoBuildRecordStatusResponseBody self = new GetRepoBuildRecordStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoBuildRecordStatusResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepoBuildRecordStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepoBuildRecordStatusResponseBody setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
        return this;
    }
    public String getBuildStatus() {
        return this.buildStatus;
    }

    public GetRepoBuildRecordStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
