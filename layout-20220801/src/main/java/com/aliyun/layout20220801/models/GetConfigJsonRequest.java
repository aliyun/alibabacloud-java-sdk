// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class GetConfigJsonRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("FileName")
    public String fileName;

    public static GetConfigJsonRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigJsonRequest self = new GetConfigJsonRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigJsonRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public GetConfigJsonRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
