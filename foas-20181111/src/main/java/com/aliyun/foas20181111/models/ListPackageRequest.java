// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListPackageRequest extends TeaModel {
    @NameInMap("packageName")
    public String packageName;

    @NameInMap("pageIndex")
    public Integer pageIndex;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("tag")
    public String tag;

    @NameInMap("type")
    public String type;

    public static ListPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPackageRequest self = new ListPackageRequest();
        return TeaModel.build(map, self);
    }

    public ListPackageRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public ListPackageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListPackageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPackageRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ListPackageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
