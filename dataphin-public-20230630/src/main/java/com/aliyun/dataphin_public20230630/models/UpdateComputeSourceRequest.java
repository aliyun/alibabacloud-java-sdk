// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateComputeSourceRequest extends TeaModel {
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

    /**
     * <p>The update command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateComputeSourceRequestUpdateCommand updateCommand;

    public static UpdateComputeSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeSourceRequest self = new UpdateComputeSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComputeSourceRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateComputeSourceRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpdateComputeSourceRequest setUpdateCommand(UpdateComputeSourceRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateComputeSourceRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateComputeSourceRequestUpdateCommandConfigList extends TeaModel {
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
         * <p>The value of the configuration item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateComputeSourceRequestUpdateCommandConfigList build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeSourceRequestUpdateCommandConfigList self = new UpdateComputeSourceRequestUpdateCommandConfigList();
            return TeaModel.build(map, self);
        }

        public UpdateComputeSourceRequestUpdateCommandConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateComputeSourceRequestUpdateCommandConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateComputeSourceRequestUpdateCommand extends TeaModel {
        /**
         * <p>The ID of the associated cluster. This parameter takes effect only when CreateType is left empty or set to COMPUTE_SOURCE, which means creating a compute source that references a cluster. This parameter is mutually exclusive with CreateType=CLUSTER.</p>
         * 
         * <strong>example:</strong>
         * <p>102311</p>
         */
        @NameInMap("ClusterId")
        public Long clusterId;

        /**
         * <p>The connection configurations.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConfigList")
        public java.util.List<UpdateComputeSourceRequestUpdateCommandConfigList> configList;

        /**
         * <p>The type of the entity to create. Valid values:</p>
         * <ul>
         * <li>CLUSTER: creates a cluster. You cannot specify ClusterId.</li>
         * <li>COMPUTE_SOURCE: creates a compute source. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLUSTER</p>
         */
        @NameInMap("CreateType")
        public String createType;

        /**
         * <p>The description.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the compute source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>102311</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the compute source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1021</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the time zone, such as Asia/Shanghai. If you do not specify this parameter when you update the compute source, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        /**
         * <p>The type of the compute source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MacCompute</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the compute source type.</p>
         * 
         * <strong>example:</strong>
         * <p>CDH6</p>
         */
        @NameInMap("TypeVersion")
        public String typeVersion;

        public static UpdateComputeSourceRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeSourceRequestUpdateCommand self = new UpdateComputeSourceRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateComputeSourceRequestUpdateCommand setClusterId(Long clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Long getClusterId() {
            return this.clusterId;
        }

        public UpdateComputeSourceRequestUpdateCommand setConfigList(java.util.List<UpdateComputeSourceRequestUpdateCommandConfigList> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<UpdateComputeSourceRequestUpdateCommandConfigList> getConfigList() {
            return this.configList;
        }

        public UpdateComputeSourceRequestUpdateCommand setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public UpdateComputeSourceRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateComputeSourceRequestUpdateCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateComputeSourceRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateComputeSourceRequestUpdateCommand setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public UpdateComputeSourceRequestUpdateCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateComputeSourceRequestUpdateCommand setTypeVersion(String typeVersion) {
            this.typeVersion = typeVersion;
            return this;
        }
        public String getTypeVersion() {
            return this.typeVersion;
        }

    }

}
