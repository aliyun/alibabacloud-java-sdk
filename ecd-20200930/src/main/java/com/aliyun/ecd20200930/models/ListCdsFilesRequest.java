// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListCdsFilesRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the user to whom the cloud disk is allocated.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The IDs of the files to be queried.</p>
     */
    @NameInMap("FileIds")
    public java.util.List<String> fileIds;

    /**
     * <p>The number of entries to return on each page. Default value: 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used for the next query. If this parameter is empty, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sorting method of the files.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   CreateTimeDesc</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    sorts files in descending order based on the time when they are created.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   ModifiedTimeAsc</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    sorts files in ascending order based on the time when they are modified.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   NameDesc</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    sorts files in descending order based on their names.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   SizeAsc</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    sorts files in ascending order based on their sizes.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   ModifiedTimeDesc</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    sorts files in descending order based on the time when they are modified.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   CreateTimeAsc</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    sorts files in ascending order based on the time when they are created.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   SizeDesc</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    sorts files in descending order based on their sizes.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   NameAsc</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    sorts files in ascending order based on their names.</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The ID of the parent file.</p>
     */
    @NameInMap("ParentFileId")
    public String parentFileId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The file status.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   available</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    returns only normal files.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   uploading</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    returns only the files that are being uploaded.</p>
     * <br>
     * <p>    <!-- --></p>
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
