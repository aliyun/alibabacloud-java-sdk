// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBizUnitRequest extends TeaModel {
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
    public UpdateBizUnitRequestUpdateCommand updateCommand;

    public static UpdateBizUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizUnitRequest self = new UpdateBizUnitRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBizUnitRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateBizUnitRequest setUpdateCommand(UpdateBizUnitRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateBizUnitRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateBizUnitRequestUpdateCommandBizUnitAccountList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20001201</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static UpdateBizUnitRequestUpdateCommandBizUnitAccountList build(java.util.Map<String, ?> map) throws Exception {
            UpdateBizUnitRequestUpdateCommandBizUnitAccountList self = new UpdateBizUnitRequestUpdateCommandBizUnitAccountList();
            return TeaModel.build(map, self);
        }

        public UpdateBizUnitRequestUpdateCommandBizUnitAccountList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdateBizUnitRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("BizUnitAccountList")
        public java.util.List<UpdateBizUnitRequestUpdateCommandBizUnitAccountList> bizUnitAccountList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>545844456</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

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
         * <p>测试</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>icon-environment</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bz_code_name</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateBizUnitRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateBizUnitRequestUpdateCommand self = new UpdateBizUnitRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateBizUnitRequestUpdateCommand setBizUnitAccountList(java.util.List<UpdateBizUnitRequestUpdateCommandBizUnitAccountList> bizUnitAccountList) {
            this.bizUnitAccountList = bizUnitAccountList;
            return this;
        }
        public java.util.List<UpdateBizUnitRequestUpdateCommandBizUnitAccountList> getBizUnitAccountList() {
            return this.bizUnitAccountList;
        }

        public UpdateBizUnitRequestUpdateCommand setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public UpdateBizUnitRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateBizUnitRequestUpdateCommand setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateBizUnitRequestUpdateCommand setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public UpdateBizUnitRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
