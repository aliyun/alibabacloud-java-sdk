// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DataDisks extends TeaModel {
    // 数据盘类型。取值cloud,cloud-ssd等
    @NameInMap("category")
    public String category;

    // 数据盘大小。最小值40，单位：GiB
    @NameInMap("size")
    public Long size;

    // 是否对数据盘加密。默认值：false。
    @NameInMap("encrypted")
    public Boolean encrypted;

    public static DataDisks build(java.util.Map<String, ?> map) throws Exception {
        DataDisks self = new DataDisks();
        return TeaModel.build(map, self);
    }

    public DataDisks setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DataDisks setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DataDisks setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

}
