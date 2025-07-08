// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ExportCardSmsStatisticsRequest extends TeaModel {
    @NameInMap("CustomTmpCode")
    public String customTmpCode;

    @NameInMap("SendDateEnd")
    public String sendDateEnd;

    @NameInMap("SendDateStart")
    public String sendDateStart;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("TmpCode")
    public String tmpCode;

    @NameInMap("TmpName")
    public String tmpName;

    public static ExportCardSmsStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportCardSmsStatisticsRequest self = new ExportCardSmsStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ExportCardSmsStatisticsRequest setCustomTmpCode(String customTmpCode) {
        this.customTmpCode = customTmpCode;
        return this;
    }
    public String getCustomTmpCode() {
        return this.customTmpCode;
    }

    public ExportCardSmsStatisticsRequest setSendDateEnd(String sendDateEnd) {
        this.sendDateEnd = sendDateEnd;
        return this;
    }
    public String getSendDateEnd() {
        return this.sendDateEnd;
    }

    public ExportCardSmsStatisticsRequest setSendDateStart(String sendDateStart) {
        this.sendDateStart = sendDateStart;
        return this;
    }
    public String getSendDateStart() {
        return this.sendDateStart;
    }

    public ExportCardSmsStatisticsRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public ExportCardSmsStatisticsRequest setTmpCode(String tmpCode) {
        this.tmpCode = tmpCode;
        return this;
    }
    public String getTmpCode() {
        return this.tmpCode;
    }

    public ExportCardSmsStatisticsRequest setTmpName(String tmpName) {
        this.tmpName = tmpName;
        return this;
    }
    public String getTmpName() {
        return this.tmpName;
    }

}
