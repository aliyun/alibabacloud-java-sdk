// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrawlerRunsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("StartTimeFrom")
    public Long startTimeFrom;

    /**
     * <strong>example:</strong>
     * <p>1710325405403</p>
     */
    @NameInMap("StartTimeTo")
    public Long startTimeTo;

    /**
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
