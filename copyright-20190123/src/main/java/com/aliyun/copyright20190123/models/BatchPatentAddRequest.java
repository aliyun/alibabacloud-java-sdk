// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class BatchPatentAddRequest extends TeaModel {
    @NameInMap("ApplyNumber")
    public String applyNumber;

    public static BatchPatentAddRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchPatentAddRequest self = new BatchPatentAddRequest();
        return TeaModel.build(map, self);
    }

    public BatchPatentAddRequest setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
        return this;
    }
    public String getApplyNumber() {
        return this.applyNumber;
    }

}
