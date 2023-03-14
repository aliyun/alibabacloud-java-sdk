// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribleLayer7InstanceRelationsResponseBody extends TeaModel {
    @NameInMap("Layer7InstanceRelations")
    public java.util.List<DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelations> layer7InstanceRelations;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribleLayer7InstanceRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribleLayer7InstanceRelationsResponseBody self = new DescribleLayer7InstanceRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribleLayer7InstanceRelationsResponseBody setLayer7InstanceRelations(java.util.List<DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelations> layer7InstanceRelations) {
        this.layer7InstanceRelations = layer7InstanceRelations;
        return this;
    }
    public java.util.List<DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelations> getLayer7InstanceRelations() {
        return this.layer7InstanceRelations;
    }

    public DescribleLayer7InstanceRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelationsInstanceDetails extends TeaModel {
        @NameInMap("EipList")
        public java.util.List<String> eipList;

        @NameInMap("FunctionVersion")
        public String functionVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IpMode")
        public String ipMode;

        @NameInMap("IpVersion")
        public String ipVersion;

        public static DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelationsInstanceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelationsInstanceDetails self = new DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelationsInstanceDetails();
            return TeaModel.build(map, self);
        }

        public DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelationsInstanceDetails setEipList(java.util.List<String> eipList) {
            this.eipList = eipList;
            return this;
        }
        public java.util.List<String> getEipList() {
            return this.eipList;
        }

        public DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelationsInstanceDetails setFunctionVersion(String functionVersion) {
            this.functionVersion = functionVersion;
            return this;
        }
        public String getFunctionVersion() {
            return this.functionVersion;
        }

        public DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelationsInstanceDetails setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelationsInstanceDetails setIpMode(String ipMode) {
            this.ipMode = ipMode;
            return this;
        }
        public String getIpMode() {
            return this.ipMode;
        }

        public DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelationsInstanceDetails setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

    }

    public static class DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelations extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("InstanceDetails")
        public java.util.List<DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelationsInstanceDetails> instanceDetails;

        public static DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelations build(java.util.Map<String, ?> map) throws Exception {
            DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelations self = new DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelations();
            return TeaModel.build(map, self);
        }

        public DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelations setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelations setInstanceDetails(java.util.List<DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelationsInstanceDetails> instanceDetails) {
            this.instanceDetails = instanceDetails;
            return this;
        }
        public java.util.List<DescribleLayer7InstanceRelationsResponseBodyLayer7InstanceRelationsInstanceDetails> getInstanceDetails() {
            return this.instanceDetails;
        }

    }

}
