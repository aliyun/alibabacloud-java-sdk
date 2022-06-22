// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListInspectRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("HideExcludeFunction")
    public Boolean hideExcludeFunction;

    @NameInMap("HideNotEnableFunction")
    public Boolean hideNotEnableFunction;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListInspectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInspectRuleRequest self = new ListInspectRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListInspectRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ListInspectRuleRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public ListInspectRuleRequest setHideExcludeFunction(Boolean hideExcludeFunction) {
        this.hideExcludeFunction = hideExcludeFunction;
        return this;
    }
    public Boolean getHideExcludeFunction() {
        return this.hideExcludeFunction;
    }

    public ListInspectRuleRequest setHideNotEnableFunction(Boolean hideNotEnableFunction) {
        this.hideNotEnableFunction = hideNotEnableFunction;
        return this;
    }
    public Boolean getHideNotEnableFunction() {
        return this.hideNotEnableFunction;
    }

    public ListInspectRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListInspectRuleRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInspectRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
