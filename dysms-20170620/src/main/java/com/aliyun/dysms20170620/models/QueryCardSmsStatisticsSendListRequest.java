// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsStatisticsSendListRequest extends TeaModel {
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

    public static QueryCardSmsStatisticsSendListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsStatisticsSendListRequest self = new QueryCardSmsStatisticsSendListRequest();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsStatisticsSendListRequest setCustomTmpCode(String customTmpCode) {
        this.customTmpCode = customTmpCode;
        return this;
    }
    public String getCustomTmpCode() {
        return this.customTmpCode;
    }

    public QueryCardSmsStatisticsSendListRequest setSendDateEnd(String sendDateEnd) {
        this.sendDateEnd = sendDateEnd;
        return this;
    }
    public String getSendDateEnd() {
        return this.sendDateEnd;
    }

    public QueryCardSmsStatisticsSendListRequest setSendDateStart(String sendDateStart) {
        this.sendDateStart = sendDateStart;
        return this;
    }
    public String getSendDateStart() {
        return this.sendDateStart;
    }

    public QueryCardSmsStatisticsSendListRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QueryCardSmsStatisticsSendListRequest setTmpCode(String tmpCode) {
        this.tmpCode = tmpCode;
        return this;
    }
    public String getTmpCode() {
        return this.tmpCode;
    }

}
