// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetSensitiveDataResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the sensitive data returned. The information includes totalCount and sensDatas.</p>
     * <br>
     * <p>sensDatas includes the following parameters:</p>
     * <br>
     * <p>*   guid: the ID of the metadata of the tenant. For example, the ID of the metadata in the MaxCompute compute engine is in the Project name.Table name.Column name format.</p>
     * <p>*   sensType: the type of the sensitive data.</p>
     * <p>*   sensLevel: the sensitivity level of the sensitive data.</p>
     */
    @NameInMap("SensitiveData")
    public java.util.Map<String, ?> sensitiveData;

    public static GetSensitiveDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSensitiveDataResponseBody self = new GetSensitiveDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSensitiveDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSensitiveDataResponseBody setSensitiveData(java.util.Map<String, ?> sensitiveData) {
        this.sensitiveData = sensitiveData;
        return this;
    }
    public java.util.Map<String, ?> getSensitiveData() {
        return this.sensitiveData;
    }

}
