// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteVerifyInfoResponseBody extends TeaModel {
    @NameInMap("Cname")
    public String cname;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("HostFile")
    public String hostFile;

    @NameInMap("IndexPage")
    public String indexPage;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VerifyMethod")
    public String verifyMethod;

    public static DescribeWebsiteVerifyInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteVerifyInfoResponseBody self = new DescribeWebsiteVerifyInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteVerifyInfoResponseBody setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public DescribeWebsiteVerifyInfoResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeWebsiteVerifyInfoResponseBody setHostFile(String hostFile) {
        this.hostFile = hostFile;
        return this;
    }
    public String getHostFile() {
        return this.hostFile;
    }

    public DescribeWebsiteVerifyInfoResponseBody setIndexPage(String indexPage) {
        this.indexPage = indexPage;
        return this;
    }
    public String getIndexPage() {
        return this.indexPage;
    }

    public DescribeWebsiteVerifyInfoResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeWebsiteVerifyInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebsiteVerifyInfoResponseBody setVerifyMethod(String verifyMethod) {
        this.verifyMethod = verifyMethod;
        return this;
    }
    public String getVerifyMethod() {
        return this.verifyMethod;
    }

}
