// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDagsRequest extends TeaModel {
    @NameInMap("OpSeq")
    public Long opSeq;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static ListDagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDagsRequest self = new ListDagsRequest();
        return TeaModel.build(map, self);
    }

    public ListDagsRequest setOpSeq(Long opSeq) {
        this.opSeq = opSeq;
        return this;
    }
    public Long getOpSeq() {
        return this.opSeq;
    }

    public ListDagsRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
