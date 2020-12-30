// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClusterADDomainResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("TaskFinished")
    public Boolean taskFinished;

    @NameInMap("IsSupported")
    public Boolean isSupported;

    @NameInMap("DomainDnsIp")
    public String domainDnsIp;

    public static DescribeClusterADDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterADDomainResponseBody self = new DescribeClusterADDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterADDomainResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeClusterADDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterADDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeClusterADDomainResponseBody setTaskFinished(Boolean taskFinished) {
        this.taskFinished = taskFinished;
        return this;
    }
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

    public DescribeClusterADDomainResponseBody setIsSupported(Boolean isSupported) {
        this.isSupported = isSupported;
        return this;
    }
    public Boolean getIsSupported() {
        return this.isSupported;
    }

    public DescribeClusterADDomainResponseBody setDomainDnsIp(String domainDnsIp) {
        this.domainDnsIp = domainDnsIp;
        return this;
    }
    public String getDomainDnsIp() {
        return this.domainDnsIp;
    }

}
