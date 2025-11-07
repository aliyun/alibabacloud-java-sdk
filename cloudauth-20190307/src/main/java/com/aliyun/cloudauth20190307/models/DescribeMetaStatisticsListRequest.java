// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaStatisticsListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MOBILE_ONLINE_LENGTH</p>
     */
    @NameInMap("Api")
    public String api;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1750694399999</p>
     */
    @NameInMap("EndDate")
    public Long endDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1760112000000</p>
     */
    @NameInMap("StartDate")
    public Long startDate;

    public static DescribeMetaStatisticsListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaStatisticsListRequest self = new DescribeMetaStatisticsListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetaStatisticsListRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    public DescribeMetaStatisticsListRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public DescribeMetaStatisticsListRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
