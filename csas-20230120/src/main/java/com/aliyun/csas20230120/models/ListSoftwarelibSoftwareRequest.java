// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListSoftwarelibSoftwareRequest extends TeaModel {
    /**
     * <p>The software classification ID. You can call <a href="~~ListSoftwarelibClassify~~">ListSoftwarelibClassify</a> to obtain the value.</p>
     * 
     * <strong>example:</strong>
     * <p>softwarelib-classify-61b7ccc63cae****</p>
     */
    @NameInMap("ClassifyId")
    public String classifyId;

    /**
     * <p>The page number of the current page in a paging query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The maximum number of entries per page. This parameter is not supported by this operation. Use CurrentPage and PageSize for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. This parameter is not supported by this operation. Use CurrentPage and PageSize for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh27/Jy4SXvlU9WgqeV7az+t</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The operating system to which the software package applies. Valid values:</p>
     * <ul>
     * <li><strong>Windows</strong>: Windows.</li>
     * <li><strong>Mac(Apple)</strong>: macOS with Apple silicon.</li>
     * <li><strong>Mac(Intel)</strong>: macOS with Intel processors.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The number of entries per page in a paging query. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The software name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Thunder</p>
     */
    @NameInMap("SoftwareName")
    public String softwareName;

    /**
     * <p>The software source. Valid values:</p>
     * <ul>
     * <li><strong>custom</strong>: custom software.</li>
     * <li><strong>builtin</strong>: built-in software library.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>builtin</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ListSoftwarelibSoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSoftwarelibSoftwareRequest self = new ListSoftwarelibSoftwareRequest();
        return TeaModel.build(map, self);
    }

    public ListSoftwarelibSoftwareRequest setClassifyId(String classifyId) {
        this.classifyId = classifyId;
        return this;
    }
    public String getClassifyId() {
        return this.classifyId;
    }

    public ListSoftwarelibSoftwareRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListSoftwarelibSoftwareRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSoftwarelibSoftwareRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSoftwarelibSoftwareRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public ListSoftwarelibSoftwareRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSoftwarelibSoftwareRequest setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
        return this;
    }
    public String getSoftwareName() {
        return this.softwareName;
    }

    public ListSoftwarelibSoftwareRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
