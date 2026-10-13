// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreatePublishTaskResponseBody extends TeaModel {
    /**
     * <p>The list of business types.</p>
     */
    @NameInMap("BizTypeList")
    public java.util.List<String> bizTypeList;

    /**
     * <p>The UTC time when the task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-12T06:30:17Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The task failure information.</p>
     * 
     * <strong>example:</strong>
     * <p>An error occurred while checking whether the module to be published is idle, faq</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <p>The publish task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8522</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The UTC time when the task was last modified.</p>
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
     * <p>The publish task ID. This is a redundant field. Use the publish task ID from the Id field instead.</p>
     * 
     * <strong>example:</strong>
     * <p>8522</p>
     */
    @NameInMap("Response")
    public String response;

    /**
     * <p>The task status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>FE_RUNNING: Publishing in progress.</li>
     * <li>FE_SUCCESS: Published.</li>
     * <li>FE_FAILED: Publish failed.</li>
     * <li>FE_ABORTED: Publish canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FE_RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreatePublishTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishTaskResponseBody self = new CreatePublishTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePublishTaskResponseBody setBizTypeList(java.util.List<String> bizTypeList) {
        this.bizTypeList = bizTypeList;
        return this;
    }
    public java.util.List<String> getBizTypeList() {
        return this.bizTypeList;
    }

    public CreatePublishTaskResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreatePublishTaskResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public CreatePublishTaskResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreatePublishTaskResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public CreatePublishTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePublishTaskResponseBody setResponse(String response) {
        this.response = response;
        return this;
    }
    public String getResponse() {
        return this.response;
    }

    public CreatePublishTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
