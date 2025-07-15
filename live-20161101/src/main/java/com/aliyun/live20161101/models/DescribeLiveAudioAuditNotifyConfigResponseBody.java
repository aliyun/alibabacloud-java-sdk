// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAudioAuditNotifyConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration of callbacks for audio moderation results.</p>
     */
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
        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://guide.aliyundoc.com/callback">http://guide.aliyundoc.com/callback</a></p>
         */
        @NameInMap("Callback")
        public String callback;

        /**
         * <p>The callback template. The following fields are configured:</p>
         * <ul>
         * <li><strong>{DomainName}</strong>: the streaming domain.</li>
         * <li><strong>{AppName}</strong>: the name of the application to which the live stream belongs.</li>
         * <li><strong>{StreamName}</strong>: the name of the live stream.</li>
         * <li><strong>{Timestamp}</strong>: the time when the callback is returned. The value of this field is a UNIX timestamp. Unit: seconds.</li>
         * <li><strong>{Result}</strong>: the moderation results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;domain\&quot;:{DomainName},\&quot;app\&quot;:{AppName},\&quot;stream\&quot;:{StreamName},\&quot;timestamp\&quot;:{Timestamp},\&quot;result\&quot;:{Result}}</p>
         */
        @NameInMap("CallbackTemplate")
        public String callbackTemplate;

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
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
