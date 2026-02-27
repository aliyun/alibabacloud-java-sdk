// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddDataServiceAppMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddCommand")
    public AddDataServiceAppMemberRequestAddCommand addCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static AddDataServiceAppMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataServiceAppMemberRequest self = new AddDataServiceAppMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddDataServiceAppMemberRequest setAddCommand(AddDataServiceAppMemberRequestAddCommand addCommand) {
        this.addCommand = addCommand;
        return this;
    }
    public AddDataServiceAppMemberRequestAddCommand getAddCommand() {
        return this.addCommand;
    }

    public AddDataServiceAppMemberRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class AddDataServiceAppMemberRequestAddCommandMemberList extends TeaModel {
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

        public static AddDataServiceAppMemberRequestAddCommandMemberList build(java.util.Map<String, ?> map) throws Exception {
            AddDataServiceAppMemberRequestAddCommandMemberList self = new AddDataServiceAppMemberRequestAddCommandMemberList();
            return TeaModel.build(map, self);
        }

        public AddDataServiceAppMemberRequestAddCommandMemberList setEffectiveEnd(String effectiveEnd) {
            this.effectiveEnd = effectiveEnd;
            return this;
        }
        public String getEffectiveEnd() {
            return this.effectiveEnd;
        }

        public AddDataServiceAppMemberRequestAddCommandMemberList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class AddDataServiceAppMemberRequestAddCommand extends TeaModel {
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
        public java.util.List<AddDataServiceAppMemberRequestAddCommandMemberList> memberList;

        public static AddDataServiceAppMemberRequestAddCommand build(java.util.Map<String, ?> map) throws Exception {
            AddDataServiceAppMemberRequestAddCommand self = new AddDataServiceAppMemberRequestAddCommand();
            return TeaModel.build(map, self);
        }

        public AddDataServiceAppMemberRequestAddCommand setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public AddDataServiceAppMemberRequestAddCommand setMemberList(java.util.List<AddDataServiceAppMemberRequestAddCommandMemberList> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<AddDataServiceAppMemberRequestAddCommandMemberList> getMemberList() {
            return this.memberList;
        }

    }

}
