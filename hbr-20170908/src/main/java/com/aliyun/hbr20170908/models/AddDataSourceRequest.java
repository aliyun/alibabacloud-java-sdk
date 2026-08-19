// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class AddDataSourceRequest extends TeaModel {
    /**
     * <p>The ID of the client group used to access the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-0004i0nlngorvgjpl7ck</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The connection information for the data source. Examples:</p>
     * <ul>
     * <li><p>Local NAS data source:
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
     * <li><p>CPFS AI-Computing Edition data source:
     * {&quot;vpcMountTarget&quot;:&quot;cpfs-010wn\<em>\</em>\<em>wy-vpc-ta\</em>\*\*8.cn-shanghai.cpfs.aliyuncs.com&quot;,&quot;sharePath&quot;:&quot;/&quot;}</p>
     * </li>
     * <li><p>Other large-scale file system data source:
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
     * <p>The access credential for the data source. This parameter is required for local NAS (SMB) data sources and for OSS- or S3-compatible data sources. Examples:</p>
     * <ul>
     * <li><p>Local NAS data source (SMB protocol):
     * {
     * &quot;mountUsername&quot;: &quot;\<em>\</em>\<em>\</em>\<em>&quot;,
     * &quot;mountPassword&quot;: &quot;\</em>\<em>\</em>\<em>\</em>&quot;
     * }</p>
     * </li>
     * <li><p>OSS-compatible or S3-compatible data source:
     * {
     * &quot;accessKeyId&quot;: &quot;\<em>\</em>\<em>\</em>\<em>&quot;,
     * &quot;accessKeySecret&quot;: &quot;\</em>\<em>\</em>\<em>\</em>&quot;
     * }</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;mountUsername&quot;: &quot;<em><strong><strong>&quot;,
     *     &quot;mountPassword&quot;: &quot;</strong></strong></em>&quot;
     * }</p>
     */
    @NameInMap("Credential")
    public String credential;

    /**
     * <p>The name of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyLocalNas</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>The type of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>COMMON_NAS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>A filter that specifies the files to exclude. This parameter applies only to data source analysis with the archive feature.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/log&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <p>A filter that specifies the files to include. This parameter applies only to data source analysis with the archive feature.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;/home/alice&quot;, &quot;/home/bob&quot;]</p>
     */
    @NameInMap("Include")
    public String include;

    /**
     * <p>The index level. This parameter applies only to data source analysis with the archive feature.</p>
     * <ul>
     * <li><p><code>OFF</code>: No index is created.</p>
     * </li>
     * <li><p><code>META</code>: A metadata index is created.</p>
     * </li>
     * <li><p><code>ALL</code>: A full-text index is created. (Deprecated)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>META</p>
     */
    @NameInMap("IndexLevel")
    public String indexLevel;

    /**
     * <p>The options for data source analysis. This parameter applies only to data source analysis with the archive feature.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>A list of paths for data source analysis. This parameter applies only to data source analysis with the archive feature.</p>
     */
    @NameInMap("Path")
    public java.util.List<String> path;

    /**
     * <p>The execution schedule. This parameter applies only to data source analysis with the archive feature. The format <code>I|{startTime}|{interval}</code> specifies a task that runs at a defined interval starting from <code>{startTime}</code>. <code>{interval}</code> is an ISO 8601 duration. For example, <code>PT1H</code> specifies a one-hour interval, and <code>P1D</code> specifies a one-day interval.</p>
     * 
     * <strong>example:</strong>
     * <p>I|1729493847|P1D</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    /**
     * <p>The rate limiting settings. This parameter applies only to data source analysis with the archive feature.</p>
     * 
     * <strong>example:</strong>
     * <p>6:21:10240</p>
     */
    @NameInMap("SpeedLimit")
    public String speedLimit;

    public static AddDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceRequest self = new AddDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public AddDataSourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddDataSourceRequest setConnectionInfo(String connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }
    public String getConnectionInfo() {
        return this.connectionInfo;
    }

    public AddDataSourceRequest setCredential(String credential) {
        this.credential = credential;
        return this;
    }
    public String getCredential() {
        return this.credential;
    }

    public AddDataSourceRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public AddDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public AddDataSourceRequest setExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }
    public String getExclude() {
        return this.exclude;
    }

    public AddDataSourceRequest setInclude(String include) {
        this.include = include;
        return this;
    }
    public String getInclude() {
        return this.include;
    }

    public AddDataSourceRequest setIndexLevel(String indexLevel) {
        this.indexLevel = indexLevel;
        return this;
    }
    public String getIndexLevel() {
        return this.indexLevel;
    }

    public AddDataSourceRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public AddDataSourceRequest setPath(java.util.List<String> path) {
        this.path = path;
        return this;
    }
    public java.util.List<String> getPath() {
        return this.path;
    }

    public AddDataSourceRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

    public AddDataSourceRequest setSpeedLimit(String speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }
    public String getSpeedLimit() {
        return this.speedLimit;
    }

}
