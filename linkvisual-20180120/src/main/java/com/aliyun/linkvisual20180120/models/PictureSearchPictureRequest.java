// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class PictureSearchPictureRequest extends TeaModel {
    /**
     * <p>Instance ID of the image search application instance. You can call the <a href="https://help.aliyun.com/document_detail/206608.html">QueryPictureSearchApps</a> operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5a502d3fbab8410e8fd4be9037c7****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>Specifies whether the response includes the image URL.</p>
     * <blockquote>
     * <p>Currently, the response is returned regardless of whether this parameter is set to true or false.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ContainPicUrl")
    public Boolean containPicUrl;

    /**
     * <p>The page number of the page to return. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time of the search range. The time is a 13-digit timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1614850651299</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of entries to return on each page. Maximum value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong> (default): face</li>
     * <li><strong>0</strong>: human body</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PictureSearchType")
    public Integer pictureSearchType;

    /**
     * <p>The URL of the image to search for.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SearchPicUrl")
    public String searchPicUrl;

    /**
     * <p>The start time of the search range. The time is a 13-digit timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1614297000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The search threshold. Valid values: 0 to 1.</p>
     * <blockquote>
     * <p>Set the search threshold to a value greater than or equal to 0.3 to ensure a match with the detected object.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    public static PictureSearchPictureRequest build(java.util.Map<String, ?> map) throws Exception {
        PictureSearchPictureRequest self = new PictureSearchPictureRequest();
        return TeaModel.build(map, self);
    }

    public PictureSearchPictureRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public PictureSearchPictureRequest setContainPicUrl(Boolean containPicUrl) {
        this.containPicUrl = containPicUrl;
        return this;
    }
    public Boolean getContainPicUrl() {
        return this.containPicUrl;
    }

    public PictureSearchPictureRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public PictureSearchPictureRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public PictureSearchPictureRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PictureSearchPictureRequest setPictureSearchType(Integer pictureSearchType) {
        this.pictureSearchType = pictureSearchType;
        return this;
    }
    public Integer getPictureSearchType() {
        return this.pictureSearchType;
    }

    public PictureSearchPictureRequest setSearchPicUrl(String searchPicUrl) {
        this.searchPicUrl = searchPicUrl;
        return this;
    }
    public String getSearchPicUrl() {
        return this.searchPicUrl;
    }

    public PictureSearchPictureRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public PictureSearchPictureRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
