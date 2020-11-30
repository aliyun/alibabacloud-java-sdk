// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeInstanceDetailsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceDetails")
    @Validation(required = true)
    public java.util.List<DescribeInstanceDetailsResponseInstanceDetails> instanceDetails;

    public static DescribeInstanceDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDetailsResponse self = new DescribeInstanceDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDetailsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceDetailsResponse setInstanceDetails(java.util.List<DescribeInstanceDetailsResponseInstanceDetails> instanceDetails) {
        this.instanceDetails = instanceDetails;
        return this;
    }
    public java.util.List<DescribeInstanceDetailsResponseInstanceDetails> getInstanceDetails() {
        return this.instanceDetails;
    }

    public static class DescribeInstanceDetailsResponseInstanceDetailsEipInfoList extends TeaModel {
        @NameInMap("Eip")
        @Validation(required = true)
        public String eip;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeInstanceDetailsResponseInstanceDetailsEipInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDetailsResponseInstanceDetailsEipInfoList self = new DescribeInstanceDetailsResponseInstanceDetailsEipInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDetailsResponseInstanceDetailsEipInfoList setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public DescribeInstanceDetailsResponseInstanceDetailsEipInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeInstanceDetailsResponseInstanceDetails extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Line")
        @Validation(required = true)
        public String line;

        @NameInMap("EipInfoList")
        @Validation(required = true)
        public java.util.List<DescribeInstanceDetailsResponseInstanceDetailsEipInfoList> eipInfoList;

        public static DescribeInstanceDetailsResponseInstanceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDetailsResponseInstanceDetails self = new DescribeInstanceDetailsResponseInstanceDetails();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDetailsResponseInstanceDetails setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceDetailsResponseInstanceDetails setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeInstanceDetailsResponseInstanceDetails setEipInfoList(java.util.List<DescribeInstanceDetailsResponseInstanceDetailsEipInfoList> eipInfoList) {
            this.eipInfoList = eipInfoList;
            return this;
        }
        public java.util.List<DescribeInstanceDetailsResponseInstanceDetailsEipInfoList> getEipInfoList() {
            return this.eipInfoList;
        }

    }

}
