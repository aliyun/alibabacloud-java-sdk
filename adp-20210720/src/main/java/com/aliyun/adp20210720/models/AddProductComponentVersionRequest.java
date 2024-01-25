// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddProductComponentVersionRequest extends TeaModel {
    @NameInMap("componentVersionSpecUID")
    public String componentVersionSpecUID;

    @NameInMap("componentVersionSpecValues")
    public String componentVersionSpecValues;

    @NameInMap("releaseName")
    public String releaseName;

    public static AddProductComponentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductComponentVersionRequest self = new AddProductComponentVersionRequest();
        return TeaModel.build(map, self);
    }

    public AddProductComponentVersionRequest setComponentVersionSpecUID(String componentVersionSpecUID) {
        this.componentVersionSpecUID = componentVersionSpecUID;
        return this;
    }
    public String getComponentVersionSpecUID() {
        return this.componentVersionSpecUID;
    }

    public AddProductComponentVersionRequest setComponentVersionSpecValues(String componentVersionSpecValues) {
        this.componentVersionSpecValues = componentVersionSpecValues;
        return this;
    }
    public String getComponentVersionSpecValues() {
        return this.componentVersionSpecValues;
    }

    public AddProductComponentVersionRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

}
