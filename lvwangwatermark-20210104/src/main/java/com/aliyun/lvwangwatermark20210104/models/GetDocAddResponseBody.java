// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetDocAddResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetDocAddResponseBodyData> data;

    public static GetDocAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocAddResponseBody self = new GetDocAddResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocAddResponseBody setData(java.util.List<GetDocAddResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDocAddResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDocAddResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SourceUrl")
        public String sourceUrl;

        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("MediaType")
        public String mediaType;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("TaskUid")
        public String taskUid;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("OptType")
        public String optType;

        @NameInMap("FinishedTime")
        public Long finishedTime;

        @NameInMap("Id")
        public Long id;

        public static GetDocAddResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocAddResponseBodyData self = new GetDocAddResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocAddResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDocAddResponseBodyData setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public GetDocAddResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public GetDocAddResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetDocAddResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetDocAddResponseBodyData setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetDocAddResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public GetDocAddResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public GetDocAddResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public GetDocAddResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDocAddResponseBodyData setOptType(String optType) {
            this.optType = optType;
            return this;
        }
        public String getOptType() {
            return this.optType;
        }

        public GetDocAddResponseBodyData setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public GetDocAddResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
