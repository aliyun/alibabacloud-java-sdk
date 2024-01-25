// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ConfirmNoticeRequest extends TeaModel {
    @NameInMap("ClusterBizId")
    public String clusterBizId;

    public static ConfirmNoticeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmNoticeRequest self = new ConfirmNoticeRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmNoticeRequest setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

}
