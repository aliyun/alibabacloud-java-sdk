// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGlobalPoliciesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Gateway</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <strong>example:</strong>
     * <p>JWTAuth,OIDCAuth,ExternalZAuth</p>
     */
    @NameInMap("className")
    public String className;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>env-xxxx</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <strong>example:</strong>
     * <p>gw-xxxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>GlobalAuth</p>
     */
    @NameInMap("globalPolicyType")
    public String globalPolicyType;

    /**
     * <strong>example:</strong>
     * <p>1.2.3.4</p>
     */
    @NameInMap("ipAccessControlContent")
    public String ipAccessControlContent;

    /**
     * <strong>example:</strong>
     * <p>L7</p>
     */
    @NameInMap("ipAccessControlProtocolLayer")
    public String ipAccessControlProtocolLayer;

    /**
     * <strong>example:</strong>
     * <p>my-route</p>
     */
    @NameInMap("ipAccessControlResourceName")
    public String ipAccessControlResourceName;

    /**
     * <strong>example:</strong>
     * <p>White / Black</p>
     */
    @NameInMap("ipAccessControlType")
    public String ipAccessControlType;

    /**
     * <strong>example:</strong>
     * <p>my-jwt-auth</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListGlobalPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalPoliciesRequest self = new ListGlobalPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListGlobalPoliciesRequest setAttachResourceType(String attachResourceType) {
        this.attachResourceType = attachResourceType;
        return this;
    }
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    public ListGlobalPoliciesRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public ListGlobalPoliciesRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ListGlobalPoliciesRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListGlobalPoliciesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListGlobalPoliciesRequest setGlobalPolicyType(String globalPolicyType) {
        this.globalPolicyType = globalPolicyType;
        return this;
    }
    public String getGlobalPolicyType() {
        return this.globalPolicyType;
    }

    public ListGlobalPoliciesRequest setIpAccessControlContent(String ipAccessControlContent) {
        this.ipAccessControlContent = ipAccessControlContent;
        return this;
    }
    public String getIpAccessControlContent() {
        return this.ipAccessControlContent;
    }

    public ListGlobalPoliciesRequest setIpAccessControlProtocolLayer(String ipAccessControlProtocolLayer) {
        this.ipAccessControlProtocolLayer = ipAccessControlProtocolLayer;
        return this;
    }
    public String getIpAccessControlProtocolLayer() {
        return this.ipAccessControlProtocolLayer;
    }

    public ListGlobalPoliciesRequest setIpAccessControlResourceName(String ipAccessControlResourceName) {
        this.ipAccessControlResourceName = ipAccessControlResourceName;
        return this;
    }
    public String getIpAccessControlResourceName() {
        return this.ipAccessControlResourceName;
    }

    public ListGlobalPoliciesRequest setIpAccessControlType(String ipAccessControlType) {
        this.ipAccessControlType = ipAccessControlType;
        return this;
    }
    public String getIpAccessControlType() {
        return this.ipAccessControlType;
    }

    public ListGlobalPoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListGlobalPoliciesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGlobalPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
