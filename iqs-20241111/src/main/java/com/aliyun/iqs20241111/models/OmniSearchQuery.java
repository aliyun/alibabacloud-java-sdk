// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class OmniSearchQuery extends TeaModel {
    /**
     * <p>The request parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>What is the weather in Hangzhou today?</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The session ID. This is a reserved field and is not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>session_id_123</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Specifies whether to use CoT. This is a reserved field and is not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("useCot")
    public Boolean useCot;

    /**
     * <p>The model version to use. Valid values: pro for the deep version, and lite for the fast version.</p>
     * 
     * <strong>example:</strong>
     * <p>pro</p>
     */
    @NameInMap("useModel")
    public String useModel;

    public static OmniSearchQuery build(java.util.Map<String, ?> map) throws Exception {
        OmniSearchQuery self = new OmniSearchQuery();
        return TeaModel.build(map, self);
    }

    public OmniSearchQuery setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public OmniSearchQuery setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public OmniSearchQuery setUseCot(Boolean useCot) {
        this.useCot = useCot;
        return this;
    }
    public Boolean getUseCot() {
        return this.useCot;
    }

    public OmniSearchQuery setUseModel(String useModel) {
        this.useModel = useModel;
        return this;
    }
    public String getUseModel() {
        return this.useModel;
    }

}
