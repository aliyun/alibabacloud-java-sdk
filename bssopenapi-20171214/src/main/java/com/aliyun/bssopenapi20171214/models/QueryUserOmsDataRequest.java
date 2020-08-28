// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryUserOmsDataRequest extends TeaModel {
    @NameInMap("Table")
    @Validation(required = true)
    public String table;

    @NameInMap("DataType")
    @Validation(required = true)
    public String dataType;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryUserOmsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserOmsDataRequest self = new QueryUserOmsDataRequest();
        return TeaModel.build(map, self);
    }

}
