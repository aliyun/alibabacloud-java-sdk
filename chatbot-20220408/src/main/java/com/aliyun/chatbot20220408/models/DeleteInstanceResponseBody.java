// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteInstanceResponseBody extends TeaModel {
    /**
     * <p>A list of business types.</p>
     */
    @NameInMap("BizTypeList")
    public java.util.List<String> bizTypeList;

    /**
     * <p>The UTC time when the task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-11T09:26:14Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the user who created the task.</p>
     * 
     * <strong>example:</strong>
     * <p>9052</p>
     */
    @NameInMap("CreateUserId")
    public Long createUserId;

    /**
     * <p>The username of the user who created the task.</p>
     * 
     * <strong>example:</strong>
     * <p>xuqiang_test</p>
     */
    @NameInMap("CreateUserName")
    public String createUserName;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>检查待发布模块是否空闲发生错误，faq</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8521</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5CBF0581-EAE7-1DC4-95C6-A089656A1E2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID. This parameter is an alias for <code>Id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>8521</p>
     */
    @NameInMap("Response")
    public Long response;

    /**
     * <p>The task status. For more information about possible states, see the GetInstancePublishTaskState API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>FE_RUNNING</p>
     */
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
