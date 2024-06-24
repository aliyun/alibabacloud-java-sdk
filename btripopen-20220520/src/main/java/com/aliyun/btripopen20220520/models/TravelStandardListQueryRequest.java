// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardListQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("from_group")
    public Boolean fromGroup;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_no")
    public Integer pageNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("rule_name")
    public String ruleName;

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

}
