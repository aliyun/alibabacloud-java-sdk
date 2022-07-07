// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DownloadItemBillFileRequest extends TeaModel {
    @NameInMap("BillId")
    public String billId;

    @NameInMap("BizId")
    public String bizId;

    public static DownloadItemBillFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadItemBillFileRequest self = new DownloadItemBillFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadItemBillFileRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public DownloadItemBillFileRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
