// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class FunctionLayer extends TeaModel {
    @NameInMap("arn")
    public String arn;

    @NameInMap("size")
    public Long size;

    public static FunctionLayer build(java.util.Map<String, ?> map) throws Exception {
        FunctionLayer self = new FunctionLayer();
        return TeaModel.build(map, self);
    }

    public FunctionLayer setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public FunctionLayer setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
