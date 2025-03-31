// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoBuildRecordStatusResponseBody extends TeaModel {
    /**
     * <p>The status of the image building.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("BuildStatus")
    public String buildStatus;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>79174CBA-8556-443A-8976-22C922D7BE37</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRepoBuildRecordStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoBuildRecordStatusResponseBody self = new GetRepoBuildRecordStatusResponseBody();
        return TeaModel.build(map, self);
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

}
