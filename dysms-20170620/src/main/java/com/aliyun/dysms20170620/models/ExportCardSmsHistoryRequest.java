// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ExportCardSmsHistoryRequest extends TeaModel {
    @NameInMap("ApiSend")
    public Long apiSend;

    @NameInMap("CardTemplateType")
    public String cardTemplateType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

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

    public static ExportCardSmsHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportCardSmsHistoryRequest self = new ExportCardSmsHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ExportCardSmsHistoryRequest setApiSend(Long apiSend) {
        this.apiSend = apiSend;
        return this;
    }
    public Long getApiSend() {
        return this.apiSend;
    }

    public ExportCardSmsHistoryRequest setCardTemplateType(String cardTemplateType) {
        this.cardTemplateType = cardTemplateType;
        return this;
    }
    public String getCardTemplateType() {
        return this.cardTemplateType;
    }

    public ExportCardSmsHistoryRequest setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ExportCardSmsHistoryRequest setReceiveState(Long receiveState) {
        this.receiveState = receiveState;
        return this;
    }
    public Long getReceiveState() {
        return this.receiveState;
    }

    public ExportCardSmsHistoryRequest setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }
    public String getReceiver() {
        return this.receiver;
    }

    public ExportCardSmsHistoryRequest setRenderState(Long renderState) {
        this.renderState = renderState;
        return this;
    }
    public Long getRenderState() {
        return this.renderState;
    }

    public ExportCardSmsHistoryRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public ExportCardSmsHistoryRequest setTmpCode(String tmpCode) {
        this.tmpCode = tmpCode;
        return this;
    }
    public String getTmpCode() {
        return this.tmpCode;
    }

}
