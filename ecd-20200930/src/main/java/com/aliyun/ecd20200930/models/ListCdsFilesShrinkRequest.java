// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListCdsFilesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the enterprise drive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-320357****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the user to which the network disk is assigned.</p>
     * 
     * <strong>example:</strong>
     * <p>testUser</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The IDs of the files to be queried.</p>
     */
    @NameInMap("FileIds")
    public String fileIdsShrink;

    /**
     * <p>The ID of the team space.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The number of entries to return on each page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the value of the <code>NextToken</code> parameter returned in the last call to the operation. You do not need to set this parameter when you call the operation for the first time.</p>
     * 
     * <strong>example:</strong>
     * <p>WyI2Mzg4MjAwMzFhNGQwZWVmN2I3MjRkZjZhZjAyMWU4YzY1MmRjZmUyIiwibiIsIm4iLDEsLTEsMTY2OTg2NTQ3NTMxMiwiNjM4ODIwMDNlNTU0YmZiZjFkYTk0MmEyYTZhMjEyZDkxODdjMjAy****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sorting method of the files.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CreateTimeDesc: sorts the by creation time in descending order.</li>
     * <li>ModifiedTimeAsc: sort the by modification time in ascending order.</li>
     * <li>NameDesc: sorts the by file name in descending order.</li>
     * <li>SizeAsc: sorts by file size in ascending order.</li>
     * <li>ModifiedTimeDesc: sort the by modification time in descending order.</li>
     * <li>CreateTimeAsc: sorts the by creation time in ascending order.</li>
     * <li>SizeDesc: sorts by file size in descending order.</li>
     * <li>NameAsc: sorts by file name in ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTimeDesc</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The parent folder ID. You can obtain the value by using the response parameter <code>FileId</code> of this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>63636837e47e5a24a8a940218bef395c210e****</p>
     */
    @NameInMap("ParentFileId")
    public String parentFileId;

    /**
     * <p>The ID of the logon region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to obtain the list of regions supported by cloud computers.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The file status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>available: returns only normal file.</li>
     * <li>uploading: returns only the of objects that are being uploaded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListCdsFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCdsFilesShrinkRequest self = new ListCdsFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCdsFilesShrinkRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public ListCdsFilesShrinkRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListCdsFilesShrinkRequest setFileIdsShrink(String fileIdsShrink) {
        this.fileIdsShrink = fileIdsShrink;
        return this;
    }
    public String getFileIdsShrink() {
        return this.fileIdsShrink;
    }

    public ListCdsFilesShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListCdsFilesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCdsFilesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCdsFilesShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListCdsFilesShrinkRequest setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public ListCdsFilesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCdsFilesShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
