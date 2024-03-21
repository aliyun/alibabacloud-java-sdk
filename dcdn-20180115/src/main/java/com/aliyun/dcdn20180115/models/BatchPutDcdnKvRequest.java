// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchPutDcdnKvRequest extends TeaModel {
    /**
     * <p>The key-value pairs. The key-value pairs can be up to 2 MB in size.</p>
     */
    @NameInMap("KvList")
    public java.util.List<BatchPutDcdnKvRequestKvList> kvList;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static BatchPutDcdnKvRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchPutDcdnKvRequest self = new BatchPutDcdnKvRequest();
        return TeaModel.build(map, self);
    }

    public BatchPutDcdnKvRequest setKvList(java.util.List<BatchPutDcdnKvRequestKvList> kvList) {
        this.kvList = kvList;
        return this;
    }
    public java.util.List<BatchPutDcdnKvRequestKvList> getKvList() {
        return this.kvList;
    }

    public BatchPutDcdnKvRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public static class BatchPutDcdnKvRequestKvList extends TeaModel {
        /**
         * <p>The expiration time. The value is a timestamp in seconds. The expiration time cannot be earlier than the current time. If you specify Expiration and ExpirationTtl, only ExpirationTtl takes effect.</p>
         */
        @NameInMap("Expiration")
        public Long expiration;

        /**
         * <p>The relative expiration time. Unit: seconds. If you specify Expiration and ExpirationTtl, only ExpirationTtl takes effect.</p>
         */
        @NameInMap("ExpirationTtl")
        public Long expirationTtl;

        /**
         * <p>The key. The key can be up to 512 characters in length and cannot contain spaces.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static BatchPutDcdnKvRequestKvList build(java.util.Map<String, ?> map) throws Exception {
            BatchPutDcdnKvRequestKvList self = new BatchPutDcdnKvRequestKvList();
            return TeaModel.build(map, self);
        }

        public BatchPutDcdnKvRequestKvList setExpiration(Long expiration) {
            this.expiration = expiration;
            return this;
        }
        public Long getExpiration() {
            return this.expiration;
        }

        public BatchPutDcdnKvRequestKvList setExpirationTtl(Long expirationTtl) {
            this.expirationTtl = expirationTtl;
            return this;
        }
        public Long getExpirationTtl() {
            return this.expirationTtl;
        }

        public BatchPutDcdnKvRequestKvList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public BatchPutDcdnKvRequestKvList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
