// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListConfigsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.Map<String, java.util.List<DataValue>> data;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    public static ListConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigsResponseBody self = new ListConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigsResponseBody setData(java.util.Map<String, java.util.List<DataValue>> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, java.util.List<DataValue>> getData() {
        return this.data;
    }

    public ListConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
