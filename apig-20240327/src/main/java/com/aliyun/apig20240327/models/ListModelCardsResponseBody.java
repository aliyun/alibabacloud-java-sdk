// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListModelCardsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public java.util.List<ListModelCardsResponseBodyData> data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListModelCardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelCardsResponseBody self = new ListModelCardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelCardsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelCardsResponseBody setData(java.util.List<ListModelCardsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListModelCardsResponseBodyData> getData() {
        return this.data;
    }

    public ListModelCardsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListModelCardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListModelCardsResponseBodyDataAvailablePaths extends TeaModel {
        /**
         * <p>The request path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The type identifier of the available path record. The set of valid values is not declared in the API definition.</p>
         * 
         * <strong>example:</strong>
         * <p>type-xxxxxxxx</p>
         */
        @NameInMap("type")
        public String type;

        public static ListModelCardsResponseBodyDataAvailablePaths build(java.util.Map<String, ?> map) throws Exception {
            ListModelCardsResponseBodyDataAvailablePaths self = new ListModelCardsResponseBodyDataAvailablePaths();
            return TeaModel.build(map, self);
        }

        public ListModelCardsResponseBodyDataAvailablePaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListModelCardsResponseBodyDataAvailablePaths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListModelCardsResponseBodyDataMeta extends TeaModel {
        /**
         * <p>The description text of the model card.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample description text for the model card</p>
         */
        @NameInMap("description")
        public String description;

        public static ListModelCardsResponseBodyDataMeta build(java.util.Map<String, ?> map) throws Exception {
            ListModelCardsResponseBodyDataMeta self = new ListModelCardsResponseBodyDataMeta();
            return TeaModel.build(map, self);
        }

        public ListModelCardsResponseBodyDataMeta setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListModelCardsResponseBodyData extends TeaModel {
        /**
         * <p>The list of available paths for the model card. Each element consists of the path and type members. The criteria for availability are not specified in the API definition.</p>
         */
        @NameInMap("availablePaths")
        public java.util.List<ListModelCardsResponseBodyDataAvailablePaths> availablePaths;

        /**
         * <p>The feature configuration of the model card, which is a key-value map structure. The set of keys is not declared in the API definition.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;functionCall&quot;:true}</p>
         */
        @NameInMap("features")
        public java.util.Map<String, ?> features;

        /**
         * <p>The metadata container of the model card. Only the description member is declared in the API definition.</p>
         */
        @NameInMap("meta")
        public ListModelCardsResponseBodyDataMeta meta;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The pricing information of the model card, which is a key-value map structure. The set of keys and the billing criteria are not declared in the API definition.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;input&quot;:0.004,&quot;output&quot;:0.012}</p>
         */
        @NameInMap("pricing")
        public java.util.Map<String, ?> pricing;

        /**
         * <p>The identifier of the model provider corresponding to the model card.</p>
         * 
         * <strong>example:</strong>
         * <p>provider-xxxxxxxx</p>
         */
        @NameInMap("provider")
        public String provider;

        /**
         * <p>The list of snapshots for the model card. Each array item is a map structure with undeclared members. The snapshot content and generation rules are not specified in the API definition.</p>
         */
        @NameInMap("snapshots")
        public java.util.List<java.util.Map<String, ?>> snapshots;

        /**
         * <p>The source identifier of the model card. The set of valid values is not declared in the API definition.</p>
         * 
         * <strong>example:</strong>
         * <p>source-xxxxxxxx</p>
         */
        @NameInMap("source")
        public String source;

        public static ListModelCardsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModelCardsResponseBodyData self = new ListModelCardsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModelCardsResponseBodyData setAvailablePaths(java.util.List<ListModelCardsResponseBodyDataAvailablePaths> availablePaths) {
            this.availablePaths = availablePaths;
            return this;
        }
        public java.util.List<ListModelCardsResponseBodyDataAvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        public ListModelCardsResponseBodyData setFeatures(java.util.Map<String, ?> features) {
            this.features = features;
            return this;
        }
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        public ListModelCardsResponseBodyData setMeta(ListModelCardsResponseBodyDataMeta meta) {
            this.meta = meta;
            return this;
        }
        public ListModelCardsResponseBodyDataMeta getMeta() {
            return this.meta;
        }

        public ListModelCardsResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListModelCardsResponseBodyData setPricing(java.util.Map<String, ?> pricing) {
            this.pricing = pricing;
            return this;
        }
        public java.util.Map<String, ?> getPricing() {
            return this.pricing;
        }

        public ListModelCardsResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListModelCardsResponseBodyData setSnapshots(java.util.List<java.util.Map<String, ?>> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSnapshots() {
            return this.snapshots;
        }

        public ListModelCardsResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
