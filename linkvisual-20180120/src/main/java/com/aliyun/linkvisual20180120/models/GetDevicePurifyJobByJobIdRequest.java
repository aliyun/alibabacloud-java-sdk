// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetDevicePurifyJobByJobIdRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("JobId")
    public String jobId;

    public static GetDevicePurifyJobByJobIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDevicePurifyJobByJobIdRequest self = new GetDevicePurifyJobByJobIdRequest();
        return TeaModel.build(map, self);
    }

    public GetDevicePurifyJobByJobIdRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public GetDevicePurifyJobByJobIdRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public GetDevicePurifyJobByJobIdRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
