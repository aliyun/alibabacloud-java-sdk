// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GetBasicInfoForAccountRequest extends TeaModel {
    @NameInMap("AliyunId")
    public String aliyunId;

    public static GetBasicInfoForAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBasicInfoForAccountRequest self = new GetBasicInfoForAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetBasicInfoForAccountRequest setAliyunId(String aliyunId) {
        this.aliyunId = aliyunId;
        return this;
    }
    public String getAliyunId() {
        return this.aliyunId;
    }

}
