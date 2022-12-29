// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    // The name of the SSL certificate.
    @NameInMap("CertCommonName")
    public String certCommonName;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The time when the SSL certificate expires. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
    @NameInMap("SSLExpiredTime")
    public String SSLExpiredTime;

    // The status of the SSL feature. Valid values:
    // 
    // *   **Open**: The SSL feature is enabled.
    // *   **Closed**: The SSL feature is disabled.
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
