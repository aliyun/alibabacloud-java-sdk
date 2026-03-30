// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class AddDataSourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cl-0004i0nlngorvgjpl7ck</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;dataServerAddresses\&quot;:[{\&quot;host\&quot;:\&quot;111\&quot;,\&quot;port\&quot;:\&quot;\&quot;}],\&quot;sharePath\&quot;:\&quot;/share\&quot;,\&quot;mountOptions\&quot;:\&quot;\&quot;,\&quot;fileSystemType\&quot;:\&quot;nfs\&quot;}</p>
     */
    @NameInMap("ConnectionInfo")
    public String connectionInfo;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Credential")
    public String credential;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbr_detection_source-nas-20250710101315</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>COMMON_NAS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <strong>example:</strong>
     * <p>[&quot;/var&quot;, &quot;/proc&quot;]</p>
     */
    @NameInMap("Exclude")
    public String exclude;

    /**
     * <strong>example:</strong>
     * <p>[&quot;/home/alice/<em>.pdf&quot;, &quot;/home/bob/</em>.txt&quot;]</p>
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
     * <p>{\&quot;includes\&quot;:[],\&quot;excludes\&quot;:[],\&quot;conflictPolicy\&quot;:\&quot;OVERWRITE_EXISTING\&quot;}</p>
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
     * <p>0:24:5120</p>
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
