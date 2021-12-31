// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    @NameInMap("CertCommonName")
    public String certCommonName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SSLExpiredTime")
    public String SSLExpiredTime;

    @NameInMap("SSLStatus")
    public String SSLStatus;

    public static DescribeDBInstanceSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSSLResponseBody self = new DescribeDBInstanceSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSSLResponseBody setCertCommonName(String certCommonName) {
        this.certCommonName = certCommonName;
        return this;
    }
    public String getCertCommonName() {
        return this.certCommonName;
    }

    public DescribeDBInstanceSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceSSLResponseBody setSSLExpiredTime(String SSLExpiredTime) {
        this.SSLExpiredTime = SSLExpiredTime;
        return this;
    }
    public String getSSLExpiredTime() {
        return this.SSLExpiredTime;
    }

    public DescribeDBInstanceSSLResponseBody setSSLStatus(String SSLStatus) {
        this.SSLStatus = SSLStatus;
        return this;
    }
    public String getSSLStatus() {
        return this.SSLStatus;
    }

}
