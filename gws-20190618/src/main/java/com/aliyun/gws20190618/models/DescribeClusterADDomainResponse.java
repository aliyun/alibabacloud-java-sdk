// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClusterADDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsSupported")
    @Validation(required = true)
    public Boolean isSupported;

    @NameInMap("TaskFinished")
    @Validation(required = true)
    public Boolean taskFinished;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("DomainDnsIp")
    @Validation(required = true)
    public String domainDnsIp;

    public static DescribeClusterADDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterADDomainResponse self = new DescribeClusterADDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterADDomainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterADDomainResponse setIsSupported(Boolean isSupported) {
        this.isSupported = isSupported;
        return this;
    }
    public Boolean getIsSupported() {
        return this.isSupported;
    }

    public DescribeClusterADDomainResponse setTaskFinished(Boolean taskFinished) {
        this.taskFinished = taskFinished;
        return this;
    }
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

    public DescribeClusterADDomainResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeClusterADDomainResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeClusterADDomainResponse setDomainDnsIp(String domainDnsIp) {
        this.domainDnsIp = domainDnsIp;
        return this;
    }
    public String getDomainDnsIp() {
        return this.domainDnsIp;
    }

}
