// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DiskSize extends TeaModel {
    /**
     * <p>磁盘类型。</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>单位GB。</p>
     */
    @NameInMap("Size")
    public Integer size;

    public static DiskSize build(java.util.Map<String, ?> map) throws Exception {
        DiskSize self = new DiskSize();
        return TeaModel.build(map, self);
    }

    public DiskSize setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DiskSize setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
