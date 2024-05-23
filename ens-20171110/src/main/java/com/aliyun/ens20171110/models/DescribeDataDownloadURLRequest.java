// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDownloadURLRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the data file.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataName")
    public String dataName;

    /**
     * <p>The version number of the data file.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataVersion")
    public String dataVersion;

    /**
     * <p>This parameter is reserved.</p>
     */
    @NameInMap("ExpireTimeout")
    public Long expireTimeout;

    /**
     * <p>The condition that you want to use to filter file servers. You can specify multiple canary release policies. By default, all resources are queried.</p>
     */
    @NameInMap("ServerFilterStrategy")
    public String serverFilterStrategy;

    public static DescribeDataDownloadURLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataDownloadURLRequest self = new DescribeDataDownloadURLRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataDownloadURLRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeDataDownloadURLRequest setDataName(String dataName) {
        this.dataName = dataName;
        return this;
    }
    public String getDataName() {
        return this.dataName;
    }

    public DescribeDataDownloadURLRequest setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
        return this;
    }
    public String getDataVersion() {
        return this.dataVersion;
    }

    public DescribeDataDownloadURLRequest setExpireTimeout(Long expireTimeout) {
        this.expireTimeout = expireTimeout;
        return this;
    }
    public Long getExpireTimeout() {
        return this.expireTimeout;
    }

    public DescribeDataDownloadURLRequest setServerFilterStrategy(String serverFilterStrategy) {
        this.serverFilterStrategy = serverFilterStrategy;
        return this;
    }
    public String getServerFilterStrategy() {
        return this.serverFilterStrategy;
    }

}
