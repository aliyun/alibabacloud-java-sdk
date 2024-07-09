// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListCdsFilesRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-320357****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the user to whom the cloud disk is allocated.</p>
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
    public java.util.List<String> fileIds;

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
     * <p>The token used for the next query. If this parameter is empty, all results are returned.</p>
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
     * <li><p>CreateTimeDesc</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>sorts files in descending order based on the time when they are created.</p>
     * <!-- -->
     * </li>
     * <li><p>ModifiedTimeAsc</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>sorts files in ascending order based on the time when they are modified.</p>
     * <!-- -->
     * </li>
     * <li><p>NameDesc</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>sorts files in descending order based on their names.</p>
     * <!-- -->
     * </li>
     * <li><p>SizeAsc</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>sorts files in ascending order based on their sizes.</p>
     * <!-- -->
     * </li>
     * <li><p>ModifiedTimeDesc</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>sorts files in descending order based on the time when they are modified.</p>
     * <!-- -->
     * </li>
     * <li><p>CreateTimeAsc</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>sorts files in ascending order based on the time when they are created.</p>
     * <!-- -->
     * </li>
     * <li><p>SizeDesc</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>sorts files in descending order based on their sizes.</p>
     * <!-- -->
     * </li>
     * <li><p>NameAsc</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>sorts files in ascending order based on their names.</p>
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTimeDesc</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The ID of the parent file.</p>
     * 
     * <strong>example:</strong>
     * <p>63636837e47e5a24a8a940218bef395c210e****</p>
     */
    @NameInMap("ParentFileId")
    public String parentFileId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <li><p>available</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>returns only normal files.</p>
     * <!-- -->
     * </li>
     * <li><p>uploading</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>returns only the files that are being uploaded.</p>
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListCdsFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCdsFilesRequest self = new ListCdsFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListCdsFilesRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public ListCdsFilesRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ListCdsFilesRequest setFileIds(java.util.List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

    public ListCdsFilesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListCdsFilesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCdsFilesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCdsFilesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListCdsFilesRequest setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public ListCdsFilesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCdsFilesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
