// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGlobalPoliciesRequest extends TeaModel {
    /**
     * <p>The attached resource type to filter by. This parameter takes effect only when globalPolicyType is set to BlackOrWhite. If this parameter is not specified, Gateway, Domain, and Route resources are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Gateway</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The policy class name. Separate multiple values with commas (server-side strings.Split).</p>
     * 
     * <strong>example:</strong>
     * <p>JWTAuth,OIDCAuth,ExternalZAuth</p>
     */
    @NameInMap("className")
    public String className;

    /**
     * <p>The enabling status to filter by.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The environment ID to filter by.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxxx</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The gateway ID to filter by (attachment dimension).</p>
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
     * <p>The IP content to filter by. A LIKE match is performed on the config field.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.3.4</p>
     */
    @NameInMap("ipAccessControlContent")
    public String ipAccessControlContent;

    /**
     * <p>The protocol layer to filter by. L4 queries config entries that contain L4. L7 queries config entries that do not contain L4.</p>
     * 
     * <strong>example:</strong>
     * <p>L7</p>
     */
    @NameInMap("ipAccessControlProtocolLayer")
    public String ipAccessControlProtocolLayer;

    /**
     * <p>The resource name to filter by. A LIKE match is performed on the config field.</p>
     * 
     * <strong>example:</strong>
     * <p>my-route</p>
     */
    @NameInMap("ipAccessControlResourceName")
    public String ipAccessControlResourceName;

    /**
     * <p>The IP access control type to filter by. A LIKE match is performed on the config field.</p>
     * 
     * <strong>example:</strong>
     * <p>White / Black</p>
     */
    @NameInMap("ipAccessControlType")
    public String ipAccessControlType;

    /**
     * <p>The exact policy name to filter by.</p>
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
