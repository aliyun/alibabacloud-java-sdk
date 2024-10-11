// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateRankingModelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateRankingModelResponseBodyResult result;

    public static CreateRankingModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRankingModelResponseBody self = new CreateRankingModelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRankingModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRankingModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRankingModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRankingModelResponseBody setResult(CreateRankingModelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateRankingModelResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateRankingModelResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2018-12-07T02:24:26.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>map</p>
         */
        @NameInMap("meta")
        public java.util.Map<String, ?> meta;

        /**
         * <strong>example:</strong>
         * <p>ranktest</p>
         */
        @NameInMap("rankingModelId")
        public String rankingModelId;

        public static CreateRankingModelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateRankingModelResponseBodyResult self = new CreateRankingModelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateRankingModelResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateRankingModelResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateRankingModelResponseBodyResult setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public CreateRankingModelResponseBodyResult setRankingModelId(String rankingModelId) {
            this.rankingModelId = rankingModelId;
            return this;
        }
        public String getRankingModelId() {
            return this.rankingModelId;
        }

    }

}
