// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveDataServiceAppMemberRequest extends TeaModel {
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
    @NameInMap("RemoveCommand")
    public RemoveDataServiceAppMemberRequestRemoveCommand removeCommand;

    public static RemoveDataServiceAppMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataServiceAppMemberRequest self = new RemoveDataServiceAppMemberRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDataServiceAppMemberRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RemoveDataServiceAppMemberRequest setRemoveCommand(RemoveDataServiceAppMemberRequestRemoveCommand removeCommand) {
        this.removeCommand = removeCommand;
        return this;
    }
    public RemoveDataServiceAppMemberRequestRemoveCommand getRemoveCommand() {
        return this.removeCommand;
    }

    public static class RemoveDataServiceAppMemberRequestRemoveCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200000000</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("MemberIds")
        public java.util.List<String> memberIds;

        public static RemoveDataServiceAppMemberRequestRemoveCommand build(java.util.Map<String, ?> map) throws Exception {
            RemoveDataServiceAppMemberRequestRemoveCommand self = new RemoveDataServiceAppMemberRequestRemoveCommand();
            return TeaModel.build(map, self);
        }

        public RemoveDataServiceAppMemberRequestRemoveCommand setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public RemoveDataServiceAppMemberRequestRemoveCommand setMemberIds(java.util.List<String> memberIds) {
            this.memberIds = memberIds;
            return this;
        }
        public java.util.List<String> getMemberIds() {
            return this.memberIds;
        }

    }

}
