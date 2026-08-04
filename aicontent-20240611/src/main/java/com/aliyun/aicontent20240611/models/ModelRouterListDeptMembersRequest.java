// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListDeptMembersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>inherit</p>
     */
    @NameInMap("authConfig")
    public String authConfig;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeAuthorization")
    public Boolean includeAuthorization;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("includeBalance")
    public Boolean includeBalance;

    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ModelRouterListDeptMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListDeptMembersRequest self = new ModelRouterListDeptMembersRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterListDeptMembersRequest setAuthConfig(String authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public String getAuthConfig() {
        return this.authConfig;
    }

    public ModelRouterListDeptMembersRequest setIncludeAuthorization(Boolean includeAuthorization) {
        this.includeAuthorization = includeAuthorization;
        return this;
    }
    public Boolean getIncludeAuthorization() {
        return this.includeAuthorization;
    }

    public ModelRouterListDeptMembersRequest setIncludeBalance(Boolean includeBalance) {
        this.includeBalance = includeBalance;
        return this;
    }
    public Boolean getIncludeBalance() {
        return this.includeBalance;
    }

    public ModelRouterListDeptMembersRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ModelRouterListDeptMembersRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ModelRouterListDeptMembersRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ModelRouterListDeptMembersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
