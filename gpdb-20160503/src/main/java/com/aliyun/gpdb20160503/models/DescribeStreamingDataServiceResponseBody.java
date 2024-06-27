// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeStreamingDataServiceResponseBody extends TeaModel {
    /**
     * <p>The time when the service was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-08T16:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the service was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-08T17:00:00Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The description of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>test-adbpgss</p>
     */
    @NameInMap("ServiceDescription")
    public String serviceDescription;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The IP address of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("ServiceIp")
    public String serviceIp;

    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>test-adbpgss</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceOwnerId")
    public String serviceOwnerId;

    /**
     * <p>The port number of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("ServicePort")
    public Integer servicePort;

    /**
     * <p>The specifications of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ServiceSpec")
    public String serviceSpec;

    /**
     * <p>The status of the service. Valid values:</p>
     * <ul>
     * <li>Init</li>
     * <li>Running</li>
     * <li>Exception</li>
     * <li>Paused</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeStreamingDataServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamingDataServiceResponseBody self = new DescribeStreamingDataServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStreamingDataServiceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeStreamingDataServiceResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeStreamingDataServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStreamingDataServiceResponseBody setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public DescribeStreamingDataServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DescribeStreamingDataServiceResponseBody setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }
    public String getServiceIp() {
        return this.serviceIp;
    }

    public DescribeStreamingDataServiceResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeStreamingDataServiceResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeStreamingDataServiceResponseBody setServiceOwnerId(String serviceOwnerId) {
        this.serviceOwnerId = serviceOwnerId;
        return this;
    }
    public String getServiceOwnerId() {
        return this.serviceOwnerId;
    }

    public DescribeStreamingDataServiceResponseBody setServicePort(Integer servicePort) {
        this.servicePort = servicePort;
        return this;
    }
    public Integer getServicePort() {
        return this.servicePort;
    }

    public DescribeStreamingDataServiceResponseBody setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }
    public String getServiceSpec() {
        return this.serviceSpec;
    }

    public DescribeStreamingDataServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
