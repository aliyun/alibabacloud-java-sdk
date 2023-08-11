// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListServiceAuthsRequest extends TeaModel {
    @NameInMap("serviceAuthType")
    public String serviceAuthType;

    public static ListServiceAuthsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceAuthsRequest self = new ListServiceAuthsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceAuthsRequest setServiceAuthType(String serviceAuthType) {
        this.serviceAuthType = serviceAuthType;
        return this;
    }
    public String getServiceAuthType() {
        return this.serviceAuthType;
    }

}
