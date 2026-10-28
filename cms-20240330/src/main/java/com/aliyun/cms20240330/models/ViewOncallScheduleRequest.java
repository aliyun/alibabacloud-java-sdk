// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ViewOncallScheduleRequest extends TeaModel {
    /**
     * <p>The end date of the query. Format: yyyy-MM-dd. This parameter must be specified together with startDate.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-05</p>
     */
    @NameInMap("endDate")
    public String endDate;

    /**
     * <p>The start date of the query. Format: yyyy-MM-dd. This parameter must be specified together with endDate.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-04</p>
     */
    @NameInMap("startDate")
    public String startDate;

    public static ViewOncallScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        ViewOncallScheduleRequest self = new ViewOncallScheduleRequest();
        return TeaModel.build(map, self);
    }

    public ViewOncallScheduleRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ViewOncallScheduleRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
