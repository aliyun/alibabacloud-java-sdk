// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1759975856382</p>
     */
    @NameInMap("endDate")
    public Long endDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1775644926203</p>
     */
    @NameInMap("startDate")
    public Long startDate;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public ListInstancesRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
