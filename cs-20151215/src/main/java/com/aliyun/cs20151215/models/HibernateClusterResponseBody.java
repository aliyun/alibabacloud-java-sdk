// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class HibernateClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>49511F2D-D56A-5C24-B9AE-C8491E09B***</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>T-67d7ec016ce37c0106000***</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static HibernateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HibernateClusterResponseBody self = new HibernateClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public HibernateClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HibernateClusterResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
