// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateBuildRecordByRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the image building record.</p>
     * 
     * <strong>example:</strong>
     * <p>0A311FC5-B8C6-4332-80E4-539EB73****</p>
     */
    @NameInMap("BuildRecordId")
    public String buildRecordId;

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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B01B8857-A16E-40E9-A37E-764F15776FAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBuildRecordByRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildRecordByRuleResponseBody self = new CreateBuildRecordByRuleResponseBody();
        return TeaModel.build(map, self);
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

}
