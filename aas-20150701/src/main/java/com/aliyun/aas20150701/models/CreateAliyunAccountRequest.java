// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateAliyunAccountRequest extends TeaModel {
    @NameInMap("AliyunId")
    public String aliyunId;

    public static CreateAliyunAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunAccountRequest self = new CreateAliyunAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliyunAccountRequest setAliyunId(String aliyunId) {
        this.aliyunId = aliyunId;
        return this;
    }
    public String getAliyunId() {
        return this.aliyunId;
    }

}
