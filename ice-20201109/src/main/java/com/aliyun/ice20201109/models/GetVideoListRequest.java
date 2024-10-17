// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVideoListRequest extends TeaModel {
    /**
     * <p>The ID of the category.</p>
     * 
     * <strong>example:</strong>
     * <p>781111</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:59:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sorting method of the results. Valid values:</p>
     * <ul>
     * <li>CreationTime:Desc (default): sorts results in reverse chronological order.</li>
     * <li>CreationTime:Asc: sorts results in chronological order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the video. You can specify multiple video statuses and separate them with commas (,).</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PrepareFail: The file is abnormal.</li>
     * <li>UploadFail: The video failed to be uploaded.</li>
     * <li>UploadSucc: The video is uploaded.</li>
     * <li>Transcoding: The video is being transcoded.</li>
     * <li>TranscodeFail: The video failed to be transcoded.</li>
     * <li>ProduceFail: The video failed to be produced.</li>
     * <li>Normal: The video is normal.</li>
     * <li>Uploading: The video is being uploaded.</li>
     * <li>Preparing: The file is being generated.</li>
     * <li>Blocked: The video is blocked.</li>
     * <li>checking: The video is being reviewed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Uploading,Normal</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetVideoListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoListRequest self = new GetVideoListRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoListRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public GetVideoListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetVideoListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetVideoListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetVideoListRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public GetVideoListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetVideoListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
