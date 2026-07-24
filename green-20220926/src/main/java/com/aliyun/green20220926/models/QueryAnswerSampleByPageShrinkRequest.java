// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class QueryAnswerSampleByPageShrinkRequest extends TeaModel {
    /**
     * <p>The answer.</p>
     * 
     * <strong>example:</strong>
     * <p>答案</p>
     */
    @NameInMap("Answer")
    public String answer;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the proxy answer library.</p>
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
     */
    @NameInMap("Sort")
    public String sortShrink;

    public static QueryAnswerSampleByPageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAnswerSampleByPageShrinkRequest self = new QueryAnswerSampleByPageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryAnswerSampleByPageShrinkRequest setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public QueryAnswerSampleByPageShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryAnswerSampleByPageShrinkRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public QueryAnswerSampleByPageShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAnswerSampleByPageShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryAnswerSampleByPageShrinkRequest setSortShrink(String sortShrink) {
        this.sortShrink = sortShrink;
        return this;
    }
    public String getSortShrink() {
        return this.sortShrink;
    }

}
