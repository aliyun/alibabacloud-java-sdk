// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryAppTopologyRequest extends TeaModel {
    /**
     * <p>The application type</p>
     * 
     * <strong>example:</strong>
     * <p>TRACE</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The database domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-xxx.mysql.rds.aliyuncs.com:3306</p>
     */
    @NameInMap("Db")
    public String db;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>orders</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1671952708499</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.Map<String, String> filters;

    /**
     * <p>The ID of the application.</p>
     * <p>Log on to the <strong>ARMS console</strong>. In the left-side navigation pane, choose <strong>Browser Monitoring</strong> &gt; <strong>Browser Monitoring</strong>. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is eb4zdose6v%409781be0f44d\<em>\</em>\<em>\</em>, you must replace %40 with an at sign (@) to obtain eb4zdose6v@9781be0f44d\<em>\</em>\<em>\</em>.</p>
     * 
     * <strong>example:</strong>
     * <p>atc889zkcf@d8deedfa9bf****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>RPC interface name.</p>
     * 
     * <strong>example:</strong>
     * <p>/eventCenter</p>
     */
    @NameInMap("Rpc")
    public String rpc;

    /**
     * <p>The start of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1595568910000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The type kind of topology.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apm_apps_v2</p>
     */
    @NameInMap("Type")
    public String type;

    public static QueryAppTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppTopologyRequest self = new QueryAppTopologyRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppTopologyRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public QueryAppTopologyRequest setDb(String db) {
        this.db = db;
        return this;
    }
    public String getDb() {
        return this.db;
    }

    public QueryAppTopologyRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public QueryAppTopologyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryAppTopologyRequest setFilters(java.util.Map<String, String> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.Map<String, String> getFilters() {
        return this.filters;
    }

    public QueryAppTopologyRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public QueryAppTopologyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryAppTopologyRequest setRpc(String rpc) {
        this.rpc = rpc;
        return this;
    }
    public String getRpc() {
        return this.rpc;
    }

    public QueryAppTopologyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryAppTopologyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
