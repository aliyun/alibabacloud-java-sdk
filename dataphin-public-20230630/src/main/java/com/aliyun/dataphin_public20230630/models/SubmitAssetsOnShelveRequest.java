// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitAssetsOnShelveRequest extends TeaModel {
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
     * <p>The submit listing instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubmitCommand")
    public SubmitAssetsOnShelveRequestSubmitCommand submitCommand;

    public static SubmitAssetsOnShelveRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAssetsOnShelveRequest self = new SubmitAssetsOnShelveRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAssetsOnShelveRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitAssetsOnShelveRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public SubmitAssetsOnShelveRequest setSubmitCommand(SubmitAssetsOnShelveRequestSubmitCommand submitCommand) {
        this.submitCommand = submitCommand;
        return this;
    }
    public SubmitAssetsOnShelveRequestSubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static class SubmitAssetsOnShelveRequestSubmitCommand extends TeaModel {
        /**
         * <p>The list of asset GUIDs to be listed. A maximum of 50 GUIDs can be specified per request.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("GuidList")
        public java.util.List<String> guidList;

        public static SubmitAssetsOnShelveRequestSubmitCommand build(java.util.Map<String, ?> map) throws Exception {
            SubmitAssetsOnShelveRequestSubmitCommand self = new SubmitAssetsOnShelveRequestSubmitCommand();
            return TeaModel.build(map, self);
        }

        public SubmitAssetsOnShelveRequestSubmitCommand setGuidList(java.util.List<String> guidList) {
            this.guidList = guidList;
            return this;
        }
        public java.util.List<String> getGuidList() {
            return this.guidList;
        }

    }

}
