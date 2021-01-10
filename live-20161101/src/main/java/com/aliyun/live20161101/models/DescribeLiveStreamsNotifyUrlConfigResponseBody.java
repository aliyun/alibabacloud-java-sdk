// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsNotifyUrlConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveStreamsNotifyConfig")
    public DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig liveStreamsNotifyConfig;

    public static DescribeLiveStreamsNotifyUrlConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsNotifyUrlConfigResponseBody self = new DescribeLiveStreamsNotifyUrlConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsNotifyUrlConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsNotifyUrlConfigResponseBody setLiveStreamsNotifyConfig(DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig liveStreamsNotifyConfig) {
        this.liveStreamsNotifyConfig = liveStreamsNotifyConfig;
        return this;
    }
    public DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig getLiveStreamsNotifyConfig() {
        return this.liveStreamsNotifyConfig;
    }

    public static class DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig extends TeaModel {
        @NameInMap("NotifyUrl")
        public String notifyUrl;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig self = new DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        public DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
