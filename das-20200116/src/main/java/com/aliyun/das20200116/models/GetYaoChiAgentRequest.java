// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetYaoChiAgentRequest extends TeaModel {
    /**
     * <p>The additional information in JSON string format. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtraInfo")
    public String extraInfo;

    @NameInMap("ImageKeys")
    public String imageKeys;

    /**
     * <p>The natural language description of the question.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Are there any issues or abnormalities with my instance rm-xxx?</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The session ID in UUID string format. This parameter is optional. If you do not specify this parameter, a new session is created. To maintain context across a conversation, use the same session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The cloud service source that specifies which cloud service the question belongs to. This parameter is optional. Default value: yaochi.</p>
     * 
     * <strong>example:</strong>
     * <p>yaochi</p>
     */
    @NameInMap("Source")
    public String source;

    public static GetYaoChiAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetYaoChiAgentRequest self = new GetYaoChiAgentRequest();
        return TeaModel.build(map, self);
    }

    public GetYaoChiAgentRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public GetYaoChiAgentRequest setImageKeys(String imageKeys) {
        this.imageKeys = imageKeys;
        return this;
    }
    public String getImageKeys() {
        return this.imageKeys;
    }

    public GetYaoChiAgentRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetYaoChiAgentRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetYaoChiAgentRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
