// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyQueryRequest extends TeaModel {
    @NameInMap("apply_id")
    public Integer applyId;

    @NameInMap("apply_show_id")
    public String applyShowId;

    @NameInMap("thirdpart_apply_id")
    public String thirdpartApplyId;

    @NameInMap("type")
    public Integer type;

    public static ApplyQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyQueryRequest self = new ApplyQueryRequest();
        return TeaModel.build(map, self);
    }

    public ApplyQueryRequest setApplyId(Integer applyId) {
        this.applyId = applyId;
        return this;
    }
    public Integer getApplyId() {
        return this.applyId;
    }

    public ApplyQueryRequest setApplyShowId(String applyShowId) {
        this.applyShowId = applyShowId;
        return this;
    }
    public String getApplyShowId() {
        return this.applyShowId;
    }

    public ApplyQueryRequest setThirdpartApplyId(String thirdpartApplyId) {
        this.thirdpartApplyId = thirdpartApplyId;
        return this;
    }
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    public ApplyQueryRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
