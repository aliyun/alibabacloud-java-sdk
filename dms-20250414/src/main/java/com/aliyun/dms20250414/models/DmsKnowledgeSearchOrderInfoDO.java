// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DmsKnowledgeSearchOrderInfoDO extends TeaModel {
    @NameInMap("AliyunAccountUid")
    public String aliyunAccountUid;

    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Id")
    public Long id;

    @NameInMap("OrderId")
    public String orderId;

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
