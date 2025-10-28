// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneRequest extends TeaModel {
    /**
     * <p>The information about applications related to the lane.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;appId&quot;:&quot;f72deaac-26ba-429a-948d-5fa47c4a****&quot;},{&quot;appId&quot;:&quot;5049d2c8-f997-4fc9-92a2-153506a6****&quot;}]</p>
     */
    @NameInMap("AppInfos")
    public String appInfos;

    /**
     * <p>Specifies whether to enable the throttling rule.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRules")
    public Boolean enableRules;

    /**
     * <p>The throttling conditions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;priority&quot;:1,&quot;path&quot;:&quot;/traffic&quot;,&quot;condition&quot;:&quot;AND&quot;,&quot;restItems&quot;:[{&quot;type&quot;:&quot;header&quot;,&quot;name&quot;:&quot;testheader&quot;,&quot;value&quot;:&quot;testvalue&quot;,&quot;cond&quot;:&quot;==&quot;,&quot;operator&quot;:&quot;rawvalue&quot;}]}]</p>
     */
    @NameInMap("EntryRules")
    public String entryRules;

    /**
     * <p>The ID of the lane group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the custom namespace. The ID is in the <code>physical region ID:custom namespace identifier</code> format. Example: <code>cn-hangzhou:test</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The name of the lane.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The tag.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tag</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static InsertSwimmingLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertSwimmingLaneRequest self = new InsertSwimmingLaneRequest();
        return TeaModel.build(map, self);
    }

    public InsertSwimmingLaneRequest setAppInfos(String appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public String getAppInfos() {
        return this.appInfos;
    }

    public InsertSwimmingLaneRequest setEnableRules(Boolean enableRules) {
        this.enableRules = enableRules;
        return this;
    }
    public Boolean getEnableRules() {
        return this.enableRules;
    }

    public InsertSwimmingLaneRequest setEntryRules(String entryRules) {
        this.entryRules = entryRules;
        return this;
    }
    public String getEntryRules() {
        return this.entryRules;
    }

    public InsertSwimmingLaneRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public InsertSwimmingLaneRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public InsertSwimmingLaneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InsertSwimmingLaneRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
