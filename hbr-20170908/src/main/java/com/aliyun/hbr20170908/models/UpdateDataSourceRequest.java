// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UpdateDataSourceRequest extends TeaModel {
    /**
     * <p>The ID of the client group used to access the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-000**************hg9</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The connection information for the data source. Examples:</p>
     * <ul>
     * <li><p>On-premises NAS data source:
     * {
     * &quot;dataServerAddresses&quot;: [
     * {
     * &quot;host&quot;: &quot;123.123.123.123&quot;,
     * &quot;port&quot;: &quot;8080&quot;
     * }
     * ],
     * &quot;sharePath&quot;: &quot;/share&quot;,
     * &quot;mountOptions&quot;: &quot;vers=3&quot;,
     * &quot;fileSystemType&quot;: &quot;nfs&quot;
     * }</p>
     * </li>
     * <li><p>Intelligent Computing CPFS data source:
     * {&quot;vpcMountTarget&quot;:&quot;cpfs-010wn\<em>\</em>\<em>wy-vpc-ta\</em>\*\*8.cn-shanghai.cpfs.aliyuncs.com&quot;,&quot;sharePath&quot;:&quot;/&quot;}</p>
     * </li>
     * <li><p>Other large-scale file system data sources:
     * {&quot;path&quot;:&quot;/mnt&quot;}</p>
     * </li>
     * </ul>
     * 
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
     * <p>The access credentials for the data source. This parameter is used for on-premises NAS data sources that use the SMB protocol, and for OSS and S3 protocol-compatible data sources. Examples:</p>
     * <ul>
     * <li><p>On-premises NAS data source (SMB protocol):
     * {
     * &quot;mountUsername&quot;: &quot;\<em>\</em>\<em>\</em>\<em>&quot;,
     * &quot;mountPassword&quot;: &quot;\</em>\<em>\</em>\<em>\</em>&quot;
     * }</p>
     * </li>
     * <li><p>OSS protocol-compatible data source/S3 protocol-compatible data source:
     * {
     * &quot;accessKeyId&quot;: &quot;\<em>\</em>\<em>\</em>\<em>&quot;,
     * &quot;accessKeySecret&quot;: &quot;\</em>\<em>\</em>\<em>\</em>&quot;
     * }</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;mountUsername&quot;:&quot;<em><strong>&quot;,&quot;mountPassword&quot;:&quot;</strong></em>&quot;}</p>
     */
    @NameInMap("Credential")
    public String credential;

    /**
     * <p>The ID of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-0006xo****dtle</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>MyLocalNas</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>A filter to specify which files to exclude. This parameter applies only to the archive feature.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/log/&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>A filter to specify which files to include. This parameter applies only to the archive feature.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/&quot;, &quot;/home/bob/&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>The index level for data source analysis. This parameter applies only to the archive feature.</p>
     * <ul>
     * <li><p>OFF: No index is created.</p>
     * </li>
     * <li><p>META: A metadata index is created.</p>
     * </li>
     * <li><p>ALL: A full-text index is created. (Deprecated)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>META</p>
     */
    @NameInMap("IndexLevel")
    public String indexLevel;

    /**
     * <p>The options for data source analysis. This parameter applies only to the archive feature.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>A list of paths for data source analysis. This parameter applies only to the archive feature.</p>
     */
    @NameInMap("Path")
    public java.util.List<String> path;

    /**
     * <p>The schedule for data source analysis. This parameter applies only to the archive feature. The format is <code>I|{startTime}|{interval}</code>. This specifies a task that starts at <code>{startTime}</code> and repeats at the specified <code>{interval}</code>. <code>startTime</code> is a Unix time value in seconds. <code>interval</code> is an ISO 8601 time interval. For example, <code>PT1H</code> indicates a one-hour interval, and <code>P1D</code> indicates a one-day interval.</p>
     * 
     * <strong>example:</strong>
     * <p>I|1729493847|P1D</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    /**
     * <p>The rate limiting configuration for data source analysis. This parameter applies only to the archive feature.</p>
     * 
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
