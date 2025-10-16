// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RetrieveMemoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1756431013</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public RetrieveMemoryRequestQuery query;

    /**
     * <strong>example:</strong>
     * <p>memory</p>
     */
    @NameInMap("store")
    public String store;

    /**
     * <strong>example:</strong>
     * <p>1737856802</p>
     */
    @NameInMap("to")
    public Integer to;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("topk")
    public Integer topk;

    public static RetrieveMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveMemoryRequest self = new RetrieveMemoryRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveMemoryRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public RetrieveMemoryRequest setQuery(RetrieveMemoryRequestQuery query) {
        this.query = query;
        return this;
    }
    public RetrieveMemoryRequestQuery getQuery() {
        return this.query;
    }

    public RetrieveMemoryRequest setStore(String store) {
        this.store = store;
        return this;
    }
    public String getStore() {
        return this.store;
    }

    public RetrieveMemoryRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

    public RetrieveMemoryRequest setTopk(Integer topk) {
        this.topk = topk;
        return this;
    }
    public Integer getTopk() {
        return this.topk;
    }

    public static class RetrieveMemoryRequestQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("memory")
        public String memory;

        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <strong>example:</strong>
         * <p>preference</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1</p>
         */
        @NameInMap("userId")
        public String userId;

        public static RetrieveMemoryRequestQuery build(java.util.Map<String, ?> map) throws Exception {
            RetrieveMemoryRequestQuery self = new RetrieveMemoryRequestQuery();
            return TeaModel.build(map, self);
        }

        public RetrieveMemoryRequestQuery setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public RetrieveMemoryRequestQuery setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public RetrieveMemoryRequestQuery setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public RetrieveMemoryRequestQuery setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
