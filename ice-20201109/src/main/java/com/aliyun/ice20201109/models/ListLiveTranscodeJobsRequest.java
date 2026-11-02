// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveTranscodeJobsRequest extends TeaModel {
    /**
     * <p>The search keyword. You can search by job ID or name. Fuzzy match is supported for job names.</p>
     * 
     * <strong>example:</strong>
     * <p>24ecbb5c-4f98-4194-9400-f17102e27fc5</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

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
     * <p>The sort order based on CreateTime. Default value: desc. Valid values:</p>
     * <ul>
     * <li>asc: Ascending order.</li>
     * <li>desc: Descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start mode. Valid values:</p>
     * <ul>
     * <li>0: Starts immediately.</li>
     * <li>1: Starts at a scheduled time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartMode")
    public Integer startMode;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li>0: Not started.</li>
     * <li>1: Running.</li>
     * <li>2: Stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The template type corresponding to the transcoding job. Valid values:</p>
     * <ul>
     * <li>normal: Standard template.</li>
     * <li>narrow-band: Narrowband HD template.</li>
     * <li>audio-only: Audio-only template.</li>
     * <li>origin: Original quality template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListLiveTranscodeJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveTranscodeJobsRequest self = new ListLiveTranscodeJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveTranscodeJobsRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ListLiveTranscodeJobsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListLiveTranscodeJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLiveTranscodeJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveTranscodeJobsRequest setStartMode(Integer startMode) {
        this.startMode = startMode;
        return this;
    }
    public Integer getStartMode() {
        return this.startMode;
    }

    public ListLiveTranscodeJobsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListLiveTranscodeJobsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
