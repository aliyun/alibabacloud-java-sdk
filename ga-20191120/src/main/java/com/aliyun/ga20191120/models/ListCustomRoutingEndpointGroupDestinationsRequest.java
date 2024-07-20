// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointGroupDestinationsRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp16jdc00bhe97sr5****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The start port of the backend service port range of the endpoint group.</p>
     * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The <strong>FromPort</strong> value must be smaller than or equal to the <strong>ToPort</strong> value.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("FromPort")
    public Integer fromPort;

    /**
     * <p>The ID of the listener.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The backend service protocols of the endpoint group. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong>: TCP.</li>
     * <li><strong>UDP</strong>: UDP.</li>
     * <li><strong>TCP,UDP</strong>: TCP and UDP.</li>
     * </ul>
     * <p>If this parameter is empty, all types of protocols are queried.</p>
     * <p>You can specify up to 10 protocols.</p>
     */
    @NameInMap("Protocols")
    public java.util.List<String> protocols;

    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The end port of the backend service port range of the endpoint group.</p>
     * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The <strong>FromPort</strong> value must be smaller than or equal to the <strong>ToPort</strong> value.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ToPort")
    public Integer toPort;

    public static ListCustomRoutingEndpointGroupDestinationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingEndpointGroupDestinationsRequest self = new ListCustomRoutingEndpointGroupDestinationsRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }
    public Integer getFromPort() {
        return this.fromPort;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCustomRoutingEndpointGroupDestinationsRequest setToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }
    public Integer getToPort() {
        return this.toPort;
    }

}
