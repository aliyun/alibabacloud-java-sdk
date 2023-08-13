// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataTrendRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time, but not later than 00:00:00 (UTC+8) on the current day.</p>
     */
    @NameInMap("End")
    public String end;

    /**
     * <p>The database engine. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **PolarDBMySQL**</p>
     * <p>*   **PostgreSQL**</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance IDs. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The region in which the instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-china**: Chinese mainland.</p>
     * <p>*   **cn-hongkong**: China (Hong Kong).</p>
     * <p>*   **ap-southeast-1**: Singapore.</p>
     * <br>
     * <p>This parameter takes effect only if **InstanceIds** is left empty. If you leave **InstanceIds** empty, the system obtains data from the region specified by **Region**. By default, Region is set to **cn-china**. If you specify **InstanceIds**, **Region** does not take effect and the system obtains data from the region in which the first specified instance resides.****</p>
     * <br>
     * <p>>  If your instances reside in the regions inside the Chinese mainland, set this parameter to **cn-china**.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  You can specify a start time up to two months earlier than the current time.</p>
     */
    @NameInMap("Start")
    public String start;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("TagNames")
    public String tagNames;

    public static GetQueryOptimizeDataTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeDataTrendRequest self = new GetQueryOptimizeDataTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeDataTrendRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public GetQueryOptimizeDataTrendRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeDataTrendRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetQueryOptimizeDataTrendRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQueryOptimizeDataTrendRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public GetQueryOptimizeDataTrendRequest setTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public String getTagNames() {
        return this.tagNames;
    }

}
