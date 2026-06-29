// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDataSourceRequest extends TeaModel {
    /**
     * <p>Request object</p>
     */
    @NameInMap("CreateCommand")
    public CreateDataSourceRequestCreateCommand createCommand;

    /**
     * <p>Tenant ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceRequest self = new CreateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceRequest setCreateCommand(CreateDataSourceRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateDataSourceRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateDataSourceRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreateConfigItemList extends TeaModel {
        /**
         * <p>Configuration item. For the key values required by different databases, see the supplementary description at the bottom of the document.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jdbc.username</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Configuration item value</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreateConfigItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreateConfigItemList self = new CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreateConfigItemList();
            return TeaModel.build(map, self);
        }

        public CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreateConfigItemList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreateConfigItemList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate extends TeaModel {
        /**
         * <p>Whether to check connectivity</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CheckActivity")
        public Boolean checkActivity;

        /**
         * <p>List of connection configuration items</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConfigItemList")
        public java.util.List<CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreateConfigItemList> configItemList;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>datasource for xxx in dev</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Data source name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dp_test_dev</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Data source type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate self = new CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate();
            return TeaModel.build(map, self);
        }

        public CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate setCheckActivity(Boolean checkActivity) {
            this.checkActivity = checkActivity;
            return this;
        }
        public Boolean getCheckActivity() {
            return this.checkActivity;
        }

        public CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate setConfigItemList(java.util.List<CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreateConfigItemList> configItemList) {
            this.configItemList = configItemList;
            return this;
        }
        public java.util.List<CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreateConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        public CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataSourceRequestCreateCommandDevDataSourceCreate extends TeaModel {
        /**
         * <p>Development environment data source</p>
         */
        @NameInMap("DataSourceCreate")
        public CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate dataSourceCreate;

        /**
         * <p>Associated production environment data source ID. This parameter cannot be empty when only creating a development environment compute source.</p>
         * 
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("ProdDataSourceId")
        public Long prodDataSourceId;

        public static CreateDataSourceRequestCreateCommandDevDataSourceCreate build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSourceRequestCreateCommandDevDataSourceCreate self = new CreateDataSourceRequestCreateCommandDevDataSourceCreate();
            return TeaModel.build(map, self);
        }

        public CreateDataSourceRequestCreateCommandDevDataSourceCreate setDataSourceCreate(CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate dataSourceCreate) {
            this.dataSourceCreate = dataSourceCreate;
            return this;
        }
        public CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate getDataSourceCreate() {
            return this.dataSourceCreate;
        }

        public CreateDataSourceRequestCreateCommandDevDataSourceCreate setProdDataSourceId(Long prodDataSourceId) {
            this.prodDataSourceId = prodDataSourceId;
            return this;
        }
        public Long getProdDataSourceId() {
            return this.prodDataSourceId;
        }

    }

    public static class CreateDataSourceRequestCreateCommandProdDataSourceCreateConfigItemList extends TeaModel {
        /**
         * <p>Configuration item. For the key values required by different databases, see the supplementary description at the bottom of the document.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jdbc.username</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Configuration item value</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDataSourceRequestCreateCommandProdDataSourceCreateConfigItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSourceRequestCreateCommandProdDataSourceCreateConfigItemList self = new CreateDataSourceRequestCreateCommandProdDataSourceCreateConfigItemList();
            return TeaModel.build(map, self);
        }

        public CreateDataSourceRequestCreateCommandProdDataSourceCreateConfigItemList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDataSourceRequestCreateCommandProdDataSourceCreateConfigItemList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateDataSourceRequestCreateCommandProdDataSourceCreate extends TeaModel {
        /**
         * <p>Whether to check connectivity</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CheckActivity")
        public Boolean checkActivity;

        /**
         * <p>List of connection configuration items</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConfigItemList")
        public java.util.List<CreateDataSourceRequestCreateCommandProdDataSourceCreateConfigItemList> configItemList;

        /**
         * <p>Data source description</p>
         * 
         * <strong>example:</strong>
         * <p>datasource for xx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Data source name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dp_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Data source type:</p>
         * <ul>
         * <li>MAX_COMPUTE</li>
         * <li>HDFS</li>
         * <li>LOG_HUB</li>
         * <li>POLARDB</li>
         * <li>HBASE_0_9_4</li>
         * <li>HBASE_1_1_X</li>
         * <li>DRDS</li>
         * <li>HIVE</li>
         * <li>FTP</li>
         * <li>ELASTIC_SEARCH</li>
         * <li>MYSQL</li>
         * <li>MONGODB</li>
         * <li>OSS</li>
         * <li>HANA</li>
         * <li>SQL_SERVER</li>
         * <li>POSTGRE_SQL</li>
         * <li>ANALYTICDB</li>
         * <li>ADB_FOR_MYSQL_V3</li>
         * <li>ADB_FOR_PG</li>
         * <li>ORACLE</li>
         * <li>VERTICA</li>
         * <li>DB2</li>
         * <li>TERA_DATA, etc.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateDataSourceRequestCreateCommandProdDataSourceCreate build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSourceRequestCreateCommandProdDataSourceCreate self = new CreateDataSourceRequestCreateCommandProdDataSourceCreate();
            return TeaModel.build(map, self);
        }

        public CreateDataSourceRequestCreateCommandProdDataSourceCreate setCheckActivity(Boolean checkActivity) {
            this.checkActivity = checkActivity;
            return this;
        }
        public Boolean getCheckActivity() {
            return this.checkActivity;
        }

        public CreateDataSourceRequestCreateCommandProdDataSourceCreate setConfigItemList(java.util.List<CreateDataSourceRequestCreateCommandProdDataSourceCreateConfigItemList> configItemList) {
            this.configItemList = configItemList;
            return this;
        }
        public java.util.List<CreateDataSourceRequestCreateCommandProdDataSourceCreateConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        public CreateDataSourceRequestCreateCommandProdDataSourceCreate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDataSourceRequestCreateCommandProdDataSourceCreate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataSourceRequestCreateCommandProdDataSourceCreate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataSourceRequestCreateCommand extends TeaModel {
        /**
         * <p>Development environment data source</p>
         */
        @NameInMap("DevDataSourceCreate")
        public CreateDataSourceRequestCreateCommandDevDataSourceCreate devDataSourceCreate;

        /**
         * <p>Production environment data source</p>
         */
        @NameInMap("ProdDataSourceCreate")
        public CreateDataSourceRequestCreateCommandProdDataSourceCreate prodDataSourceCreate;

        public static CreateDataSourceRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSourceRequestCreateCommand self = new CreateDataSourceRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateDataSourceRequestCreateCommand setDevDataSourceCreate(CreateDataSourceRequestCreateCommandDevDataSourceCreate devDataSourceCreate) {
            this.devDataSourceCreate = devDataSourceCreate;
            return this;
        }
        public CreateDataSourceRequestCreateCommandDevDataSourceCreate getDevDataSourceCreate() {
            return this.devDataSourceCreate;
        }

        public CreateDataSourceRequestCreateCommand setProdDataSourceCreate(CreateDataSourceRequestCreateCommandProdDataSourceCreate prodDataSourceCreate) {
            this.prodDataSourceCreate = prodDataSourceCreate;
            return this;
        }
        public CreateDataSourceRequestCreateCommandProdDataSourceCreate getProdDataSourceCreate() {
            return this.prodDataSourceCreate;
        }

    }

}
