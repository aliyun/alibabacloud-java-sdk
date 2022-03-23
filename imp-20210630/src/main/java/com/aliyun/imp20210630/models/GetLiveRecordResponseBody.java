// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRecordResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // API请求的返回结果结构体。
    @NameInMap("Result")
    public GetLiveRecordResponseBodyResult result;

    public static GetLiveRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRecordResponseBody self = new GetLiveRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveRecordResponseBody setResult(GetLiveRecordResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLiveRecordResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLiveRecordResponseBodyResult extends TeaModel {
        @NameInMap("PlaybackUrlMap")
        public java.util.Map<String, java.util.List<String>> playbackUrlMap;

        public static GetLiveRecordResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRecordResponseBodyResult self = new GetLiveRecordResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLiveRecordResponseBodyResult setPlaybackUrlMap(java.util.Map<String, java.util.List<String>> playbackUrlMap) {
            this.playbackUrlMap = playbackUrlMap;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getPlaybackUrlMap() {
            return this.playbackUrlMap;
        }

    }

}
