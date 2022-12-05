// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetMessageAppResponseBodyResult result;

    public static GetMessageAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageAppResponseBody self = new GetMessageAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMessageAppResponseBody setResult(GetMessageAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMessageAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetMessageAppResponseBodyResult extends TeaModel {
        @NameInMap("AppConfig")
        public java.util.Map<String, String> appConfig;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        @NameInMap("Status")
        public Integer status;

        public static GetMessageAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMessageAppResponseBodyResult self = new GetMessageAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMessageAppResponseBodyResult setAppConfig(java.util.Map<String, String> appConfig) {
            this.appConfig = appConfig;
            return this;
        }
        public java.util.Map<String, String> getAppConfig() {
            return this.appConfig;
        }

        public GetMessageAppResponseBodyResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetMessageAppResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetMessageAppResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMessageAppResponseBodyResult setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public GetMessageAppResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
