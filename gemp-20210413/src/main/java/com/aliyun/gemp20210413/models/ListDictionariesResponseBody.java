// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListDictionariesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.Map<String, java.util.List<DataValue>> data;

    @NameInMap("requestId")
    public String requestId;

    public static ListDictionariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDictionariesResponseBody self = new ListDictionariesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDictionariesResponseBody setData(java.util.Map<String, java.util.List<DataValue>> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, java.util.List<DataValue>> getData() {
        return this.data;
    }

    public ListDictionariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
