// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeRuleListRequest extends TeaModel {
    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>PolarDBMySQL</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance IDs. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The region in which the instance resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-china</strong>: Chinese mainland</li>
     * <li><strong>cn-hongkong</strong>: China (Hong Kong)</li>
     * <li><strong>ap-southeast-1</strong>: Singapore</li>
     * </ul>
     * <p>This parameter takes effect only if <strong>InstanceIds</strong> is left empty. If you leave <strong>InstanceIds</strong> empty, the system obtains data from the region set by <strong>Region</strong>. By default, Region is set to <strong>cn-china</strong>. If you specify <strong>InstanceIds</strong>, <strong>Region</strong> does not take effect and the system obtains data from the region in which the first specified instance resides.****</p>
     * <blockquote>
     * <p> If your instances reside in the regions in the Chinese mainland, set this parameter to <strong>cn-china</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-china</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
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
