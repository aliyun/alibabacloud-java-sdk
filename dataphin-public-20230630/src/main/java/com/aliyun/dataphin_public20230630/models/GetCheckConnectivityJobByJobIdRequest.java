// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetCheckConnectivityJobByJobIdRequest extends TeaModel {
    /**
     * <p>The ID of the connectivity check task, which is the Data returned by CheckDataSourceConnectivityOnResourceGroup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>129837xxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static GetCheckConnectivityJobByJobIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckConnectivityJobByJobIdRequest self = new GetCheckConnectivityJobByJobIdRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckConnectivityJobByJobIdRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetCheckConnectivityJobByJobIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetCheckConnectivityJobByJobIdRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
