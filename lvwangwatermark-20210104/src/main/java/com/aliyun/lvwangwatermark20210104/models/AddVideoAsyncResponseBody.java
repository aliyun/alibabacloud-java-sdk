// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddVideoAsyncResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<AddVideoAsyncResponseBodyData> data;

    public static AddVideoAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVideoAsyncResponseBody self = new AddVideoAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVideoAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddVideoAsyncResponseBody setData(java.util.List<AddVideoAsyncResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddVideoAsyncResponseBodyData> getData() {
        return this.data;
    }

    public static class AddVideoAsyncResponseBodyData extends TeaModel {
        @NameInMap("TaskUid")
        public String taskUid;

        @NameInMap("DataId")
        public String dataId;

        public static AddVideoAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddVideoAsyncResponseBodyData self = new AddVideoAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddVideoAsyncResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public AddVideoAsyncResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
