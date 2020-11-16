// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveStreamsNotifyConfig")
    @Validation(required = true)
    public DescribeLiveStreamsNotifyUrlConfigResponseLiveStreamsNotifyConfig liveStreamsNotifyConfig;

    public static DescribeLiveStreamsNotifyUrlConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsNotifyUrlConfigResponse self = new DescribeLiveStreamsNotifyUrlConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsNotifyUrlConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsNotifyUrlConfigResponse setLiveStreamsNotifyConfig(DescribeLiveStreamsNotifyUrlConfigResponseLiveStreamsNotifyConfig liveStreamsNotifyConfig) {
        this.liveStreamsNotifyConfig = liveStreamsNotifyConfig;
        return this;
    }
    public DescribeLiveStreamsNotifyUrlConfigResponseLiveStreamsNotifyConfig getLiveStreamsNotifyConfig() {
        return this.liveStreamsNotifyConfig;
    }

    public static class DescribeLiveStreamsNotifyUrlConfigResponseLiveStreamsNotifyConfig extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("NotifyUrl")
        @Validation(required = true)
        public String notifyUrl;

        @NameInMap("AuthType")
        @Validation(required = true)
        public String authType;

        @NameInMap("AuthKey")
        @Validation(required = true)
        public String authKey;

        public static DescribeLiveStreamsNotifyUrlConfigResponseLiveStreamsNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsNotifyUrlConfigResponseLiveStreamsNotifyConfig self = new DescribeLiveStreamsNotifyUrlConfigResponseLiveStreamsNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsNotifyUrlConfigResponseLiveStreamsNotifyConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamsNotifyUrlConfigResponseLiveStreamsNotifyConfig setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        public DescribeLiveStreamsNotifyUrlConfigResponseLiveStreamsNotifyConfig setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DescribeLiveStreamsNotifyUrlConfigResponseLiveStreamsNotifyConfig setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

    }

}
