// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddDocAsyncResponseBody extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<AddDocAsyncResponseBodyData> data;

    public static AddDocAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDocAsyncResponseBody self = new AddDocAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDocAsyncResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AddDocAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDocAsyncResponseBody setData(java.util.List<AddDocAsyncResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddDocAsyncResponseBodyData> getData() {
        return this.data;
    }

    public static class AddDocAsyncResponseBodyData extends TeaModel {
        @NameInMap("TaskUid")
        public String taskUid;

        @NameInMap("DataId")
        public String dataId;

        public static AddDocAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddDocAsyncResponseBodyData self = new AddDocAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddDocAsyncResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public AddDocAsyncResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
