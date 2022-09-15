// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductInstancesShrinkRequest extends TeaModel {
    @NameInMap("envUID")
    public String envUID;

    @NameInMap("options")
    public String optionsShrink;

    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static ListProductInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductInstancesShrinkRequest self = new ListProductInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProductInstancesShrinkRequest setEnvUID(String envUID) {
        this.envUID = envUID;
        return this;
    }
    public String getEnvUID() {
        return this.envUID;
    }

    public ListProductInstancesShrinkRequest setOptionsShrink(String optionsShrink) {
        this.optionsShrink = optionsShrink;
        return this;
    }
    public String getOptionsShrink() {
        return this.optionsShrink;
    }

    public ListProductInstancesShrinkRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListProductInstancesShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListProductInstancesShrinkRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
