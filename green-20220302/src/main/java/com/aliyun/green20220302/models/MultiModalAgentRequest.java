// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalAgentRequest extends TeaModel {
    /**
     * <p>The unique identifier of the whiteboard application. To obtain the whiteboard application ID, see <a href="https://help.aliyun.com/document_detail/204234.html">CreateApp</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>txt_check_agent_01</p>
     */
    @NameInMap("AppID")
    public String appID;

    /**
     * <p>The parameter set required by the moderation service. taskId specifies the taskId of the detection task to query. Only one taskId can be specified per request.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;content&quot;:&quot;Test text&quot;,&quot;dataId&quot;:&quot;img1234567&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static MultiModalAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        MultiModalAgentRequest self = new MultiModalAgentRequest();
        return TeaModel.build(map, self);
    }

    public MultiModalAgentRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public MultiModalAgentRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
