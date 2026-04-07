// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUpdateDesensStatusListShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DesensStatus")
    public Integer desensStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    public static DsgUpdateDesensStatusListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgUpdateDesensStatusListShrinkRequest self = new DsgUpdateDesensStatusListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DsgUpdateDesensStatusListShrinkRequest setDesensStatus(Integer desensStatus) {
        this.desensStatus = desensStatus;
        return this;
    }
    public Integer getDesensStatus() {
        return this.desensStatus;
    }

    public DsgUpdateDesensStatusListShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

}
