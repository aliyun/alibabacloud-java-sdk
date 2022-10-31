// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsNotifyUrlConfigResponseBody extends TeaModel {
    @NameInMap("LiveStreamsNotifyConfig")
    public DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig liveStreamsNotifyConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveStreamsNotifyUrlConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsNotifyUrlConfigResponseBody self = new DescribeLiveStreamsNotifyUrlConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsNotifyUrlConfigResponseBody setLiveStreamsNotifyConfig(DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig liveStreamsNotifyConfig) {
        this.liveStreamsNotifyConfig = liveStreamsNotifyConfig;
        return this;
    }
    public DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig getLiveStreamsNotifyConfig() {
        return this.liveStreamsNotifyConfig;
    }

    public DescribeLiveStreamsNotifyUrlConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("NotifyAuthKey")
        public String notifyAuthKey;

        @NameInMap("NotifyReqAuth")
        public String notifyReqAuth;

        @NameInMap("NotifyUrl")
        public String notifyUrl;

        public static DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig self = new DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig setNotifyAuthKey(String notifyAuthKey) {
            this.notifyAuthKey = notifyAuthKey;
            return this;
        }
        public String getNotifyAuthKey() {
            return this.notifyAuthKey;
        }

        public DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig setNotifyReqAuth(String notifyReqAuth) {
            this.notifyReqAuth = notifyReqAuth;
            return this;
        }
        public String getNotifyReqAuth() {
            return this.notifyReqAuth;
        }

        public DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

    }

}
