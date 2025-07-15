// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEdgeTranscodeJobRequest extends TeaModel {
    /**
     * <p>The ID of the data center.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-1</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The keyword of the query.</p>
     * <ul>
     * <li>You can specify a task ID for an exact match.</li>
     * <li>You can specify a task name for a fuzzy match.</li>
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

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The sort order of the tasks by creation time. Default value: desc. Valid values:</p>
     * <ul>
     * <li>desc: descending order</li>
     * <li>asc: ascending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>0: not started</li>
     * <li>1: running</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The type of edge transcoding. Valid values:</p>
     * <ul>
     * <li>common: standard transcoding and Narrowband HD™ 1.0 transcoding.</li>
     * <li>nbhd-2: Narrowband HD™ 2.0 transcoding</li>
     * <li>ultra-hd: ultra-high definition transcoding</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, the query results are filtered based on the types of edge transcoding on which you are granted permissions.</p>
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
