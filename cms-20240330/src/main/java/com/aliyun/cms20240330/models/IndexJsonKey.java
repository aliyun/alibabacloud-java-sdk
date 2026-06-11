// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IndexJsonKey extends TeaModel {
    /**
     * <p>Specifies whether the field contains Chinese characters.</p>
     * <ul>
     * <li><p><code>true</code>: The field contains Chinese characters.</p>
     * </li>
     * <li><p><code>false</code>: The field does not contain Chinese characters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("chn")
    public Boolean chn;

    /**
     * <p>The field type.</p>
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
