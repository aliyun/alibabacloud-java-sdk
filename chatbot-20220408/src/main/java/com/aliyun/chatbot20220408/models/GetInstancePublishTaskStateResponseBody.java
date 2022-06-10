// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetInstancePublishTaskStateResponseBody extends TeaModel {
    // 业务类型列表
    @NameInMap("BizTypeList")
    public java.util.List<String> bizTypeList;

    // 任务创建的 UTC 时间
    @NameInMap("CreateTime")
    public String createTime;

    // job失败信息
    @NameInMap("Error")
    public String error;

    // 各子发布模块的错误信息，key是子发布模块，value是错误信息
    @NameInMap("Errors")
    public java.util.Map<String, ?> errors;

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

    // 各子发布模块的警告信息，key是子发布模块，value是警告信息
    @NameInMap("Warnings")
    public java.util.Map<String, ?> warnings;

    public static GetInstancePublishTaskStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstancePublishTaskStateResponseBody self = new GetInstancePublishTaskStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstancePublishTaskStateResponseBody setBizTypeList(java.util.List<String> bizTypeList) {
        this.bizTypeList = bizTypeList;
        return this;
    }
    public java.util.List<String> getBizTypeList() {
        return this.bizTypeList;
    }

    public GetInstancePublishTaskStateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetInstancePublishTaskStateResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public GetInstancePublishTaskStateResponseBody setErrors(java.util.Map<String, ?> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.Map<String, ?> getErrors() {
        return this.errors;
    }

    public GetInstancePublishTaskStateResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetInstancePublishTaskStateResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public GetInstancePublishTaskStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstancePublishTaskStateResponseBody setResponse(String response) {
        this.response = response;
        return this;
    }
    public String getResponse() {
        return this.response;
    }

    public GetInstancePublishTaskStateResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetInstancePublishTaskStateResponseBody setWarnings(java.util.Map<String, ?> warnings) {
        this.warnings = warnings;
        return this;
    }
    public java.util.Map<String, ?> getWarnings() {
        return this.warnings;
    }

}
