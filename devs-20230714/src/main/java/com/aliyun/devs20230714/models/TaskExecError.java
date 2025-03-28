// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TaskExecError extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AccessDenied</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>部署辅助函数权限不足，需要添加额外的权限以解决问题。<a href="https://help.aliyun.com">https://help.aliyun.com</a></p>
     */
    @NameInMap("extraInfo")
    public String extraInfo;

    /**
     * <strong>example:</strong>
     * <p>部署服务[_appcenter-xxx]失败，权限不足</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1-26d1287xxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>权限不足错误</p>
     */
    @NameInMap("title")
    public String title;

    public static TaskExecError build(java.util.Map<String, ?> map) throws Exception {
        TaskExecError self = new TaskExecError();
        return TeaModel.build(map, self);
    }

    public TaskExecError setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TaskExecError setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public TaskExecError setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskExecError setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaskExecError setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
