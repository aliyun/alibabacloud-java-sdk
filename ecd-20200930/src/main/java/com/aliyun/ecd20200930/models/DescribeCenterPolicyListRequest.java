// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCenterPolicyListRequest extends TeaModel {
    /**
     * <p>學術代理功能開關。取值範圍：</p>
     * <ul>
     * <li>on：開啟。</li>
     * <li>off：關閉。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("AcademicProxy")
    public String academicProxy;

    /**
     * <p>業務類型。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BusinessType")
    public Integer businessType;

    /**
     * <p>模型庫功能開關。取值範圍：</p>
     * <ul>
     * <li>on：開啟。</li>
     * <li>off：關閉。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("ModelLibrary")
    public String modelLibrary;

    /**
     * <p>分頁查詢時，當前頁的頁碼。<br>預設值：1。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>分頁查詢時，每頁最大行數。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>雲端電腦策略ID清單。</p>
     */
    @NameInMap("PolicyGroupId")
    public java.util.List<String> policyGroupId;

    /**
     * <p>連接埠代理功能開關。取值範圍：</p>
     * <ul>
     * <li>on：開啟。</li>
     * <li>off：關閉。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("PortProxy")
    public String portProxy;

    /**
     * <p>資源類型。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>雲端電腦策略的生效範圍。</p>
     * 
     * <strong>example:</strong>
     * <p>GLOBAL</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static DescribeCenterPolicyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenterPolicyListRequest self = new DescribeCenterPolicyListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCenterPolicyListRequest setAcademicProxy(String academicProxy) {
        this.academicProxy = academicProxy;
        return this;
    }
    public String getAcademicProxy() {
        return this.academicProxy;
    }

    public DescribeCenterPolicyListRequest setBusinessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }
    public Integer getBusinessType() {
        return this.businessType;
    }

    public DescribeCenterPolicyListRequest setModelLibrary(String modelLibrary) {
        this.modelLibrary = modelLibrary;
        return this;
    }
    public String getModelLibrary() {
        return this.modelLibrary;
    }

    public DescribeCenterPolicyListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenterPolicyListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenterPolicyListRequest setPolicyGroupId(java.util.List<String> policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public java.util.List<String> getPolicyGroupId() {
        return this.policyGroupId;
    }

    public DescribeCenterPolicyListRequest setPortProxy(String portProxy) {
        this.portProxy = portProxy;
        return this;
    }
    public String getPortProxy() {
        return this.portProxy;
    }

    public DescribeCenterPolicyListRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeCenterPolicyListRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
