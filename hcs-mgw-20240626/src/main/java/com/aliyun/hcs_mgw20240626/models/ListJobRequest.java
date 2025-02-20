// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListJobRequest extends TeaModel {
    /**
     * <p>Specifies whether to return subtasks.\
     * Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>Specifies the number of migration tasks to be returned.\
     * Valid values: 0 - 1000 (excluding 0).\
     * Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The marker after which the migration tasks are listed.\
     * By default, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>test_marker</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The name of the parent task. If this parameter is specified, all subtasks of the parent task are returned.</p>
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
