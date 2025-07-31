// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckComputeSourceConnectivityRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckCommand")
    public CheckComputeSourceConnectivityRequestCheckCommand checkCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CheckComputeSourceConnectivityRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckComputeSourceConnectivityRequest self = new CheckComputeSourceConnectivityRequest();
        return TeaModel.build(map, self);
    }

    public CheckComputeSourceConnectivityRequest setCheckCommand(CheckComputeSourceConnectivityRequestCheckCommand checkCommand) {
        this.checkCommand = checkCommand;
        return this;
    }
    public CheckComputeSourceConnectivityRequestCheckCommand getCheckCommand() {
        return this.checkCommand;
    }

    public CheckComputeSourceConnectivityRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CheckComputeSourceConnectivityRequestCheckCommandConfigList extends TeaModel {
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

        public static CheckComputeSourceConnectivityRequestCheckCommandConfigList build(java.util.Map<String, ?> map) throws Exception {
            CheckComputeSourceConnectivityRequestCheckCommandConfigList self = new CheckComputeSourceConnectivityRequestCheckCommandConfigList();
            return TeaModel.build(map, self);
        }

        public CheckComputeSourceConnectivityRequestCheckCommandConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CheckComputeSourceConnectivityRequestCheckCommandConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CheckComputeSourceConnectivityRequestCheckCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConfigList")
        public java.util.List<CheckComputeSourceConnectivityRequestCheckCommandConfigList> configList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("Type")
        public String type;

        public static CheckComputeSourceConnectivityRequestCheckCommand build(java.util.Map<String, ?> map) throws Exception {
            CheckComputeSourceConnectivityRequestCheckCommand self = new CheckComputeSourceConnectivityRequestCheckCommand();
            return TeaModel.build(map, self);
        }

        public CheckComputeSourceConnectivityRequestCheckCommand setConfigList(java.util.List<CheckComputeSourceConnectivityRequestCheckCommandConfigList> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<CheckComputeSourceConnectivityRequestCheckCommandConfigList> getConfigList() {
            return this.configList;
        }

        public CheckComputeSourceConnectivityRequestCheckCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
