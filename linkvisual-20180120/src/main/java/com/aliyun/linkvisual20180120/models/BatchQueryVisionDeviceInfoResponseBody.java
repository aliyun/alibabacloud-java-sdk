// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class BatchQueryVisionDeviceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchQueryVisionDeviceInfoResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchQueryVisionDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryVisionDeviceInfoResponseBody self = new BatchQueryVisionDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryVisionDeviceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchQueryVisionDeviceInfoResponseBody setData(BatchQueryVisionDeviceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchQueryVisionDeviceInfoResponseBodyData getData() {
        return this.data;
    }

    public BatchQueryVisionDeviceInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchQueryVisionDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryVisionDeviceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo extends TeaModel {
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

        public static BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo self = new BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo();
            return TeaModel.build(map, self);
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo setDeviceProtocol(Integer deviceProtocol) {
            this.deviceProtocol = deviceProtocol;
            return this;
        }
        public Integer getDeviceProtocol() {
            return this.deviceProtocol;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo setNetProtocol(Integer netProtocol) {
            this.netProtocol = netProtocol;
            return this;
        }
        public Integer getNetProtocol() {
            return this.netProtocol;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo setSubProductKey(String subProductKey) {
            this.subProductKey = subProductKey;
            return this;
        }
        public String getSubProductKey() {
            return this.subProductKey;
        }

    }

    public static class BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo extends TeaModel {
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

        public static BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo self = new BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo();
            return TeaModel.build(map, self);
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo setPullAuthKey(String pullAuthKey) {
            this.pullAuthKey = pullAuthKey;
            return this;
        }
        public String getPullAuthKey() {
            return this.pullAuthKey;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo setPullKeyExpireTime(Integer pullKeyExpireTime) {
            this.pullKeyExpireTime = pullKeyExpireTime;
            return this;
        }
        public Integer getPullKeyExpireTime() {
            return this.pullKeyExpireTime;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo setPushAuthKey(String pushAuthKey) {
            this.pushAuthKey = pushAuthKey;
            return this;
        }
        public String getPushAuthKey() {
            return this.pushAuthKey;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo setPushKeyExpireTime(Integer pushKeyExpireTime) {
            this.pushKeyExpireTime = pushKeyExpireTime;
            return this;
        }
        public Integer getPushKeyExpireTime() {
            return this.pushKeyExpireTime;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo setPushUrlSample(String pushUrlSample) {
            this.pushUrlSample = pushUrlSample;
            return this;
        }
        public String getPushUrlSample() {
            return this.pushUrlSample;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo setStreamStatus(Integer streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }
        public Integer getStreamStatus() {
            return this.streamStatus;
        }

    }

    public static class BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoList extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceType")
        public Integer deviceType;

        @NameInMap("GbDeviceInfo")
        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo gbDeviceInfo;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("RtmpDeviceInfo")
        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo rtmpDeviceInfo;

        public static BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoList build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoList self = new BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoList();
            return TeaModel.build(map, self);
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoList setDeviceType(Integer deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public Integer getDeviceType() {
            return this.deviceType;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoList setGbDeviceInfo(BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo gbDeviceInfo) {
            this.gbDeviceInfo = gbDeviceInfo;
            return this;
        }
        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListGbDeviceInfo getGbDeviceInfo() {
            return this.gbDeviceInfo;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoList setRtmpDeviceInfo(BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo rtmpDeviceInfo) {
            this.rtmpDeviceInfo = rtmpDeviceInfo;
            return this;
        }
        public BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoListRtmpDeviceInfo getRtmpDeviceInfo() {
            return this.rtmpDeviceInfo;
        }

    }

    public static class BatchQueryVisionDeviceInfoResponseBodyData extends TeaModel {
        @NameInMap("DeviceInfoList")
        public java.util.List<BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoList> deviceInfoList;

        public static BatchQueryVisionDeviceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryVisionDeviceInfoResponseBodyData self = new BatchQueryVisionDeviceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchQueryVisionDeviceInfoResponseBodyData setDeviceInfoList(java.util.List<BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoList> deviceInfoList) {
            this.deviceInfoList = deviceInfoList;
            return this;
        }
        public java.util.List<BatchQueryVisionDeviceInfoResponseBodyDataDeviceInfoList> getDeviceInfoList() {
            return this.deviceInfoList;
        }

    }

}
