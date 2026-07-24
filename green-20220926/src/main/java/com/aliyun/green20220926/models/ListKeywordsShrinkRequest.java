// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListKeywordsShrinkRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The keyword library ID.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_xxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;GmtCreate\&quot;:\&quot;desc\&quot;}</p>
     */
    @NameInMap("Sort")
    public String sortShrink;

    /**
     * <p>The keyword library code. Valid values:</p>
     * <ul>
     * <li>desensitize: desensitization keyword library.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desensitize</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    /**
     * <p>The keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>测试词</p>
     */
    @NameInMap("Word")
    public String word;

    public static ListKeywordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKeywordsShrinkRequest self = new ListKeywordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListKeywordsShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListKeywordsShrinkRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public ListKeywordsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKeywordsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListKeywordsShrinkRequest setSortShrink(String sortShrink) {
        this.sortShrink = sortShrink;
        return this;
    }
    public String getSortShrink() {
        return this.sortShrink;
    }

    public ListKeywordsShrinkRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ListKeywordsShrinkRequest setWord(String word) {
        this.word = word;
        return this;
    }
    public String getWord() {
        return this.word;
    }

}
