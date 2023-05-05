// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class BatchSubscribeAppsRequest extends TeaModel {
    @NameInMap("AppIds")
    public java.util.Map<String, ?> appIds;

    @NameInMap("AutoInstallApps")
    public java.util.List<BatchSubscribeAppsRequestAutoInstallApps> autoInstallApps;

    @NameInMap("DistributeType")
    public String distributeType;

    @NameInMap("ForceInstallType")
    public String forceInstallType;

    @NameInMap("Language")
    public String language;

    @NameInMap("RequestType")
    public String requestType;

    public static BatchSubscribeAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSubscribeAppsRequest self = new BatchSubscribeAppsRequest();
        return TeaModel.build(map, self);
    }

    public BatchSubscribeAppsRequest setAppIds(java.util.Map<String, ?> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.Map<String, ?> getAppIds() {
        return this.appIds;
    }

    public BatchSubscribeAppsRequest setAutoInstallApps(java.util.List<BatchSubscribeAppsRequestAutoInstallApps> autoInstallApps) {
        this.autoInstallApps = autoInstallApps;
        return this;
    }
    public java.util.List<BatchSubscribeAppsRequestAutoInstallApps> getAutoInstallApps() {
        return this.autoInstallApps;
    }

    public BatchSubscribeAppsRequest setDistributeType(String distributeType) {
        this.distributeType = distributeType;
        return this;
    }
    public String getDistributeType() {
        return this.distributeType;
    }

    public BatchSubscribeAppsRequest setForceInstallType(String forceInstallType) {
        this.forceInstallType = forceInstallType;
        return this;
    }
    public String getForceInstallType() {
        return this.forceInstallType;
    }

    public BatchSubscribeAppsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public BatchSubscribeAppsRequest setRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }
    public String getRequestType() {
        return this.requestType;
    }

    public static class BatchSubscribeAppsRequestAutoInstallApps extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("SilenceDeleteParam")
        public String silenceDeleteParam;

        @NameInMap("SilenceInstallParam")
        public String silenceInstallParam;

        public static BatchSubscribeAppsRequestAutoInstallApps build(java.util.Map<String, ?> map) throws Exception {
            BatchSubscribeAppsRequestAutoInstallApps self = new BatchSubscribeAppsRequestAutoInstallApps();
            return TeaModel.build(map, self);
        }

        public BatchSubscribeAppsRequestAutoInstallApps setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public BatchSubscribeAppsRequestAutoInstallApps setSilenceDeleteParam(String silenceDeleteParam) {
            this.silenceDeleteParam = silenceDeleteParam;
            return this;
        }
        public String getSilenceDeleteParam() {
            return this.silenceDeleteParam;
        }

        public BatchSubscribeAppsRequestAutoInstallApps setSilenceInstallParam(String silenceInstallParam) {
            this.silenceInstallParam = silenceInstallParam;
            return this;
        }
        public String getSilenceInstallParam() {
            return this.silenceInstallParam;
        }

    }

}
