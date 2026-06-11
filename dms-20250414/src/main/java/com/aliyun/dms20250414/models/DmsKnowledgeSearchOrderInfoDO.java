// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DmsKnowledgeSearchOrderInfoDO extends TeaModel {
    /**
     * <p>The UID of the Alibaba Cloud account.</p>
     */
    @NameInMap("AliyunAccountUid")
    public String aliyunAccountUid;

    /**
     * <p>The API key used for authentication.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The time when the entry was created.</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>The time when the entry was last modified.</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The unique ID of the entry.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The unique ID of the order.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The endpoint URL for the web search API.</p>
     */
    @NameInMap("WebSearchApiUrl")
    public String webSearchApiUrl;

    public static DmsKnowledgeSearchOrderInfoDO build(java.util.Map<String, ?> map) throws Exception {
        DmsKnowledgeSearchOrderInfoDO self = new DmsKnowledgeSearchOrderInfoDO();
        return TeaModel.build(map, self);
    }

    public DmsKnowledgeSearchOrderInfoDO setAliyunAccountUid(String aliyunAccountUid) {
        this.aliyunAccountUid = aliyunAccountUid;
        return this;
    }
    public String getAliyunAccountUid() {
        return this.aliyunAccountUid;
    }

    public DmsKnowledgeSearchOrderInfoDO setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DmsKnowledgeSearchOrderInfoDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DmsKnowledgeSearchOrderInfoDO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DmsKnowledgeSearchOrderInfoDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DmsKnowledgeSearchOrderInfoDO setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DmsKnowledgeSearchOrderInfoDO setWebSearchApiUrl(String webSearchApiUrl) {
        this.webSearchApiUrl = webSearchApiUrl;
        return this;
    }
    public String getWebSearchApiUrl() {
        return this.webSearchApiUrl;
    }

}
