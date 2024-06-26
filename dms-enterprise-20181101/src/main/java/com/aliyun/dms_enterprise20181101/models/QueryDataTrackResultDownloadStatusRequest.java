// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class QueryDataTrackResultDownloadStatusRequest extends TeaModel {
    /**
     * <p>The ID of the download key, which is used to identify the parsing progress of data tracking logs. You can call the DownloadDataTrackResult operation to query the ID of the key.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DownloadKeyId")
    public String downloadKeyId;

    /**
     * <p>The ID of the ticket. You can call the [ListOrders](https://help.aliyun.com/document_detail/144643.html) operation to query the ID of the ticket.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to query the ID of the tenant.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static QueryDataTrackResultDownloadStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataTrackResultDownloadStatusRequest self = new QueryDataTrackResultDownloadStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataTrackResultDownloadStatusRequest setDownloadKeyId(String downloadKeyId) {
        this.downloadKeyId = downloadKeyId;
        return this;
    }
    public String getDownloadKeyId() {
        return this.downloadKeyId;
    }

    public QueryDataTrackResultDownloadStatusRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public QueryDataTrackResultDownloadStatusRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
