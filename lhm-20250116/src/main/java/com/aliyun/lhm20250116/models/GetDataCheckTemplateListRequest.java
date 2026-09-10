// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckTemplateListRequest extends TeaModel {
    /**
     * <p>The validation rule type. Valid values:</p>
     * <ul>
     * <li>0: data volume comparison.</li>
     * <li>1: metric comparison.</li>
     * <li>2: weak content comparison.</li>
     * <li>3: custom comparison.</li>
     * <li>4: full-text comparison.</li>
     * <li>5: null rate comparison.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("checkType")
    public Integer checkType;

    /**
     * <p>The field used for grouping (GROUP BY condition). Configure this parameter as needed.</p>
     * 
     * <strong>example:</strong>
     * <p>order_date</p>
     */
    @NameInMap("groupBy")
    public String groupBy;

    /**
     * <p>The list of validation template UUIDs. The source code of CheckTemplatePagedQry indicates that this parameter has no actual effect and does not need to be exposed externally. It is retained only for backward compatibility with legacy calls. Passing this parameter does not affect query results.</p>
     */
    @NameInMap("idList")
    public java.util.List<String> idList;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not need to be passed. The source code of CheckTemplatePagedQry marks this parameter with @Deprecated.</p>
     */
    @NameInMap("isAdmin")
    public Boolean isAdmin;

    /**
     * <p>Specifies whether the template is built-in. Valid values:</p>
     * <ul>
     * <li>0: No. The template is a custom template.</li>
     * <li>1: Yes. The template is a built-in template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("isBuiltin")
    public Integer isBuiltin;

    /**
     * <p>Specifies whether to return the total record count in the paginated results.</p>
     */
    @NameInMap("needTotalCount")
    public Boolean needTotalCount;

    /**
     * <p>The field used for sorting. Configure this parameter as needed.</p>
     * 
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>The sort direction. Valid values:</p>
     * <ul>
     * <li>ASC: ascending order.</li>
     * <li>DESC: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The page size, which specifies the number of records returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4B7A-9C3D-2A8F7E6B5C4D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The name of the validation template.</p>
     * 
     * <strong>example:</strong>
     * <p>DataVolumeValidationTemplate</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetDataCheckTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckTemplateListRequest self = new GetDataCheckTemplateListRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCheckTemplateListRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public GetDataCheckTemplateListRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public GetDataCheckTemplateListRequest setIdList(java.util.List<String> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<String> getIdList() {
        return this.idList;
    }

    public GetDataCheckTemplateListRequest setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public GetDataCheckTemplateListRequest setIsBuiltin(Integer isBuiltin) {
        this.isBuiltin = isBuiltin;
        return this;
    }
    public Integer getIsBuiltin() {
        return this.isBuiltin;
    }

    public GetDataCheckTemplateListRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public GetDataCheckTemplateListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetDataCheckTemplateListRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public GetDataCheckTemplateListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetDataCheckTemplateListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetDataCheckTemplateListRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCheckTemplateListRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetDataCheckTemplateListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
