// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeDialogFlowResponseBody extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("CreateUserName")
    public String createUserName;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("DialogName")
    public String dialogName;

    @NameInMap("GlobalVars")
    public java.util.Map<String, ?> globalVars;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("ModifyUserId")
    public String modifyUserId;

    @NameInMap("ModifyUserName")
    public String modifyUserName;

    @NameInMap("ModuleDefinition")
    public PaasProcessData moduleDefinition;

    @NameInMap("ModuleId")
    public Long moduleId;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>0 for deleted, 1 for inSandbox, 2 for draft，3 for online</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>null</p>
     */
    @NameInMap("Tags")
    public String tags;

    @NameInMap("Templates")
    public String templates;

    public static DescribeDialogFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogFlowResponseBody self = new DescribeDialogFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDialogFlowResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeDialogFlowResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDialogFlowResponseBody setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public DescribeDialogFlowResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeDialogFlowResponseBody setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public DescribeDialogFlowResponseBody setDialogName(String dialogName) {
        this.dialogName = dialogName;
        return this;
    }
    public String getDialogName() {
        return this.dialogName;
    }

    public DescribeDialogFlowResponseBody setGlobalVars(java.util.Map<String, ?> globalVars) {
        this.globalVars = globalVars;
        return this;
    }
    public java.util.Map<String, ?> getGlobalVars() {
        return this.globalVars;
    }

    public DescribeDialogFlowResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDialogFlowResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeDialogFlowResponseBody setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
        return this;
    }
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    public DescribeDialogFlowResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeDialogFlowResponseBody setModuleDefinition(PaasProcessData moduleDefinition) {
        this.moduleDefinition = moduleDefinition;
        return this;
    }
    public PaasProcessData getModuleDefinition() {
        return this.moduleDefinition;
    }

    public DescribeDialogFlowResponseBody setModuleId(Long moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public Long getModuleId() {
        return this.moduleId;
    }

    public DescribeDialogFlowResponseBody setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public DescribeDialogFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDialogFlowResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeDialogFlowResponseBody setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DescribeDialogFlowResponseBody setTemplates(String templates) {
        this.templates = templates;
        return this;
    }
    public String getTemplates() {
        return this.templates;
    }

}
