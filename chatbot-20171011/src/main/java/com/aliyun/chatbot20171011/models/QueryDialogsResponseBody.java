// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryDialogsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Dialogs")
    public java.util.List<QueryDialogsResponseBodyDialogs> dialogs;

    public static QueryDialogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDialogsResponseBody self = new QueryDialogsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDialogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryDialogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDialogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDialogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryDialogsResponseBody setDialogs(java.util.List<QueryDialogsResponseBodyDialogs> dialogs) {
        this.dialogs = dialogs;
        return this;
    }
    public java.util.List<QueryDialogsResponseBodyDialogs> getDialogs() {
        return this.dialogs;
    }

    public static class QueryDialogsResponseBodyDialogs extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("DialogName")
        public String dialogName;

        @NameInMap("ModifyUserId")
        public String modifyUserId;

        @NameInMap("IsOnline")
        public Boolean isOnline;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("Description")
        public String description;

        @NameInMap("DialogId")
        public Long dialogId;

        @NameInMap("IsSampleDialog")
        public Boolean isSampleDialog;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static QueryDialogsResponseBodyDialogs build(java.util.Map<String, ?> map) throws Exception {
            QueryDialogsResponseBodyDialogs self = new QueryDialogsResponseBodyDialogs();
            return TeaModel.build(map, self);
        }

        public QueryDialogsResponseBodyDialogs setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryDialogsResponseBodyDialogs setDialogName(String dialogName) {
            this.dialogName = dialogName;
            return this;
        }
        public String getDialogName() {
            return this.dialogName;
        }

        public QueryDialogsResponseBodyDialogs setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public QueryDialogsResponseBodyDialogs setIsOnline(Boolean isOnline) {
            this.isOnline = isOnline;
            return this;
        }
        public Boolean getIsOnline() {
            return this.isOnline;
        }

        public QueryDialogsResponseBodyDialogs setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public QueryDialogsResponseBodyDialogs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryDialogsResponseBodyDialogs setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public QueryDialogsResponseBodyDialogs setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public QueryDialogsResponseBodyDialogs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryDialogsResponseBodyDialogs setDialogId(Long dialogId) {
            this.dialogId = dialogId;
            return this;
        }
        public Long getDialogId() {
            return this.dialogId;
        }

        public QueryDialogsResponseBodyDialogs setIsSampleDialog(Boolean isSampleDialog) {
            this.isSampleDialog = isSampleDialog;
            return this;
        }
        public Boolean getIsSampleDialog() {
            return this.isSampleDialog;
        }

        public QueryDialogsResponseBodyDialogs setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
