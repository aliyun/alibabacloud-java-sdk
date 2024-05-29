// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateSceneDefensePolicyRequest extends TeaModel {
    /**
     * <p>The end time of the policy. This value is a UNIX timestamp. Units: milliseconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The name of the policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The start time of the policy. This value is a UNIX timestamp. Units: milliseconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The template of the policy. Valid values:</p>
     * <br>
     * <p>*   **promotion**: important activity</p>
     * <p>*   **bypass**: all traffic forwarded</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Template")
    public String template;

    public static CreateSceneDefensePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneDefensePolicyRequest self = new CreateSceneDefensePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSceneDefensePolicyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateSceneDefensePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSceneDefensePolicyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateSceneDefensePolicyRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
