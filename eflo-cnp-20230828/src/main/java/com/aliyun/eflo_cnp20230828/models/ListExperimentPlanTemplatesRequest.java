// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListExperimentPlanTemplatesRequest extends TeaModel {
    /**
     * <p>The sharing level of the template, default is private, options are public and private.</p>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("PrivacyLevel")
    public String privacyLevel;

    public static ListExperimentPlanTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentPlanTemplatesRequest self = new ListExperimentPlanTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListExperimentPlanTemplatesRequest setPrivacyLevel(String privacyLevel) {
        this.privacyLevel = privacyLevel;
        return this;
    }
    public String getPrivacyLevel() {
        return this.privacyLevel;
    }

}
