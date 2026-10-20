// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ColumnMask extends TeaModel {
    /**
     * <p>The column masking expression.</p>
     * 
     * <strong>example:</strong>
     * <p>CONCAT(\&quot;<em><strong>-</strong>-</em>***\&quot;)</p>
     */
    @NameInMap("expression")
    public String expression;

    /**
     * <p>The column masking transform method.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;CONCAT&quot;,&quot;inputs&quot;:[&quot;***-&quot;,{&quot;index&quot;:1,&quot;name&quot;:&quot;phone&quot;,&quot;type&quot;:&quot;STRING&quot;}]}</p>
     */
    @NameInMap("transform")
    public String transform;

    public static ColumnMask build(java.util.Map<String, ?> map) throws Exception {
        ColumnMask self = new ColumnMask();
        return TeaModel.build(map, self);
    }

    public ColumnMask setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public ColumnMask setTransform(String transform) {
        this.transform = transform;
        return this;
    }
    public String getTransform() {
        return this.transform;
    }

}
