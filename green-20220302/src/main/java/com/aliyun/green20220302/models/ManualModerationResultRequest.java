// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ManualModerationResultRequest extends TeaModel {
    /**
     * <p>Set of parameters required by the service, in JSON string format.</p>
     * <ul>
     * <li>TaskId: The task ID returned when the task was submitted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;TaskId\&quot;:\&quot;e5f2d886-4c23-440d-999c-bd98acde11b6\&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static ManualModerationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ManualModerationResultRequest self = new ManualModerationResultRequest();
        return TeaModel.build(map, self);
    }

    public ManualModerationResultRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
