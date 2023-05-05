// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class BatchSubscribeAppsShrinkRequest extends TeaModel {
    @NameInMap("AppIds")
    public String appIdsShrink;

    @NameInMap("AutoInstallApps")
    public java.util.List<BatchSubscribeAppsShrinkRequestAutoInstallApps> autoInstallApps;

    @NameInMap("DistributeType")
    public String distributeType;

    @NameInMap("ForceInstallType")
    public String forceInstallType;

    @NameInMap("Language")
    public String language;

    @NameInMap("RequestType")
    public String requestType;

    public static BatchSubscribeAppsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSubscribeAppsShrinkRequest self = new BatchSubscribeAppsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchSubscribeAppsShrinkRequest setAppIdsShrink(String appIdsShrink) {
        this.appIdsShrink = appIdsShrink;
        return this;
    }
    public String getAppIdsShrink() {
        return this.appIdsShrink;
    }

    public BatchSubscribeAppsShrinkRequest setAutoInstallApps(java.util.List<BatchSubscribeAppsShrinkRequestAutoInstallApps> autoInstallApps) {
        this.autoInstallApps = autoInstallApps;
        return this;
    }
    public java.util.List<BatchSubscribeAppsShrinkRequestAutoInstallApps> getAutoInstallApps() {
        return this.autoInstallApps;
    }

    public BatchSubscribeAppsShrinkRequest setDistributeType(String distributeType) {
        this.distributeType = distributeType;
        return this;
    }
    public String getDistributeType() {
        return this.distributeType;
    }

    public BatchSubscribeAppsShrinkRequest setForceInstallType(String forceInstallType) {
        this.forceInstallType = forceInstallType;
        return this;
    }
    public String getForceInstallType() {
        return this.forceInstallType;
    }

    public BatchSubscribeAppsShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public BatchSubscribeAppsShrinkRequest setRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }
    public String getRequestType() {
        return this.requestType;
    }

    public static class BatchSubscribeAppsShrinkRequestAutoInstallApps extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("SilenceDeleteParam")
        public String silenceDeleteParam;

        @NameInMap("SilenceInstallParam")
        public String silenceInstallParam;

        public static BatchSubscribeAppsShrinkRequestAutoInstallApps build(java.util.Map<String, ?> map) throws Exception {
            BatchSubscribeAppsShrinkRequestAutoInstallApps self = new BatchSubscribeAppsShrinkRequestAutoInstallApps();
            return TeaModel.build(map, self);
        }

        public BatchSubscribeAppsShrinkRequestAutoInstallApps setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public BatchSubscribeAppsShrinkRequestAutoInstallApps setSilenceDeleteParam(String silenceDeleteParam) {
            this.silenceDeleteParam = silenceDeleteParam;
            return this;
        }
        public String getSilenceDeleteParam() {
            return this.silenceDeleteParam;
        }

        public BatchSubscribeAppsShrinkRequestAutoInstallApps setSilenceInstallParam(String silenceInstallParam) {
            this.silenceInstallParam = silenceInstallParam;
            return this;
        }
        public String getSilenceInstallParam() {
            return this.silenceInstallParam;
        }

    }

}
