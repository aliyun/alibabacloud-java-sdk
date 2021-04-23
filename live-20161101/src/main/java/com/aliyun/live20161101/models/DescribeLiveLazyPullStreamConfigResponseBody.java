// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveLazyPullStreamConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveLazyPullConfigList")
    public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigList liveLazyPullConfigList;

    public static DescribeLiveLazyPullStreamConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveLazyPullStreamConfigResponseBody self = new DescribeLiveLazyPullStreamConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveLazyPullStreamConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveLazyPullStreamConfigResponseBody setLiveLazyPullConfigList(DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigList liveLazyPullConfigList) {
        this.liveLazyPullConfigList = liveLazyPullConfigList;
        return this;
    }
    public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigList getLiveLazyPullConfigList() {
        return this.liveLazyPullConfigList;
    }

    public static class DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("PullAppName")
        public String pullAppName;

        @NameInMap("PullProtocol")
        public String pullProtocol;

        @NameInMap("PullDomainName")
        public String pullDomainName;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig self = new DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig setPullAppName(String pullAppName) {
            this.pullAppName = pullAppName;
            return this;
        }
        public String getPullAppName() {
            return this.pullAppName;
        }

        public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig setPullProtocol(String pullProtocol) {
            this.pullProtocol = pullProtocol;
            return this;
        }
        public String getPullProtocol() {
            return this.pullProtocol;
        }

        public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig setPullDomainName(String pullDomainName) {
            this.pullDomainName = pullDomainName;
            return this;
        }
        public String getPullDomainName() {
            return this.pullDomainName;
        }

        public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigList extends TeaModel {
        @NameInMap("LiveLazyPullConfig")
        public java.util.List<DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig> liveLazyPullConfig;

        public static DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigList self = new DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigList setLiveLazyPullConfig(java.util.List<DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig> liveLazyPullConfig) {
            this.liveLazyPullConfig = liveLazyPullConfig;
            return this;
        }
        public java.util.List<DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig> getLiveLazyPullConfig() {
            return this.liveLazyPullConfig;
        }

    }

}
