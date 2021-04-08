// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetDocExtractResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetDocExtractResponseBodyData> data;

    public static GetDocExtractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocExtractResponseBody self = new GetDocExtractResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocExtractResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocExtractResponseBody setData(java.util.List<GetDocExtractResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDocExtractResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDocExtractResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SourceUrl")
        public String sourceUrl;

        @NameInMap("WaterMarkId")
        public String waterMarkId;

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

        public static GetDocExtractResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocExtractResponseBodyData self = new GetDocExtractResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocExtractResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDocExtractResponseBodyData setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public GetDocExtractResponseBodyData setWaterMarkId(String waterMarkId) {
            this.waterMarkId = waterMarkId;
            return this;
        }
        public String getWaterMarkId() {
            return this.waterMarkId;
        }

        public GetDocExtractResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public GetDocExtractResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetDocExtractResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetDocExtractResponseBodyData setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetDocExtractResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public GetDocExtractResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public GetDocExtractResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public GetDocExtractResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDocExtractResponseBodyData setOptType(String optType) {
            this.optType = optType;
            return this;
        }
        public String getOptType() {
            return this.optType;
        }

        public GetDocExtractResponseBodyData setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public GetDocExtractResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
