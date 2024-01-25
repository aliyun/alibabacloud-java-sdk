// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductVersionsShrinkRequest extends TeaModel {
    @NameInMap("fuzzy")
    public String fuzzy;

    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("platforms")
    public String platformsShrink;

    @NameInMap("productName")
    public String productName;

    @NameInMap("productUID")
    public String productUID;

    @NameInMap("released")
    public Boolean released;

    @NameInMap("supportedFoundationTypes")
    public String supportedFoundationTypesShrink;

    @NameInMap("tag")
    public String tagShrink;

    @NameInMap("version")
    public String version;

    public static ListProductVersionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionsShrinkRequest self = new ListProductVersionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProductVersionsShrinkRequest setFuzzy(String fuzzy) {
        this.fuzzy = fuzzy;
        return this;
    }
    public String getFuzzy() {
        return this.fuzzy;
    }

    public ListProductVersionsShrinkRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListProductVersionsShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListProductVersionsShrinkRequest setPlatformsShrink(String platformsShrink) {
        this.platformsShrink = platformsShrink;
        return this;
    }
    public String getPlatformsShrink() {
        return this.platformsShrink;
    }

    public ListProductVersionsShrinkRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ListProductVersionsShrinkRequest setProductUID(String productUID) {
        this.productUID = productUID;
        return this;
    }
    public String getProductUID() {
        return this.productUID;
    }

    public ListProductVersionsShrinkRequest setReleased(Boolean released) {
        this.released = released;
        return this;
    }
    public Boolean getReleased() {
        return this.released;
    }

    public ListProductVersionsShrinkRequest setSupportedFoundationTypesShrink(String supportedFoundationTypesShrink) {
        this.supportedFoundationTypesShrink = supportedFoundationTypesShrink;
        return this;
    }
    public String getSupportedFoundationTypesShrink() {
        return this.supportedFoundationTypesShrink;
    }

    public ListProductVersionsShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public ListProductVersionsShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
