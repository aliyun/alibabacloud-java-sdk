// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsNotifyUrlConfigResponseBody extends TeaModel {
    /**
     * <p>The callback configuration.</p>
     */
    @NameInMap("LiveStreamsNotifyConfig")
    public DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig liveStreamsNotifyConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40A4F36D-A7CC-473A-88E7-154F92242566</p>
     */
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
        /**
         * <p>The ingest domain.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Exception event callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://4a7e5f08.r37.cpolar.top/live/Record/call-back/streamException">https://4a7e5f08.r37.cpolar.top/live/Record/call-back/streamException</a></p>
         */
        @NameInMap("ExceptionNotifyUrl")
        public String exceptionNotifyUrl;

        /**
         * <p>The authentication key.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("NotifyAuthKey")
        public String notifyAuthKey;

        /**
         * <p>Indicates whether callback authentication is enabled. Valid values:</p>
         * <ul>
         * <li>yes</li>
         * <li>no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("NotifyReqAuth")
        public String notifyReqAuth;

        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://guide.aliyundoc.com/notify">http://guide.aliyundoc.com/notify</a></p>
         */
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

        public DescribeLiveStreamsNotifyUrlConfigResponseBodyLiveStreamsNotifyConfig setExceptionNotifyUrl(String exceptionNotifyUrl) {
            this.exceptionNotifyUrl = exceptionNotifyUrl;
            return this;
        }
        public String getExceptionNotifyUrl() {
            return this.exceptionNotifyUrl;
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
