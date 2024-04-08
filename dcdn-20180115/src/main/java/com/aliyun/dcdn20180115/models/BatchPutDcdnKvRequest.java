// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchPutDcdnKvRequest extends TeaModel {
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
        @NameInMap("Expiration")
        public Long expiration;

        @NameInMap("ExpirationTtl")
        public Long expirationTtl;

        @NameInMap("Key")
        public String key;

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
