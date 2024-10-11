// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataSourceBasicInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateDataSourceBasicInfoRequestUpdateCommand updateCommand;

    public static UpdateDataSourceBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceBasicInfoRequest self = new UpdateDataSourceBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceBasicInfoRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateDataSourceBasicInfoRequest setUpdateCommand(UpdateDataSourceBasicInfoRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateDataSourceBasicInfoRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateDataSourceBasicInfoRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23231</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateDataSourceBasicInfoRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataSourceBasicInfoRequestUpdateCommand self = new UpdateDataSourceBasicInfoRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateDataSourceBasicInfoRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateDataSourceBasicInfoRequestUpdateCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateDataSourceBasicInfoRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
