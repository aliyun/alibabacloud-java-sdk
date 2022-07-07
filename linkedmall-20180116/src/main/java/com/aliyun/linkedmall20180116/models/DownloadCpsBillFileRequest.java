// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DownloadCpsBillFileRequest extends TeaModel {
    @NameInMap("BillId")
    public String billId;

    @NameInMap("BizId")
    public String bizId;

    public static DownloadCpsBillFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadCpsBillFileRequest self = new DownloadCpsBillFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadCpsBillFileRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public DownloadCpsBillFileRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
