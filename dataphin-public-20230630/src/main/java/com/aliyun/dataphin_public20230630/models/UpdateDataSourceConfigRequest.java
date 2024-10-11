// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataSourceConfigRequest extends TeaModel {
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
    public UpdateDataSourceConfigRequestUpdateCommand updateCommand;

    public static UpdateDataSourceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceConfigRequest self = new UpdateDataSourceConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceConfigRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateDataSourceConfigRequest setUpdateCommand(UpdateDataSourceConfigRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateDataSourceConfigRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateDataSourceConfigRequestUpdateCommandConfigItemList extends TeaModel {
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

        public static UpdateDataSourceConfigRequestUpdateCommandConfigItemList build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataSourceConfigRequestUpdateCommandConfigItemList self = new UpdateDataSourceConfigRequestUpdateCommandConfigItemList();
            return TeaModel.build(map, self);
        }

        public UpdateDataSourceConfigRequestUpdateCommandConfigItemList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateDataSourceConfigRequestUpdateCommandConfigItemList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateDataSourceConfigRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConfigItemList")
        public java.util.List<UpdateDataSourceConfigRequestUpdateCommandConfigItemList> configItemList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13231313</p>
         */
        @NameInMap("Id")
        public Long id;

        public static UpdateDataSourceConfigRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataSourceConfigRequestUpdateCommand self = new UpdateDataSourceConfigRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateDataSourceConfigRequestUpdateCommand setConfigItemList(java.util.List<UpdateDataSourceConfigRequestUpdateCommandConfigItemList> configItemList) {
            this.configItemList = configItemList;
            return this;
        }
        public java.util.List<UpdateDataSourceConfigRequestUpdateCommandConfigItemList> getConfigItemList() {
            return this.configItemList;
        }

        public UpdateDataSourceConfigRequestUpdateCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
