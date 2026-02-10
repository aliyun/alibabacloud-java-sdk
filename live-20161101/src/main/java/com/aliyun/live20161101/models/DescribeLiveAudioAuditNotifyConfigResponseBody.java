// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAudioAuditNotifyConfigResponseBody extends TeaModel {
    @NameInMap("LiveAudioAuditNotifyConfigList")
    public DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigList liveAudioAuditNotifyConfigList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B908FF89-B03C-4831-B55B-48D2A******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveAudioAuditNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAudioAuditNotifyConfigResponseBody self = new DescribeLiveAudioAuditNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAudioAuditNotifyConfigResponseBody setLiveAudioAuditNotifyConfigList(DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigList liveAudioAuditNotifyConfigList) {
        this.liveAudioAuditNotifyConfigList = liveAudioAuditNotifyConfigList;
        return this;
    }
    public DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigList getLiveAudioAuditNotifyConfigList() {
        return this.liveAudioAuditNotifyConfigList;
    }

    public DescribeLiveAudioAuditNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig extends TeaModel {
        @NameInMap("Callback")
        public String callback;

        @NameInMap("CallbackTemplate")
        public String callbackTemplate;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig self = new DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAudioAuditNotifyConfigResponseBodyLiveAudioAuditNotifyConfigListLiveAudioAuditNotifyConfig setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
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
