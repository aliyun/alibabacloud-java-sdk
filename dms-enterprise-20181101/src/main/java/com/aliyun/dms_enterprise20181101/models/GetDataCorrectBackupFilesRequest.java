// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectBackupFilesRequest extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("ActionDetail")
    public java.util.Map<String, ?> actionDetail;

    /**
     * <p>The download URL of the backup file for the ticket.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The parameters that are required to perform the operation. You do not need to specify this parameter.</p>
     */
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
