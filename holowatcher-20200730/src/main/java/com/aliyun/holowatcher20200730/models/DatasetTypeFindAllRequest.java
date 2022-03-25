// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetTypeFindAllRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public String sort;

    public static DatasetTypeFindAllRequest build(java.util.Map<String, ?> map) throws Exception {
        DatasetTypeFindAllRequest self = new DatasetTypeFindAllRequest();
        return TeaModel.build(map, self);
    }

    public DatasetTypeFindAllRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public DatasetTypeFindAllRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DatasetTypeFindAllRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
