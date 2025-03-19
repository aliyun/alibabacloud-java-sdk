// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPolicyClassesRequest extends TeaModel {
    /**
     * <p>Types of attachment points supported by the policy.</p>
     * <ul>
     * <li>HttpApi: HttpApi.</li>
     * <li>Operation: Operation of HttpApi.</li>
     * <li>GatewayRoute: Gateway route.</li>
     * <li>GatewayService: Gateway service.</li>
     * <li>GatewayServicePort: Gateway service port.</li>
     * <li>Domain: Gateway domain.</li>
     * <li>Gateway: Gateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Operation</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>Direction of the policy.</p>
     * <ul>
     * <li>Outbound: OutBound.</li>
     * <li>Inbound: InBound.</li>
     * <li>Both directions: Both.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InBound</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>Page number, default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Type of the policy template.</p>
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
