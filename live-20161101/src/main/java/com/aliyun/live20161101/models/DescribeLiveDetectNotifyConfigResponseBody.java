// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDetectNotifyConfigResponseBody extends TeaModel {
    /**
     * <p>The callback configuration.</p>
     */
    @NameInMap("LiveDetectNotifyConfig")
    public DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig liveDetectNotifyConfig;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDetectNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDetectNotifyConfigResponseBody self = new DescribeLiveDetectNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDetectNotifyConfigResponseBody setLiveDetectNotifyConfig(DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig liveDetectNotifyConfig) {
        this.liveDetectNotifyConfig = liveDetectNotifyConfig;
        return this;
    }
    public DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig getLiveDetectNotifyConfig() {
        return this.liveDetectNotifyConfig;
    }

    public DescribeLiveDetectNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig extends TeaModel {
        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://aliyundoc.com">http://aliyundoc.com</a></p>
         */
        @NameInMap("NotifyUrl")
        public String notifyUrl;

        public static DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig self = new DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

    }

}
