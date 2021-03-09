// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDistributeDetailRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("JobId")
    public String jobId;

    public static QueryDeviceDistributeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDistributeDetailRequest self = new QueryDeviceDistributeDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDistributeDetailRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryDeviceDistributeDetailRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryDeviceDistributeDetailRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
