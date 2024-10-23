// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterSSLResponseBody extends TeaModel {
    /**
     * <p>The endpoint that is protected by SSL encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>am-d7oualxo05x4o5be872***.ads.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The time when the SSL certificate expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-11T08:16:43Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>348303D8-6F42-5141-9B00-A6EECA1E37B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SSLEnabled")
    public Boolean SSLEnabled;

    public static DescribeDBClusterSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterSSLResponseBody self = new DescribeDBClusterSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterSSLResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public DescribeDBClusterSSLResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDBClusterSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterSSLResponseBody setSSLEnabled(Boolean SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

}
