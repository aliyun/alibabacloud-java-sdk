// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetClassRecordResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // API请求的返回结果结构体。
    @NameInMap("Result")
    public GetClassRecordResponseBodyResult result;

    public static GetClassRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClassRecordResponseBody self = new GetClassRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClassRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClassRecordResponseBody setResult(GetClassRecordResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetClassRecordResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetClassRecordResponseBodyResult extends TeaModel {
        @NameInMap("PlaybackUrlMap")
        public java.util.Map<String, java.util.List<String>> playbackUrlMap;

        public static GetClassRecordResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetClassRecordResponseBodyResult self = new GetClassRecordResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetClassRecordResponseBodyResult setPlaybackUrlMap(java.util.Map<String, java.util.List<String>> playbackUrlMap) {
            this.playbackUrlMap = playbackUrlMap;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getPlaybackUrlMap() {
            return this.playbackUrlMap;
        }

    }

}
