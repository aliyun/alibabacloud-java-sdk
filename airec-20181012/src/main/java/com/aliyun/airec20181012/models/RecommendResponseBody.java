// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class RecommendResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public java.util.List<RecommendResponseBodyResult> result;

    public static RecommendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecommendResponseBody self = new RecommendResponseBody();
        return TeaModel.build(map, self);
    }

    public RecommendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecommendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecommendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecommendResponseBody setResult(java.util.List<RecommendResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<RecommendResponseBodyResult> getResult() {
        return this.result;
    }

    public static class RecommendResponseBodyResult extends TeaModel {
        @NameInMap("TraceInfo")
        public String traceInfo;

        @NameInMap("Weight")
        public Float weight;

        @NameInMap("MatchInfo")
        public String matchInfo;

        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("Position")
        public Integer position;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("TraceId")
        public String traceId;

        public static RecommendResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RecommendResponseBodyResult self = new RecommendResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RecommendResponseBodyResult setTraceInfo(String traceInfo) {
            this.traceInfo = traceInfo;
            return this;
        }
        public String getTraceInfo() {
            return this.traceInfo;
        }

        public RecommendResponseBodyResult setWeight(Float weight) {
            this.weight = weight;
            return this;
        }
        public Float getWeight() {
            return this.weight;
        }

        public RecommendResponseBodyResult setMatchInfo(String matchInfo) {
            this.matchInfo = matchInfo;
            return this;
        }
        public String getMatchInfo() {
            return this.matchInfo;
        }

        public RecommendResponseBodyResult setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public RecommendResponseBodyResult setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public RecommendResponseBodyResult setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public RecommendResponseBodyResult setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
