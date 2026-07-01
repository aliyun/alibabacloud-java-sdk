// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetDemonstrationForCustomizedVoiceJobRequest extends TeaModel {
    /**
     * <p>The demonstration scenario.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>story</strong></p>
     * </li>
     * <li><p><strong>interaction</strong></p>
     * </li>
     * <li><p><strong>navigation</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>story</p>
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
