// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSlsLogstoreInfoResponseBody extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Quota")
    public Long quota;

    @NameInMap("LogStore")
    public String logStore;

    @NameInMap("Used")
    public Long used;

    @NameInMap("Ttl")
    public Integer ttl;

    public static DescribeSlsLogstoreInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsLogstoreInfoResponseBody self = new DescribeSlsLogstoreInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlsLogstoreInfoResponseBody setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DescribeSlsLogstoreInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlsLogstoreInfoResponseBody setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

    public DescribeSlsLogstoreInfoResponseBody setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public DescribeSlsLogstoreInfoResponseBody setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

    public DescribeSlsLogstoreInfoResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
