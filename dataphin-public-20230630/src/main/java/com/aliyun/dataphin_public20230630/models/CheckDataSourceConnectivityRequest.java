// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckDataSourceConnectivityRequest extends TeaModel {
    /**
     * <p>The object to check.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckCommand")
    public CheckDataSourceConnectivityRequestCheckCommand checkCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CheckDataSourceConnectivityRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDataSourceConnectivityRequest self = new CheckDataSourceConnectivityRequest();
        return TeaModel.build(map, self);
    }

    public CheckDataSourceConnectivityRequest setCheckCommand(CheckDataSourceConnectivityRequestCheckCommand checkCommand) {
        this.checkCommand = checkCommand;
        return this;
    }
    public CheckDataSourceConnectivityRequestCheckCommand getCheckCommand() {
        return this.checkCommand;
    }

    public CheckDataSourceConnectivityRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CheckDataSourceConnectivityRequestCheckCommandConfigItemList extends TeaModel {
        /**
         * <p>The configuration item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The configuration value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CheckDataSourceConnectivityRequestCheckCommandConfigItemList build(java.util.Map<String, ?> map) throws Exception {
            CheckDataSourceConnectivityRequestCheckCommandConfigItemList self = new CheckDataSourceConnectivityRequestCheckCommandConfigItemList();
            return TeaModel.build(map, self);
        }

        public CheckDataSourceConnectivityRequestCheckCommandConfigItemList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CheckDataSourceConnectivityRequestCheckCommandConfigItemList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CheckDataSourceConnectivityRequestCheckCommand extends TeaModel {
        /**
         * <p>The connection configuration items.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConfigItemList")
        public java.util.List<CheckDataSourceConnectivityRequestCheckCommandConfigItemList> configItemList;

        /**
         * <p>The data source type. For supported data source types, see the documentation for creating a data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("Type")
        public String type;

        public static CheckDataSourceConnectivityRequestCheckCommand build(java.util.Map<String, ?> map) throws Exception {
            CheckDataSourceConnectivityRequestCheckCommand self = new CheckDataSourceConnectivityRequestCheckCommand();
            return TeaModel.build(map, self);
        }

        public CheckDataSourceConnectivityRequestCheckCommand setConfigItemList(java.util.List<CheckDataSourceConnectivityRequestCheckCommandConfigItemList> configItemList) {
            this.configItemList = configItemList;
            return this;
        }
        public java.util.List<CheckDataSourceConnectivityRequestCheckCommandConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        public CheckDataSourceConnectivityRequestCheckCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
