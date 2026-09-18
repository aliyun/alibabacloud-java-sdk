// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetCategoryDetailRequest extends TeaModel {
    /**
     * <p>The list of category paths.</p>
     * 
     * <strong>example:</strong>
     * <p>/lhm/</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The source dialect.</p>
     * 
     * <strong>example:</strong>
     * <p>sparksql</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The target dialect.</p>
     * 
     * <strong>example:</strong>
     * <p>hologres</p>
     */
    @NameInMap("target")
    public String target;

    public static GetCategoryDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCategoryDetailRequest self = new GetCategoryDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCategoryDetailRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GetCategoryDetailRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetCategoryDetailRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
