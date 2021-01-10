// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordNotifyConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveRecordNotifyConfig")
    public DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig liveRecordNotifyConfig;

    public static DescribeLiveRecordNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordNotifyConfigResponseBody self = new DescribeLiveRecordNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveRecordNotifyConfigResponseBody setLiveRecordNotifyConfig(DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig liveRecordNotifyConfig) {
        this.liveRecordNotifyConfig = liveRecordNotifyConfig;
        return this;
    }
    public DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig getLiveRecordNotifyConfig() {
        return this.liveRecordNotifyConfig;
    }

    public static class DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig extends TeaModel {
        @NameInMap("NeedStatusNotify")
        public Boolean needStatusNotify;

        @NameInMap("OnDemandUrl")
        public String onDemandUrl;

        @NameInMap("NotifyUrl")
        public String notifyUrl;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig self = new DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig setNeedStatusNotify(Boolean needStatusNotify) {
            this.needStatusNotify = needStatusNotify;
            return this;
        }
        public Boolean getNeedStatusNotify() {
            return this.needStatusNotify;
        }

        public DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig setOnDemandUrl(String onDemandUrl) {
            this.onDemandUrl = onDemandUrl;
            return this;
        }
        public String getOnDemandUrl() {
            return this.onDemandUrl;
        }

        public DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        public DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
