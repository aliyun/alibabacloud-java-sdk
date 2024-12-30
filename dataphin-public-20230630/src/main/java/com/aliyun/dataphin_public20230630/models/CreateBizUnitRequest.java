// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBizUnitRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateBizUnitRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateBizUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBizUnitRequest self = new CreateBizUnitRequest();
        return TeaModel.build(map, self);
    }

    public CreateBizUnitRequest setCreateCommand(CreateBizUnitRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateBizUnitRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateBizUnitRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateBizUnitRequestCreateCommandBizUnitAccountList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20001201</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CreateBizUnitRequestCreateCommandBizUnitAccountList build(java.util.Map<String, ?> map) throws Exception {
            CreateBizUnitRequestCreateCommandBizUnitAccountList self = new CreateBizUnitRequestCreateCommandBizUnitAccountList();
            return TeaModel.build(map, self);
        }

        public CreateBizUnitRequestCreateCommandBizUnitAccountList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreateBizUnitRequestCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("BizUnitAccountList")
        public java.util.List<CreateBizUnitRequestCreateCommandBizUnitAccountList> bizUnitAccountList;

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
         * <p>create_object_name</p>
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
         * <strong>example:</strong>
         * <p>DEV_PROD</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>create_object_code_name</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateBizUnitRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateBizUnitRequestCreateCommand self = new CreateBizUnitRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateBizUnitRequestCreateCommand setBizUnitAccountList(java.util.List<CreateBizUnitRequestCreateCommandBizUnitAccountList> bizUnitAccountList) {
            this.bizUnitAccountList = bizUnitAccountList;
            return this;
        }
        public java.util.List<CreateBizUnitRequestCreateCommandBizUnitAccountList> getBizUnitAccountList() {
            return this.bizUnitAccountList;
        }

        public CreateBizUnitRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateBizUnitRequestCreateCommand setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateBizUnitRequestCreateCommand setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public CreateBizUnitRequestCreateCommand setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateBizUnitRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
