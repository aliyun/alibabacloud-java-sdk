// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductVersionsShrinkRequest extends TeaModel {
    // 过滤参数，产品uid
    @NameInMap("productUID")
    public String productUID;

    // 过滤参数，产品名称
    @NameInMap("productName")
    public String productName;

    // 过滤参数，产品版本号
    @NameInMap("version")
    public String version;

    // 过滤参数，是否已发布
    @NameInMap("released")
    public Boolean released;

    // 过滤参数，支持的环境类型
    @NameInMap("supportedFoundationTypes")
    public String supportedFoundationTypesShrink;

    // 支持的platform，为空则不过滤
    @NameInMap("platforms")
    public String platformsShrink;

    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    public static ListProductVersionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionsShrinkRequest self = new ListProductVersionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProductVersionsShrinkRequest setProductUID(String productUID) {
        this.productUID = productUID;
        return this;
    }
    public String getProductUID() {
        return this.productUID;
    }

    public ListProductVersionsShrinkRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ListProductVersionsShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
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

    public ListProductVersionsShrinkRequest setPlatformsShrink(String platformsShrink) {
        this.platformsShrink = platformsShrink;
        return this;
    }
    public String getPlatformsShrink() {
        return this.platformsShrink;
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

}
