// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDetectNotifyConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveDetectNotifyConfig")
    public DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig liveDetectNotifyConfig;

    public static DescribeLiveDetectNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDetectNotifyConfigResponseBody self = new DescribeLiveDetectNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDetectNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDetectNotifyConfigResponseBody setLiveDetectNotifyConfig(DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig liveDetectNotifyConfig) {
        this.liveDetectNotifyConfig = liveDetectNotifyConfig;
        return this;
    }
    public DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig getLiveDetectNotifyConfig() {
        return this.liveDetectNotifyConfig;
    }

    public static class DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig extends TeaModel {
        @NameInMap("NotifyUrl")
        public String notifyUrl;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig self = new DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        public DescribeLiveDetectNotifyConfigResponseBodyLiveDetectNotifyConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
