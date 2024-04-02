// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteImageLibRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteImageLibRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageLibRequest self = new DeleteImageLibRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageLibRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public DeleteImageLibRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
