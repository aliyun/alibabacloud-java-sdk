// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAsrConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveAsrConfig")
    @Validation(required = true)
    public DescribeLiveAsrConfigResponseLiveAsrConfig liveAsrConfig;

    public static DescribeLiveAsrConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAsrConfigResponse self = new DescribeLiveAsrConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAsrConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveAsrConfigResponse setLiveAsrConfig(DescribeLiveAsrConfigResponseLiveAsrConfig liveAsrConfig) {
        this.liveAsrConfig = liveAsrConfig;
        return this;
    }
    public DescribeLiveAsrConfigResponseLiveAsrConfig getLiveAsrConfig() {
        return this.liveAsrConfig;
    }

    public static class DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public Integer domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("StreamName")
        @Validation(required = true)
        public String streamName;

        @NameInMap("Period")
        @Validation(required = true)
        public Integer period;

        @NameInMap("MnsTopic")
        @Validation(required = true)
        public String mnsTopic;

        @NameInMap("MnsRegion")
        @Validation(required = true)
        public String mnsRegion;

        @NameInMap("HttpCallbackURL")
        @Validation(required = true)
        public String httpCallbackURL;

        public static DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList self = new DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList setDomainName(Integer domainName) {
            this.domainName = domainName;
            return this;
        }
        public Integer getDomainName() {
            return this.domainName;
        }

        public DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList setMnsTopic(String mnsTopic) {
            this.mnsTopic = mnsTopic;
            return this;
        }
        public String getMnsTopic() {
            return this.mnsTopic;
        }

        public DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList setMnsRegion(String mnsRegion) {
            this.mnsRegion = mnsRegion;
            return this;
        }
        public String getMnsRegion() {
            return this.mnsRegion;
        }

        public DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList setHttpCallbackURL(String httpCallbackURL) {
            this.httpCallbackURL = httpCallbackURL;
            return this;
        }
        public String getHttpCallbackURL() {
            return this.httpCallbackURL;
        }

    }

    public static class DescribeLiveAsrConfigResponseLiveAsrConfig extends TeaModel {
        @NameInMap("LiveAsrConfigList")
        @Validation(required = true)
        public java.util.List<DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList> liveAsrConfigList;

        public static DescribeLiveAsrConfigResponseLiveAsrConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAsrConfigResponseLiveAsrConfig self = new DescribeLiveAsrConfigResponseLiveAsrConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAsrConfigResponseLiveAsrConfig setLiveAsrConfigList(java.util.List<DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList> liveAsrConfigList) {
            this.liveAsrConfigList = liveAsrConfigList;
            return this;
        }
        public java.util.List<DescribeLiveAsrConfigResponseLiveAsrConfigLiveAsrConfigList> getLiveAsrConfigList() {
            return this.liveAsrConfigList;
        }

    }

}
