// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddDataServiceProjectMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddCommand")
    public AddDataServiceProjectMemberRequestAddCommand addCommand;

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
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    public static AddDataServiceProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataServiceProjectMemberRequest self = new AddDataServiceProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddDataServiceProjectMemberRequest setAddCommand(AddDataServiceProjectMemberRequestAddCommand addCommand) {
        this.addCommand = addCommand;
        return this;
    }
    public AddDataServiceProjectMemberRequestAddCommand getAddCommand() {
        return this.addCommand;
    }

    public AddDataServiceProjectMemberRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public AddDataServiceProjectMemberRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public static class AddDataServiceProjectMemberRequestAddCommandProjectMemberList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xx@aliyuncs.com">xx@aliyuncs.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Role")
        public Integer role;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static AddDataServiceProjectMemberRequestAddCommandProjectMemberList build(java.util.Map<String, ?> map) throws Exception {
            AddDataServiceProjectMemberRequestAddCommandProjectMemberList self = new AddDataServiceProjectMemberRequestAddCommandProjectMemberList();
            return TeaModel.build(map, self);
        }

        public AddDataServiceProjectMemberRequestAddCommandProjectMemberList setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public AddDataServiceProjectMemberRequestAddCommandProjectMemberList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public AddDataServiceProjectMemberRequestAddCommandProjectMemberList setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public AddDataServiceProjectMemberRequestAddCommandProjectMemberList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class AddDataServiceProjectMemberRequestAddCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ProjectMemberList")
        public java.util.List<AddDataServiceProjectMemberRequestAddCommandProjectMemberList> projectMemberList;

        public static AddDataServiceProjectMemberRequestAddCommand build(java.util.Map<String, ?> map) throws Exception {
            AddDataServiceProjectMemberRequestAddCommand self = new AddDataServiceProjectMemberRequestAddCommand();
            return TeaModel.build(map, self);
        }

        public AddDataServiceProjectMemberRequestAddCommand setProjectMemberList(java.util.List<AddDataServiceProjectMemberRequestAddCommandProjectMemberList> projectMemberList) {
            this.projectMemberList = projectMemberList;
            return this;
        }
        public java.util.List<AddDataServiceProjectMemberRequestAddCommandProjectMemberList> getProjectMemberList() {
            return this.projectMemberList;
        }

    }

}
