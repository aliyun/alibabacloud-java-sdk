// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DescribeSimilarEventScenariosRequest extends TeaModel {
    /**
     * <p>The ID of the alert event.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12321</p>
     */
    @NameInMap("SecurityEventId")
    public Long securityEventId;

    public static DescribeSimilarEventScenariosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimilarEventScenariosRequest self = new DescribeSimilarEventScenariosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSimilarEventScenariosRequest setSecurityEventId(Long securityEventId) {
        this.securityEventId = securityEventId;
        return this;
    }
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

}
