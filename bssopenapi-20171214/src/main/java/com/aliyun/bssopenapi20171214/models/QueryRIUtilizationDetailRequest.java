// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRIUtilizationDetailRequest extends TeaModel {
    @NameInMap("RIInstanceId")
    public String RIInstanceId;

    @NameInMap("InstanceSpec")
    public String instanceSpec;

    @NameInMap("RICommodityCode")
    @Validation(required = true)
    public String RICommodityCode;

    @NameInMap("DeductedInstanceId")
    public String deductedInstanceId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryRIUtilizationDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRIUtilizationDetailRequest self = new QueryRIUtilizationDetailRequest();
        return TeaModel.build(map, self);
    }

}
