// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryVisionDeviceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryVisionDeviceInfoResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryVisionDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVisionDeviceInfoResponseBody self = new QueryVisionDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVisionDeviceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVisionDeviceInfoResponseBody setData(QueryVisionDeviceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryVisionDeviceInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryVisionDeviceInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryVisionDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVisionDeviceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo extends TeaModel {
        @NameInMap("DeviceProtocol")
        public Integer deviceProtocol;

        @NameInMap("GbId")
        public String gbId;

        @NameInMap("NetProtocol")
        public Integer netProtocol;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("Password")
        public String password;

        @NameInMap("SubProductKey")
        public String subProductKey;

        public static QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo self = new QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo setDeviceProtocol(Integer deviceProtocol) {
            this.deviceProtocol = deviceProtocol;
            return this;
        }
        public Integer getDeviceProtocol() {
            return this.deviceProtocol;
        }

        public QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo setNetProtocol(Integer netProtocol) {
            this.netProtocol = netProtocol;
            return this;
        }
        public Integer getNetProtocol() {
            return this.netProtocol;
        }

        public QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo setSubProductKey(String subProductKey) {
            this.subProductKey = subProductKey;
            return this;
        }
        public String getSubProductKey() {
            return this.subProductKey;
        }

    }

    public static class QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo extends TeaModel {
        @NameInMap("PullAuthKey")
        public String pullAuthKey;

        @NameInMap("PullKeyExpireTime")
        public Integer pullKeyExpireTime;

        @NameInMap("PushAuthKey")
        public String pushAuthKey;

        @NameInMap("PushKeyExpireTime")
        public Integer pushKeyExpireTime;

        @NameInMap("PushUrlSample")
        public String pushUrlSample;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("StreamStatus")
        public Integer streamStatus;

        public static QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo self = new QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo setPullAuthKey(String pullAuthKey) {
            this.pullAuthKey = pullAuthKey;
            return this;
        }
        public String getPullAuthKey() {
            return this.pullAuthKey;
        }

        public QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo setPullKeyExpireTime(Integer pullKeyExpireTime) {
            this.pullKeyExpireTime = pullKeyExpireTime;
            return this;
        }
        public Integer getPullKeyExpireTime() {
            return this.pullKeyExpireTime;
        }

        public QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo setPushAuthKey(String pushAuthKey) {
            this.pushAuthKey = pushAuthKey;
            return this;
        }
        public String getPushAuthKey() {
            return this.pushAuthKey;
        }

        public QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo setPushKeyExpireTime(Integer pushKeyExpireTime) {
            this.pushKeyExpireTime = pushKeyExpireTime;
            return this;
        }
        public Integer getPushKeyExpireTime() {
            return this.pushKeyExpireTime;
        }

        public QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo setPushUrlSample(String pushUrlSample) {
            this.pushUrlSample = pushUrlSample;
            return this;
        }
        public String getPushUrlSample() {
            return this.pushUrlSample;
        }

        public QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo setStreamStatus(Integer streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }
        public Integer getStreamStatus() {
            return this.streamStatus;
        }

    }

    public static class QueryVisionDeviceInfoResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceType")
        public Integer deviceType;

        @NameInMap("GbDeviceInfo")
        public QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo gbDeviceInfo;

        @NameInMap("RtmpDeviceInfo")
        public QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo rtmpDeviceInfo;

        public static QueryVisionDeviceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryVisionDeviceInfoResponseBodyData self = new QueryVisionDeviceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryVisionDeviceInfoResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryVisionDeviceInfoResponseBodyData setDeviceType(Integer deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public Integer getDeviceType() {
            return this.deviceType;
        }

        public QueryVisionDeviceInfoResponseBodyData setGbDeviceInfo(QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo gbDeviceInfo) {
            this.gbDeviceInfo = gbDeviceInfo;
            return this;
        }
        public QueryVisionDeviceInfoResponseBodyDataGbDeviceInfo getGbDeviceInfo() {
            return this.gbDeviceInfo;
        }

        public QueryVisionDeviceInfoResponseBodyData setRtmpDeviceInfo(QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo rtmpDeviceInfo) {
            this.rtmpDeviceInfo = rtmpDeviceInfo;
            return this;
        }
        public QueryVisionDeviceInfoResponseBodyDataRtmpDeviceInfo getRtmpDeviceInfo() {
            return this.rtmpDeviceInfo;
        }

    }

}
