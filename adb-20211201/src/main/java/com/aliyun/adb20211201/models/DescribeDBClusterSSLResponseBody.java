// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterSSLResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>amv-*********.ads.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <strong>example:</strong>
     * <p>2022-10-11T08:16:43Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>348303D8-6F42-5141-9B00-A6EECA1E37B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
