// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListJobRequest extends TeaModel {
    /**
     * <p>Specifies whether to return subtasks.<br>Valid values: true, false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>Specifies the number of migration tasks to return.<br>Valid values: 1 to 1000.<br>Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>Specifies the marker after which migration tasks are listed.<br>Default value: None.</p>
     * 
     * <strong>example:</strong>
     * <p>test_marker</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The name of the parent task. If you specify this parameter, all subtasks of the parent task are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>test_parent_job_name</p>
     */
    @NameInMap("parentName")
    public String parentName;

    public static ListJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobRequest self = new ListJobRequest();
        return TeaModel.build(map, self);
    }

    public ListJobRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ListJobRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListJobRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListJobRequest setParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }
    public String getParentName() {
        return this.parentName;
    }

}
