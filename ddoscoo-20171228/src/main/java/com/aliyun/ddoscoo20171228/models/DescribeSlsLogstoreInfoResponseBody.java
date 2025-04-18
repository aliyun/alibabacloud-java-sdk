// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSlsLogstoreInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ddoscoo-logstore</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <strong>example:</strong>
     * <p>ddoscoo-project-xxxx-cn-hangzhou</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <strong>example:</strong>
     * <p>5497558138880</p>
     */
    @NameInMap("Quota")
    public Long quota;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Used")
    public Long used;

    public static DescribeSlsLogstoreInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsLogstoreInfoResponseBody self = new DescribeSlsLogstoreInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlsLogstoreInfoResponseBody setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public DescribeSlsLogstoreInfoResponseBody setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DescribeSlsLogstoreInfoResponseBody setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

    public DescribeSlsLogstoreInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlsLogstoreInfoResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public DescribeSlsLogstoreInfoResponseBody setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

}
