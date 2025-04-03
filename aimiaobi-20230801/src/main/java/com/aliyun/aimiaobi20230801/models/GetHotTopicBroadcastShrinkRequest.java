// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetHotTopicBroadcastShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CalcTotalToken")
    public Boolean calcTotalToken;

    /**
     * <strong>example:</strong>
     * <p>分类筛选</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <strong>example:</strong>
     * <p>2024-10-11_13</p>
     */
    @NameInMap("HotTopicVersion")
    public String hotTopicVersion;

    @NameInMap("LocationQuery")
    public String locationQuery;

    @NameInMap("Locations")
    public String locationsShrink;

    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Size")
    public Integer size;

    @NameInMap("StepForCustomSummaryStyleConfig")
    public String stepForCustomSummaryStyleConfigShrink;

    @NameInMap("StepForNewsBroadcastContentConfig")
    public String stepForNewsBroadcastContentConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>[&quot;主题1&quot;,&quot;主题2&quot;]</p>
     */
    @NameInMap("Topics")
    public String topicsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetHotTopicBroadcastShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotTopicBroadcastShrinkRequest self = new GetHotTopicBroadcastShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetHotTopicBroadcastShrinkRequest setCalcTotalToken(Boolean calcTotalToken) {
        this.calcTotalToken = calcTotalToken;
        return this;
    }
    public Boolean getCalcTotalToken() {
        return this.calcTotalToken;
    }

    public GetHotTopicBroadcastShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetHotTopicBroadcastShrinkRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public GetHotTopicBroadcastShrinkRequest setHotTopicVersion(String hotTopicVersion) {
        this.hotTopicVersion = hotTopicVersion;
        return this;
    }
    public String getHotTopicVersion() {
        return this.hotTopicVersion;
    }

    public GetHotTopicBroadcastShrinkRequest setLocationQuery(String locationQuery) {
        this.locationQuery = locationQuery;
        return this;
    }
    public String getLocationQuery() {
        return this.locationQuery;
    }

    public GetHotTopicBroadcastShrinkRequest setLocationsShrink(String locationsShrink) {
        this.locationsShrink = locationsShrink;
        return this;
    }
    public String getLocationsShrink() {
        return this.locationsShrink;
    }

    public GetHotTopicBroadcastShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetHotTopicBroadcastShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public GetHotTopicBroadcastShrinkRequest setStepForCustomSummaryStyleConfigShrink(String stepForCustomSummaryStyleConfigShrink) {
        this.stepForCustomSummaryStyleConfigShrink = stepForCustomSummaryStyleConfigShrink;
        return this;
    }
    public String getStepForCustomSummaryStyleConfigShrink() {
        return this.stepForCustomSummaryStyleConfigShrink;
    }

    public GetHotTopicBroadcastShrinkRequest setStepForNewsBroadcastContentConfigShrink(String stepForNewsBroadcastContentConfigShrink) {
        this.stepForNewsBroadcastContentConfigShrink = stepForNewsBroadcastContentConfigShrink;
        return this;
    }
    public String getStepForNewsBroadcastContentConfigShrink() {
        return this.stepForNewsBroadcastContentConfigShrink;
    }

    public GetHotTopicBroadcastShrinkRequest setTopicsShrink(String topicsShrink) {
        this.topicsShrink = topicsShrink;
        return this;
    }
    public String getTopicsShrink() {
        return this.topicsShrink;
    }

    public GetHotTopicBroadcastShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
