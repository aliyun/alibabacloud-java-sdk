// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchPutKvRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KvList")
    public java.util.List<BatchPutKvRequestKvList> kvList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static BatchPutKvRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchPutKvRequest self = new BatchPutKvRequest();
        return TeaModel.build(map, self);
    }

    public BatchPutKvRequest setKvList(java.util.List<BatchPutKvRequestKvList> kvList) {
        this.kvList = kvList;
        return this;
    }
    public java.util.List<BatchPutKvRequestKvList> getKvList() {
        return this.kvList;
    }

    public BatchPutKvRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public static class BatchPutKvRequestKvList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1690081381</p>
         */
        @NameInMap("Expiration")
        public Long expiration;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("ExpirationTtl")
        public Long expirationTtl;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_value</p>
         */
        @NameInMap("Value")
        public String value;

        public static BatchPutKvRequestKvList build(java.util.Map<String, ?> map) throws Exception {
            BatchPutKvRequestKvList self = new BatchPutKvRequestKvList();
            return TeaModel.build(map, self);
        }

        public BatchPutKvRequestKvList setExpiration(Long expiration) {
            this.expiration = expiration;
            return this;
        }
        public Long getExpiration() {
            return this.expiration;
        }

        public BatchPutKvRequestKvList setExpirationTtl(Long expirationTtl) {
            this.expirationTtl = expirationTtl;
            return this;
        }
        public Long getExpirationTtl() {
            return this.expirationTtl;
        }

        public BatchPutKvRequestKvList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public BatchPutKvRequestKvList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
