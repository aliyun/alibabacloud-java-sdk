// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class QueryIndustryDeviceStatusDataRequest extends TeaModel {
    @NameInMap("Request")
    public java.util.Map<String, ?> request;

    public static QueryIndustryDeviceStatusDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndustryDeviceStatusDataRequest self = new QueryIndustryDeviceStatusDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndustryDeviceStatusDataRequest setRequest(java.util.Map<String, ?> request) {
        this.request = request;
        return this;
    }
    public java.util.Map<String, ?> getRequest() {
        return this.request;
    }

}
