// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreatePublishTaskResponseBody extends TeaModel {
    // 业务类型列表
    @NameInMap("BizTypeList")
    public java.util.List<String> bizTypeList;

    // 任务创建的 UTC 时间
    @NameInMap("CreateTime")
    public String createTime;

    // job失败信息
    @NameInMap("Error")
    public String error;

    // 任务Id
    @NameInMap("Id")
    public Long id;

    // 任务修改的 UTC 时间
    @NameInMap("ModifyTime")
    public String modifyTime;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 任务Id
    @NameInMap("Response")
    public String response;

    // 任务状态
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
