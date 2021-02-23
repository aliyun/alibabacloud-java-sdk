// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddImageAsyncResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<AddImageAsyncResponseBodyData> data;

    public static AddImageAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddImageAsyncResponseBody self = new AddImageAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public AddImageAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddImageAsyncResponseBody setData(java.util.List<AddImageAsyncResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddImageAsyncResponseBodyData> getData() {
        return this.data;
    }

    public static class AddImageAsyncResponseBodyData extends TeaModel {
        @NameInMap("TaskUid")
        public String taskUid;

        @NameInMap("DataId")
        public String dataId;

        public static AddImageAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddImageAsyncResponseBodyData self = new AddImageAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddImageAsyncResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public AddImageAsyncResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
