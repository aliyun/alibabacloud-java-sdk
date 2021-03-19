// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetAudioExtractResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetAudioExtractResponseBodyData data;

    public static GetAudioExtractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAudioExtractResponseBody self = new GetAudioExtractResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAudioExtractResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAudioExtractResponseBody setData(GetAudioExtractResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAudioExtractResponseBodyData getData() {
        return this.data;
    }

    public static class GetAudioExtractResponseBodyData extends TeaModel {
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

        public static GetAudioExtractResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAudioExtractResponseBodyData self = new GetAudioExtractResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAudioExtractResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAudioExtractResponseBodyData setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public GetAudioExtractResponseBodyData setWaterMarkId(String waterMarkId) {
            this.waterMarkId = waterMarkId;
            return this;
        }
        public String getWaterMarkId() {
            return this.waterMarkId;
        }

        public GetAudioExtractResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public GetAudioExtractResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetAudioExtractResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetAudioExtractResponseBodyData setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetAudioExtractResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public GetAudioExtractResponseBodyData setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

        public GetAudioExtractResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public GetAudioExtractResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAudioExtractResponseBodyData setOptType(String optType) {
            this.optType = optType;
            return this;
        }
        public String getOptType() {
            return this.optType;
        }

        public GetAudioExtractResponseBodyData setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public GetAudioExtractResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
