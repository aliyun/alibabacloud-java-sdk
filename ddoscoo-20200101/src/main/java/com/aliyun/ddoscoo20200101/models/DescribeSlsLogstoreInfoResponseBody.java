// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSlsLogstoreInfoResponseBody extends TeaModel {
    /**
     * <p>The Logstore of the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The Logstore project of the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     */
    @NameInMap("Project")
    public String project;

    /**
     * <p>The available log storage capacity. Unit: bytes.</p>
     */
    @NameInMap("Quota")
    public Long quota;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The log storage duration. Unit: days.</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The used log storage capacity. Unit: bytes.</p>
     * <br>
     * <p>> The statistics on Log Service are delayed for about two hours.</p>
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
