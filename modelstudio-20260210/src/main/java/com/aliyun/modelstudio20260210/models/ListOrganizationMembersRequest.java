// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListOrganizationMembersRequest extends TeaModel {
    /**
     * <p>Specifies whether to filter by seat assignment.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasSeat")
    public Boolean hasSeat;

    /**
     * <p>Fuzzy filter by member name. Matches accountName or email and is case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>成员名称</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number, starting from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filters by member status, such as ACTIVE or FROZEN. Set to null to disable filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListOrganizationMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationMembersRequest self = new ListOrganizationMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListOrganizationMembersRequest setHasSeat(Boolean hasSeat) {
        this.hasSeat = hasSeat;
        return this;
    }
    public Boolean getHasSeat() {
        return this.hasSeat;
    }

    public ListOrganizationMembersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListOrganizationMembersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListOrganizationMembersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrganizationMembersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
