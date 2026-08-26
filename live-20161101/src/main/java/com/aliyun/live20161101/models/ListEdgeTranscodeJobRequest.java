// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEdgeTranscodeJobRequest extends TeaModel {
    /**
     * <p>The data center ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-1</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The search keyword. Valid values:</p>
     * <ul>
     * <li>Task ID. Exact match is supported.</li>
     * <li>Task name. Fuzzy match is supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The collation based on CreateTime. Default value: desc. Valid values:</p>
     * <ul>
     * <li>desc: descending sorting.</li>
     * <li>asc: ascending sorting.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The edge transcoding task status. Valid values:</p>
     * <ul>
     * <li>0: not started.</li>
     * <li>1: running.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The edge transcoding type. Valid values:</p>
     * <ul>
     * <li>common: default transcoding (standard + Narrowband HD 1.0).</li>
     * <li>nbhd-2: Narrowband HD 2.0.</li>
     * <li>ultra-hd: ultra-high definition.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, transcoding templates for which the user has the corresponding transcoding type permissions are displayed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>common</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListEdgeTranscodeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeTranscodeJobRequest self = new ListEdgeTranscodeJobRequest();
        return TeaModel.build(map, self);
    }

    public ListEdgeTranscodeJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListEdgeTranscodeJobRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListEdgeTranscodeJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListEdgeTranscodeJobRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListEdgeTranscodeJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEdgeTranscodeJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEdgeTranscodeJobRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListEdgeTranscodeJobRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListEdgeTranscodeJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
