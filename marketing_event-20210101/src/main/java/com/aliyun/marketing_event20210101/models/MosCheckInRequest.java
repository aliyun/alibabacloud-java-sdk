// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class MosCheckInRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>INTL1234</p>
     */
    @NameInMap("ActivityId")
    public String activityId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtParam")
    public String extParam;

    /**
     * <strong>example:</strong>
     * <p>abc12345</p>
     */
    @NameInMap("QrCode")
    public String qrCode;

    public static MosCheckInRequest build(java.util.Map<String, ?> map) throws Exception {
        MosCheckInRequest self = new MosCheckInRequest();
        return TeaModel.build(map, self);
    }

    public MosCheckInRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public MosCheckInRequest setExtParam(String extParam) {
        this.extParam = extParam;
        return this;
    }
    public String getExtParam() {
        return this.extParam;
    }

    public MosCheckInRequest setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }
    public String getQrCode() {
        return this.qrCode;
    }

}
