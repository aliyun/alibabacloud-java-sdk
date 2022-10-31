// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveLazyPullStreamConfigResponseBody extends TeaModel {
    @NameInMap("LiveLazyPullConfigList")
    public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigList liveLazyPullConfigList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveLazyPullStreamConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveLazyPullStreamConfigResponseBody self = new DescribeLiveLazyPullStreamConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveLazyPullStreamConfigResponseBody setLiveLazyPullConfigList(DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigList liveLazyPullConfigList) {
        this.liveLazyPullConfigList = liveLazyPullConfigList;
        return this;
    }
    public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigList getLiveLazyPullConfigList() {
        return this.liveLazyPullConfigList;
    }

    public DescribeLiveLazyPullStreamConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("PullAppName")
        public String pullAppName;

        @NameInMap("PullDomainName")
        public String pullDomainName;

        @NameInMap("PullProtocol")
        public String pullProtocol;

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

        public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig setPullAppName(String pullAppName) {
            this.pullAppName = pullAppName;
            return this;
        }
        public String getPullAppName() {
            return this.pullAppName;
        }

        public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig setPullDomainName(String pullDomainName) {
            this.pullDomainName = pullDomainName;
            return this;
        }
        public String getPullDomainName() {
            return this.pullDomainName;
        }

        public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig setPullProtocol(String pullProtocol) {
            this.pullProtocol = pullProtocol;
            return this;
        }
        public String getPullProtocol() {
            return this.pullProtocol;
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
