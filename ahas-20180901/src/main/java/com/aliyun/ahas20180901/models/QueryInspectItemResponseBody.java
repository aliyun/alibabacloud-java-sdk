// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryInspectItemResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryInspectItemResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryInspectItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInspectItemResponseBody self = new QueryInspectItemResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInspectItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInspectItemResponseBody setData(java.util.List<QueryInspectItemResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryInspectItemResponseBodyData> getData() {
        return this.data;
    }

    public QueryInspectItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInspectItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInspectItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryInspectItemResponseBodyDataEffectEffectHeader extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        public static QueryInspectItemResponseBodyDataEffectEffectHeader build(java.util.Map<String, ?> map) throws Exception {
            QueryInspectItemResponseBodyDataEffectEffectHeader self = new QueryInspectItemResponseBodyDataEffectEffectHeader();
            return TeaModel.build(map, self);
        }

        public QueryInspectItemResponseBodyDataEffectEffectHeader setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryInspectItemResponseBodyDataEffectEffectHeader setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryInspectItemResponseBodyDataEffect extends TeaModel {
        @NameInMap("EffectHeader")
        public java.util.List<QueryInspectItemResponseBodyDataEffectEffectHeader> effectHeader;

        @NameInMap("EffectRows")
        public java.util.List<java.util.Map<String, ?>> effectRows;

        public static QueryInspectItemResponseBodyDataEffect build(java.util.Map<String, ?> map) throws Exception {
            QueryInspectItemResponseBodyDataEffect self = new QueryInspectItemResponseBodyDataEffect();
            return TeaModel.build(map, self);
        }

        public QueryInspectItemResponseBodyDataEffect setEffectHeader(java.util.List<QueryInspectItemResponseBodyDataEffectEffectHeader> effectHeader) {
            this.effectHeader = effectHeader;
            return this;
        }
        public java.util.List<QueryInspectItemResponseBodyDataEffectEffectHeader> getEffectHeader() {
            return this.effectHeader;
        }

        public QueryInspectItemResponseBodyDataEffect setEffectRows(java.util.List<java.util.Map<String, ?>> effectRows) {
            this.effectRows = effectRows;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getEffectRows() {
            return this.effectRows;
        }

    }

    public static class QueryInspectItemResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Effect")
        public QueryInspectItemResponseBodyDataEffect effect;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Level")
        public String level;

        @NameInMap("Links")
        public String links;

        @NameInMap("Name")
        public String name;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Risk")
        public String risk;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggest")
        public String suggest;

        public static QueryInspectItemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInspectItemResponseBodyData self = new QueryInspectItemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInspectItemResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryInspectItemResponseBodyData setEffect(QueryInspectItemResponseBodyDataEffect effect) {
            this.effect = effect;
            return this;
        }
        public QueryInspectItemResponseBodyDataEffect getEffect() {
            return this.effect;
        }

        public QueryInspectItemResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryInspectItemResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryInspectItemResponseBodyData setLinks(String links) {
            this.links = links;
            return this;
        }
        public String getLinks() {
            return this.links;
        }

        public QueryInspectItemResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryInspectItemResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QueryInspectItemResponseBodyData setRisk(String risk) {
            this.risk = risk;
            return this;
        }
        public String getRisk() {
            return this.risk;
        }

        public QueryInspectItemResponseBodyData setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryInspectItemResponseBodyData setSuggest(String suggest) {
            this.suggest = suggest;
            return this;
        }
        public String getSuggest() {
            return this.suggest;
        }

    }

}
