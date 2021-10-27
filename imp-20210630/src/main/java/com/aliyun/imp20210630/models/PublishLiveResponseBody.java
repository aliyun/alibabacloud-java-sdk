// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class PublishLiveResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public PublishLiveResponseBodyResult result;

    public static PublishLiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishLiveResponseBody self = new PublishLiveResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishLiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishLiveResponseBody setResult(PublishLiveResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public PublishLiveResponseBodyResult getResult() {
        return this.result;
    }

    public static class PublishLiveResponseBodyResult extends TeaModel {
        // 主播ID
        @NameInMap("AnchorId")
        public String anchorId;

        // 直播资源的唯一标识ID
        @NameInMap("LiveId")
        public String liveId;

        // 直播拉流地址
        @NameInMap("LiveUrl")
        public String liveUrl;

        // 直播推流地址
        @NameInMap("PushUrl")
        public String pushUrl;

        // 直播状态：Created-已创建未开播，Living-直播中，End-直播结束
        @NameInMap("Status")
        public String status;

        public static PublishLiveResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PublishLiveResponseBodyResult self = new PublishLiveResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PublishLiveResponseBodyResult setAnchorId(String anchorId) {
            this.anchorId = anchorId;
            return this;
        }
        public String getAnchorId() {
            return this.anchorId;
        }

        public PublishLiveResponseBodyResult setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public PublishLiveResponseBodyResult setLiveUrl(String liveUrl) {
            this.liveUrl = liveUrl;
            return this;
        }
        public String getLiveUrl() {
            return this.liveUrl;
        }

        public PublishLiveResponseBodyResult setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

        public PublishLiveResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
