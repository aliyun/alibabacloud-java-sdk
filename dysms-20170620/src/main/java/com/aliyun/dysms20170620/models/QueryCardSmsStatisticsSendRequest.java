// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsStatisticsSendRequest extends TeaModel {
    @NameInMap("CustomTmpCode")
    public String customTmpCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SendDateEnd")
    public String sendDateEnd;

    @NameInMap("SendDateStart")
    public String sendDateStart;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("TmpCode")
    public String tmpCode;

    public static QueryCardSmsStatisticsSendRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsStatisticsSendRequest self = new QueryCardSmsStatisticsSendRequest();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsStatisticsSendRequest setCustomTmpCode(String customTmpCode) {
        this.customTmpCode = customTmpCode;
        return this;
    }
    public String getCustomTmpCode() {
        return this.customTmpCode;
    }

    public QueryCardSmsStatisticsSendRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryCardSmsStatisticsSendRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCardSmsStatisticsSendRequest setSendDateEnd(String sendDateEnd) {
        this.sendDateEnd = sendDateEnd;
        return this;
    }
    public String getSendDateEnd() {
        return this.sendDateEnd;
    }

    public QueryCardSmsStatisticsSendRequest setSendDateStart(String sendDateStart) {
        this.sendDateStart = sendDateStart;
        return this;
    }
    public String getSendDateStart() {
        return this.sendDateStart;
    }

    public QueryCardSmsStatisticsSendRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QueryCardSmsStatisticsSendRequest setTmpCode(String tmpCode) {
        this.tmpCode = tmpCode;
        return this;
    }
    public String getTmpCode() {
        return this.tmpCode;
    }

}
