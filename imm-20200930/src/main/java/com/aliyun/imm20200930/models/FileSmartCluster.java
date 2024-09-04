// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FileSmartCluster extends TeaModel {
    @NameInMap("Similarity")
    public Float similarity;

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
