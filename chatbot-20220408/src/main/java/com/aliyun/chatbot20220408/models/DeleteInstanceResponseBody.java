// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteInstanceResponseBody extends TeaModel {
    @NameInMap("BizTypeList")
    public java.util.List<String> bizTypeList;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateUserId")
    public Long createUserId;

    @NameInMap("CreateUserName")
    public String createUserName;

    @NameInMap("Error")
    public String error;

    @NameInMap("Id")
    public Long id;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Response")
    public Long response;

    @NameInMap("Status")
    public String status;

    public static DeleteInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceResponseBody self = new DeleteInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceResponseBody setBizTypeList(java.util.List<String> bizTypeList) {
        this.bizTypeList = bizTypeList;
        return this;
    }
    public java.util.List<String> getBizTypeList() {
        return this.bizTypeList;
    }

    public DeleteInstanceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DeleteInstanceResponseBody setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public Long getCreateUserId() {
        return this.createUserId;
    }

    public DeleteInstanceResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DeleteInstanceResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public DeleteInstanceResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteInstanceResponseBody setResponse(Long response) {
        this.response = response;
        return this;
    }
    public Long getResponse() {
        return this.response;
    }

    public DeleteInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
