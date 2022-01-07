// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectBackupFilesRequest extends TeaModel {
    @NameInMap("ActionDetail")
    public java.util.Map<String, ?> actionDetail;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Tid")
    public Long tid;

    public static GetDataCorrectBackupFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectBackupFilesRequest self = new GetDataCorrectBackupFilesRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectBackupFilesRequest setActionDetail(java.util.Map<String, ?> actionDetail) {
        this.actionDetail = actionDetail;
        return this;
    }
    public java.util.Map<String, ?> getActionDetail() {
        return this.actionDetail;
    }

    public GetDataCorrectBackupFilesRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataCorrectBackupFilesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
