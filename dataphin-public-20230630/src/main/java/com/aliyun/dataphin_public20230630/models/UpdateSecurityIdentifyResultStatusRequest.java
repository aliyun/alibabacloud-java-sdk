// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateSecurityIdentifyResultStatusRequest extends TeaModel {
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
    public UpdateSecurityIdentifyResultStatusRequestUpdateCommand updateCommand;

    public static UpdateSecurityIdentifyResultStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityIdentifyResultStatusRequest self = new UpdateSecurityIdentifyResultStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityIdentifyResultStatusRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateSecurityIdentifyResultStatusRequest setUpdateCommand(UpdateSecurityIdentifyResultStatusRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateSecurityIdentifyResultStatusRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateSecurityIdentifyResultStatusRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("IdentifyResultIdList")
        public java.util.List<Long> identifyResultIdList;

        public static UpdateSecurityIdentifyResultStatusRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecurityIdentifyResultStatusRequestUpdateCommand self = new UpdateSecurityIdentifyResultStatusRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateSecurityIdentifyResultStatusRequestUpdateCommand setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateSecurityIdentifyResultStatusRequestUpdateCommand setIdentifyResultIdList(java.util.List<Long> identifyResultIdList) {
            this.identifyResultIdList = identifyResultIdList;
            return this;
        }
        public java.util.List<Long> getIdentifyResultIdList() {
            return this.identifyResultIdList;
        }

    }

}
