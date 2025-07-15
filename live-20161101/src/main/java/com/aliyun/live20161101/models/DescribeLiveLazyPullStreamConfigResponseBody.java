// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveLazyPullStreamConfigResponseBody extends TeaModel {
    /**
     * <p>The configurations of triggered stream pulling.</p>
     */
    @NameInMap("LiveLazyPullConfigList")
    public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigList liveLazyPullConfigList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A3136B58-5876-4168-83CA-B562781981A0</p>
     */
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
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The name of the application for back-to-origin stream pulling. If the application specified in the streaming URL is used, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>livePullApp****</p>
         */
        @NameInMap("PullAppName")
        public String pullAppName;

        /**
         * <p>The parameters of back-to-origin stream pulling.</p>
         * 
         * <strong>example:</strong>
         * <p>k=v</p>
         */
        @NameInMap("PullArgs")
        public String pullArgs;

        /**
         * <p>The domain name for back-to-origin stream pulling.</p>
         * 
         * <strong>example:</strong>
         * <p>guide.aliyundoc.com</p>
         */
        @NameInMap("PullDomainName")
        public String pullDomainName;

        /**
         * <p>The protocol for back-to-origin stream pulling. Valid values:</p>
         * <ul>
         * <li><strong>rtmp</strong></li>
         * <li><strong>httpflv</strong></li>
         * <li><strong>hls</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RTMP</p>
         */
        @NameInMap("PullProtocol")
        public String pullProtocol;

        /**
         * <p>Indicates whether stream pulling is triggered when the transcoded stream is played. Default value: <strong>no</strong>. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong></li>
         * <li><strong>no</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("TranscodeLazy")
        public String transcodeLazy;

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

        public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig setPullArgs(String pullArgs) {
            this.pullArgs = pullArgs;
            return this;
        }
        public String getPullArgs() {
            return this.pullArgs;
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

        public DescribeLiveLazyPullStreamConfigResponseBodyLiveLazyPullConfigListLiveLazyPullConfig setTranscodeLazy(String transcodeLazy) {
            this.transcodeLazy = transcodeLazy;
            return this;
        }
        public String getTranscodeLazy() {
            return this.transcodeLazy;
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
