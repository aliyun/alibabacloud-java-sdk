// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ModelApiApiInfoDeployCntMapValue extends TeaModel {
    /**
     * <p>The number of deployed APIs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deployedCnt")
    public Long deployedCnt;

    /**
     * <p>The total number of APIs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cnt")
    public Long cnt;

    public static ModelApiApiInfoDeployCntMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModelApiApiInfoDeployCntMapValue self = new ModelApiApiInfoDeployCntMapValue();
        return TeaModel.build(map, self);
    }

    public ModelApiApiInfoDeployCntMapValue setDeployedCnt(Long deployedCnt) {
        this.deployedCnt = deployedCnt;
        return this;
    }
    public Long getDeployedCnt() {
        return this.deployedCnt;
    }

    public ModelApiApiInfoDeployCntMapValue setCnt(Long cnt) {
        this.cnt = cnt;
        return this;
    }
    public Long getCnt() {
        return this.cnt;
    }

}
