// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDataSourceRequest extends TeaModel {
    @NameInMap("CreateCommand")
    public CreateDataSourceRequestCreateCommand createCommand;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CheckActivity")
        public Boolean checkActivity;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConfigItemList")
        public java.util.List<CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreateConfigItemList> configItemList;

        /**
         * <strong>example:</strong>
         * <p>datasource for xxx in dev</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dp_test_dev</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <p>数据源创建结构体</p>
         */
        @NameInMap("DataSourceCreate")
        public CreateDataSourceRequestCreateCommandDevDataSourceCreateDataSourceCreate dataSourceCreate;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CheckActivity")
        public Boolean checkActivity;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConfigItemList")
        public java.util.List<CreateDataSourceRequestCreateCommandProdDataSourceCreateConfigItemList> configItemList;

        /**
         * <strong>example:</strong>
         * <p>datasource for xx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dp_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
        @NameInMap("DevDataSourceCreate")
        public CreateDataSourceRequestCreateCommandDevDataSourceCreate devDataSourceCreate;

        /**
         * <p>数据源创建结构体</p>
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
