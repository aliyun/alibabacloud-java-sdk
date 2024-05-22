// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetDemonstrationForCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Scenario")
    public String scenario;

    public static GetDemonstrationForCustomizedVoiceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDemonstrationForCustomizedVoiceJobRequest self = new GetDemonstrationForCustomizedVoiceJobRequest();
        return TeaModel.build(map, self);
    }

    public GetDemonstrationForCustomizedVoiceJobRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

}
