// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class IndexJsonKey extends TeaModel {
    /**
     * <p>Specifies whether the field contains Chinese characters. This parameter is required only when the <strong>type</strong> parameter is set to <strong>text</strong>. Valid values:</p>
     * <ul>
     * <li>true: The field contains Chinese characters.</li>
     * <li>false: The field does not contain Chinese characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("chn")
    public Boolean chn;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("type")
    public String type;

    public static IndexJsonKey build(java.util.Map<String, ?> map) throws Exception {
        IndexJsonKey self = new IndexJsonKey();
        return TeaModel.build(map, self);
    }

    public IndexJsonKey setChn(Boolean chn) {
        this.chn = chn;
        return this;
    }
    public Boolean getChn() {
        return this.chn;
    }

    public IndexJsonKey setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
