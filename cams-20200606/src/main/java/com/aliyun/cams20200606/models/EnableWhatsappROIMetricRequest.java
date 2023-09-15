// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class EnableWhatsappROIMetricRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("IsvCode")
    public String isvCode;

    public static EnableWhatsappROIMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableWhatsappROIMetricRequest self = new EnableWhatsappROIMetricRequest();
        return TeaModel.build(map, self);
    }

    public EnableWhatsappROIMetricRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public EnableWhatsappROIMetricRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

}
