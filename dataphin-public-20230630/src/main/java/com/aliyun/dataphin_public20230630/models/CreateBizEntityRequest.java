// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBizEntityRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateBizEntityRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateBizEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBizEntityRequest self = new CreateBizEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateBizEntityRequest setCreateCommand(CreateBizEntityRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateBizEntityRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateBizEntityRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateBizEntityRequestCreateCommandBizObject extends TeaModel {
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
         * <p>create_object_code_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>30010010</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <strong>example:</strong>
         * <p>116306</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("RefBizEntityIdList")
        public java.util.List<Long> refBizEntityIdList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateBizEntityRequestCreateCommandBizObject build(java.util.Map<String, ?> map) throws Exception {
            CreateBizEntityRequestCreateCommandBizObject self = new CreateBizEntityRequestCreateCommandBizObject();
            return TeaModel.build(map, self);
        }

        public CreateBizEntityRequestCreateCommandBizObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateBizEntityRequestCreateCommandBizObject setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateBizEntityRequestCreateCommandBizObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBizEntityRequestCreateCommandBizObject setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public CreateBizEntityRequestCreateCommandBizObject setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public CreateBizEntityRequestCreateCommandBizObject setRefBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
            this.refBizEntityIdList = refBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

        public CreateBizEntityRequestCreateCommandBizObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateBizEntityRequestCreateCommandBizProcess extends TeaModel {
        @NameInMap("BizEventEntityIdList")
        public java.util.List<Long> bizEventEntityIdList;

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
         * <p>create_process_name</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>create_process_code_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>30010010</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        @NameInMap("PreBizProcessIdList")
        public java.util.List<Long> preBizProcessIdList;

        @NameInMap("RefBizEntityIdList")
        public java.util.List<Long> refBizEntityIdList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BIZ_EVENT</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateBizEntityRequestCreateCommandBizProcess build(java.util.Map<String, ?> map) throws Exception {
            CreateBizEntityRequestCreateCommandBizProcess self = new CreateBizEntityRequestCreateCommandBizProcess();
            return TeaModel.build(map, self);
        }

        public CreateBizEntityRequestCreateCommandBizProcess setBizEventEntityIdList(java.util.List<Long> bizEventEntityIdList) {
            this.bizEventEntityIdList = bizEventEntityIdList;
            return this;
        }
        public java.util.List<Long> getBizEventEntityIdList() {
            return this.bizEventEntityIdList;
        }

        public CreateBizEntityRequestCreateCommandBizProcess setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateBizEntityRequestCreateCommandBizProcess setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateBizEntityRequestCreateCommandBizProcess setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBizEntityRequestCreateCommandBizProcess setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public CreateBizEntityRequestCreateCommandBizProcess setPreBizProcessIdList(java.util.List<Long> preBizProcessIdList) {
            this.preBizProcessIdList = preBizProcessIdList;
            return this;
        }
        public java.util.List<Long> getPreBizProcessIdList() {
            return this.preBizProcessIdList;
        }

        public CreateBizEntityRequestCreateCommandBizProcess setRefBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
            this.refBizEntityIdList = refBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

        public CreateBizEntityRequestCreateCommandBizProcess setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateBizEntityRequestCreateCommand extends TeaModel {
        @NameInMap("BizObject")
        public CreateBizEntityRequestCreateCommandBizObject bizObject;

        @NameInMap("BizProcess")
        public CreateBizEntityRequestCreateCommandBizProcess bizProcess;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6798087749072704</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20101011</p>
         */
        @NameInMap("DataDomainId")
        public Long dataDomainId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BIZ_OBJECT</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateBizEntityRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateBizEntityRequestCreateCommand self = new CreateBizEntityRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateBizEntityRequestCreateCommand setBizObject(CreateBizEntityRequestCreateCommandBizObject bizObject) {
            this.bizObject = bizObject;
            return this;
        }
        public CreateBizEntityRequestCreateCommandBizObject getBizObject() {
            return this.bizObject;
        }

        public CreateBizEntityRequestCreateCommand setBizProcess(CreateBizEntityRequestCreateCommandBizProcess bizProcess) {
            this.bizProcess = bizProcess;
            return this;
        }
        public CreateBizEntityRequestCreateCommandBizProcess getBizProcess() {
            return this.bizProcess;
        }

        public CreateBizEntityRequestCreateCommand setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public CreateBizEntityRequestCreateCommand setDataDomainId(Long dataDomainId) {
            this.dataDomainId = dataDomainId;
            return this;
        }
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        public CreateBizEntityRequestCreateCommand setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
