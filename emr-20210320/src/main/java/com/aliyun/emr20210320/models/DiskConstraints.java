// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DiskConstraints extends TeaModel {
    /**
     * <p>支持的磁盘类型。</p>
     */
    @NameInMap("Categories")
    public java.util.List<String> categories;

    /**
     * <p>磁盘数量最小值。</p>
     */
    @NameInMap("CountConstraint")
    public ValueConstraints countConstraint;

    /**
     * <p>磁盘容量限制。</p>
     */
    @NameInMap("SizeConstraint")
    public ValueConstraints sizeConstraint;

    public static DiskConstraints build(java.util.Map<String, ?> map) throws Exception {
        DiskConstraints self = new DiskConstraints();
        return TeaModel.build(map, self);
    }

    public DiskConstraints setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public DiskConstraints setCountConstraint(ValueConstraints countConstraint) {
        this.countConstraint = countConstraint;
        return this;
    }
    public ValueConstraints getCountConstraint() {
        return this.countConstraint;
    }

    public DiskConstraints setSizeConstraint(ValueConstraints sizeConstraint) {
        this.sizeConstraint = sizeConstraint;
        return this;
    }
    public ValueConstraints getSizeConstraint() {
        return this.sizeConstraint;
    }

}
