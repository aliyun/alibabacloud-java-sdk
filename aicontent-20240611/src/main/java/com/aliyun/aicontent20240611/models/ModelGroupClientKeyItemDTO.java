// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelGroupClientKeyItemDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>501</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>sk-ab****yz</p>
     */
    @NameInMap("keyPreview")
    public String keyPreview;

    /**
     * <strong>example:</strong>
     * <p>Default Key</p>
     */
    @NameInMap("name")
    public String name;

    public static ModelGroupClientKeyItemDTO build(java.util.Map<String, ?> map) throws Exception {
        ModelGroupClientKeyItemDTO self = new ModelGroupClientKeyItemDTO();
        return TeaModel.build(map, self);
    }

    public ModelGroupClientKeyItemDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModelGroupClientKeyItemDTO setKeyPreview(String keyPreview) {
        this.keyPreview = keyPreview;
        return this;
    }
    public String getKeyPreview() {
        return this.keyPreview;
    }

    public ModelGroupClientKeyItemDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
