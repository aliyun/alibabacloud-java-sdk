// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityAlertRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1010543619</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>0bc14115***159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataQualityAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityAlertRuleResponseBody self = new CreateDataQualityAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityAlertRuleResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateDataQualityAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
