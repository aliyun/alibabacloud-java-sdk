// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiErrorImpactRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-30 20:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-30 08:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetDataServiceApiErrorImpactRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiErrorImpactRequest self = new GetDataServiceApiErrorImpactRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiErrorImpactRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetDataServiceApiErrorImpactRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetDataServiceApiErrorImpactRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public GetDataServiceApiErrorImpactRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
