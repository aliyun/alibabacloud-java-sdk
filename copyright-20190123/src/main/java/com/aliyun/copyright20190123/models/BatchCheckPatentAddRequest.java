// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class BatchCheckPatentAddRequest extends TeaModel {
    @NameInMap("ApplyNumber")
    public String applyNumber;

    public static BatchCheckPatentAddRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckPatentAddRequest self = new BatchCheckPatentAddRequest();
        return TeaModel.build(map, self);
    }

    public BatchCheckPatentAddRequest setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
        return this;
    }
    public String getApplyNumber() {
        return this.applyNumber;
    }

}
