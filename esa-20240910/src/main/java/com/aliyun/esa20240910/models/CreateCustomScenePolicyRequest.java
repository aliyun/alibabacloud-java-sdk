// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCustomScenePolicyRequest extends TeaModel {
    /**
     * <p>The time when the policy expires.</p>
     * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-07T18:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The policy name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The IDs of the websites that you want to associate with the policy. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>7096621098****</p>
     */
    @NameInMap("Objects")
    public String objects;

    @NameInMap("SiteIds")
    public String siteIds;

    /**
     * <p>The time when the policy takes effect.</p>
     * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-07T17:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the policy template. Valid value:</p>
     * <ul>
     * <li><strong>promotion</strong>: major events.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>promotion</p>
     */
    @NameInMap("Template")
    public String template;

    public static CreateCustomScenePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomScenePolicyRequest self = new CreateCustomScenePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomScenePolicyRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateCustomScenePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomScenePolicyRequest setObjects(String objects) {
        this.objects = objects;
        return this;
    }
    public String getObjects() {
        return this.objects;
    }

    public CreateCustomScenePolicyRequest setSiteIds(String siteIds) {
        this.siteIds = siteIds;
        return this;
    }
    public String getSiteIds() {
        return this.siteIds;
    }

    public CreateCustomScenePolicyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateCustomScenePolicyRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
