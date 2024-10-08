// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCustomScenePolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023-04-03T19:00:00Z</p>
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
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2023-04-03T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>promotion</p>
     */
    @NameInMap("Template")
    public String template;

    public static UpdateCustomScenePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomScenePolicyResponseBody self = new UpdateCustomScenePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCustomScenePolicyResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateCustomScenePolicyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCustomScenePolicyResponseBody setObjects(java.util.List<String> objects) {
        this.objects = objects;
        return this;
    }
    public java.util.List<String> getObjects() {
        return this.objects;
    }

    public UpdateCustomScenePolicyResponseBody setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public UpdateCustomScenePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCustomScenePolicyResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateCustomScenePolicyResponseBody setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
