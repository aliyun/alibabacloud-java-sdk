// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAsrConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveAsrConfig")
    public DescribeLiveAsrConfigResponseBodyLiveAsrConfig liveAsrConfig;

    public static DescribeLiveAsrConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAsrConfigResponseBody self = new DescribeLiveAsrConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAsrConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveAsrConfigResponseBody setLiveAsrConfig(DescribeLiveAsrConfigResponseBodyLiveAsrConfig liveAsrConfig) {
        this.liveAsrConfig = liveAsrConfig;
        return this;
    }
    public DescribeLiveAsrConfigResponseBodyLiveAsrConfig getLiveAsrConfig() {
        return this.liveAsrConfig;
    }

    public static class DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList extends TeaModel {
        @NameInMap("DomainName")
        public Integer domainName;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("MnsTopic")
        public String mnsTopic;

        @NameInMap("MnsRegion")
        public String mnsRegion;

        @NameInMap("HttpCallbackURL")
        public String httpCallbackURL;

        public static DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList self = new DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList setDomainName(Integer domainName) {
            this.domainName = domainName;
            return this;
        }
        public Integer getDomainName() {
            return this.domainName;
        }

        public DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList setMnsTopic(String mnsTopic) {
            this.mnsTopic = mnsTopic;
            return this;
        }
        public String getMnsTopic() {
            return this.mnsTopic;
        }

        public DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList setMnsRegion(String mnsRegion) {
            this.mnsRegion = mnsRegion;
            return this;
        }
        public String getMnsRegion() {
            return this.mnsRegion;
        }

        public DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList setHttpCallbackURL(String httpCallbackURL) {
            this.httpCallbackURL = httpCallbackURL;
            return this;
        }
        public String getHttpCallbackURL() {
            return this.httpCallbackURL;
        }

    }

    public static class DescribeLiveAsrConfigResponseBodyLiveAsrConfig extends TeaModel {
        @NameInMap("LiveAsrConfigList")
        public java.util.List<DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList> liveAsrConfigList;

        public static DescribeLiveAsrConfigResponseBodyLiveAsrConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveAsrConfigResponseBodyLiveAsrConfig self = new DescribeLiveAsrConfigResponseBodyLiveAsrConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveAsrConfigResponseBodyLiveAsrConfig setLiveAsrConfigList(java.util.List<DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList> liveAsrConfigList) {
            this.liveAsrConfigList = liveAsrConfigList;
            return this;
        }
        public java.util.List<DescribeLiveAsrConfigResponseBodyLiveAsrConfigLiveAsrConfigList> getLiveAsrConfigList() {
            return this.liveAsrConfigList;
        }

    }

}
