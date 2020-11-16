// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveLazyPullStreamConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveLazyPullConfigList")
    @Validation(required = true)
    public DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigList liveLazyPullConfigList;

    public static DescribeLiveLazyPullStreamConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveLazyPullStreamConfigResponse self = new DescribeLiveLazyPullStreamConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveLazyPullStreamConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveLazyPullStreamConfigResponse setLiveLazyPullConfigList(DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigList liveLazyPullConfigList) {
        this.liveLazyPullConfigList = liveLazyPullConfigList;
        return this;
    }
    public DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigList getLiveLazyPullConfigList() {
        return this.liveLazyPullConfigList;
    }

    public static class DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("PullDomainName")
        @Validation(required = true)
        public String pullDomainName;

        @NameInMap("PullAppName")
        @Validation(required = true)
        public String pullAppName;

        @NameInMap("PullProtocol")
        @Validation(required = true)
        public String pullProtocol;

        @NameInMap("PullAuthType")
        @Validation(required = true)
        public String pullAuthType;

        @NameInMap("PullAuthKey")
        @Validation(required = true)
        public String pullAuthKey;

        @NameInMap("PullArgs")
        @Validation(required = true)
        public String pullArgs;

        public static DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig self = new DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig setPullDomainName(String pullDomainName) {
            this.pullDomainName = pullDomainName;
            return this;
        }
        public String getPullDomainName() {
            return this.pullDomainName;
        }

        public DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig setPullAppName(String pullAppName) {
            this.pullAppName = pullAppName;
            return this;
        }
        public String getPullAppName() {
            return this.pullAppName;
        }

        public DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig setPullProtocol(String pullProtocol) {
            this.pullProtocol = pullProtocol;
            return this;
        }
        public String getPullProtocol() {
            return this.pullProtocol;
        }

        public DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig setPullAuthType(String pullAuthType) {
            this.pullAuthType = pullAuthType;
            return this;
        }
        public String getPullAuthType() {
            return this.pullAuthType;
        }

        public DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig setPullAuthKey(String pullAuthKey) {
            this.pullAuthKey = pullAuthKey;
            return this;
        }
        public String getPullAuthKey() {
            return this.pullAuthKey;
        }

        public DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig setPullArgs(String pullArgs) {
            this.pullArgs = pullArgs;
            return this;
        }
        public String getPullArgs() {
            return this.pullArgs;
        }

    }

    public static class DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigList extends TeaModel {
        @NameInMap("LiveLazyPullConfig")
        @Validation(required = true)
        public java.util.List<DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig> liveLazyPullConfig;

        public static DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigList self = new DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigList setLiveLazyPullConfig(java.util.List<DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig> liveLazyPullConfig) {
            this.liveLazyPullConfig = liveLazyPullConfig;
            return this;
        }
        public java.util.List<DescribeLiveLazyPullStreamConfigResponseLiveLazyPullConfigListLiveLazyPullConfig> getLiveLazyPullConfig() {
            return this.liveLazyPullConfig;
        }

    }

}
