// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribleLayer7InstanceRelationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Layer7InstanceRelations")
    @Validation(required = true)
    public java.util.List<DescribleLayer7InstanceRelationsResponseLayer7InstanceRelations> layer7InstanceRelations;

    public static DescribleLayer7InstanceRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribleLayer7InstanceRelationsResponse self = new DescribleLayer7InstanceRelationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribleLayer7InstanceRelationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribleLayer7InstanceRelationsResponse setLayer7InstanceRelations(java.util.List<DescribleLayer7InstanceRelationsResponseLayer7InstanceRelations> layer7InstanceRelations) {
        this.layer7InstanceRelations = layer7InstanceRelations;
        return this;
    }
    public java.util.List<DescribleLayer7InstanceRelationsResponseLayer7InstanceRelations> getLayer7InstanceRelations() {
        return this.layer7InstanceRelations;
    }

    public static class DescribleLayer7InstanceRelationsResponseLayer7InstanceRelationsInstanceDetails extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("FunctionVersion")
        @Validation(required = true)
        public String functionVersion;

        @NameInMap("EipList")
        @Validation(required = true)
        public java.util.List<String> eipList;

        public static DescribleLayer7InstanceRelationsResponseLayer7InstanceRelationsInstanceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribleLayer7InstanceRelationsResponseLayer7InstanceRelationsInstanceDetails self = new DescribleLayer7InstanceRelationsResponseLayer7InstanceRelationsInstanceDetails();
            return TeaModel.build(map, self);
        }

        public DescribleLayer7InstanceRelationsResponseLayer7InstanceRelationsInstanceDetails setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribleLayer7InstanceRelationsResponseLayer7InstanceRelationsInstanceDetails setFunctionVersion(String functionVersion) {
            this.functionVersion = functionVersion;
            return this;
        }
        public String getFunctionVersion() {
            return this.functionVersion;
        }

        public DescribleLayer7InstanceRelationsResponseLayer7InstanceRelationsInstanceDetails setEipList(java.util.List<String> eipList) {
            this.eipList = eipList;
            return this;
        }
        public java.util.List<String> getEipList() {
            return this.eipList;
        }

    }

    public static class DescribleLayer7InstanceRelationsResponseLayer7InstanceRelations extends TeaModel {
        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("InstanceDetails")
        @Validation(required = true)
        public java.util.List<DescribleLayer7InstanceRelationsResponseLayer7InstanceRelationsInstanceDetails> instanceDetails;

        public static DescribleLayer7InstanceRelationsResponseLayer7InstanceRelations build(java.util.Map<String, ?> map) throws Exception {
            DescribleLayer7InstanceRelationsResponseLayer7InstanceRelations self = new DescribleLayer7InstanceRelationsResponseLayer7InstanceRelations();
            return TeaModel.build(map, self);
        }

        public DescribleLayer7InstanceRelationsResponseLayer7InstanceRelations setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribleLayer7InstanceRelationsResponseLayer7InstanceRelations setInstanceDetails(java.util.List<DescribleLayer7InstanceRelationsResponseLayer7InstanceRelationsInstanceDetails> instanceDetails) {
            this.instanceDetails = instanceDetails;
            return this;
        }
        public java.util.List<DescribleLayer7InstanceRelationsResponseLayer7InstanceRelationsInstanceDetails> getInstanceDetails() {
            return this.instanceDetails;
        }

    }

}
