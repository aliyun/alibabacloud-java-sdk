// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveTenantMemberRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The request command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemoveCommand")
    public RemoveTenantMemberRequestRemoveCommand removeCommand;

    public static RemoveTenantMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTenantMemberRequest self = new RemoveTenantMemberRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTenantMemberRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RemoveTenantMemberRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public RemoveTenantMemberRequest setRemoveCommand(RemoveTenantMemberRequestRemoveCommand removeCommand) {
        this.removeCommand = removeCommand;
        return this;
    }
    public RemoveTenantMemberRequestRemoveCommand getRemoveCommand() {
        return this.removeCommand;
    }

    public static class RemoveTenantMemberRequestRemoveCommand extends TeaModel {
        /**
         * <p>The source ID of the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:123@xx.com">123@xx.com</a></p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static RemoveTenantMemberRequestRemoveCommand build(java.util.Map<String, ?> map) throws Exception {
            RemoveTenantMemberRequestRemoveCommand self = new RemoveTenantMemberRequestRemoveCommand();
            return TeaModel.build(map, self);
        }

        public RemoveTenantMemberRequestRemoveCommand setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public RemoveTenantMemberRequestRemoveCommand setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
