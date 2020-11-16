// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAudioAuditNotifyConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveAudioAuditNotifyConfigList")
    @Validation(required = true)
    public DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigList liveAudioAuditNotifyConfigList;

    public static DescribeLiveAudioAuditNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAudioAuditNotifyConfigResponse self = new DescribeLiveAudioAuditNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAudioAuditNotifyConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveAudioAuditNotifyConfigResponse setLiveAudioAuditNotifyConfigList(DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigList liveAudioAuditNotifyConfigList) {
        this.liveAudioAuditNotifyConfigList = liveAudioAuditNotifyConfigList;
        return this;
    }
    public DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigList getLiveAudioAuditNotifyConfigList() {
        return this.liveAudioAuditNotifyConfigList;
    }

    public static class DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("Callback")
        @Validation(required = true)
        public String callback;

        @NameInMap("CallbackTemplate")
        @Validation(required = true)
        public String callbackTemplate;

        public static DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig self = new DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig setCallbackTemplate(String callbackTemplate) {
            this.callbackTemplate = callbackTemplate;
            return this;
        }
        public String getCallbackTemplate() {
            return this.callbackTemplate;
        }

    }

    public static class DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigList extends TeaModel {
        @NameInMap("LiveAudioAuditNotifyConfig")
        @Validation(required = true)
        public java.util.List<DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfig;

        public static DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigList self = new DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigList setLiveAudioAuditNotifyConfig(java.util.List<DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfig) {
            this.liveAudioAuditNotifyConfig = liveAudioAuditNotifyConfig;
            return this;
        }
        public java.util.List<DescribeLiveAudioAuditNotifyConfigResponseLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig> getLiveAudioAuditNotifyConfig() {
            return this.liveAudioAuditNotifyConfig;
        }

    }

}
