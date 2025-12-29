// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The name of the SSL certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bpxxxxxxxx.mongodb.rds.aliyuncs.com</p>
     */
    @NameInMap("CertCommonName")
    public String certCommonName;

    @NameInMap("ForceEncryption")
    public String forceEncryption;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36BB1BC2-789C-4BBA-A519-C5B388E4B0D4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the SSL certificate expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in Coordinated Universal Time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-11T02:28:25Z</p>
     */
    @NameInMap("SSLExpiredTime")
    public String SSLExpiredTime;

    /**
     * <p>The status of the SSL feature. Valid values:</p>
     * <ul>
     * <li><strong>Open</strong>: The SSL feature is enabled.</li>
     * <li><strong>Closed</strong>: The SSL feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Open</p>
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

    public DescribeDBInstanceSSLResponseBody setForceEncryption(String forceEncryption) {
        this.forceEncryption = forceEncryption;
        return this;
    }
    public String getForceEncryption() {
        return this.forceEncryption;
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
