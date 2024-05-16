// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstanceAmountRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query, accurate to the day. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BeginDate")
    public String beginDate;

    /**
     * <p>The end of the time range to query, accurate to the day. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListInstanceAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAmountRequest self = new ListInstanceAmountRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceAmountRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public ListInstanceAmountRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListInstanceAmountRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
