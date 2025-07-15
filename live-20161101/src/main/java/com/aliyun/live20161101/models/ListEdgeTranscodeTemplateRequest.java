// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEdgeTranscodeTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the data center.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3b-4d18-395c-8106-ff21a6</strong></strong></strong></p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The keyword of the query.</p>
     * <ul>
     * <li>You can specify a template ID for an exact match.</li>
     * <li>You can also specify a template name for a fuzzy match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>baseline</p>
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
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The sorting order of the templates by creation time. Default value: desc. Valid values:</p>
     * <ul>
     * <li>desc: descending order.</li>
     * <li>asc: ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The type of edge transcoding. Valid values:</p>
     * <ul>
     * <li><strong>common</strong>: standard transcoding and Narrowband HD™ 1.0 transcoding.</li>
     * <li><strong>nbhd-2</strong>: Narrowband HD™ 2.0 transcoding.</li>
     * <li><strong>ultra-hd</strong>: ultra-high definition transcoding.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, the query result is filtered based on the type of edge transcoding on which you are granted permissions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>nbhd-2</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The video encoding format. Valid values:</p>
     * <ul>
     * <li>H.264</li>
     * <li>H.265</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, the query result is filtered based on the video encoding format on which you are granted permissions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>H.264</p>
     */
    @NameInMap("VideoCodec")
    public String videoCodec;

    public static ListEdgeTranscodeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeTranscodeTemplateRequest self = new ListEdgeTranscodeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListEdgeTranscodeTemplateRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListEdgeTranscodeTemplateRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListEdgeTranscodeTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListEdgeTranscodeTemplateRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListEdgeTranscodeTemplateRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEdgeTranscodeTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEdgeTranscodeTemplateRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListEdgeTranscodeTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListEdgeTranscodeTemplateRequest setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }
    public String getVideoCodec() {
        return this.videoCodec;
    }

}
