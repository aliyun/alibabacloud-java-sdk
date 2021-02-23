// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetVideoAsyncResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetVideoAsyncResponseBodyData> data;

    public static GetVideoAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoAsyncResponseBody self = new GetVideoAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoAsyncResponseBody setData(java.util.List<GetVideoAsyncResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetVideoAsyncResponseBodyData> getData() {
        return this.data;
    }

    public static class GetVideoAsyncResponseBodyData extends TeaModel {
        @NameInMap("TaskUid")
        public String taskUid;

        @NameInMap("DataId")
        public String dataId;

        public static GetVideoAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVideoAsyncResponseBodyData self = new GetVideoAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVideoAsyncResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public GetVideoAsyncResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
