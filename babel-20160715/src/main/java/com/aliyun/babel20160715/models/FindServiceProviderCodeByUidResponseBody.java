// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class FindServiceProviderCodeByUidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceProviderCode")
    public String serviceProviderCode;

    @NameInMap("Success")
    public Boolean success;

    public static FindServiceProviderCodeByUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindServiceProviderCodeByUidResponseBody self = new FindServiceProviderCodeByUidResponseBody();
        return TeaModel.build(map, self);
    }

    public FindServiceProviderCodeByUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindServiceProviderCodeByUidResponseBody setServiceProviderCode(String serviceProviderCode) {
        this.serviceProviderCode = serviceProviderCode;
        return this;
    }
    public String getServiceProviderCode() {
        return this.serviceProviderCode;
    }

    public FindServiceProviderCodeByUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
