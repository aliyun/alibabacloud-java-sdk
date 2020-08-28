// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryMonthRecordRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("Month")
    @Validation(required = true)
    public String month;

    public static QueryMonthRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthRecordRequest self = new QueryMonthRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryMonthRecordRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryMonthRecordRequest setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

}
