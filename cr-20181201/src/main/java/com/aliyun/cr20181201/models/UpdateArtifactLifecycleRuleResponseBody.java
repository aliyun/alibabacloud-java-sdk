// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateArtifactLifecycleRuleResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the API request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
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
     * <p>BF92FC2E-455F-5600-A276-D2150A59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateArtifactLifecycleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateArtifactLifecycleRuleResponseBody self = new UpdateArtifactLifecycleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateArtifactLifecycleRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateArtifactLifecycleRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public UpdateArtifactLifecycleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
