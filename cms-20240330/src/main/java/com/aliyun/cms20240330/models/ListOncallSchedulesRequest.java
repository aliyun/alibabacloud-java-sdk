// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListOncallSchedulesRequest extends TeaModel {
    @NameInMap("oncallScheduleIds")
    public java.util.List<String> oncallScheduleIds;

    /**
     * <strong>example:</strong>
     * <p>testOncallScheduleName</p>
     */
    @NameInMap("oncallScheduleName")
    public String oncallScheduleName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>default-cms-5884500827389836-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ListOncallSchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOncallSchedulesRequest self = new ListOncallSchedulesRequest();
        return TeaModel.build(map, self);
    }

    public ListOncallSchedulesRequest setOncallScheduleIds(java.util.List<String> oncallScheduleIds) {
        this.oncallScheduleIds = oncallScheduleIds;
        return this;
    }
    public java.util.List<String> getOncallScheduleIds() {
        return this.oncallScheduleIds;
    }

    public ListOncallSchedulesRequest setOncallScheduleName(String oncallScheduleName) {
        this.oncallScheduleName = oncallScheduleName;
        return this;
    }
    public String getOncallScheduleName() {
        return this.oncallScheduleName;
    }

    public ListOncallSchedulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOncallSchedulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOncallSchedulesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
