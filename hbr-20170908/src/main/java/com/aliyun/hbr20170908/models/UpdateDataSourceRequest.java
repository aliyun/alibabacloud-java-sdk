// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateDataSourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cl-000**************hg9</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;dataServerAddresses&quot;: [
     *         {
     *             &quot;host&quot;: &quot;123.123.123.123&quot;,
     *             &quot;port&quot;: &quot;8080&quot;
     *         }
     *     ],
     *     &quot;sharePath&quot;: &quot;/share&quot;,
     *     &quot;mountOptions&quot;: &quot;vers=3&quot;,
     *     &quot;fileSystemType&quot;: &quot;nfs&quot;
     * }</p>
     */
    @NameInMap("ConnectionInfo")
    public String connectionInfo;

    /**
     * <strong>example:</strong>
     * <p>{&quot;mountUsername&quot;:&quot;<em><strong>&quot;,&quot;mountPassword&quot;:&quot;</strong></em>&quot;}</p>
     */
    @NameInMap("Credential")
    public String credential;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-0006xo****dtle</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>MyLocalNas</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/log/&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/&quot;, &quot;/home/bob/&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <strong>example:</strong>
     * <p>META</p>
     */
    @NameInMap("IndexLevel")
    public String indexLevel;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Options")
    public String options;

    @NameInMap("Path")
    public java.util.List<String> path;

    /**
     * <strong>example:</strong>
     * <p>I|1729493847|P1D</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    /**
     * <strong>example:</strong>
     * <p>0:24:102400</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

    public static UpdateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceRequest self = new UpdateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateDataSourceRequest setConnectionInfo(String connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }
    public String getConnectionInfo() {
        return this.connectionInfo;
    }

    public UpdateDataSourceRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public UpdateDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdateDataSourceRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public UpdateDataSourceRequest setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }
    public String getExclude() {
        return this.exclude;
    }

    public UpdateDataSourceRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
    }

    public UpdateDataSourceRequest setIndexLevel(String indexLevel) {
        this.indexLevel = indexLevel;
        return this;
    }
    public String getIndexLevel() {
        return this.indexLevel;
    }

    public UpdateDataSourceRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public UpdateDataSourceRequest setPath(java.util.List<String> path) {
        this.path = path;
        return this;
    }
    public java.util.List<String> getPath() {
        return this.path;
    }

    public UpdateDataSourceRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

    public UpdateDataSourceRequest setSpeedLimit(String speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }
    public String getSpeedLimit() {
        return this.speedLimit;
    }

}
