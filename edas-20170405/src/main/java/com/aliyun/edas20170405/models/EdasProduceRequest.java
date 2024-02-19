// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170405.models;

import com.aliyun.tea.*;

public class EdasProduceRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("sourceFlag")
    public String sourceFlag;

    public static EdasProduceRequest build(java.util.Map<String, ?> map) throws Exception {
        EdasProduceRequest self = new EdasProduceRequest();
        return TeaModel.build(map, self);
    }

    public EdasProduceRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public EdasProduceRequest setSourceFlag(String sourceFlag) {
        this.sourceFlag = sourceFlag;
        return this;
    }
    public String getSourceFlag() {
        return this.sourceFlag;
    }

}
