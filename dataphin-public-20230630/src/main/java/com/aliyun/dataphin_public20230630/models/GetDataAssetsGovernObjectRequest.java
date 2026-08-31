// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataAssetsGovernObjectRequest extends TeaModel {
    /**
     * <p>The query instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Command")
    public GetDataAssetsGovernObjectRequestCommand command;

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
     * <p>The ID of the operation user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static GetDataAssetsGovernObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataAssetsGovernObjectRequest self = new GetDataAssetsGovernObjectRequest();
        return TeaModel.build(map, self);
    }

    public GetDataAssetsGovernObjectRequest setCommand(GetDataAssetsGovernObjectRequestCommand command) {
        this.command = command;
        return this;
    }
    public GetDataAssetsGovernObjectRequestCommand getCommand() {
        return this.command;
    }

    public GetDataAssetsGovernObjectRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetDataAssetsGovernObjectRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class GetDataAssetsGovernObjectRequestCommand extends TeaModel {
        /**
         * <p>The governance object ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22004</p>
         */
        @NameInMap("GovernObjectId")
        public Long governObjectId;

        public static GetDataAssetsGovernObjectRequestCommand build(java.util.Map<String, ?> map) throws Exception {
            GetDataAssetsGovernObjectRequestCommand self = new GetDataAssetsGovernObjectRequestCommand();
            return TeaModel.build(map, self);
        }

        public GetDataAssetsGovernObjectRequestCommand setGovernObjectId(Long governObjectId) {
            this.governObjectId = governObjectId;
            return this;
        }
        public Long getGovernObjectId() {
            return this.governObjectId;
        }

    }

}
