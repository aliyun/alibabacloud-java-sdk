// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ModelApiListApiInfoDeployCntMapValue extends TeaModel {
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

    public static ModelApiListApiInfoDeployCntMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModelApiListApiInfoDeployCntMapValue self = new ModelApiListApiInfoDeployCntMapValue();
        return TeaModel.build(map, self);
    }

    public ModelApiListApiInfoDeployCntMapValue setDeployedCnt(Long deployedCnt) {
        this.deployedCnt = deployedCnt;
        return this;
    }
    public Long getDeployedCnt() {
        return this.deployedCnt;
    }

    public ModelApiListApiInfoDeployCntMapValue setCnt(Long cnt) {
        this.cnt = cnt;
        return this;
    }
    public Long getCnt() {
        return this.cnt;
    }

}
