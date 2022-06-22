// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetGeneralSettingOfAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelGetGeneralSettingOfAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelGetGeneralSettingOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetGeneralSettingOfAppResponseBody self = new SentinelGetGeneralSettingOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelGetGeneralSettingOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelGetGeneralSettingOfAppResponseBody setData(SentinelGetGeneralSettingOfAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelGetGeneralSettingOfAppResponseBodyData getData() {
        return this.data;
    }

    public SentinelGetGeneralSettingOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelGetGeneralSettingOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelGetGeneralSettingOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelGetGeneralSettingOfAppResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MaxContextAmount")
        public Integer maxContextAmount;

        @NameInMap("MaxOriginAmount")
        public Integer maxOriginAmount;

        @NameInMap("MaxResourceAmount")
        public Integer maxResourceAmount;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("StatisticMaxRt")
        public Integer statisticMaxRt;

        @NameInMap("UserId")
        public String userId;

        public static SentinelGetGeneralSettingOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelGetGeneralSettingOfAppResponseBodyData self = new SentinelGetGeneralSettingOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelGetGeneralSettingOfAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelGetGeneralSettingOfAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelGetGeneralSettingOfAppResponseBodyData setMaxContextAmount(Integer maxContextAmount) {
            this.maxContextAmount = maxContextAmount;
            return this;
        }
        public Integer getMaxContextAmount() {
            return this.maxContextAmount;
        }

        public SentinelGetGeneralSettingOfAppResponseBodyData setMaxOriginAmount(Integer maxOriginAmount) {
            this.maxOriginAmount = maxOriginAmount;
            return this;
        }
        public Integer getMaxOriginAmount() {
            return this.maxOriginAmount;
        }

        public SentinelGetGeneralSettingOfAppResponseBodyData setMaxResourceAmount(Integer maxResourceAmount) {
            this.maxResourceAmount = maxResourceAmount;
            return this;
        }
        public Integer getMaxResourceAmount() {
            return this.maxResourceAmount;
        }

        public SentinelGetGeneralSettingOfAppResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelGetGeneralSettingOfAppResponseBodyData setStatisticMaxRt(Integer statisticMaxRt) {
            this.statisticMaxRt = statisticMaxRt;
            return this;
        }
        public Integer getStatisticMaxRt() {
            return this.statisticMaxRt;
        }

        public SentinelGetGeneralSettingOfAppResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
