// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetAudioAsyncResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetAudioAsyncResponseBodyData> data;

    public static GetAudioAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAudioAsyncResponseBody self = new GetAudioAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAudioAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAudioAsyncResponseBody setData(java.util.List<GetAudioAsyncResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAudioAsyncResponseBodyData> getData() {
        return this.data;
    }

    public static class GetAudioAsyncResponseBodyData extends TeaModel {
        @NameInMap("TaskUid")
        public String taskUid;

        @NameInMap("DataId")
        public String dataId;

        public static GetAudioAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAudioAsyncResponseBodyData self = new GetAudioAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAudioAsyncResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public GetAudioAsyncResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
