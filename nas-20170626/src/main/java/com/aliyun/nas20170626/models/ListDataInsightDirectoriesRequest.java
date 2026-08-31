// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDataInsightDirectoriesRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li>CPFS for Lingjun: The ID must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.<blockquote>
     * <p>Only CPFS for Lingjun file systems are supported.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-030wldnqm8evtpy****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The maximum number of directories to return.</p>
     * <p>Valid values: 10 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call. Leave this parameter empty for the first request. Default value: &quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The parent directory path. Specifies the parent directory to query. Default value: root directory &quot;/&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("ParentDir")
    public String parentDir;

    public static ListDataInsightDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataInsightDirectoriesRequest self = new ListDataInsightDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataInsightDirectoriesRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListDataInsightDirectoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataInsightDirectoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataInsightDirectoriesRequest setParentDir(String parentDir) {
        this.parentDir = parentDir;
        return this;
    }
    public String getParentDir() {
        return this.parentDir;
    }

}
