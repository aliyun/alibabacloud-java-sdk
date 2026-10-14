// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckDataSourceConnectivityOnResourceGroupRequest extends TeaModel {
    /**
     * <p>The check object.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckCommand")
    public CheckDataSourceConnectivityOnResourceGroupRequestCheckCommand checkCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static CheckDataSourceConnectivityOnResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDataSourceConnectivityOnResourceGroupRequest self = new CheckDataSourceConnectivityOnResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CheckDataSourceConnectivityOnResourceGroupRequest setCheckCommand(CheckDataSourceConnectivityOnResourceGroupRequestCheckCommand checkCommand) {
        this.checkCommand = checkCommand;
        return this;
    }
    public CheckDataSourceConnectivityOnResourceGroupRequestCheckCommand getCheckCommand() {
        return this.checkCommand;
    }

    public CheckDataSourceConnectivityOnResourceGroupRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CheckDataSourceConnectivityOnResourceGroupRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CheckDataSourceConnectivityOnResourceGroupRequestCheckCommandConfigItemList extends TeaModel {
        /**
         * <p>The key of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>jdbc.url</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The configuration value.</p>
         * 
         * <strong>example:</strong>
         * <p>jdbc:mysql://host:port/database</p>
         */
        @NameInMap("Value")
        public String value;

        public static CheckDataSourceConnectivityOnResourceGroupRequestCheckCommandConfigItemList build(java.util.Map<String, ?> map) throws Exception {
            CheckDataSourceConnectivityOnResourceGroupRequestCheckCommandConfigItemList self = new CheckDataSourceConnectivityOnResourceGroupRequestCheckCommandConfigItemList();
            return TeaModel.build(map, self);
        }

        public CheckDataSourceConnectivityOnResourceGroupRequestCheckCommandConfigItemList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CheckDataSourceConnectivityOnResourceGroupRequestCheckCommandConfigItemList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CheckDataSourceConnectivityOnResourceGroupRequestCheckCommand extends TeaModel {
        /**
         * <p>The connection configuration items. If DataSourceId is specified, this parameter is optional and the saved configurations of the data source are used by default.</p>
         */
        @NameInMap("ConfigItemList")
        public java.util.List<CheckDataSourceConnectivityOnResourceGroupRequestCheckCommandConfigItemList> configItemList;

        /**
         * <p>The data source ID. This parameter is optional. If specified, the check result is associated with the data source and visible on the data source page, and the old check records of the data source on the target resource group are cleared first. If Type and ConfigItemList are not specified, the saved type and configurations of the data source are used for the check.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The ID of the schedule resource group. The connectivity check task is executed on this resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg_269xxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The data source type. If DataSourceId is specified, this parameter is optional and the saved type of the data source is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        @NameInMap("Type")
        public String type;

        public static CheckDataSourceConnectivityOnResourceGroupRequestCheckCommand build(java.util.Map<String, ?> map) throws Exception {
            CheckDataSourceConnectivityOnResourceGroupRequestCheckCommand self = new CheckDataSourceConnectivityOnResourceGroupRequestCheckCommand();
            return TeaModel.build(map, self);
        }

        public CheckDataSourceConnectivityOnResourceGroupRequestCheckCommand setConfigItemList(java.util.List<CheckDataSourceConnectivityOnResourceGroupRequestCheckCommandConfigItemList> configItemList) {
            this.configItemList = configItemList;
            return this;
        }
        public java.util.List<CheckDataSourceConnectivityOnResourceGroupRequestCheckCommandConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        public CheckDataSourceConnectivityOnResourceGroupRequestCheckCommand setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public CheckDataSourceConnectivityOnResourceGroupRequestCheckCommand setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CheckDataSourceConnectivityOnResourceGroupRequestCheckCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
