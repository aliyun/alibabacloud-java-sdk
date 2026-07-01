// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetRCSSignatureRequest extends TeaModel {
    /**
     * <p>签名名称</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    public static GetRCSSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRCSSignatureRequest self = new GetRCSSignatureRequest();
        return TeaModel.build(map, self);
    }

    public GetRCSSignatureRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
