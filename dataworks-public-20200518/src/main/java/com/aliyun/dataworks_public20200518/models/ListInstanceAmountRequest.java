// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstanceAmountRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("BeginDate")
    @Validation(required = true)
    public String beginDate;

    @NameInMap("EndDate")
    @Validation(required = true)
    public String endDate;

    public static ListInstanceAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAmountRequest self = new ListInstanceAmountRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceAmountRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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

}
