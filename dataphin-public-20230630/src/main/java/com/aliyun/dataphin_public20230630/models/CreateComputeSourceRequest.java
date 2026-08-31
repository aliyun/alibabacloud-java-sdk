// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateComputeSourceRequest extends TeaModel {
    /**
     * <p>The create command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateComputeSourceRequestCreateCommand createCommand;

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

    public static CreateComputeSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeSourceRequest self = new CreateComputeSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeSourceRequest setCreateCommand(CreateComputeSourceRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateComputeSourceRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateComputeSourceRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateComputeSourceRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreateComputeSourceRequestCreateCommandConfigList extends TeaModel {
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

        public static CreateComputeSourceRequestCreateCommandConfigList build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeSourceRequestCreateCommandConfigList self = new CreateComputeSourceRequestCreateCommandConfigList();
            return TeaModel.build(map, self);
        }

        public CreateComputeSourceRequestCreateCommandConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateComputeSourceRequestCreateCommandConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateComputeSourceRequestCreateCommand extends TeaModel {
        /**
         * <p>The ID of the associated cluster. This parameter takes effect only when CreateType is not specified or is set to COMPUTE_SOURCE, which creates a compute source that references a cluster. This parameter is mutually exclusive with CreateType=CLUSTER.</p>
         * 
         * <strong>example:</strong>
         * <p>102311</p>
         */
        @NameInMap("ClusterId")
        public Long clusterId;

        /**
         * <p>The connection configuration items.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConfigList")
        public java.util.List<CreateComputeSourceRequestCreateCommandConfigList> configList;

        /**
         * <p>The type of entity to create. Valid values:</p>
         * <ul>
         * <li>CLUSTER: Creates a cluster. ClusterId cannot be specified.</li>
         * <li>COMPUTE_SOURCE: Creates a compute source. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLUSTER</p>
         */
        @NameInMap("CreateType")
        public String createType;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the compute source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1011</p>
         */
        @NameInMap("Name")
        public String name;

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

        public static CreateComputeSourceRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeSourceRequestCreateCommand self = new CreateComputeSourceRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateComputeSourceRequestCreateCommand setClusterId(Long clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Long getClusterId() {
            return this.clusterId;
        }

        public CreateComputeSourceRequestCreateCommand setConfigList(java.util.List<CreateComputeSourceRequestCreateCommandConfigList> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<CreateComputeSourceRequestCreateCommandConfigList> getConfigList() {
            return this.configList;
        }

        public CreateComputeSourceRequestCreateCommand setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public CreateComputeSourceRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateComputeSourceRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateComputeSourceRequestCreateCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateComputeSourceRequestCreateCommand setTypeVersion(String typeVersion) {
            this.typeVersion = typeVersion;
            return this;
        }
        public String getTypeVersion() {
            return this.typeVersion;
        }

    }

}
