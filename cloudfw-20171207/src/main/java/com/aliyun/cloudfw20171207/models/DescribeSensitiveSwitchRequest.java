// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSensitiveSwitchRequest extends TeaModel {
    /**
     * <p>The name of the category.</p>
     * 
     * <strong>example:</strong>
     * <p>Identity card</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the request and response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The parent class.</p>
     * 
     * <strong>example:</strong>
     * <p>universal_industry_template</p>
     */
    @NameInMap("ParentCategory")
    public String parentCategory;

    /**
     * <p>The type of the sensitive credential.</p>
     * 
     * <strong>example:</strong>
     * <p>id_card</p>
     */
    @NameInMap("SensitiveCategory")
    public String sensitiveCategory;

    /**
     * <p>The sensitivity level.</p>
     * 
     * <strong>example:</strong>
     * <p>S3</p>
     */
    @NameInMap("SensitiveLevel")
    public String sensitiveLevel;

    /**
     * <p>The status of the sensitive data detection switch.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SwitchStatus")
    public String switchStatus;

    public static DescribeSensitiveSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveSwitchRequest self = new DescribeSensitiveSwitchRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveSwitchRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public DescribeSensitiveSwitchRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSensitiveSwitchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSensitiveSwitchRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSensitiveSwitchRequest setParentCategory(String parentCategory) {
        this.parentCategory = parentCategory;
        return this;
    }
    public String getParentCategory() {
        return this.parentCategory;
    }

    public DescribeSensitiveSwitchRequest setSensitiveCategory(String sensitiveCategory) {
        this.sensitiveCategory = sensitiveCategory;
        return this;
    }
    public String getSensitiveCategory() {
        return this.sensitiveCategory;
    }

    public DescribeSensitiveSwitchRequest setSensitiveLevel(String sensitiveLevel) {
        this.sensitiveLevel = sensitiveLevel;
        return this;
    }
    public String getSensitiveLevel() {
        return this.sensitiveLevel;
    }

    public DescribeSensitiveSwitchRequest setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }
    public String getSwitchStatus() {
        return this.switchStatus;
    }

}
