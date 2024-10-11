// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingModelsResponseBody extends TeaModel {
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
     * <p>2D898E45-B97A-4245-B590-6D0AFEAF626B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRankingModelsResponseBodyResult> result;

    public static ListRankingModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRankingModelsResponseBody self = new ListRankingModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRankingModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRankingModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRankingModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRankingModelsResponseBody setResult(java.util.List<ListRankingModelsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRankingModelsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListRankingModelsResponseBodyResult extends TeaModel {
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2020-11-11T09:47:43.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("meta")
        public java.util.Map<String, ?> meta;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("rankingModelId")
        public String rankingModelId;

        public static ListRankingModelsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRankingModelsResponseBodyResult self = new ListRankingModelsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRankingModelsResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListRankingModelsResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListRankingModelsResponseBodyResult setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public ListRankingModelsResponseBodyResult setRankingModelId(String rankingModelId) {
            this.rankingModelId = rankingModelId;
            return this;
        }
        public String getRankingModelId() {
            return this.rankingModelId;
        }

    }

}
