// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCsImportedProdStatusByUserResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the cloud service is activated for the account. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCsImportedProdStatusByUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCsImportedProdStatusByUserResponseBody self = new DescribeCsImportedProdStatusByUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCsImportedProdStatusByUserResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DescribeCsImportedProdStatusByUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
