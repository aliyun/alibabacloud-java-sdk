// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataTopRequest extends TeaModel {
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
     * <p>*   **cn-china**: Chinese mainland</p>
     * <p>*   **cn-hongkong**: China (Hong Kong)</p>
     * <p>*   **ap-southeast-1**: Singapore</p>
     * <br>
     * <p>This parameter takes effect only if **InstanceIds** is left empty. If you leave **InstanceIds** empty, the system obtains data from the region set by **Region**. By default, Region is set to **cn-china**. If you specify **InstanceIds**, **Region** does not take effect and the system obtains data from the region in which the first specified instance resides.****</p>
     * <br>
     * <p>>  Set this parameter to **cn-china** for all your instances that reside in the regions in the Chinese mainland.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("TagNames")
    public String tagNames;

    /**
     * <p>The time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("Time")
    public String time;

    /**
     * <p>The type of instances that you want to query. Valid values:</p>
     * <br>
     * <p>*   **RED**: the best-performing instances</p>
     * <p>*   **BLACK**: the worst-performing instances</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetQueryOptimizeDataTopRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeDataTopRequest self = new GetQueryOptimizeDataTopRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeDataTopRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeDataTopRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetQueryOptimizeDataTopRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQueryOptimizeDataTopRequest setTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public String getTagNames() {
        return this.tagNames;
    }

    public GetQueryOptimizeDataTopRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public GetQueryOptimizeDataTopRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
