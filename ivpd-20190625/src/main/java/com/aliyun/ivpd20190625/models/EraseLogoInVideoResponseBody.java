// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class EraseLogoInVideoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EraseLogoInVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static EraseLogoInVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EraseLogoInVideoResponseBody self = new EraseLogoInVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public EraseLogoInVideoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EraseLogoInVideoResponseBody setData(EraseLogoInVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EraseLogoInVideoResponseBodyData getData() {
        return this.data;
    }

    public EraseLogoInVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EraseLogoInVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EraseLogoInVideoResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static EraseLogoInVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EraseLogoInVideoResponseBodyData self = new EraseLogoInVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EraseLogoInVideoResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public EraseLogoInVideoResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
