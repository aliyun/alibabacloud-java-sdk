// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceLogResponseBody extends TeaModel {
    /**
     * <p>The Logstore of Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>access_log</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Network interfaces are updating</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The Log Service project that is associated with the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-asdasdasd-sls</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>ResourceReady</p>
     */
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
