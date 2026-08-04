// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetMemberBalanceLogsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>recharge</p>
     */
    @NameInMap("changeType")
    public String changeType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("skipTotal")
    public Boolean skipTotal;

    public static ModelRouterGetMemberBalanceLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetMemberBalanceLogsRequest self = new ModelRouterGetMemberBalanceLogsRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetMemberBalanceLogsRequest setChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }
    public String getChangeType() {
        return this.changeType;
    }

    public ModelRouterGetMemberBalanceLogsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ModelRouterGetMemberBalanceLogsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ModelRouterGetMemberBalanceLogsRequest setSkipTotal(Boolean skipTotal) {
        this.skipTotal = skipTotal;
        return this;
    }
    public Boolean getSkipTotal() {
        return this.skipTotal;
    }

}
