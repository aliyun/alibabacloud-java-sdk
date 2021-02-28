// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeDialogResponseBody extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("CreateUserName")
    public String createUserName;

    @NameInMap("IsOnline")
    public Boolean isOnline;

    @NameInMap("DialogName")
    public String dialogName;

    @NameInMap("ModifyUserId")
    public String modifyUserId;

    @NameInMap("ModifyUserName")
    public String modifyUserName;

    @NameInMap("IsSampleDialog")
    public Boolean isSampleDialog;

    public static DescribeDialogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogResponseBody self = new DescribeDialogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDialogResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeDialogResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeDialogResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDialogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDialogResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDialogResponseBody setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public DescribeDialogResponseBody setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public DescribeDialogResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeDialogResponseBody setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
        return this;
    }
    public Boolean getIsOnline() {
        return this.isOnline;
    }

    public DescribeDialogResponseBody setDialogName(String dialogName) {
        this.dialogName = dialogName;
        return this;
    }
    public String getDialogName() {
        return this.dialogName;
    }

    public DescribeDialogResponseBody setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
        return this;
    }
    public String getModifyUserId() {
        return this.modifyUserId;
    }

    public DescribeDialogResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeDialogResponseBody setIsSampleDialog(Boolean isSampleDialog) {
        this.isSampleDialog = isSampleDialog;
        return this;
    }
    public Boolean getIsSampleDialog() {
        return this.isSampleDialog;
    }

}
