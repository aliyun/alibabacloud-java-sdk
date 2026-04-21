// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class OmniSearchQuery extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>今天杭州天气</p>
     */
    @NameInMap("query")
    public String query;

    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("useCot")
    public Boolean useCot;

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
