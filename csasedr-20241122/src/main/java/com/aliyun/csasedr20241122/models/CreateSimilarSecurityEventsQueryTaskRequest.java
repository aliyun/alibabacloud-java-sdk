// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class CreateSimilarSecurityEventsQueryTaskRequest extends TeaModel {
    /**
     * <p>The ID of the alert event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>14323</p>
     */
    @NameInMap("SecurityEventId")
    public Long securityEventId;

    /**
     * <p>The scenario code of alerting events that are of the same type or have the same rule hits.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("SimilarEventScenarioCode")
    public String similarEventScenarioCode;

    public static CreateSimilarSecurityEventsQueryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimilarSecurityEventsQueryTaskRequest self = new CreateSimilarSecurityEventsQueryTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSimilarSecurityEventsQueryTaskRequest setSecurityEventId(Long securityEventId) {
        this.securityEventId = securityEventId;
        return this;
    }
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

    public CreateSimilarSecurityEventsQueryTaskRequest setSimilarEventScenarioCode(String similarEventScenarioCode) {
        this.similarEventScenarioCode = similarEventScenarioCode;
        return this;
    }
    public String getSimilarEventScenarioCode() {
        return this.similarEventScenarioCode;
    }

}
