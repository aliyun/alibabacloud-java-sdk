// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListAlarmRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;instanceId&quot;:&quot;XXX&quot;}</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <strong>example:</strong>
     * <p>i-2ze3w55tr2rcpejpcfap_72071739-396b-497d-849c-59a73de44bcf</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsEnable")
    public Boolean isEnable;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("State")
    public String state;

    public static ListAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmRequest self = new ListAlarmRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public ListAlarmRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListAlarmRequest setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public Boolean getIsEnable() {
        return this.isEnable;
    }

    public ListAlarmRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAlarmRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListAlarmRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlarmRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlarmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAlarmRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
