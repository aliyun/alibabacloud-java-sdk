// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ExportCardSmsStatisticsSendRequest extends TeaModel {
    @NameInMap("CustomTmpCode")
    public String customTmpCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SendDateEnd")
    public String sendDateEnd;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SendDateStart")
    public String sendDateStart;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("TmpCode")
    public String tmpCode;

    public static ExportCardSmsStatisticsSendRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportCardSmsStatisticsSendRequest self = new ExportCardSmsStatisticsSendRequest();
        return TeaModel.build(map, self);
    }

    public ExportCardSmsStatisticsSendRequest setCustomTmpCode(String customTmpCode) {
        this.customTmpCode = customTmpCode;
        return this;
    }
    public String getCustomTmpCode() {
        return this.customTmpCode;
    }

    public ExportCardSmsStatisticsSendRequest setSendDateEnd(String sendDateEnd) {
        this.sendDateEnd = sendDateEnd;
        return this;
    }
    public String getSendDateEnd() {
        return this.sendDateEnd;
    }

    public ExportCardSmsStatisticsSendRequest setSendDateStart(String sendDateStart) {
        this.sendDateStart = sendDateStart;
        return this;
    }
    public String getSendDateStart() {
        return this.sendDateStart;
    }

    public ExportCardSmsStatisticsSendRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public ExportCardSmsStatisticsSendRequest setTmpCode(String tmpCode) {
        this.tmpCode = tmpCode;
        return this;
    }
    public String getTmpCode() {
        return this.tmpCode;
    }

}
