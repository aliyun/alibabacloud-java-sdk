// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPolicyClassesRequest extends TeaModel {
    /**
     * <p>The ID of the attached resource.</p>
     * 
     * <strong>example:</strong>
     * <p>route-001</p>
     */
    @NameInMap("attachResourceId")
    public String attachResourceId;

    /**
     * <p>The type of resource that the policy can be attached to. Valid values:</p>
     * <ul>
     * <li>HttpApi: HttpApi.</li>
     * <li>Operation: an operation of an HttpApi.</li>
     * <li>GatewayRoute: a gateway route.</li>
     * <li>GatewayService: a gateway service.</li>
     * <li>GatewayServicePort: a gateway service port.</li>
     * <li>Domain: a gateway domain name.</li>
     * <li>Gateway: a gateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Operation</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The direction of the policy. Valid values:</p>
     * <ul>
     * <li>OutBound: outbound.</li>
     * <li>InBound: inbound.</li>
     * <li>Both: both directions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InBound</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>The gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-001</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

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

    /**
     * <p>The policy templatetype.</p>
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
