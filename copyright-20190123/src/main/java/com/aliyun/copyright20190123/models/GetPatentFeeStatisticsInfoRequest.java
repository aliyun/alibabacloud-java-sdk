// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentFeeStatisticsInfoRequest extends TeaModel {
    @NameInMap("UserType")
    public String userType;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("EndDate")
    public Long endDate;

    public static GetPatentFeeStatisticsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPatentFeeStatisticsInfoRequest self = new GetPatentFeeStatisticsInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetPatentFeeStatisticsInfoRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public GetPatentFeeStatisticsInfoRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetPatentFeeStatisticsInfoRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

}
