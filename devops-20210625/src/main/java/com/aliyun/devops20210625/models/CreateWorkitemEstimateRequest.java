// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemEstimateRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1316458xxxxx41068</p>
     */
    @NameInMap("recordUserIdentifier")
    public String recordUserIdentifier;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("spentTime")
    public String spentTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9144ef6b72d8exxxxx9e61a4d0</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1e9903d8b3f1xxxxxf9286ef5</p>
     */
    @NameInMap("workitemIdentifier")
    public String workitemIdentifier;

    public static CreateWorkitemEstimateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemEstimateRequest self = new CreateWorkitemEstimateRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemEstimateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkitemEstimateRequest setRecordUserIdentifier(String recordUserIdentifier) {
        this.recordUserIdentifier = recordUserIdentifier;
        return this;
    }
    public String getRecordUserIdentifier() {
        return this.recordUserIdentifier;
    }

    public CreateWorkitemEstimateRequest setSpentTime(String spentTime) {
        this.spentTime = spentTime;
        return this;
    }
    public String getSpentTime() {
        return this.spentTime;
    }

    public CreateWorkitemEstimateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateWorkitemEstimateRequest setWorkitemIdentifier(String workitemIdentifier) {
        this.workitemIdentifier = workitemIdentifier;
        return this;
    }
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

}
