// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DeadLetterQueue extends TeaModel {
    @NameInMap("Arn")
    public String arn;

    public static DeadLetterQueue build(java.util.Map<String, ?> map) throws Exception {
        DeadLetterQueue self = new DeadLetterQueue();
        return TeaModel.build(map, self);
    }

    public DeadLetterQueue setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

}
