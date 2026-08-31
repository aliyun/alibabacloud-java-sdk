// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitAssetsOffShelveRequest extends TeaModel {
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
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The delisting submit command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubmitCommand")
    public SubmitAssetsOffShelveRequestSubmitCommand submitCommand;

    public static SubmitAssetsOffShelveRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAssetsOffShelveRequest self = new SubmitAssetsOffShelveRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAssetsOffShelveRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitAssetsOffShelveRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public SubmitAssetsOffShelveRequest setSubmitCommand(SubmitAssetsOffShelveRequestSubmitCommand submitCommand) {
        this.submitCommand = submitCommand;
        return this;
    }
    public SubmitAssetsOffShelveRequestSubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static class SubmitAssetsOffShelveRequestSubmitCommand extends TeaModel {
        /**
         * <p>The list of asset GUIDs to be delisted. A maximum of 50 GUIDs can be specified per request.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("GuidList")
        public java.util.List<String> guidList;

        /**
         * <p>The delisting description. The value must be 1 to 100 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Business adjustment, no longer available externally</p>
         */
        @NameInMap("OffShelveDescription")
        public String offShelveDescription;

        public static SubmitAssetsOffShelveRequestSubmitCommand build(java.util.Map<String, ?> map) throws Exception {
            SubmitAssetsOffShelveRequestSubmitCommand self = new SubmitAssetsOffShelveRequestSubmitCommand();
            return TeaModel.build(map, self);
        }

        public SubmitAssetsOffShelveRequestSubmitCommand setGuidList(java.util.List<String> guidList) {
            this.guidList = guidList;
            return this;
        }
        public java.util.List<String> getGuidList() {
            return this.guidList;
        }

        public SubmitAssetsOffShelveRequestSubmitCommand setOffShelveDescription(String offShelveDescription) {
            this.offShelveDescription = offShelveDescription;
            return this;
        }
        public String getOffShelveDescription() {
            return this.offShelveDescription;
        }

    }

}
