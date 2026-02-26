// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FileSmartCluster extends TeaModel {
    /**
     * <p>Similarity</p>
     * 
     * <strong>example:</strong>
     * <p>0.9</p>
     */
    @NameInMap("Similarity")
    public Float similarity;

    /**
     * <p>SmartClusterId</p>
     * 
     * <strong>example:</strong>
     * <p>SmartCluster-12cd1645-deae-4b5e-9434-613747b75f6d</p>
     */
    @NameInMap("SmartClusterId")
    public String smartClusterId;

    public static FileSmartCluster build(java.util.Map<String, ?> map) throws Exception {
        FileSmartCluster self = new FileSmartCluster();
        return TeaModel.build(map, self);
    }

    public FileSmartCluster setSimilarity(Float similarity) {
        this.similarity = similarity;
        return this;
    }
    public Float getSimilarity() {
        return this.similarity;
    }

    public FileSmartCluster setSmartClusterId(String smartClusterId) {
        this.smartClusterId = smartClusterId;
        return this;
    }
    public String getSmartClusterId() {
        return this.smartClusterId;
    }

}
