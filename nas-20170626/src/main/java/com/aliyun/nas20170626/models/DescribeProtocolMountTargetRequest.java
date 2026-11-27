// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeProtocolMountTargetRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, and make sure that the token is unique across different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request may be different.</p>
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
     * <p>The filter keys used to query the export directories of the protocol service.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeProtocolMountTargetRequestFilters> filters;

    /**
     * <p>The maximum number of entries to return for a single request.</p>
     * <ul>
     * <li><p>Valid values: 10 to 100.</p>
     * </li>
     * <li><p>Default value: 20.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results when the returned results are truncated.</p>
     * 
     * <strong>example:</strong>
     * <p>aBcdg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of protocol service IDs.</p>
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
         * <p>The name of the filter key. Valid values:</p>
         * <ul>
         * <li><p>ProtocolServiceIds: filters by protocol service ID.</p>
         * </li>
         * <li><p>ExportIds: filters by export directory ID.</p>
         * </li>
         * <li><p>VpcIds: filters by VPC ID.</p>
         * </li>
         * <li><p>FsetIds: filters by Fileset ID.</p>
         * </li>
         * <li><p>Paths: filters by the file system path corresponding to the mount target.</p>
         * </li>
         * <li><p>AccessGroupNames: filters by permission group name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ExportIds</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter key. Wildcards are not supported.</p>
         * <ul>
         * <li><p>If Key is set to ProtocolServiceIds, set Value to the protocol service IDs. You can specify up to 10 protocol service IDs. Example: <code>ptc-12345678</code> or <code>ptc-12345678,ptc-12345679</code>.</p>
         * </li>
         * <li><p>If Key is set to ExportIds, set Value to the export directory IDs. You can specify up to 10 export directory IDs. Example: <code>exp-12345678</code> or <code>exp-12345678,exp-12345679</code>.</p>
         * </li>
         * <li><p>If Key is set to VpcIds, set Value to the VPC IDs of the protocol service. You can specify up to 10 VPC IDs. Example: <code>vpc-12345678</code> or <code>vpc-12345678,vpc-12345679</code>.</p>
         * </li>
         * <li><p>If Key is set to FsetIds, set Value to the Fileset IDs. You can specify up to 10 Fileset IDs. Example: <code>fset-12345678</code> or <code>fset-12345678,fset-12345679</code>.</p>
         * </li>
         * <li><p>If Key is set to Paths, set Value to the file system directories corresponding to the mount targets. You can specify up to 10 paths. Example: <code>/cpfs/mnt_1/</code> or <code>/cpfs/mnt_1/,/cpfs/mnt_2/</code>.</p>
         * </li>
         * <li><p>If Key is set to AccessGroupNames, set Value to the permission group names of the protocol service. You can specify up to 10 permission group names. Example: <code>ag-12345678</code> or <code>ag-12345678,ag-12345679</code>.</p>
         * </li>
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
