// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteMetaCategoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30000235594</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaCategoryRequest self = new DeleteMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetaCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public DeleteMetaCategoryRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
