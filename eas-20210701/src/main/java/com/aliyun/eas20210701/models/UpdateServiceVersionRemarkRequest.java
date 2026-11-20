// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceVersionRemarkRequest extends TeaModel {
    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>version info.</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static UpdateServiceVersionRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceVersionRemarkRequest self = new UpdateServiceVersionRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceVersionRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
