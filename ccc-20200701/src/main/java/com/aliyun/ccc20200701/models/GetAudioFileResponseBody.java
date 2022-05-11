// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetAudioFileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAudioFileResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("MainFlow")
    public Boolean mainFlow;

    @NameInMap("Message")
    public String message;

    @NameInMap("Published")
    public Boolean published;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAudioFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAudioFileResponseBody self = new GetAudioFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAudioFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAudioFileResponseBody setData(GetAudioFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAudioFileResponseBodyData getData() {
        return this.data;
    }

    public GetAudioFileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAudioFileResponseBody setMainFlow(Boolean mainFlow) {
        this.mainFlow = mainFlow;
        return this;
    }
    public Boolean getMainFlow() {
        return this.mainFlow;
    }

    public GetAudioFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAudioFileResponseBody setPublished(Boolean published) {
        this.published = published;
        return this;
    }
    public Boolean getPublished() {
        return this.published;
    }

    public GetAudioFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAudioFileResponseBodyData extends TeaModel {
        @NameInMap("AudioFileName")
        public String audioFileName;

        @NameInMap("AudioResourceId")
        public String audioResourceId;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssFileKey")
        public String ossFileKey;

        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static GetAudioFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAudioFileResponseBodyData self = new GetAudioFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAudioFileResponseBodyData setAudioFileName(String audioFileName) {
            this.audioFileName = audioFileName;
            return this;
        }
        public String getAudioFileName() {
            return this.audioFileName;
        }

        public GetAudioFileResponseBodyData setAudioResourceId(String audioResourceId) {
            this.audioResourceId = audioResourceId;
            return this;
        }
        public String getAudioResourceId() {
            return this.audioResourceId;
        }

        public GetAudioFileResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetAudioFileResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAudioFileResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAudioFileResponseBodyData setOssFileKey(String ossFileKey) {
            this.ossFileKey = ossFileKey;
            return this;
        }
        public String getOssFileKey() {
            return this.ossFileKey;
        }

        public GetAudioFileResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
