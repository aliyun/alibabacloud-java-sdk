// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    /**
     * <p>The name of the SSL certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>*.gpdbmaster.xxx.rds.aliyuncs.com</p>
     */
    @NameInMap("CertCommonName")
    public String certCommonName;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D5FF8636-37F6-4CE0-8002-F8734C62C686</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether SSL encryption is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SSLEnabled")
    public Boolean SSLEnabled;

    /**
     * <p>The expiration time of the SSL certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-05T09:05:53Z</p>
     */
    @NameInMap("SSLExpiredTime")
    public String SSLExpiredTime;

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

    public DescribeDBInstanceSSLResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceSSLResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeDBInstanceSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceSSLResponseBody setSSLEnabled(Boolean SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

    public DescribeDBInstanceSSLResponseBody setSSLExpiredTime(String SSLExpiredTime) {
        this.SSLExpiredTime = SSLExpiredTime;
        return this;
    }
    public String getSSLExpiredTime() {
        return this.SSLExpiredTime;
    }

}
