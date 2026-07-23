// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateTableRequest extends TeaModel {
    /**
     * <p>The data catalog to which the table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my_catalog</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>1e9b8f60-3a2c-4d7e-9f1b-8c3d5e7a2b4f</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The column definitions.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;,&quot;Comment&quot;:&quot;主键&quot;}]</p>
     */
    @NameInMap("Columns")
    public java.util.List<CreateTableRequestColumns> columns;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>测试事件表</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name of the table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_table</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace to which the table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The data retention policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;HotTTL&quot;:7,&quot;ColdTTL&quot;:30}</p>
     */
    @NameInMap("RetentionPolicy")
    public CreateTableRequestRetentionPolicy retentionPolicy;

    public static CreateTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableRequest self = new CreateTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTableRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public CreateTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTableRequest setColumns(java.util.List<CreateTableRequestColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<CreateTableRequestColumns> getColumns() {
        return this.columns;
    }

    public CreateTableRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateTableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTableRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateTableRequest setRetentionPolicy(CreateTableRequestRetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }
    public CreateTableRequestRetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    public static class CreateTableRequestColumns extends TeaModel {
        /**
         * <p>The description of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>Isp</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The name of the connector.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka-default-agent-alikafka_pre-cn-28t3sfzno003</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc_cluster</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateTableRequestColumns build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestColumns self = new CreateTableRequestColumns();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateTableRequestColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTableRequestColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateTableRequestRetentionPolicy extends TeaModel {
        /**
         * <p>The cold storage retention time.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ColdTTL")
        public Integer coldTTL;

        /**
         * <p>The hot storage retention time.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("HotTTL")
        public Integer hotTTL;

        public static CreateTableRequestRetentionPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateTableRequestRetentionPolicy self = new CreateTableRequestRetentionPolicy();
            return TeaModel.build(map, self);
        }

        public CreateTableRequestRetentionPolicy setColdTTL(Integer coldTTL) {
            this.coldTTL = coldTTL;
            return this;
        }
        public Integer getColdTTL() {
            return this.coldTTL;
        }

        public CreateTableRequestRetentionPolicy setHotTTL(Integer hotTTL) {
            this.hotTTL = hotTTL;
            return this;
        }
        public Integer getHotTTL() {
            return this.hotTTL;
        }

    }

}
