// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordNotifyConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveRecordNotifyConfig")
    @Validation(required = true)
    public DescribeLiveRecordNotifyConfigResponseLiveRecordNotifyConfig liveRecordNotifyConfig;

    public static DescribeLiveRecordNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordNotifyConfigResponse self = new DescribeLiveRecordNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordNotifyConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveRecordNotifyConfigResponse setLiveRecordNotifyConfig(DescribeLiveRecordNotifyConfigResponseLiveRecordNotifyConfig liveRecordNotifyConfig) {
        this.liveRecordNotifyConfig = liveRecordNotifyConfig;
        return this;
    }
    public DescribeLiveRecordNotifyConfigResponseLiveRecordNotifyConfig getLiveRecordNotifyConfig() {
        return this.liveRecordNotifyConfig;
    }

    public static class DescribeLiveRecordNotifyConfigResponseLiveRecordNotifyConfig extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("NotifyUrl")
        @Validation(required = true)
        public String notifyUrl;

        @NameInMap("OnDemandUrl")
        @Validation(required = true)
        public String onDemandUrl;

        @NameInMap("NeedStatusNotify")
        @Validation(required = true)
        public Boolean needStatusNotify;

        public static DescribeLiveRecordNotifyConfigResponseLiveRecordNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordNotifyConfigResponseLiveRecordNotifyConfig self = new DescribeLiveRecordNotifyConfigResponseLiveRecordNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordNotifyConfigResponseLiveRecordNotifyConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveRecordNotifyConfigResponseLiveRecordNotifyConfig setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        public DescribeLiveRecordNotifyConfigResponseLiveRecordNotifyConfig setOnDemandUrl(String onDemandUrl) {
            this.onDemandUrl = onDemandUrl;
            return this;
        }
        public String getOnDemandUrl() {
            return this.onDemandUrl;
        }

        public DescribeLiveRecordNotifyConfigResponseLiveRecordNotifyConfig setNeedStatusNotify(Boolean needStatusNotify) {
            this.needStatusNotify = needStatusNotify;
            return this;
        }
        public Boolean getNeedStatusNotify() {
            return this.needStatusNotify;
        }

    }

}
