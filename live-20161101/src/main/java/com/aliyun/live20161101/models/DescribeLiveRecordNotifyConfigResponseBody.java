// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordNotifyConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration of callbacks for live stream recording.</p>
     */
    @NameInMap("LiveRecordNotifyConfig")
    public DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig liveRecordNotifyConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5056369B-D337-499E-B8B7-B761BD37B08A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveRecordNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordNotifyConfigResponseBody self = new DescribeLiveRecordNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordNotifyConfigResponseBody setLiveRecordNotifyConfig(DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig liveRecordNotifyConfig) {
        this.liveRecordNotifyConfig = liveRecordNotifyConfig;
        return this;
    }
    public DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig getLiveRecordNotifyConfig() {
        return this.liveRecordNotifyConfig;
    }

    public DescribeLiveRecordNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig extends TeaModel {
        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Indicates whether recording status callbacks are enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedStatusNotify")
        public Boolean needStatusNotify;

        /**
         * <p>The recording callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://learn.aliyundoc.com/examplecallback.action">http://learn.aliyundoc.com/examplecallback.action</a></p>
         */
        @NameInMap("NotifyUrl")
        public String notifyUrl;

        /**
         * <p>The callback URL for on-demand recording.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://guide.aliyundoc.com/ondemandcallback.action">http://guide.aliyundoc.com/ondemandcallback.action</a></p>
         */
        @NameInMap("OnDemandUrl")
        public String onDemandUrl;

        public static DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig self = new DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig setNeedStatusNotify(Boolean needStatusNotify) {
            this.needStatusNotify = needStatusNotify;
            return this;
        }
        public Boolean getNeedStatusNotify() {
            return this.needStatusNotify;
        }

        public DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        public DescribeLiveRecordNotifyConfigResponseBodyLiveRecordNotifyConfig setOnDemandUrl(String onDemandUrl) {
            this.onDemandUrl = onDemandUrl;
            return this;
        }
        public String getOnDemandUrl() {
            return this.onDemandUrl;
        }

    }

}
