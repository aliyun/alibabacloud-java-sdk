// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteSecurityIdentifyResultsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteCommand")
    public DeleteSecurityIdentifyResultsRequestDeleteCommand deleteCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteSecurityIdentifyResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityIdentifyResultsRequest self = new DeleteSecurityIdentifyResultsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityIdentifyResultsRequest setDeleteCommand(DeleteSecurityIdentifyResultsRequestDeleteCommand deleteCommand) {
        this.deleteCommand = deleteCommand;
        return this;
    }
    public DeleteSecurityIdentifyResultsRequestDeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    public DeleteSecurityIdentifyResultsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class DeleteSecurityIdentifyResultsRequestDeleteCommand extends TeaModel {
        @NameInMap("IdentifyResultIdList")
        public java.util.List<Long> identifyResultIdList;

        public static DeleteSecurityIdentifyResultsRequestDeleteCommand build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecurityIdentifyResultsRequestDeleteCommand self = new DeleteSecurityIdentifyResultsRequestDeleteCommand();
            return TeaModel.build(map, self);
        }

        public DeleteSecurityIdentifyResultsRequestDeleteCommand setIdentifyResultIdList(java.util.List<Long> identifyResultIdList) {
            this.identifyResultIdList = identifyResultIdList;
            return this;
        }
        public java.util.List<Long> getIdentifyResultIdList() {
            return this.identifyResultIdList;
        }

    }

}
