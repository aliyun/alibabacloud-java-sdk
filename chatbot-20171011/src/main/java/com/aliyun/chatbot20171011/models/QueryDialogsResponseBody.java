// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryDialogsResponseBody extends TeaModel {
    @NameInMap("Dialogs")
    public java.util.List<QueryDialogsResponseBodyDialogs> dialogs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryDialogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDialogsResponseBody self = new QueryDialogsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDialogsResponseBody setDialogs(java.util.List<QueryDialogsResponseBodyDialogs> dialogs) {
        this.dialogs = dialogs;
        return this;
    }
    public java.util.List<QueryDialogsResponseBodyDialogs> getDialogs() {
        return this.dialogs;
    }

    public QueryDialogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryDialogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDialogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDialogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryDialogsResponseBodyDialogs extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("Description")
        public String description;

        @NameInMap("DialogId")
        public Long dialogId;

        @NameInMap("DialogName")
        public String dialogName;

        @NameInMap("IsOnline")
        public Boolean isOnline;

        @NameInMap("IsSampleDialog")
        public Boolean isSampleDialog;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ModifyUserId")
        public String modifyUserId;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("Status")
        public Integer status;

        public static QueryDialogsResponseBodyDialogs build(java.util.Map<String, ?> map) throws Exception {
            QueryDialogsResponseBodyDialogs self = new QueryDialogsResponseBodyDialogs();
            return TeaModel.build(map, self);
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

        public QueryDialogsResponseBodyDialogs setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
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

        public QueryDialogsResponseBodyDialogs setDialogName(String dialogName) {
            this.dialogName = dialogName;
            return this;
        }
        public String getDialogName() {
            return this.dialogName;
        }

        public QueryDialogsResponseBodyDialogs setIsOnline(Boolean isOnline) {
            this.isOnline = isOnline;
            return this;
        }
        public Boolean getIsOnline() {
            return this.isOnline;
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

        public QueryDialogsResponseBodyDialogs setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public QueryDialogsResponseBodyDialogs setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public QueryDialogsResponseBodyDialogs setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
