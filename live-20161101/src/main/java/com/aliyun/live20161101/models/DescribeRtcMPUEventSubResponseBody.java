// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRtcMPUEventSubResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the subscription.</p>
     */
    @NameInMap("SubInfo")
    public DescribeRtcMPUEventSubResponseBodySubInfo subInfo;

    public static DescribeRtcMPUEventSubResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcMPUEventSubResponseBody self = new DescribeRtcMPUEventSubResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcMPUEventSubResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcMPUEventSubResponseBody setSubInfo(DescribeRtcMPUEventSubResponseBodySubInfo subInfo) {
        this.subInfo = subInfo;
        return this;
    }
    public DescribeRtcMPUEventSubResponseBodySubInfo getSubInfo() {
        return this.subInfo;
    }

    public static class DescribeRtcMPUEventSubResponseBodySubInfo extends TeaModel {
        /**
         * <p>The application ID. You can specify only one application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAppId</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://testcallback***.com/callback">http://testcallback***.com/callback</a></p>
         */
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        /**
         * <p>The ID of the channel to which mixed-stream relay event callbacks are sent. Multiple channel IDs are separated by commas (,). If this parameter is not returned, mixed-stream relay event callbacks are sent to all channels.</p>
         * 
         * <strong>example:</strong>
         * <p>yourCh1,yourCh2</p>
         */
        @NameInMap("ChannelIds")
        public String channelIds;

        /**
         * <p>The time when the event callback was fired. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-09 18:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>Sub-<strong><strong><strong>9799B2C4500</strong></strong></strong></p>
         */
        @NameInMap("SubId")
        public String subId;

        public static DescribeRtcMPUEventSubResponseBodySubInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcMPUEventSubResponseBodySubInfo self = new DescribeRtcMPUEventSubResponseBodySubInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRtcMPUEventSubResponseBodySubInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeRtcMPUEventSubResponseBodySubInfo setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public DescribeRtcMPUEventSubResponseBodySubInfo setChannelIds(String channelIds) {
            this.channelIds = channelIds;
            return this;
        }
        public String getChannelIds() {
            return this.channelIds;
        }

        public DescribeRtcMPUEventSubResponseBodySubInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRtcMPUEventSubResponseBodySubInfo setSubId(String subId) {
            this.subId = subId;
            return this;
        }
        public String getSubId() {
            return this.subId;
        }

    }

}
