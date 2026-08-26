// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterProgramRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you create a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, use the CasterId value that is returned in the response.</p>
     * </li>
     * <li><p>If you create a production studio in the LIVE console, find the ID on the Cloud Production Studio page. To go to this page, choose <strong>LIVE</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the list on the Cloud Production Studio page is its ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The end time. The time must be in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format and in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T10:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the program.</p>
     * 
     * <strong>example:</strong>
     * <p>1872639A-F203-4EC5-8E43-CB92E68F****</p>
     */
    @NameInMap("EpisodeId")
    public String episodeId;

    /**
     * <p>The type of the node. Valid values:</p>
     * <ul>
     * <li><p><strong>Resource</strong>: video source.</p>
     * </li>
     * <li><p><strong>Component</strong>: component.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Resource</p>
     */
    @NameInMap("EpisodeType")
    public String episodeType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of programs on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. The time must be in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format and in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T09:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the program. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: not started</p>
     * </li>
     * <li><p><strong>1</strong>: playing</p>
     * </li>
     * <li><p><strong>2</strong>: finished</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeCasterProgramRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterProgramRequest self = new DescribeCasterProgramRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasterProgramRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterProgramRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCasterProgramRequest setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
        return this;
    }
    public String getEpisodeId() {
        return this.episodeId;
    }

    public DescribeCasterProgramRequest setEpisodeType(String episodeType) {
        this.episodeType = episodeType;
        return this;
    }
    public String getEpisodeType() {
        return this.episodeType;
    }

    public DescribeCasterProgramRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCasterProgramRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeCasterProgramRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCasterProgramRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCasterProgramRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCasterProgramRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
