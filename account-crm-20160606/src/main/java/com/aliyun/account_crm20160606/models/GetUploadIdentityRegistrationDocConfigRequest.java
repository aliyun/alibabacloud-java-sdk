// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetUploadIdentityRegistrationDocConfigRequest extends TeaModel {
    @NameInMap("CustomerId")
    public String customerId;

    @NameInMap("FilePath")
    public String filePath;

    public static GetUploadIdentityRegistrationDocConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadIdentityRegistrationDocConfigRequest self = new GetUploadIdentityRegistrationDocConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadIdentityRegistrationDocConfigRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public GetUploadIdentityRegistrationDocConfigRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
