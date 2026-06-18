// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCustomScenePolicyResponseBody extends TeaModel {
    /**
     * <p>The policy end time.</p>
     * <p>The time must be in UTC and in ISO 8601 format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-07T18:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>A list of associated site IDs.</p>
     * <blockquote>
     * <p>This field is deprecated. Read the value from the <code>SiteIds</code> field instead.</p>
     * </blockquote>
     */
    @NameInMap("Objects")
    public java.util.List<String> objects;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The associated site IDs, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>7096621098****, 7096621099****</p>
     */
    @NameInMap("SiteIds")
    public String siteIds;

    /**
     * <p>The policy start time.</p>
     * <p>The time must be in UTC and in ISO 8601 format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-07T17:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>promotion</p>
     */
    @NameInMap("Template")
    public String template;

    public static CreateCustomScenePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomScenePolicyResponseBody self = new CreateCustomScenePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomScenePolicyResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateCustomScenePolicyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomScenePolicyResponseBody setObjects(java.util.List<String> objects) {
        this.objects = objects;
        return this;
    }
    public java.util.List<String> getObjects() {
        return this.objects;
    }

    public CreateCustomScenePolicyResponseBody setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public CreateCustomScenePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomScenePolicyResponseBody setSiteIds(String siteIds) {
        this.siteIds = siteIds;
        return this;
    }
    public String getSiteIds() {
        return this.siteIds;
    }

    public CreateCustomScenePolicyResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateCustomScenePolicyResponseBody setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
