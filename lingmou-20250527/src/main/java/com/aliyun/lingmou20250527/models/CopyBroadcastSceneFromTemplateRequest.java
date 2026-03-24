// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CopyBroadcastSceneFromTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9:16</p>
     */
    @NameInMap("ratio")
    public String ratio;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BS1b2WNnRMu4ouRzT4clY9Jhg</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static CopyBroadcastSceneFromTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyBroadcastSceneFromTemplateRequest self = new CopyBroadcastSceneFromTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CopyBroadcastSceneFromTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CopyBroadcastSceneFromTemplateRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public CopyBroadcastSceneFromTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
