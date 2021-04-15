// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmItemsRequest extends TeaModel {
    @NameInMap("RequestPars")
    public String requestPars;

    public static ListAlarmItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmItemsRequest self = new ListAlarmItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmItemsRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
