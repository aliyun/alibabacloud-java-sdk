// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteRepoSyncRuleResponseBody extends TeaModel {
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
     * <p>72DD4198-1BB9-47A3-BC01-EAD1A6D5E173</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRepoSyncRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepoSyncRuleResponseBody self = new DeleteRepoSyncRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRepoSyncRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteRepoSyncRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteRepoSyncRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
