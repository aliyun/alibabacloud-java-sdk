// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class DeleteExperimentPlanResponseBody extends TeaModel {
    /**
     * <p>Access denied information</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Data</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>E67E2E4C-2B47-5C55-AA17-1D771E070AEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DeleteExperimentPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentPlanResponseBody self = new DeleteExperimentPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentPlanResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteExperimentPlanResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteExperimentPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteExperimentPlanResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
