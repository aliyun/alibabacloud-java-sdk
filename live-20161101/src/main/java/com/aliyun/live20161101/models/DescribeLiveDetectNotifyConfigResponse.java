// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDetectNotifyConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveDetectNotifyConfig")
    @Validation(required = true)
    public DescribeLiveDetectNotifyConfigResponseLiveDetectNotifyConfig liveDetectNotifyConfig;

    public static DescribeLiveDetectNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDetectNotifyConfigResponse self = new DescribeLiveDetectNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDetectNotifyConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDetectNotifyConfigResponse setLiveDetectNotifyConfig(DescribeLiveDetectNotifyConfigResponseLiveDetectNotifyConfig liveDetectNotifyConfig) {
        this.liveDetectNotifyConfig = liveDetectNotifyConfig;
        return this;
    }
    public DescribeLiveDetectNotifyConfigResponseLiveDetectNotifyConfig getLiveDetectNotifyConfig() {
        return this.liveDetectNotifyConfig;
    }

    public static class DescribeLiveDetectNotifyConfigResponseLiveDetectNotifyConfig extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("NotifyUrl")
        @Validation(required = true)
        public String notifyUrl;

        public static DescribeLiveDetectNotifyConfigResponseLiveDetectNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDetectNotifyConfigResponseLiveDetectNotifyConfig self = new DescribeLiveDetectNotifyConfigResponseLiveDetectNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDetectNotifyConfigResponseLiveDetectNotifyConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDetectNotifyConfigResponseLiveDetectNotifyConfig setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

    }

}
