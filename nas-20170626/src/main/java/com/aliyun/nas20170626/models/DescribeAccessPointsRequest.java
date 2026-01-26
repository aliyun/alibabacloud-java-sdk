// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessPointsRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <p>This parameter is required for a General-purpose NAS file system.</p>
     * <p>The default permission group for virtual private clouds (VPCs) is named DEFAULT_VPC_GROUP_NAME.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_VPC_GROUP_NAME</p>
     */
    @NameInMap("AccessGroup")
    public String accessGroup;

    /**
     * <p>The ID of the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>174494****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The number of results for each query.</p>
     * <p>Valid values: 10 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. Do not specify this parameter for the first request. For subsequent requests, set this value to the NextToken returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>MTY4NzcxOTcwMjAzMDk2Nzc0MyM4MDM4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The tags of the access point.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeAccessPointsRequestTag> tag;

    public static DescribeAccessPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessPointsRequest self = new DescribeAccessPointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessPointsRequest setAccessGroup(String accessGroup) {
        this.accessGroup = accessGroup;
        return this;
    }
    public String getAccessGroup() {
        return this.accessGroup;
    }

    public DescribeAccessPointsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeAccessPointsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAccessPointsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAccessPointsRequest setTag(java.util.List<DescribeAccessPointsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeAccessPointsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeAccessPointsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>Valid values of N: 1 to 20.</li>
         * <li>Maximum length is 128 characters.</li>
         * <li>Cannot start with aliyun or acs:.</li>
         * <li>Cannot contain http:// or https://.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>Valid values of N: 1 to 20.</li>
         * <li>Maximum length is 128 characters.</li>
         * <li>Cannot start with aliyun or acs:.</li>
         * <li>Cannot contain http:// or https://.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAccessPointsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessPointsRequestTag self = new DescribeAccessPointsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeAccessPointsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAccessPointsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
