// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DataDisk extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    @NameInMap("Size")
    public Integer size;

    public static DataDisk build(java.util.Map<String, ?> map) throws Exception {
        DataDisk self = new DataDisk();
        return TeaModel.build(map, self);
    }

    public DataDisk setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DataDisk setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DataDisk setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public DataDisk setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
