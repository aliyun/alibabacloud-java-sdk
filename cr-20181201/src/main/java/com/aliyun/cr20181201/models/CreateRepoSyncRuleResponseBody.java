// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
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
     * <p>8F8A0BA6-7F06-4BAE-B147-10BD6A25****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the synchronization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>crsr-gk5p2ns1kzns****</p>
     */
    @NameInMap("SyncRuleId")
    public String syncRuleId;

    public static CreateRepoSyncRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSyncRuleResponseBody self = new CreateRepoSyncRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRepoSyncRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRepoSyncRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CreateRepoSyncRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRepoSyncRuleResponseBody setSyncRuleId(String syncRuleId) {
        this.syncRuleId = syncRuleId;
        return this;
    }
    public String getSyncRuleId() {
        return this.syncRuleId;
    }

}
