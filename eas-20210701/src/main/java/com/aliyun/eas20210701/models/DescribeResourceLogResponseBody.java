// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceLogResponseBody extends TeaModel {
    // sls日志库
    @NameInMap("LogStore")
    public String logStore;

    // sls日志信息
    @NameInMap("Message")
    public String message;

    // 资源组对应的sls日志管理项目
    @NameInMap("ProjectName")
    public String projectName;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 资源组状态
    @NameInMap("Status")
    public String status;

    public static DescribeResourceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLogResponseBody self = new DescribeResourceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLogResponseBody setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public DescribeResourceLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResourceLogResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeResourceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceLogResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
