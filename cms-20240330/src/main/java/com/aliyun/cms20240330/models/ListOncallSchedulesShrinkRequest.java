// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListOncallSchedulesShrinkRequest extends TeaModel {
    @NameInMap("oncallScheduleIds")
    public String oncallScheduleIdsShrink;

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

    public static ListOncallSchedulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOncallSchedulesShrinkRequest self = new ListOncallSchedulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListOncallSchedulesShrinkRequest setOncallScheduleIdsShrink(String oncallScheduleIdsShrink) {
        this.oncallScheduleIdsShrink = oncallScheduleIdsShrink;
        return this;
    }
    public String getOncallScheduleIdsShrink() {
        return this.oncallScheduleIdsShrink;
    }

    public ListOncallSchedulesShrinkRequest setOncallScheduleName(String oncallScheduleName) {
        this.oncallScheduleName = oncallScheduleName;
        return this;
    }
    public String getOncallScheduleName() {
        return this.oncallScheduleName;
    }

    public ListOncallSchedulesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOncallSchedulesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOncallSchedulesShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
