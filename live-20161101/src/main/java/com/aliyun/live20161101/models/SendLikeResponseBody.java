// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendLikeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public SendLikeResponseBodyResult result;

    public static SendLikeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendLikeResponseBody self = new SendLikeResponseBody();
        return TeaModel.build(map, self);
    }

    public SendLikeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendLikeResponseBody setResult(SendLikeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SendLikeResponseBodyResult getResult() {
        return this.result;
    }

    public static class SendLikeResponseBodyResult extends TeaModel {
        /**
         * <p>The number of likes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LikeCount")
        public Integer likeCount;

        public static SendLikeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SendLikeResponseBodyResult self = new SendLikeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SendLikeResponseBodyResult setLikeCount(Integer likeCount) {
            this.likeCount = likeCount;
            return this;
        }
        public Integer getLikeCount() {
            return this.likeCount;
        }

    }

}
