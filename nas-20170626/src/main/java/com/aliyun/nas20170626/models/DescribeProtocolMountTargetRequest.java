// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeProtocolMountTargetRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The filter that is used to query the export directories of the protocol service.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeProtocolMountTargetRequestFilters> filters;

    /**
     * <p>The number of results for each query.</p>
     * <ul>
     * <li>Value values: 10 to 100.</li>
     * <li>Default value: 20.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>aBcdg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Protocol service ID list</p>
     * 
     * <strong>example:</strong>
     * <p>ptc-123xxx</p>
     */
    @NameInMap("ProtocolServiceIds")
    public String protocolServiceIds;

    public static DescribeProtocolMountTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtocolMountTargetRequest self = new DescribeProtocolMountTargetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProtocolMountTargetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeProtocolMountTargetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeProtocolMountTargetRequest setFilters(java.util.List<DescribeProtocolMountTargetRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeProtocolMountTargetRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeProtocolMountTargetRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeProtocolMountTargetRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeProtocolMountTargetRequest setProtocolServiceIds(String protocolServiceIds) {
        this.protocolServiceIds = protocolServiceIds;
        return this;
    }
    public String getProtocolServiceIds() {
        return this.protocolServiceIds;
    }

    public static class DescribeProtocolMountTargetRequestFilters extends TeaModel {
        /**
         * <p>The filter name.</p>
         * <ul>
         * <li>ProtocolServiceIds: Filters export directories by protocol service ID.</li>
         * <li>ExportIds: Filters export directories by export directory ID.</li>
         * <li>VpcIds: Filters export directories by VPC ID.</li>
         * <li>FsetIds: Filters export directories by fileset ID.</li>
         * <li>Paths: Filters export directories based on the path of the file system corresponding to the mount target.</li>
         * <li>AccessGroupNames: Filters export directories by permission group name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ExportIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value. This parameter does not support wildcards.</p>
         * <ul>
         * <li>If Key is set to ProtocolServiceIds, set Value to a protocol service ID. You can specify a maximum of 10 protocol service IDs. Example: <code>ptc-12345678</code> or <code>ptc-12345678,ptc-12345679</code>.</li>
         * <li>If Key is set to ExportIds, set Value to an export directory ID. You can specify a maximum of 10 export directory IDs. Example: <code>exp-12345678</code> or <code>exp-12345678,exp-12345679</code>.</li>
         * <li>If Key is set to VpcIds, set Value to a VPC ID of the protocol service. You can specify a maximum of 10 VPC IDs. Example: <code>vpc-12345678</code> or <code>vpc-12345678,vpc-12345679</code>.</li>
         * <li>If Key is set to FsetIds, set Value to a fileset ID. You can specify a maximum of 10 fileset IDs. Example: <code>fset-12345678</code> or <code>fset-12345678,fset-12345679</code>.</li>
         * <li>If Key is set to Paths, set Value to a path of the file system corresponding to the mount target. You can specify a maximum of 10 paths. Example: <code>/cpfs/mnt_1/</code> or <code>/cpfs/mnt_1/,/cpfs/mnt_2/</code>.</li>
         * <li>If Key is set to AccessGroupNames, set Value to a permission group name for the protocol service. You can specify a maximum of 10 permission group names. Example: <code>ag-12345678</code> or <code>ag-12345678,ag-12345679</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>exp-19abf5beab8d****, exp-19acf6beaf7d****</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeProtocolMountTargetRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeProtocolMountTargetRequestFilters self = new DescribeProtocolMountTargetRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeProtocolMountTargetRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeProtocolMountTargetRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
