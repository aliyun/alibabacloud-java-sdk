// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiApiInfoDeployCntMapValue extends TeaModel {
    @NameInMap("deployedCnt")
    public Long deployedCnt;

    @NameInMap("Cnt")
    public Long cnt;

    public static HttpApiApiInfoDeployCntMapValue build(java.util.Map<String, ?> map) throws Exception {
        HttpApiApiInfoDeployCntMapValue self = new HttpApiApiInfoDeployCntMapValue();
        return TeaModel.build(map, self);
    }

    public HttpApiApiInfoDeployCntMapValue setDeployedCnt(Long deployedCnt) {
        this.deployedCnt = deployedCnt;
        return this;
    }
    public Long getDeployedCnt() {
        return this.deployedCnt;
    }

    public HttpApiApiInfoDeployCntMapValue setCnt(Long cnt) {
        this.cnt = cnt;
        return this;
    }
    public Long getCnt() {
        return this.cnt;
    }

}
