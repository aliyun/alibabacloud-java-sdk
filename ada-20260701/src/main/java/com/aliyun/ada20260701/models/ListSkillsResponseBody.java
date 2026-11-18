// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class ListSkillsResponseBody extends TeaModel {
    /**
     * <p>The current number of entries per page for cursor-based pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The next token. An empty string is returned if there are no more pages.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current compatible page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The current compatible number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of skill summaries. The structure of list items is not fixed in the current public contract. For common fields, refer to the supplementary description of response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;skillId&quot;:&quot;skill_example123&quot;,&quot;name&quot;:&quot;code-review&quot;,&quot;official&quot;:false,&quot;description&quot;:&quot;Skill for code review&quot;,&quot;iconUrl&quot;:&quot;<a href="https://example.com/icons/code-review.png%22,%22visibility%22:%22user%22,%22status%22:%22PUBLISHED%22,%22publishedVersion%22:2,%22creatorId%22:%22example-user%22,%22createdAt%22:1760000000000,%22canModify%22:true,%22canDelete%22:true%7D%5D">https://example.com/icons/code-review.png&quot;,&quot;visibility&quot;:&quot;user&quot;,&quot;status&quot;:&quot;PUBLISHED&quot;,&quot;publishedVersion&quot;:2,&quot;creatorId&quot;:&quot;example-user&quot;,&quot;createdAt&quot;:1760000000000,&quot;canModify&quot;:true,&quot;canDelete&quot;:true}]</a></p>
     */
    @NameInMap("Skills")
    public java.util.List<?> skills;

    /**
     * <p>The total number of skills that meet the current visibility and filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsResponseBody self = new ListSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSkillsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSkillsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSkillsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillsResponseBody setSkills(java.util.List<?> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<?> getSkills() {
        return this.skills;
    }

    public ListSkillsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
