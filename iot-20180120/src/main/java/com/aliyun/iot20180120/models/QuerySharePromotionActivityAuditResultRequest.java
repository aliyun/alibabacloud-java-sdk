// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySharePromotionActivityAuditResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-cv3********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61******_****<em>4901</em><strong><strong>_47</strong></strong>*******</p>
     */
    @NameInMap("SharePromotionActivityId")
    public String sharePromotionActivityId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>52******_7<strong>e_4</strong>3_9<strong>e_61</strong>********</p>
     */
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
