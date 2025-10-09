// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityTemplateResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the newly created rule template.</p>
     * 
     * <strong>example:</strong>
     * <p>USER-DEFINED:2001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The API request ID, which is generated as a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc14115***159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataQualityTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityTemplateResponseBody self = new CreateDataQualityTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityTemplateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateDataQualityTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
