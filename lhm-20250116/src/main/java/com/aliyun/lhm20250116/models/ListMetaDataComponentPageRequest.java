// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaDataComponentPageRequest extends TeaModel {
    /**
     * <p>The category type of the data source. Valid values: DATASET, WORKFLOW, and ENGINE. For scheduling scenarios, this parameter is set to WORKFLOW.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKFLOW</p>
     */
    @NameInMap("categoryType")
    public String categoryType;

    /**
     * <p>The entry component type. In some operations, this parameter is used as a backward compatible field for version 1.1.0. Valid values:</p>
     * <ul>
     * <li>0: source</li>
     * <li>1: destination</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("componentType")
    public Integer componentType;

    /**
     * <p>The data source name. Exact match and fuzzy match are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test_ds318_hangzhou_0428</p>
     */
    @NameInMap("dsName")
    public String dsName;

    /**
     * <p>The connectivity status of the data source. Valid values:</p>
     * <ul>
     * <li>0: Not tested.</li>
     * <li>1: Connected.</li>
     * <li>2: Connection failed.</li>
     * <li>-1: Connectivity test not supported.</li>
     * </ul>
     */
    @NameInMap("dsStatus")
    public java.util.List<Integer> dsStatus;

    /**
     * <p>The data source type, such as Hive or MaxCompute.</p>
     * 
     * <strong>example:</strong>
     * <p>Hive</p>
     */
    @NameInMap("dsType")
    public String dsType;

    /**
     * <p>The list of data source types.</p>
     */
    @NameInMap("dsTypeList")
    public java.util.List<String> dsTypeList;

    /**
     * <p>The grouping field (GROUP BY condition). Set this parameter as needed.</p>
     * 
     * <strong>example:</strong>
     * <p>order_date</p>
     */
    @NameInMap("groupBy")
    public String groupBy;

    /**
     * <p>Specifies whether to return the total number of records in the paginated result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("needTotalCount")
    public String needTotalCount;

    /**
     * <p>The sort field. Set this parameter as needed.</p>
     * 
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>The sort direction. Valid values:</p>
     * <ul>
     * <li>ASC: ascending order</li>
     * <li>DESC: descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The page size, which is the number of records returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The source component ID, which is the primary key of the source data source component.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("srcComponentId")
    public Long srcComponentId;

    public static ListMetaDataComponentPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaDataComponentPageRequest self = new ListMetaDataComponentPageRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaDataComponentPageRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public ListMetaDataComponentPageRequest setComponentType(Integer componentType) {
        this.componentType = componentType;
        return this;
    }
    public Integer getComponentType() {
        return this.componentType;
    }

    public ListMetaDataComponentPageRequest setDsName(String dsName) {
        this.dsName = dsName;
        return this;
    }
    public String getDsName() {
        return this.dsName;
    }

    public ListMetaDataComponentPageRequest setDsStatus(java.util.List<Integer> dsStatus) {
        this.dsStatus = dsStatus;
        return this;
    }
    public java.util.List<Integer> getDsStatus() {
        return this.dsStatus;
    }

    public ListMetaDataComponentPageRequest setDsType(String dsType) {
        this.dsType = dsType;
        return this;
    }
    public String getDsType() {
        return this.dsType;
    }

    public ListMetaDataComponentPageRequest setDsTypeList(java.util.List<String> dsTypeList) {
        this.dsTypeList = dsTypeList;
        return this;
    }
    public java.util.List<String> getDsTypeList() {
        return this.dsTypeList;
    }

    public ListMetaDataComponentPageRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public ListMetaDataComponentPageRequest setNeedTotalCount(String needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public String getNeedTotalCount() {
        return this.needTotalCount;
    }

    public ListMetaDataComponentPageRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListMetaDataComponentPageRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListMetaDataComponentPageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListMetaDataComponentPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaDataComponentPageRequest setSrcComponentId(Long srcComponentId) {
        this.srcComponentId = srcComponentId;
        return this;
    }
    public Long getSrcComponentId() {
        return this.srcComponentId;
    }

}
