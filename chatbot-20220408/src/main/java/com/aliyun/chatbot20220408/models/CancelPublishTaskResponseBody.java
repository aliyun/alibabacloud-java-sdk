// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CancelPublishTaskResponseBody extends TeaModel {
    /**
     * <p>A list of business types.</p>
     */
    @NameInMap("BizTypeList")
    public java.util.List<String> bizTypeList;

    /**
     * <p>The time when the task was created, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-12T06:30:17Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The error message returned if the task fails.</p>
     * 
     * <strong>example:</strong>
     * <p>检查待发布模块是否空闲发生错误，faq</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <p>The ID of the publish task.</p>
     * 
     * <strong>example:</strong>
     * <p>8522</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The time when the task was last modified, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-12T06:30:33Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5CBF0581-EAE7-1DC4-95C6-A089656A1E2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the publish task. This is a redundant field. We recommend that you use the <code>Id</code> field instead.</p>
     * 
     * <strong>example:</strong>
     * <p>8522</p>
     */
    @NameInMap("Response")
    public String response;

    /**
     * <p>The task status. Valid values:</p>
     * <p><code>FE_RUNNING</code>: in progress, <code>FE_SUCCESS</code>: succeeded, <code>FE_FAILED</code>: failed, <code>FE_ABORTED</code>: aborted.</p>
     * 
     * <strong>example:</strong>
     * <p>FE_ABORTED</p>
     */
    @NameInMap("Status")
    public String status;

    public static CancelPublishTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelPublishTaskResponseBody self = new CancelPublishTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelPublishTaskResponseBody setBizTypeList(java.util.List<String> bizTypeList) {
        this.bizTypeList = bizTypeList;
        return this;
    }
    public java.util.List<String> getBizTypeList() {
        return this.bizTypeList;
    }

    public CancelPublishTaskResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CancelPublishTaskResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public CancelPublishTaskResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CancelPublishTaskResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public CancelPublishTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelPublishTaskResponseBody setResponse(String response) {
        this.response = response;
        return this;
    }
    public String getResponse() {
        return this.response;
    }

    public CancelPublishTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
