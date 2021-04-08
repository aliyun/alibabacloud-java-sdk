// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetVideoTraceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetVideoTraceResponseBodyData> data;

    public static GetVideoTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTraceResponseBody self = new GetVideoTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoTraceResponseBody setData(java.util.List<GetVideoTraceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetVideoTraceResponseBodyData> getData() {
        return this.data;
    }

    public static class GetVideoTraceResponseBodyData extends TeaModel {
        @NameInMap("TaskUid")
        public String taskUid;

        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("UserInfo")
        public String userInfo;

        @NameInMap("FileUid")
        public String fileUid;

        public static GetVideoTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVideoTraceResponseBodyData self = new GetVideoTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVideoTraceResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public GetVideoTraceResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public GetVideoTraceResponseBodyData setUserInfo(String userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public String getUserInfo() {
            return this.userInfo;
        }

        public GetVideoTraceResponseBodyData setFileUid(String fileUid) {
            this.fileUid = fileUid;
            return this;
        }
        public String getFileUid() {
            return this.fileUid;
        }

    }

}
