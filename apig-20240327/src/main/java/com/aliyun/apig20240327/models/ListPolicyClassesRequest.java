// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPolicyClassesRequest extends TeaModel {
    /**
     * <p>The resource ID to attach the policy</p>
     * 
     * <strong>example:</strong>
     * <p>route-001</p>
     */
    @NameInMap("attachResourceId")
    public String attachResourceId;

    /**
     * <p>The supported mount point type. Valid values:</p>
     * <ul>
     * <li>HttpApi: an HTTP API</li>
     * <li>Operation: an operation in an HTTP API</li>
     * <li>GatewayRoute: a route</li>
     * <li>GatewayService: a service</li>
     * <li>GatewayServicePort: a service port</li>
     * <li>Domain: a domain name</li>
     * <li>Gateway: an instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Operation</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The direction of traffic on which the policy takes effect. Valid values:</p>
     * <ul>
     * <li>OutBound</li>
     * <li>InBound</li>
     * <li>Both</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InBound</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>The gateway ID</p>
     * 
     * <strong>example:</strong>
     * <p>gw-001</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The page number of the page to return. Default value: 1.</p>
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

    /**
     * <p>The template type.</p>
     * 
     * <strong>example:</strong>
     * <p>FlowControl</p>
     */
    @NameInMap("type")
    public String type;

    public static ListPolicyClassesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyClassesRequest self = new ListPolicyClassesRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicyClassesRequest setAttachResourceId(String attachResourceId) {
        this.attachResourceId = attachResourceId;
        return this;
    }
    public String getAttachResourceId() {
        return this.attachResourceId;
    }

    public ListPolicyClassesRequest setAttachResourceType(String attachResourceType) {
        this.attachResourceType = attachResourceType;
        return this;
    }
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    public ListPolicyClassesRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListPolicyClassesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListPolicyClassesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPolicyClassesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPolicyClassesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
