// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListDeptMembersRequest extends TeaModel {
    /**
     * <p>The authorization configuration filter. Valid values:</p>
     * <ul>
     * <li>inherit: only members that inherit department settings.</li>
     * <li>custom: only members with custom settings.</li>
     * <li>Empty: all members.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>inherit</p>
     */
    @NameInMap("authConfig")
    public String authConfig;

    /**
     * <p>Specifies whether to include the authorized models and the number of associated keys for the member.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeAuthorization")
    public Boolean includeAuthorization;

    /**
     * <p>Specifies whether to include the monthly and permanent balance of the member\&quot;s sub-wallet.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("includeBalance")
    public Boolean includeBalance;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>John</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>Filters members by the authorized model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
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
