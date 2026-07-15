// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalAgentSSERequest extends TeaModel {
    /**
     * <p>The unique identifier of the whiteboard application. To obtain the whiteboard application ID, see <a href="https://help.aliyun.com/document_detail/204234.html">CreateApp</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>txt_check_pro_agent_01</p>
     */
    @NameInMap("AppID")
    public String appID;

    /**
     * <p>The parameter set required by the moderation service, in JSON string format. The input parameter for text content is content (String), the custom data ID is DataId (String), and the cache type is CacheType (String, valid value: ephemeral).</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;content&quot;: &quot;这里待审核的文本内容&quot;,
     *     &quot;DataId&quot;: &quot;data123***&quot;,
     *     &quot;CacheType&quot;:&quot;ephemeral&quot;
     *     }</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    /**
     * <p>Specifies whether to use streaming output.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Stream")
    public String stream;

    public static MultiModalAgentSSERequest build(java.util.Map<String, ?> map) throws Exception {
        MultiModalAgentSSERequest self = new MultiModalAgentSSERequest();
        return TeaModel.build(map, self);
    }

    public MultiModalAgentSSERequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public MultiModalAgentSSERequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public MultiModalAgentSSERequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

}
