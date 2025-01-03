// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class CreateResourceResponseBody extends TeaModel {
    /**
     * <p>Data</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>5514CB39-B7C0-5B89-8534-2DE1E0F2B7AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total Count</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static CreateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceResponseBody self = new CreateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
