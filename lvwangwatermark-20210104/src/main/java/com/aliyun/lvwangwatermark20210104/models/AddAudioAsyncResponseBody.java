// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class AddAudioAsyncResponseBody extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<AddAudioAsyncResponseBodyData> data;

    public static AddAudioAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAudioAsyncResponseBody self = new AddAudioAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAudioAsyncResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AddAudioAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAudioAsyncResponseBody setData(java.util.List<AddAudioAsyncResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddAudioAsyncResponseBodyData> getData() {
        return this.data;
    }

    public static class AddAudioAsyncResponseBodyData extends TeaModel {
        @NameInMap("TaskUid")
        public String taskUid;

        @NameInMap("DataId")
        public String dataId;

        public static AddAudioAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddAudioAsyncResponseBodyData self = new AddAudioAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddAudioAsyncResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public AddAudioAsyncResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
