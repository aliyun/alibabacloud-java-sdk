// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantGradeVolumesRequest extends TeaModel {
    /**
     * <p>The authorization code for API calls. You can obtain it by calling the API operation that retrieves the authorization code for the English textbook AI teacher feature.</p>
     * 
     * <strong>example:</strong>
     * <p>tc_197bf5bb81889cc79eb51ae9b8c0cea3</p>
     */
    @NameInMap("authToken")
    public String authToken;

    /**
     * <p>Scenarios. Valid values: SYNC: synchronization practice, EXPAND: extended practice.</p>
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
