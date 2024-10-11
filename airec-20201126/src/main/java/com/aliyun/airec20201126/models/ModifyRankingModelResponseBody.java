// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyRankingModelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The data source of the filtering table. Only MaxCompute tables are supported.</p>
     */
    @NameInMap("result")
    public ModifyRankingModelResponseBodyResult result;

    public static ModifyRankingModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRankingModelResponseBody self = new ModifyRankingModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRankingModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyRankingModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyRankingModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRankingModelResponseBody setResult(ModifyRankingModelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyRankingModelResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyRankingModelResponseBodyResult extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-11T09:47:43.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-11T09:47:43.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p><strong>null</strong></p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("meta")
        public java.util.Map<String, ?> meta;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>test1234</p>
         */
        @NameInMap("rankingModelId")
        public String rankingModelId;

        public static ModifyRankingModelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyRankingModelResponseBodyResult self = new ModifyRankingModelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyRankingModelResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModifyRankingModelResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModifyRankingModelResponseBodyResult setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public ModifyRankingModelResponseBodyResult setRankingModelId(String rankingModelId) {
            this.rankingModelId = rankingModelId;
            return this;
        }
        public String getRankingModelId() {
            return this.rankingModelId;
        }

    }

}
