// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateMetaCategoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30000181325</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>23****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static UpdateMetaCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaCategoryRequest self = new UpdateMetaCategoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaCategoryRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateMetaCategoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMetaCategoryRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
