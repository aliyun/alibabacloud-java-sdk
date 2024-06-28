// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRelationListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The states of the relationships between the management account and its members. The valid values of this parameter are the enumeration members of the RelationshipStatusEnum data type. If you do not specify this parameter, valid relationship states are queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>RELATED</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1990699401005016</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static QueryRelationListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRelationListRequest self = new QueryRelationListRequest();
        return TeaModel.build(map, self);
    }

    public QueryRelationListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryRelationListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRelationListRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public QueryRelationListRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
