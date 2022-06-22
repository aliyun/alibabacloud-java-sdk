// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelUpdateGeneralSettingOfAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelUpdateGeneralSettingOfAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelUpdateGeneralSettingOfAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelUpdateGeneralSettingOfAppResponseBody self = new SentinelUpdateGeneralSettingOfAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelUpdateGeneralSettingOfAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelUpdateGeneralSettingOfAppResponseBody setData(SentinelUpdateGeneralSettingOfAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelUpdateGeneralSettingOfAppResponseBodyData getData() {
        return this.data;
    }

    public SentinelUpdateGeneralSettingOfAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelUpdateGeneralSettingOfAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelUpdateGeneralSettingOfAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelUpdateGeneralSettingOfAppResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("id")
        public Long id;

        @NameInMap("maxContextAmount")
        public Integer maxContextAmount;

        @NameInMap("maxOriginAmount")
        public Integer maxOriginAmount;

        @NameInMap("maxResourceAmount")
        public Integer maxResourceAmount;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("statisticMaxRt")
        public Integer statisticMaxRt;

        @NameInMap("userId")
        public String userId;

        public static SentinelUpdateGeneralSettingOfAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelUpdateGeneralSettingOfAppResponseBodyData self = new SentinelUpdateGeneralSettingOfAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelUpdateGeneralSettingOfAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelUpdateGeneralSettingOfAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelUpdateGeneralSettingOfAppResponseBodyData setMaxContextAmount(Integer maxContextAmount) {
            this.maxContextAmount = maxContextAmount;
            return this;
        }
        public Integer getMaxContextAmount() {
            return this.maxContextAmount;
        }

        public SentinelUpdateGeneralSettingOfAppResponseBodyData setMaxOriginAmount(Integer maxOriginAmount) {
            this.maxOriginAmount = maxOriginAmount;
            return this;
        }
        public Integer getMaxOriginAmount() {
            return this.maxOriginAmount;
        }

        public SentinelUpdateGeneralSettingOfAppResponseBodyData setMaxResourceAmount(Integer maxResourceAmount) {
            this.maxResourceAmount = maxResourceAmount;
            return this;
        }
        public Integer getMaxResourceAmount() {
            return this.maxResourceAmount;
        }

        public SentinelUpdateGeneralSettingOfAppResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelUpdateGeneralSettingOfAppResponseBodyData setStatisticMaxRt(Integer statisticMaxRt) {
            this.statisticMaxRt = statisticMaxRt;
            return this;
        }
        public Integer getStatisticMaxRt() {
            return this.statisticMaxRt;
        }

        public SentinelUpdateGeneralSettingOfAppResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
