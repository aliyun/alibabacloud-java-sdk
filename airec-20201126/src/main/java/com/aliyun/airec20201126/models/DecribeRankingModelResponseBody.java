// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DecribeRankingModelResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public DecribeRankingModelResponseBodyResult result;

    public static DecribeRankingModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DecribeRankingModelResponseBody self = new DecribeRankingModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DecribeRankingModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DecribeRankingModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DecribeRankingModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DecribeRankingModelResponseBody setResult(DecribeRankingModelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DecribeRankingModelResponseBodyResult getResult() {
        return this.result;
    }

    public static class DecribeRankingModelResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the ranking model was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the ranking model was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-27T06:38:28.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The metadata.</p>
         */
        @NameInMap("meta")
        public java.util.Map<String, ?> meta;

        /**
         * <p>The ID of the ranking model.</p>
         * 
         * <strong>example:</strong>
         * <p>ranktest</p>
         */
        @NameInMap("rankingModelId")
        public String rankingModelId;

        public static DecribeRankingModelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DecribeRankingModelResponseBodyResult self = new DecribeRankingModelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DecribeRankingModelResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DecribeRankingModelResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DecribeRankingModelResponseBodyResult setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public DecribeRankingModelResponseBodyResult setRankingModelId(String rankingModelId) {
            this.rankingModelId = rankingModelId;
            return this;
        }
        public String getRankingModelId() {
            return this.rankingModelId;
        }

    }

}
