// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBizEntityRequest extends TeaModel {
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
     * <p>The update request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateBizEntityRequestUpdateCommand updateCommand;

    public static UpdateBizEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizEntityRequest self = new UpdateBizEntityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBizEntityRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateBizEntityRequest setUpdateCommand(UpdateBizEntityRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateBizEntityRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateBizEntityRequestUpdateCommandBizObject extends TeaModel {
        /**
         * <p>The description of the business object. The description can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the business object. The name can be up to 64 characters in length and can contain only Chinese characters, letters, digits, underscores, and hyphens.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>create_object_name</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The code name of the business object. The name can be up to 64 characters in length and can contain only letters, digits, and underscores. For the ADB_PG engine, the code name can be up to 40 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>create_object_code_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user ID of the business object owner.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30010010</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The inherited entity of the business object. Only common business objects support inherited entity configuration, and only online business objects can be inherited.</p>
         * 
         * <strong>example:</strong>
         * <p>116306</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <p>The list of associated online business entity IDs. If this parameter is not specified, the existing values are cleared.</p>
         */
        @NameInMap("RefBizEntityIdList")
        public java.util.List<Long> refBizEntityIdList;

        public static UpdateBizEntityRequestUpdateCommandBizObject build(java.util.Map<String, ?> map) throws Exception {
            UpdateBizEntityRequestUpdateCommandBizObject self = new UpdateBizEntityRequestUpdateCommandBizObject();
            return TeaModel.build(map, self);
        }

        public UpdateBizEntityRequestUpdateCommandBizObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateBizEntityRequestUpdateCommandBizObject setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateBizEntityRequestUpdateCommandBizObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateBizEntityRequestUpdateCommandBizObject setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public UpdateBizEntityRequestUpdateCommandBizObject setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public UpdateBizEntityRequestUpdateCommandBizObject setRefBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
            this.refBizEntityIdList = refBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

    }

    public static class UpdateBizEntityRequestUpdateCommandBizProcess extends TeaModel {
        /**
         * <p>The list of business event activity IDs contained in the business flow activity. This parameter is valid only when the current entity is a business flow activity.</p>
         */
        @NameInMap("BizEventEntityIdList")
        public java.util.List<Long> bizEventEntityIdList;

        /**
         * <p>The description of the business process. The description can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the business process. The name can be up to 64 characters in length and can contain only Chinese characters, letters, digits, underscores, and hyphens.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>create_process_name</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The code name of the business process. The name can be up to 64 characters in length and can contain only letters, digits, and underscores. For the ADB_PG engine, the code name can be up to 40 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>create_process_code_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user ID of the business process owner.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30010010</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The preceding business flow activities of the business flow activity.</p>
         */
        @NameInMap("PreBizProcessIdList")
        public java.util.List<Long> preBizProcessIdList;

        /**
         * <p>The list of associated online business entity IDs. If this parameter is not specified, the existing values are cleared.</p>
         */
        @NameInMap("RefBizEntityIdList")
        public java.util.List<Long> refBizEntityIdList;

        public static UpdateBizEntityRequestUpdateCommandBizProcess build(java.util.Map<String, ?> map) throws Exception {
            UpdateBizEntityRequestUpdateCommandBizProcess self = new UpdateBizEntityRequestUpdateCommandBizProcess();
            return TeaModel.build(map, self);
        }

        public UpdateBizEntityRequestUpdateCommandBizProcess setBizEventEntityIdList(java.util.List<Long> bizEventEntityIdList) {
            this.bizEventEntityIdList = bizEventEntityIdList;
            return this;
        }
        public java.util.List<Long> getBizEventEntityIdList() {
            return this.bizEventEntityIdList;
        }

        public UpdateBizEntityRequestUpdateCommandBizProcess setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateBizEntityRequestUpdateCommandBizProcess setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateBizEntityRequestUpdateCommandBizProcess setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateBizEntityRequestUpdateCommandBizProcess setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public UpdateBizEntityRequestUpdateCommandBizProcess setPreBizProcessIdList(java.util.List<Long> preBizProcessIdList) {
            this.preBizProcessIdList = preBizProcessIdList;
            return this;
        }
        public java.util.List<Long> getPreBizProcessIdList() {
            return this.preBizProcessIdList;
        }

        public UpdateBizEntityRequestUpdateCommandBizProcess setRefBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
            this.refBizEntityIdList = refBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

    }

    public static class UpdateBizEntityRequestUpdateCommand extends TeaModel {
        /**
         * <p>The business object.</p>
         */
        @NameInMap("BizObject")
        public UpdateBizEntityRequestUpdateCommandBizObject bizObject;

        /**
         * <p>The business process.</p>
         */
        @NameInMap("BizProcess")
        public UpdateBizEntityRequestUpdateCommandBizProcess bizProcess;

        /**
         * <p>The ID of the business unit to which the business process belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6798087749072704</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The ID of the data domain to which the business process belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20101011</p>
         */
        @NameInMap("DataDomainId")
        public Long dataDomainId;

        /**
         * <p>The ID of the business entity.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>101001201</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The type of the business entity. For more information, refer to the create business entity operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BIZ_OBJECT</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateBizEntityRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateBizEntityRequestUpdateCommand self = new UpdateBizEntityRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateBizEntityRequestUpdateCommand setBizObject(UpdateBizEntityRequestUpdateCommandBizObject bizObject) {
            this.bizObject = bizObject;
            return this;
        }
        public UpdateBizEntityRequestUpdateCommandBizObject getBizObject() {
            return this.bizObject;
        }

        public UpdateBizEntityRequestUpdateCommand setBizProcess(UpdateBizEntityRequestUpdateCommandBizProcess bizProcess) {
            this.bizProcess = bizProcess;
            return this;
        }
        public UpdateBizEntityRequestUpdateCommandBizProcess getBizProcess() {
            return this.bizProcess;
        }

        public UpdateBizEntityRequestUpdateCommand setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public UpdateBizEntityRequestUpdateCommand setDataDomainId(Long dataDomainId) {
            this.dataDomainId = dataDomainId;
            return this;
        }
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        public UpdateBizEntityRequestUpdateCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateBizEntityRequestUpdateCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
