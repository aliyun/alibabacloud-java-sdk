// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataQualityScanResponseBody extends TeaModel {
    /**
     * <p>Returns the ID of the created data source sharing rule, which uniquely identifies the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>676303114031776</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataQualityScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataQualityScanResponseBody self = new CreateDataQualityScanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataQualityScanResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateDataQualityScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
