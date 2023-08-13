// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeRuleListRequest extends TeaModel {
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
     * <p>>  If your instances reside in the regions in the Chinese mainland, set this parameter to **cn-china**.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("TagNames")
    public String tagNames;

    public static GetQueryOptimizeRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeRuleListRequest self = new GetQueryOptimizeRuleListRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeRuleListRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeRuleListRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetQueryOptimizeRuleListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetQueryOptimizeRuleListRequest setTagNames(String tagNames) {
        this.tagNames = tagNames;
        return this;
    }
    public String getTagNames() {
        return this.tagNames;
    }

}
