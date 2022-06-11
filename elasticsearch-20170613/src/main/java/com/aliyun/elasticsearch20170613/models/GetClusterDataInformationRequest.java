// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetClusterDataInformationRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static GetClusterDataInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDataInformationRequest self = new GetClusterDataInformationRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterDataInformationRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
