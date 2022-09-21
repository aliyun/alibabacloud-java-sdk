// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class SystemDiskParam extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    @NameInMap("Size")
    public Integer size;

    public static SystemDiskParam build(java.util.Map<String, ?> map) throws Exception {
        SystemDiskParam self = new SystemDiskParam();
        return TeaModel.build(map, self);
    }

    public SystemDiskParam setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public SystemDiskParam setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public SystemDiskParam setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
