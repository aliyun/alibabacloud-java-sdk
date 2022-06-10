// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CancelPublishTaskResponseBody extends TeaModel {
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
