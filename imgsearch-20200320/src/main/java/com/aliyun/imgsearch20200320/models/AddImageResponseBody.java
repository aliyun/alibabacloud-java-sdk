// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class AddImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AddImageResponseBodyData data;

    public static AddImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddImageResponseBody self = new AddImageResponseBody();
        return TeaModel.build(map, self);
    }

    public AddImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddImageResponseBody setData(AddImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddImageResponseBodyData getData() {
        return this.data;
    }

    public static class AddImageResponseBodyData extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        public static AddImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddImageResponseBodyData self = new AddImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddImageResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
