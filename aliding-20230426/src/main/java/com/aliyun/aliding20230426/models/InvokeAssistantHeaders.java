// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeAssistantHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("aiLogContextJson")
    public String aiLogContextJson;

    @NameInMap("alidingSsoTicket")
    public String alidingSsoTicket;

    public static InvokeAssistantHeaders build(java.util.Map<String, ?> map) throws Exception {
        InvokeAssistantHeaders self = new InvokeAssistantHeaders();
        return TeaModel.build(map, self);
    }

    public InvokeAssistantHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InvokeAssistantHeaders setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public InvokeAssistantHeaders setAiLogContextJson(String aiLogContextJson) {
        this.aiLogContextJson = aiLogContextJson;
        return this;
    }
    public String getAiLogContextJson() {
        return this.aiLogContextJson;
    }

    public InvokeAssistantHeaders setAlidingSsoTicket(String alidingSsoTicket) {
        this.alidingSsoTicket = alidingSsoTicket;
        return this;
    }
    public String getAlidingSsoTicket() {
        return this.alidingSsoTicket;
    }

}
