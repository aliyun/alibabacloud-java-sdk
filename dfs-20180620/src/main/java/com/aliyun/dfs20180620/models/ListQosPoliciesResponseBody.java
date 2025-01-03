// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListQosPoliciesResponseBody extends TeaModel {
    @NameInMap("QosPolicies")
    public java.util.List<ListQosPoliciesResponseBodyQosPolicies> qosPolicies;

    @NameInMap("RequestId")
    public String requestId;

    public static ListQosPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQosPoliciesResponseBody self = new ListQosPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQosPoliciesResponseBody setQosPolicies(java.util.List<ListQosPoliciesResponseBodyQosPolicies> qosPolicies) {
        this.qosPolicies = qosPolicies;
        return this;
    }
    public java.util.List<ListQosPoliciesResponseBodyQosPolicies> getQosPolicies() {
        return this.qosPolicies;
    }

    public ListQosPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQosPoliciesResponseBodyQosPolicies extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("FederationId")
        public String federationId;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("FlowIds")
        public String flowIds;

        @NameInMap("MaxIOBandWidth")
        public Long maxIOBandWidth;

        @NameInMap("MaxIOps")
        public Long maxIOps;

        @NameInMap("MaxMetaQps")
        public Long maxMetaQps;

        @NameInMap("QosPolicyId")
        public String qosPolicyId;

        @NameInMap("ZoneIds")
        public String zoneIds;

        public static ListQosPoliciesResponseBodyQosPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListQosPoliciesResponseBodyQosPolicies self = new ListQosPoliciesResponseBodyQosPolicies();
            return TeaModel.build(map, self);
        }

        public ListQosPoliciesResponseBodyQosPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListQosPoliciesResponseBodyQosPolicies setFederationId(String federationId) {
            this.federationId = federationId;
            return this;
        }
        public String getFederationId() {
            return this.federationId;
        }

        public ListQosPoliciesResponseBodyQosPolicies setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListQosPoliciesResponseBodyQosPolicies setFlowIds(String flowIds) {
            this.flowIds = flowIds;
            return this;
        }
        public String getFlowIds() {
            return this.flowIds;
        }

        public ListQosPoliciesResponseBodyQosPolicies setMaxIOBandWidth(Long maxIOBandWidth) {
            this.maxIOBandWidth = maxIOBandWidth;
            return this;
        }
        public Long getMaxIOBandWidth() {
            return this.maxIOBandWidth;
        }

        public ListQosPoliciesResponseBodyQosPolicies setMaxIOps(Long maxIOps) {
            this.maxIOps = maxIOps;
            return this;
        }
        public Long getMaxIOps() {
            return this.maxIOps;
        }

        public ListQosPoliciesResponseBodyQosPolicies setMaxMetaQps(Long maxMetaQps) {
            this.maxMetaQps = maxMetaQps;
            return this;
        }
        public Long getMaxMetaQps() {
            return this.maxMetaQps;
        }

        public ListQosPoliciesResponseBodyQosPolicies setQosPolicyId(String qosPolicyId) {
            this.qosPolicyId = qosPolicyId;
            return this;
        }
        public String getQosPolicyId() {
            return this.qosPolicyId;
        }

        public ListQosPoliciesResponseBodyQosPolicies setZoneIds(String zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public String getZoneIds() {
            return this.zoneIds;
        }

    }

}
