// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityScanRunResponseBody extends TeaModel {
    /**
     * <p>The RunId that was successfully triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>248840</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc14115***159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataQualityScanRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityScanRunResponseBody self = new CreateDataQualityScanRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityScanRunResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateDataQualityScanRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
