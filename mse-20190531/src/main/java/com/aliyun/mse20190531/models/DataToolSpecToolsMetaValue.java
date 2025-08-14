// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DataToolSpecToolsMetaValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("Templates")
    public java.util.Map<String, ?> templates;

    public static DataToolSpecToolsMetaValue build(java.util.Map<String, ?> map) throws Exception {
        DataToolSpecToolsMetaValue self = new DataToolSpecToolsMetaValue();
        return TeaModel.build(map, self);
    }

    public DataToolSpecToolsMetaValue setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public DataToolSpecToolsMetaValue setTemplates(java.util.Map<String, ?> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.Map<String, ?> getTemplates() {
        return this.templates;
    }

}
