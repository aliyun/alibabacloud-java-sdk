// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class PublishLiveRoomResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 创建场景化直播返回的结果。
    @NameInMap("Result")
    public PublishLiveRoomResponseBodyResult result;

    public static PublishLiveRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishLiveRoomResponseBody self = new PublishLiveRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishLiveRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishLiveRoomResponseBody setResult(PublishLiveRoomResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public PublishLiveRoomResponseBodyResult getResult() {
        return this.result;
    }

    public static class PublishLiveRoomResponseBodyResult extends TeaModel {
        // 直播ID。
        @NameInMap("LiveId")
        public String liveId;

        // 直播拉流地址。
        @NameInMap("LiveUrl")
        public String liveUrl;

        // 直播推流地址。
        @NameInMap("PushUrl")
        public String pushUrl;

        public static PublishLiveRoomResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PublishLiveRoomResponseBodyResult self = new PublishLiveRoomResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PublishLiveRoomResponseBodyResult setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public PublishLiveRoomResponseBodyResult setLiveUrl(String liveUrl) {
            this.liveUrl = liveUrl;
            return this;
        }
        public String getLiveUrl() {
            return this.liveUrl;
        }

        public PublishLiveRoomResponseBodyResult setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
            return this;
        }
        public String getPushUrl() {
            return this.pushUrl;
        }

    }

}
