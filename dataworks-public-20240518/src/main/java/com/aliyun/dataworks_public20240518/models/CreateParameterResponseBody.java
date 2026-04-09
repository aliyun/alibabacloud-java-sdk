// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateParameterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterResponseBody self = new CreateParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateParameterResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
