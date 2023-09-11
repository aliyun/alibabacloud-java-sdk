// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryAppMetadataRequest extends TeaModel {
    /**
     * <p>The array of meta Ids.</p>
     */
    @NameInMap("MetaIds")
    public String metaIds;

    /**
     * <p>The mata type.</p>
     */
    @NameInMap("MetaType")
    public String metaType;

    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>Log on to the **ARMS console**. In the left-side navigation pane, choose **Browser Monitoring** > **Browser Monitoring**. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is eb4zdose6v%409781be0f44d\*\*\*\*, you must replace %40 with an at sign (@) to obtain eb4zdose6v@9781be0f44d\*\*\*\*.</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static QueryAppMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppMetadataRequest self = new QueryAppMetadataRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppMetadataRequest setMetaIds(String metaIds) {
        this.metaIds = metaIds;
        return this;
    }
    public String getMetaIds() {
        return this.metaIds;
    }

    public QueryAppMetadataRequest setMetaType(String metaType) {
        this.metaType = metaType;
        return this;
    }
    public String getMetaType() {
        return this.metaType;
    }

    public QueryAppMetadataRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public QueryAppMetadataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
