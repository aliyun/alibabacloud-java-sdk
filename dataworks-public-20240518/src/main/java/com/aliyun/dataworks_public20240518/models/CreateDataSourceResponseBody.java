// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataSourceResponseBody extends TeaModel {
    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22130</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B62EC203-B39E-5DC1-B5B8-EB3C61707009</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceResponseBody self = new CreateDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
