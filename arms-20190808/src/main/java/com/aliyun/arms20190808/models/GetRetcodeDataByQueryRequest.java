// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeDataByQueryRequest extends TeaModel {
    /**
     * <p>The time when the query starts. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("From")
    public Long from;

    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>Log on to the **ARMS console**. In the left-side navigation pane, choose **Browser Monitoring** > **Browser Monitoring**. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is eb4zdose6v%409781be0f44d\*\*\*\*, you must replace %40 with an at sign (@) to obtain eb4zdose6v@9781be0f44d\*\*\*\*.</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The query statement that conforms to the query syntax of the Log Service Logstore.</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The ID of the region in which the application is located.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The time when the query ends. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("To")
    public Long to;

    public static GetRetcodeDataByQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeDataByQueryRequest self = new GetRetcodeDataByQueryRequest();
        return TeaModel.build(map, self);
    }

    public GetRetcodeDataByQueryRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetRetcodeDataByQueryRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetRetcodeDataByQueryRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetRetcodeDataByQueryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRetcodeDataByQueryRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
