// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class QueryDataTrackResultDownloadStatusRequest extends TeaModel {
    @NameInMap("DownloadKeyId")
    public String downloadKeyId;

    @NameInMap("OrderId")
    public Long orderId;

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
