// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTriggerResponseBody extends TeaModel {
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
     * <p>B79F5E0E-8770-407D-BCB6-ECF4BA9C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>crw-0z4pf81pgz35****</p>
     */
    @NameInMap("TriggerId")
    public String triggerId;

    public static CreateRepoTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoTriggerResponseBody self = new CreateRepoTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRepoTriggerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRepoTriggerResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CreateRepoTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRepoTriggerResponseBody setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

}
