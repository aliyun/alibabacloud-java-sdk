// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCustomScenePolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-11-07T18:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Objects")
    public java.util.List<String> objects;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2021-11-07T17:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
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
