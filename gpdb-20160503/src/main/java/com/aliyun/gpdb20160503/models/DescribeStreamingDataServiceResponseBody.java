// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeStreamingDataServiceResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceDescription")
    public String serviceDescription;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceIp")
    public String serviceIp;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServicePort")
    public Integer servicePort;

    @NameInMap("ServiceSpec")
    public String serviceSpec;

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

    public DescribeStreamingDataServiceResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
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
