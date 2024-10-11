// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteRankingModelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D486768B-8BF8-4D80-B491-43DC3D0AF8AB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteRankingModelResponseBodyResult result;

    public static DeleteRankingModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRankingModelResponseBody self = new DeleteRankingModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRankingModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteRankingModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteRankingModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRankingModelResponseBody setResult(DeleteRankingModelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteRankingModelResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteRankingModelResponseBodyResult extends TeaModel {
        /**
         * <p>meta</p>
         */
        @NameInMap("meta")
        public java.util.Map<String, ?> meta;

        @NameInMap("rankingModelId")
        public String rankingModelId;

        public static DeleteRankingModelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteRankingModelResponseBodyResult self = new DeleteRankingModelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteRankingModelResponseBodyResult setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public DeleteRankingModelResponseBodyResult setRankingModelId(String rankingModelId) {
            this.rankingModelId = rankingModelId;
            return this;
        }
        public String getRankingModelId() {
            return this.rankingModelId;
        }

    }

}
