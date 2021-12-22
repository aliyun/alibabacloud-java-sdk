// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDownloadURLRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DataName")
    public String dataName;

    @NameInMap("DataVersion")
    public String dataVersion;

    @NameInMap("ExpireTimeout")
    public Long expireTimeout;

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
