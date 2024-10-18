// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportOssCheckStatRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ByMonth")
    public Boolean byMonth;

    /**
     * <strong>example:</strong>
     * <p>2024-03-11 10:00:00</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>P_UX0K5X</p>
     */
    @NameInMap("ParentTaskId")
    public String parentTaskId;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>2024-03-10 10:00:00</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static ExportOssCheckStatRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportOssCheckStatRequest self = new ExportOssCheckStatRequest();
        return TeaModel.build(map, self);
    }

    public ExportOssCheckStatRequest setByMonth(Boolean byMonth) {
        this.byMonth = byMonth;
        return this;
    }
    public Boolean getByMonth() {
        return this.byMonth;
    }

    public ExportOssCheckStatRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ExportOssCheckStatRequest setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
        return this;
    }
    public String getParentTaskId() {
        return this.parentTaskId;
    }

    public ExportOssCheckStatRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExportOssCheckStatRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
