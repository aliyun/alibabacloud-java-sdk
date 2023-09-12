// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ModelSpecification extends TeaModel {
    @NameInMap("MetaData")
    public MetaData metaData;

    @NameInMap("Spec")
    public Spec spec;

    public static ModelSpecification build(java.util.Map<String, ?> map) throws Exception {
        ModelSpecification self = new ModelSpecification();
        return TeaModel.build(map, self);
    }

    public ModelSpecification setMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }
    public MetaData getMetaData() {
        return this.metaData;
    }

    public ModelSpecification setSpec(Spec spec) {
        this.spec = spec;
        return this;
    }
    public Spec getSpec() {
        return this.spec;
    }

}
