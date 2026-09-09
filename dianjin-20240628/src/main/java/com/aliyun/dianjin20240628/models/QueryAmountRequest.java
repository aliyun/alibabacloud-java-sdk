// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class QueryAmountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("aliyunUidList")
    public java.util.List<String> aliyunUidList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("startDate")
    public String startDate;

    public static QueryAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAmountRequest self = new QueryAmountRequest();
        return TeaModel.build(map, self);
    }

    public QueryAmountRequest setAliyunUidList(java.util.List<String> aliyunUidList) {
        this.aliyunUidList = aliyunUidList;
        return this;
    }
    public java.util.List<String> getAliyunUidList() {
        return this.aliyunUidList;
    }

    public QueryAmountRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryAmountRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
