// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The name of the SSL certificate.</p>
     */
    @NameInMap("CertCommonName")
    public String certCommonName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the SSL certificate expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in Coordinated Universal Time (UTC).</p>
     */
    @NameInMap("SSLExpiredTime")
    public String SSLExpiredTime;

    /**
     * <p>The status of the SSL feature. Valid values:</p>
     * <br>
     * <p>*   **Open**: The SSL feature is enabled.</p>
     * <p>*   **Closed**: The SSL feature is disabled.</p>
     */
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
