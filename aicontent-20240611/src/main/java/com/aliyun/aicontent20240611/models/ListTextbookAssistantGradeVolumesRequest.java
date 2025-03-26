// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantGradeVolumesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>tc_197bf5bb81889cc79eb51ae9b8c0cea3</p>
     */
    @NameInMap("authToken")
    public String authToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYNC</p>
     */
    @NameInMap("scenario")
    public String scenario;

    public static ListTextbookAssistantGradeVolumesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantGradeVolumesRequest self = new ListTextbookAssistantGradeVolumesRequest();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantGradeVolumesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListTextbookAssistantGradeVolumesRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

}
