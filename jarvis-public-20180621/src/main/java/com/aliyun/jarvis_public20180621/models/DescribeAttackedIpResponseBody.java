// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeAttackedIpResponseBody extends TeaModel {
    @NameInMap("IpList")
    public java.util.List<String> ipList;

    @NameInMap("Module")
    public String module;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAttackedIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackedIpResponseBody self = new DescribeAttackedIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAttackedIpResponseBody setIpList(java.util.List<String> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<String> getIpList() {
        return this.ipList;
    }

    public DescribeAttackedIpResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribeAttackedIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
