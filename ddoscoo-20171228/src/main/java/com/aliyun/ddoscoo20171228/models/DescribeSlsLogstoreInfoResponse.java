// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSlsLogstoreInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Quota")
    @Validation(required = true)
    public Long quota;

    @NameInMap("LogStore")
    @Validation(required = true)
    public String logStore;

    @NameInMap("Used")
    @Validation(required = true)
    public Long used;

    @NameInMap("Project")
    @Validation(required = true)
    public String project;

    @NameInMap("Ttl")
    @Validation(required = true)
    public Integer ttl;

    public static DescribeSlsLogstoreInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsLogstoreInfoResponse self = new DescribeSlsLogstoreInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsLogstoreInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlsLogstoreInfoResponse setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

    public DescribeSlsLogstoreInfoResponse setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public DescribeSlsLogstoreInfoResponse setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

    public DescribeSlsLogstoreInfoResponse setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DescribeSlsLogstoreInfoResponse setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
