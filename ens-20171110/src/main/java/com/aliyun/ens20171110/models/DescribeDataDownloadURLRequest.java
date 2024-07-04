// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDownloadURLRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>474bdef0-d149-4695-abfb-52912d9143f0</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the data file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mirror_file/pk-1642597182026-878199448832413.tar</p>
     */
    @NameInMap("DataName")
    public String dataName;

    /**
     * <p>The version number of the data file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7895</p>
     */
    @NameInMap("DataVersion")
    public String dataVersion;

    /**
     * <p>This parameter is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("ExpireTimeout")
    public Long expireTimeout;

    /**
     * <p>The condition that you want to use to filter file servers. You can specify multiple canary release policies. By default, all resources are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;name\&quot;: \&quot;ScheduleToRegionId\&quot;,\&quot;parameters\&quot;:{\&quot;operator\&quot;: \&quot;In\&quot;,\&quot;values\&quot;: [\&quot;cn-shijiazhuang-telecom_unicom_cmcc\&quot;]}}</p>
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
