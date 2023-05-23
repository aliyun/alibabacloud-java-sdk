// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppSessionResponseBody extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>业务特定的信息，如会话启动/停止时间。</p>
     */
    @NameInMap("BizInfo")
    public GetAppSessionResponseBodyBizInfo bizInfo;

    @NameInMap("CustomSessionId")
    public String customSessionId;

    @NameInMap("PlatformSessionId")
    public String platformSessionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static GetAppSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppSessionResponseBody self = new GetAppSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppSessionResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppSessionResponseBody setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetAppSessionResponseBody setBizInfo(GetAppSessionResponseBodyBizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public GetAppSessionResponseBodyBizInfo getBizInfo() {
        return this.bizInfo;
    }

    public GetAppSessionResponseBody setCustomSessionId(String customSessionId) {
        this.customSessionId = customSessionId;
        return this;
    }
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    public GetAppSessionResponseBody setPlatformSessionId(String platformSessionId) {
        this.platformSessionId = platformSessionId;
        return this;
    }
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    public GetAppSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppSessionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetAppSessionResponseBodyBizInfo extends TeaModel {
        /**
         * <p>会话启动时间</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>会话停止时间</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        public static GetAppSessionResponseBodyBizInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAppSessionResponseBodyBizInfo self = new GetAppSessionResponseBodyBizInfo();
            return TeaModel.build(map, self);
        }

        public GetAppSessionResponseBodyBizInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetAppSessionResponseBodyBizInfo setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

}
