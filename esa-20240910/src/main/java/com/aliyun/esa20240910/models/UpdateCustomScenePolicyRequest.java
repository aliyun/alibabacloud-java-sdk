// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCustomScenePolicyRequest extends TeaModel {
    /**
     * <p>The end time of the policy.</p>
     * <p>The time must be in UTC and in the ISO 8601 format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-03T19:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The site IDs to associate with the policy. Use a comma (,) to separate multiple IDs.</p>
     * <blockquote>
     * <p>This parameter is deprecated. We recommend using the <code>SiteIds</code> parameter instead. If the <code>SiteIds</code> parameter is specified, the <code>Objects</code> parameter is ignored. You must specify a value for either the <code>Objects</code> or <code>SiteIds</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456****,123457****</p>
     */
    @NameInMap("Objects")
    public String objects;

    /**
     * <p>To obtain the policy ID, call the <a href="https://help.aliyun.com/document_detail/2850508.html">DescribeCustomScenePolicies</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The site IDs to associate with the policy. Use a comma (,) to separate multiple IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****,123457****</p>
     */
    @NameInMap("SiteIds")
    public String siteIds;

    /**
     * <p>The start time of the policy.</p>
     * <p>The time must be in UTC and in the ISO 8601 format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-03T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the template. Valid value:</p>
     * <ul>
     * <li><strong>promotion</strong>: major promotion</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>promotion</p>
     */
    @NameInMap("Template")
    public String template;

    public static UpdateCustomScenePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomScenePolicyRequest self = new UpdateCustomScenePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomScenePolicyRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateCustomScenePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCustomScenePolicyRequest setObjects(String objects) {
        this.objects = objects;
        return this;
    }
    public String getObjects() {
        return this.objects;
    }

    public UpdateCustomScenePolicyRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public UpdateCustomScenePolicyRequest setSiteIds(String siteIds) {
        this.siteIds = siteIds;
        return this;
    }
    public String getSiteIds() {
        return this.siteIds;
    }

    public UpdateCustomScenePolicyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateCustomScenePolicyRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
