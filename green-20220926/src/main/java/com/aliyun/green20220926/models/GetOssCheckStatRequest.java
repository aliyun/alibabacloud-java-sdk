// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckStatRequest extends TeaModel {
    /**
     * <p>Specifies whether to query by month.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ByMonth")
    public Boolean byMonth;

    /**
     * <p>The end time. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-24 10:01:55</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The parent task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>P_UNHBH</p>
     */
    @NameInMap("ParentTaskId")
    public String parentTaskId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-11 09:00:19</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static GetOssCheckStatRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckStatRequest self = new GetOssCheckStatRequest();
        return TeaModel.build(map, self);
    }

    public GetOssCheckStatRequest setByMonth(Boolean byMonth) {
        this.byMonth = byMonth;
        return this;
    }
    public Boolean getByMonth() {
        return this.byMonth;
    }

    public GetOssCheckStatRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetOssCheckStatRequest setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
        return this;
    }
    public String getParentTaskId() {
        return this.parentTaskId;
    }

    public GetOssCheckStatRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetOssCheckStatRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
