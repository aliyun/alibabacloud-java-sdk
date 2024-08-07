// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCsImportedProdStatusByUserResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the cloud service is activated for the account. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
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
