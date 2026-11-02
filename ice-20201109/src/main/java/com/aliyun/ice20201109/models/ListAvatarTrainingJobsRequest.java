// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAvatarTrainingJobsRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Default value: 10</li>
     * <li>Maximum value: 100</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><p>Init: initialized or draft</p>
     * </li>
     * <li><p>Queuing: queuing</p>
     * </li>
     * <li><p>Training: training</p>
     * </li>
     * <li><p>Success: training succeeded</p>
     * </li>
     * <li><p>Fail: training failed</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListAvatarTrainingJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvatarTrainingJobsRequest self = new ListAvatarTrainingJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListAvatarTrainingJobsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListAvatarTrainingJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAvatarTrainingJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
