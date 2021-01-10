// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAudioAuditNotifyConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveAudioAuditNotifyConfigList")
    public DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigList liveAudioAuditNotifyConfigList;

    public static DescribeLiveAudioAuditNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAudioAuditNotifyConfigResponseBody self = new DescribeLiveAudioAuditNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAudioAuditNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveAudioAuditNotifyConfigResponseBody setLiveAudioAuditNotifyConfigList(DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigList liveAudioAuditNotifyConfigList) {
        this.liveAudioAuditNotifyConfigList = liveAudioAuditNotifyConfigList;
        return this;
    }
    public DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigList getLiveAudioAuditNotifyConfigList() {
        return this.liveAudioAuditNotifyConfigList;
    }

    public static class DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig extends TeaModel {
        @NameInMap("CallbackTemplate")
        public String callbackTemplate;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Callback")
        public String callback;

        public static DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig self = new DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig setCallbackTemplate(String callbackTemplate) {
            this.callbackTemplate = callbackTemplate;
            return this;
        }
        public String getCallbackTemplate() {
            return this.callbackTemplate;
        }

        public DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

    }

    public static class DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigList extends TeaModel {
        @NameInMap("LiveAudioAuditNotifyConfig")
        public java.util.List<DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfig;

        public static DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigList self = new DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigList setLiveAudioAuditNotifyConfig(java.util.List<DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfig) {
            this.liveAudioAuditNotifyConfig = liveAudioAuditNotifyConfig;
            return this;
        }
        public java.util.List<DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig> getLiveAudioAuditNotifyConfig() {
            return this.liveAudioAuditNotifyConfig;
        }

    }

}
