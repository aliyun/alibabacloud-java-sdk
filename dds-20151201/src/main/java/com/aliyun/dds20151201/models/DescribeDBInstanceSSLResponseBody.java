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

    /**
     * <p>Specifies whether connections must be encrypted using SSL. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Connections must be encrypted using SSL.</p>
     * </li>
     * <li><p><strong>0</strong>: Connections do not need to be encrypted using SSL.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
     * <p>The expiration time of the SSL certificate. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format and is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-11T02:28:25Z</p>
     */
    @NameInMap("SSLExpiredTime")
    public String SSLExpiredTime;

    /**
     * <p>The status of the SSL feature.</p>
     * <ul>
     * <li><p><strong>Open</strong>: The SSL feature is enabled.</p>
     * </li>
     * <li><p><strong>Closed</strong>: The SSL feature is disabled.</p>
     * </li>
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
