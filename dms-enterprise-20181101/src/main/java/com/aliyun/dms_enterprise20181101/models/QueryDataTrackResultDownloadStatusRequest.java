// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class QueryDataTrackResultDownloadStatusRequest extends TeaModel {
    /**
     * <p>The ID of the download key, which is used to identify the parsing progress of data tracking logs. You can call the DownloadDataTrackResult operation to query the ID of the key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e23dd7ec-a19f-4a69-8eb3-8ffd26e6****</p>
     */
    @NameInMap("DownloadKeyId")
    public String downloadKeyId;

    /**
     * <p>The ID of the ticket. You can call the <a href="https://help.aliyun.com/document_detail/144643.html">ListOrders</a> operation to query the ID of the ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>1***</p>
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
