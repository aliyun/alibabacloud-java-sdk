// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSchedulesResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 20. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The program schedule.</p>
     */
    @NameInMap("Programs")
    public java.util.List<ChannelAssemblyScheduleData> programs;

    /**
     * <p><strong>Request ID</strong></p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSchedulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSchedulesResponseBody self = new ListSchedulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSchedulesResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListSchedulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSchedulesResponseBody setPrograms(java.util.List<ChannelAssemblyScheduleData> programs) {
        this.programs = programs;
        return this;
    }
    public java.util.List<ChannelAssemblyScheduleData> getPrograms() {
        return this.programs;
    }

    public ListSchedulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSchedulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
