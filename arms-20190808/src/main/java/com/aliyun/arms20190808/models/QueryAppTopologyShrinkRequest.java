// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryAppTopologyShrinkRequest extends TeaModel {
    /**
     * <p>The application type</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The database domain name.</p>
     */
    @NameInMap("Db")
    public String db;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public String filtersShrink;

    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>Log on to the **ARMS console**. In the left-side navigation pane, choose **Browser Monitoring** > **Browser Monitoring**. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is eb4zdose6v%409781be0f44d\*\*\*\*, you must replace %40 with an at sign (@) to obtain eb4zdose6v@9781be0f44d\*\*\*\*.</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>RPC interface name.</p>
     */
    @NameInMap("Rpc")
    public String rpc;

    /**
     * <p>The start of the time range to query. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The type kind of topology.</p>
     */
    @NameInMap("Type")
    public String type;

    public static QueryAppTopologyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppTopologyShrinkRequest self = new QueryAppTopologyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppTopologyShrinkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public QueryAppTopologyShrinkRequest setDb(String db) {
        this.db = db;
        return this;
    }
    public String getDb() {
        return this.db;
    }

    public QueryAppTopologyShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public QueryAppTopologyShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryAppTopologyShrinkRequest setFiltersShrink(String filtersShrink) {
        this.filtersShrink = filtersShrink;
        return this;
    }
    public String getFiltersShrink() {
        return this.filtersShrink;
    }

    public QueryAppTopologyShrinkRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public QueryAppTopologyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryAppTopologyShrinkRequest setRpc(String rpc) {
        this.rpc = rpc;
        return this;
    }
    public String getRpc() {
        return this.rpc;
    }

    public QueryAppTopologyShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryAppTopologyShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
