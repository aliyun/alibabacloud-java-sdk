// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetCopilotConversationRequest extends TeaModel {
    /**
     * <p>The session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the data management center for threat analysis is located. Select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Select this value if your assets are located in the Chinese mainland and Hong Kong (China).</li>
     * <li>ap-southeast-1: Select this value if your assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The trace ID used to precisely query invocation information.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400e29b41d4a71644665544****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static GetCopilotConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCopilotConversationRequest self = new GetCopilotConversationRequest();
        return TeaModel.build(map, self);
    }

    public GetCopilotConversationRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public GetCopilotConversationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetCopilotConversationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetCopilotConversationRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
