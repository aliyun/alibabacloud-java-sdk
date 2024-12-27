// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SmartClusterRule extends TeaModel {
    @NameInMap("Keywords")
    public java.util.List<String> keywords;

    /**
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("Sensitivity")
    public Float sensitivity;

    public static SmartClusterRule build(java.util.Map<String, ?> map) throws Exception {
        SmartClusterRule self = new SmartClusterRule();
        return TeaModel.build(map, self);
    }

    public SmartClusterRule setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public SmartClusterRule setSensitivity(Float sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }
    public Float getSensitivity() {
        return this.sensitivity;
    }

}
