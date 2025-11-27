// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListAttachedOSSBucketsRequest extends TeaModel {
    /**
     * <p>The maximum number of tasks in the returned result list. The value range is (0, 200], with a default value of 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>Pagination token.</p>
     * <p>When the total number of files exceeds the set MaxResults, this token is used for pagination. It returns the list of file information in lexicographical order starting from NextToken.</p>
     * <blockquote>
     * <p>When calling this interface for the first time in a single query, set this value to empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Project name, for more information on how to obtain it, see <a href="https://help.aliyun.com/document_detail/478153.html">Create Project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static ListAttachedOSSBucketsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAttachedOSSBucketsRequest self = new ListAttachedOSSBucketsRequest();
        return TeaModel.build(map, self);
    }

    public ListAttachedOSSBucketsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListAttachedOSSBucketsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAttachedOSSBucketsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
