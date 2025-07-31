// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveProjectMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>711833</p>
     */
    @NameInMap("Id")
    public Long id;

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
    public RemoveProjectMemberRequestRemoveCommand removeCommand;

    public static RemoveProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveProjectMemberRequest self = new RemoveProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public RemoveProjectMemberRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RemoveProjectMemberRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RemoveProjectMemberRequest setRemoveCommand(RemoveProjectMemberRequestRemoveCommand removeCommand) {
        this.removeCommand = removeCommand;
        return this;
    }
    public RemoveProjectMemberRequestRemoveCommand getRemoveCommand() {
        return this.removeCommand;
    }

    public static class RemoveProjectMemberRequestRemoveCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        @NameInMap("UserIdList")
        public java.util.List<String> userIdList;

        public static RemoveProjectMemberRequestRemoveCommand build(java.util.Map<String, ?> map) throws Exception {
            RemoveProjectMemberRequestRemoveCommand self = new RemoveProjectMemberRequestRemoveCommand();
            return TeaModel.build(map, self);
        }

        public RemoveProjectMemberRequestRemoveCommand setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public RemoveProjectMemberRequestRemoveCommand setUserIdList(java.util.List<String> userIdList) {
            this.userIdList = userIdList;
            return this;
        }
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

    }

}
