// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySharePromotionActivityAuditResultRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SharePromotionActivityId")
    public String sharePromotionActivityId;

    @NameInMap("ShareTaskCode")
    public String shareTaskCode;

    public static QuerySharePromotionActivityAuditResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySharePromotionActivityAuditResultRequest self = new QuerySharePromotionActivityAuditResultRequest();
        return TeaModel.build(map, self);
    }

    public QuerySharePromotionActivityAuditResultRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySharePromotionActivityAuditResultRequest setSharePromotionActivityId(String sharePromotionActivityId) {
        this.sharePromotionActivityId = sharePromotionActivityId;
        return this;
    }
    public String getSharePromotionActivityId() {
        return this.sharePromotionActivityId;
    }

    public QuerySharePromotionActivityAuditResultRequest setShareTaskCode(String shareTaskCode) {
        this.shareTaskCode = shareTaskCode;
        return this;
    }
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

}
