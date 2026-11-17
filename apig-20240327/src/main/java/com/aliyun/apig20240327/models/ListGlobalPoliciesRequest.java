// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGlobalPoliciesRequest extends TeaModel {
    /**
     * <p>Filters by mounted resource type. This parameter takes effect only for the BlackOrWhite policy type. By default, the Gateway, Domain, and Route types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Gateway</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The policy class name. You can specify multiple values separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>JWTAuth,OIDCAuth,ExternalZAuth</p>
     */
    @NameInMap("className")
    public String className;

    /**
     * <p>Filters by enabling status.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>Filters by environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxxx</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>Filters by gateway ID at the attachment level.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The global policy type.</p>
     * 
     * <strong>example:</strong>
     * <p>GlobalAuth</p>
     */
    @NameInMap("globalPolicyType")
    public String globalPolicyType;

    /**
     * <p>Filters by IP content by performing a LIKE query on the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.3.4</p>
     */
    @NameInMap("ipAccessControlContent")
    public String ipAccessControlContent;

    /**
     * <p>Filters by protocol layer. If you specify L4, configurations containing L4 are queried. If you specify L7, configurations that do not contain L4 are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>L7</p>
     */
    @NameInMap("ipAccessControlProtocolLayer")
    public String ipAccessControlProtocolLayer;

    /**
     * <p>Filters by resource name by performing a LIKE query on the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>my-route</p>
     */
    @NameInMap("ipAccessControlResourceName")
    public String ipAccessControlResourceName;

    /**
     * <p>Filters by IP access control type by performing a LIKE query on the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>White / Black</p>
     */
    @NameInMap("ipAccessControlType")
    public String ipAccessControlType;

    /**
     * <p>Filters by exact policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-jwt-auth</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
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
