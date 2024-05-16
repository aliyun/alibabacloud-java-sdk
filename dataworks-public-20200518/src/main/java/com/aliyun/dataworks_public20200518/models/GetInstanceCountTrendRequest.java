// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceCountTrendRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BeginDate")
    public String beginDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetInstanceCountTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceCountTrendRequest self = new GetInstanceCountTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceCountTrendRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetInstanceCountTrendRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetInstanceCountTrendRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
