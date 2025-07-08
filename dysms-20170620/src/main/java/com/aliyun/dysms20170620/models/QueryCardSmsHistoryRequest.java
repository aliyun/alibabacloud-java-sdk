// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsHistoryRequest extends TeaModel {
    @NameInMap("ApiSend")
    public Long apiSend;

    @NameInMap("CardTemplateType")
    public String cardTemplateType;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("MaxId")
    public Long maxId;

    @NameInMap("MinId")
    public Long minId;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ReceiveState")
    public Long receiveState;

    @NameInMap("Receiver")
    public String receiver;

    @NameInMap("RenderState")
    public Long renderState;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("TmpCode")
    public String tmpCode;

    @NameInMap("Type")
    public Long type;

    public static QueryCardSmsHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsHistoryRequest self = new QueryCardSmsHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsHistoryRequest setApiSend(Long apiSend) {
        this.apiSend = apiSend;
        return this;
    }
    public Long getApiSend() {
        return this.apiSend;
    }

    public QueryCardSmsHistoryRequest setCardTemplateType(String cardTemplateType) {
        this.cardTemplateType = cardTemplateType;
        return this;
    }
    public String getCardTemplateType() {
        return this.cardTemplateType;
    }

    public QueryCardSmsHistoryRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryCardSmsHistoryRequest setMaxId(Long maxId) {
        this.maxId = maxId;
        return this;
    }
    public Long getMaxId() {
        return this.maxId;
    }

    public QueryCardSmsHistoryRequest setMinId(Long minId) {
        this.minId = minId;
        return this;
    }
    public Long getMinId() {
        return this.minId;
    }

    public QueryCardSmsHistoryRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryCardSmsHistoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCardSmsHistoryRequest setReceiveState(Long receiveState) {
        this.receiveState = receiveState;
        return this;
    }
    public Long getReceiveState() {
        return this.receiveState;
    }

    public QueryCardSmsHistoryRequest setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }
    public String getReceiver() {
        return this.receiver;
    }

    public QueryCardSmsHistoryRequest setRenderState(Long renderState) {
        this.renderState = renderState;
        return this;
    }
    public Long getRenderState() {
        return this.renderState;
    }

    public QueryCardSmsHistoryRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QueryCardSmsHistoryRequest setTmpCode(String tmpCode) {
        this.tmpCode = tmpCode;
        return this;
    }
    public String getTmpCode() {
        return this.tmpCode;
    }

    public QueryCardSmsHistoryRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
