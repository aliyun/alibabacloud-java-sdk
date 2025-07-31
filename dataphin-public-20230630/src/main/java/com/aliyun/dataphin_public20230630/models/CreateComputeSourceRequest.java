// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateComputeSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateComputeSourceRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

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

    public static class CreateComputeSourceRequestCreateCommandConfigList extends TeaModel {
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConfigList")
        public java.util.List<CreateComputeSourceRequestCreateCommandConfigList> configList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1011</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MacCompute</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateComputeSourceRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeSourceRequestCreateCommand self = new CreateComputeSourceRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateComputeSourceRequestCreateCommand setConfigList(java.util.List<CreateComputeSourceRequestCreateCommandConfigList> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<CreateComputeSourceRequestCreateCommandConfigList> getConfigList() {
            return this.configList;
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

    }

}
