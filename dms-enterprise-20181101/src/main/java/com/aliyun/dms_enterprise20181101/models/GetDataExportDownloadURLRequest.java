// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportDownloadURLRequest extends TeaModel {
    /**
     * <p>The details about the download URL of the file that records the export results for the ticket.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataExportDownloadURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataExportDownloadURLRequest self = new GetDataExportDownloadURLRequest();
        return TeaModel.build(map, self);
    }

    public GetDataExportDownloadURLRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataExportDownloadURLRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
