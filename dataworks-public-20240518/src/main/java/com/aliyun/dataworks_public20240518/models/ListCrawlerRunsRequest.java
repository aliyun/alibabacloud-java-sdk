// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrawlerRunsRequest extends TeaModel {
    /**
     * <p>The ID of the metadata crawler. You can call ListCrawlers to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The lower bound of the run start time, in millisecond-level UNIX timestamp. The value must be within the last 30 days. If not specified, the default value is 30 days before the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("StartTimeFrom")
    public Long startTimeFrom;

    /**
     * <p>The upper bound of the run start time, in millisecond-level UNIX timestamp. The value must be within the last 30 days. If not specified, the default value is the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1710325405403</p>
     */
    @NameInMap("StartTimeTo")
    public Long startTimeTo;

    /**
     * <p>The run status. Valid values: WAITING, RUNNING, SUCCESS, ERROR, SHUTDOWN.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListCrawlerRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCrawlerRunsRequest self = new ListCrawlerRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListCrawlerRunsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListCrawlerRunsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCrawlerRunsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCrawlerRunsRequest setStartTimeFrom(Long startTimeFrom) {
        this.startTimeFrom = startTimeFrom;
        return this;
    }
    public Long getStartTimeFrom() {
        return this.startTimeFrom;
    }

    public ListCrawlerRunsRequest setStartTimeTo(Long startTimeTo) {
        this.startTimeTo = startTimeTo;
        return this;
    }
    public Long getStartTimeTo() {
        return this.startTimeTo;
    }

    public ListCrawlerRunsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
