// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeContactPointsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ContactPoints")
    public DescribeContactPointsResponseBodyContactPoints contactPoints;

    public static DescribeContactPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactPointsResponseBody self = new DescribeContactPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContactPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContactPointsResponseBody setContactPoints(DescribeContactPointsResponseBodyContactPoints contactPoints) {
        this.contactPoints = contactPoints;
        return this;
    }
    public DescribeContactPointsResponseBodyContactPoints getContactPoints() {
        return this.contactPoints;
    }

    public static class DescribeContactPointsResponseBodyContactPointsContactPointPublicAddresses extends TeaModel {
        @NameInMap("PublicAddress")
        public java.util.List<String> publicAddress;

        public static DescribeContactPointsResponseBodyContactPointsContactPointPublicAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactPointsResponseBodyContactPointsContactPointPublicAddresses self = new DescribeContactPointsResponseBodyContactPointsContactPointPublicAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeContactPointsResponseBodyContactPointsContactPointPublicAddresses setPublicAddress(java.util.List<String> publicAddress) {
            this.publicAddress = publicAddress;
            return this;
        }
        public java.util.List<String> getPublicAddress() {
            return this.publicAddress;
        }

    }

    public static class DescribeContactPointsResponseBodyContactPointsContactPointPrivateAddresses extends TeaModel {
        @NameInMap("PrivateAddress")
        public java.util.List<String> privateAddress;

        public static DescribeContactPointsResponseBodyContactPointsContactPointPrivateAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactPointsResponseBodyContactPointsContactPointPrivateAddresses self = new DescribeContactPointsResponseBodyContactPointsContactPointPrivateAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeContactPointsResponseBodyContactPointsContactPointPrivateAddresses setPrivateAddress(java.util.List<String> privateAddress) {
            this.privateAddress = privateAddress;
            return this;
        }
        public java.util.List<String> getPrivateAddress() {
            return this.privateAddress;
        }

    }

    public static class DescribeContactPointsResponseBodyContactPointsContactPoint extends TeaModel {
        @NameInMap("PublicAddresses")
        public DescribeContactPointsResponseBodyContactPointsContactPointPublicAddresses publicAddresses;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("PrivateAddresses")
        public DescribeContactPointsResponseBodyContactPointsContactPointPrivateAddresses privateAddresses;

        @NameInMap("DataCenterId")
        public String dataCenterId;

        public static DescribeContactPointsResponseBodyContactPointsContactPoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactPointsResponseBodyContactPointsContactPoint self = new DescribeContactPointsResponseBodyContactPointsContactPoint();
            return TeaModel.build(map, self);
        }

        public DescribeContactPointsResponseBodyContactPointsContactPoint setPublicAddresses(DescribeContactPointsResponseBodyContactPointsContactPointPublicAddresses publicAddresses) {
            this.publicAddresses = publicAddresses;
            return this;
        }
        public DescribeContactPointsResponseBodyContactPointsContactPointPublicAddresses getPublicAddresses() {
            return this.publicAddresses;
        }

        public DescribeContactPointsResponseBodyContactPointsContactPoint setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeContactPointsResponseBodyContactPointsContactPoint setPrivateAddresses(DescribeContactPointsResponseBodyContactPointsContactPointPrivateAddresses privateAddresses) {
            this.privateAddresses = privateAddresses;
            return this;
        }
        public DescribeContactPointsResponseBodyContactPointsContactPointPrivateAddresses getPrivateAddresses() {
            return this.privateAddresses;
        }

        public DescribeContactPointsResponseBodyContactPointsContactPoint setDataCenterId(String dataCenterId) {
            this.dataCenterId = dataCenterId;
            return this;
        }
        public String getDataCenterId() {
            return this.dataCenterId;
        }

    }

    public static class DescribeContactPointsResponseBodyContactPoints extends TeaModel {
        @NameInMap("ContactPoint")
        public java.util.List<DescribeContactPointsResponseBodyContactPointsContactPoint> contactPoint;

        public static DescribeContactPointsResponseBodyContactPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactPointsResponseBodyContactPoints self = new DescribeContactPointsResponseBodyContactPoints();
            return TeaModel.build(map, self);
        }

        public DescribeContactPointsResponseBodyContactPoints setContactPoint(java.util.List<DescribeContactPointsResponseBodyContactPointsContactPoint> contactPoint) {
            this.contactPoint = contactPoint;
            return this;
        }
        public java.util.List<DescribeContactPointsResponseBodyContactPointsContactPoint> getContactPoint() {
            return this.contactPoint;
        }

    }

}
