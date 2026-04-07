// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUpdateDesensStatusListRequest extends TeaModel {
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
    public java.util.List<Integer> ids;

    public static DsgUpdateDesensStatusListRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgUpdateDesensStatusListRequest self = new DsgUpdateDesensStatusListRequest();
        return TeaModel.build(map, self);
    }

    public DsgUpdateDesensStatusListRequest setDesensStatus(Integer desensStatus) {
        this.desensStatus = desensStatus;
        return this;
    }
    public Integer getDesensStatus() {
        return this.desensStatus;
    }

    public DsgUpdateDesensStatusListRequest setIds(java.util.List<Integer> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Integer> getIds() {
        return this.ids;
    }

}
