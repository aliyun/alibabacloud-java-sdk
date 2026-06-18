// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCustomScenePolicyRequest extends TeaModel {
    /**
     * <p>The policy end time.</p>
     * <p>The time must be in UTC and in ISO 8601 format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
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
     * <p>The IDs of the sites to associate with the policy. Separate multiple site IDs with commas.</p>
     * <blockquote>
     * <p>This parameter is deprecated. Use <code>SiteIds</code> instead. If <code>SiteIds</code> is specified, the value of this parameter is ignored. To prevent ambiguity, specify a value for either <code>SiteIds</code> or <code>Objects</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7096621098****,7096621099****</p>
     */
    @NameInMap("Objects")
    public String objects;

    /**
     * <p>The IDs of the sites to associate with the policy. Separate multiple site IDs with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>7096621098****,7096621099****</p>
     */
    @NameInMap("SiteIds")
    public String siteIds;

    /**
     * <p>The policy start time.</p>
     * <p>The time must be in UTC and in ISO 8601 format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-07T17:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The template name. Valid value:</p>
     * <ul>
     * <li><strong>promotion</strong>: a policy for major events.</li>
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
