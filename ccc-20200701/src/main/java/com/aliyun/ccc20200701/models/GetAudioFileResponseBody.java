// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetAudioFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAudioFileResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EEE26562-D921-5CB2-AE49-E4C45A42D432</p>
     */
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

    public GetAudioFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAudioFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAudioFileResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-file.wav</p>
         */
        @NameInMap("AudioFileName")
        public String audioFileName;

        /**
         * <strong>example:</strong>
         * <p>c1a06b46-302a-4c6e-928b-a43c0df485cf</p>
         */
        @NameInMap("AudioResourceId")
        public String audioResourceId;

        /**
         * <strong>example:</strong>
         * <p>2021-07-14 10:48:43.0</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ccc-test/test-file.wav</p>
         */
        @NameInMap("OssFileKey")
        public String ossFileKey;

        /**
         * <strong>example:</strong>
         * <p>2021-07-14 10:48:43.0</p>
         */
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
