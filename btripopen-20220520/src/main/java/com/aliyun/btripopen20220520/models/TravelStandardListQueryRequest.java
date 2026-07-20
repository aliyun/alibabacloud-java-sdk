// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardListQueryRequest extends TeaModel {
    /**
     * <p>Applicable to parent-subsidiary enterprises. Set this parameter to true to query the unified group travel standards. If left empty, the system returns the travel rules that are currently in effect for the enterprise.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("from_group")
    public Boolean fromGroup;

    /**
     * <p>The page number, starting from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_no")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Maximum value: 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <p>The name of the travel standard to search for.</p>
     * 
     * <strong>example:</strong>
     * <p>普通员工规则</p>
     */
    @NameInMap("rule_name")
    public String ruleName;

    /**
     * <p>The user ID. Specify this parameter to query the travel standards bound to an employee.</p>
     * 
     * <strong>example:</strong>
     * <p>user_1234</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static TravelStandardListQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardListQueryRequest self = new TravelStandardListQueryRequest();
        return TeaModel.build(map, self);
    }

    public TravelStandardListQueryRequest setFromGroup(Boolean fromGroup) {
        this.fromGroup = fromGroup;
        return this;
    }
    public Boolean getFromGroup() {
        return this.fromGroup;
    }

    public TravelStandardListQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public TravelStandardListQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public TravelStandardListQueryRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public TravelStandardListQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
