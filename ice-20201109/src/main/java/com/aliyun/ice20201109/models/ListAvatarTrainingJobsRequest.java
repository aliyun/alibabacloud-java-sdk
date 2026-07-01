// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAvatarTrainingJobsRequest extends TeaModel {
    /**
     * <ul>
     * <li><p>The page number.</p>
     * </li>
     * <li><p>Default value: 1.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <ul>
     * <li><p>The number of entries per page.</p>
     * </li>
     * <li><p>Default value: 10.</p>
     * </li>
     * <li><p>Valid values: 1 to 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <ul>
     * <li><p>The job state.</p>
     * </li>
     * <li><p>Valid values: Init, Queuing, Training, Success, and Fail.</p>
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
