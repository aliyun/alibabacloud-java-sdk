// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataServiceAppMemberRequest extends TeaModel {
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
    public UpdateDataServiceAppMemberRequestUpdateCommand updateCommand;

    public static UpdateDataServiceAppMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataServiceAppMemberRequest self = new UpdateDataServiceAppMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataServiceAppMemberRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateDataServiceAppMemberRequest setUpdateCommand(UpdateDataServiceAppMemberRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateDataServiceAppMemberRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateDataServiceAppMemberRequestUpdateCommandMemberList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-12</p>
         */
        @NameInMap("EffectiveEnd")
        public String effectiveEnd;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static UpdateDataServiceAppMemberRequestUpdateCommandMemberList build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataServiceAppMemberRequestUpdateCommandMemberList self = new UpdateDataServiceAppMemberRequestUpdateCommandMemberList();
            return TeaModel.build(map, self);
        }

        public UpdateDataServiceAppMemberRequestUpdateCommandMemberList setEffectiveEnd(String effectiveEnd) {
            this.effectiveEnd = effectiveEnd;
            return this;
        }
        public String getEffectiveEnd() {
            return this.effectiveEnd;
        }

        public UpdateDataServiceAppMemberRequestUpdateCommandMemberList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdateDataServiceAppMemberRequestUpdateCommand extends TeaModel {
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
        @NameInMap("MemberList")
        public java.util.List<UpdateDataServiceAppMemberRequestUpdateCommandMemberList> memberList;

        public static UpdateDataServiceAppMemberRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataServiceAppMemberRequestUpdateCommand self = new UpdateDataServiceAppMemberRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateDataServiceAppMemberRequestUpdateCommand setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public UpdateDataServiceAppMemberRequestUpdateCommand setMemberList(java.util.List<UpdateDataServiceAppMemberRequestUpdateCommandMemberList> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<UpdateDataServiceAppMemberRequestUpdateCommandMemberList> getMemberList() {
            return this.memberList;
        }

    }

}
