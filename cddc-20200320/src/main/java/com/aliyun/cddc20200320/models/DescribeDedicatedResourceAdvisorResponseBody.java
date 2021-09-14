// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedResourceAdvisorResponseBody extends TeaModel {
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceAdvisors")
    public DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisors resourceAdvisors;

    public static DescribeDedicatedResourceAdvisorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedResourceAdvisorResponseBody self = new DescribeDedicatedResourceAdvisorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedResourceAdvisorResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDedicatedResourceAdvisorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedResourceAdvisorResponseBody setResourceAdvisors(DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisors resourceAdvisors) {
        this.resourceAdvisors = resourceAdvisors;
        return this;
    }
    public DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisors getResourceAdvisors() {
        return this.resourceAdvisors;
    }

    public static class DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors extends TeaModel {
        @NameInMap("CpuUsageAfterAction")
        public Float cpuUsageAfterAction;

        @NameInMap("Action")
        public String action;

        @NameInMap("DestinationDedicatedHostId")
        public String destinationDedicatedHostId;

        @NameInMap("SourceDedicatedInstanceId")
        public String sourceDedicatedInstanceId;

        @NameInMap("ActionDescription")
        public String actionDescription;

        @NameInMap("SourceDedicatedInstanceRole")
        public String sourceDedicatedInstanceRole;

        @NameInMap("SourceDedicatedHostId")
        public String sourceDedicatedHostId;

        @NameInMap("CpuUsageBeforeAction")
        public Float cpuUsageBeforeAction;

        public static DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors self = new DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors setCpuUsageAfterAction(Float cpuUsageAfterAction) {
            this.cpuUsageAfterAction = cpuUsageAfterAction;
            return this;
        }
        public Float getCpuUsageAfterAction() {
            return this.cpuUsageAfterAction;
        }

        public DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors setDestinationDedicatedHostId(String destinationDedicatedHostId) {
            this.destinationDedicatedHostId = destinationDedicatedHostId;
            return this;
        }
        public String getDestinationDedicatedHostId() {
            return this.destinationDedicatedHostId;
        }

        public DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors setSourceDedicatedInstanceId(String sourceDedicatedInstanceId) {
            this.sourceDedicatedInstanceId = sourceDedicatedInstanceId;
            return this;
        }
        public String getSourceDedicatedInstanceId() {
            return this.sourceDedicatedInstanceId;
        }

        public DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors setActionDescription(String actionDescription) {
            this.actionDescription = actionDescription;
            return this;
        }
        public String getActionDescription() {
            return this.actionDescription;
        }

        public DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors setSourceDedicatedInstanceRole(String sourceDedicatedInstanceRole) {
            this.sourceDedicatedInstanceRole = sourceDedicatedInstanceRole;
            return this;
        }
        public String getSourceDedicatedInstanceRole() {
            return this.sourceDedicatedInstanceRole;
        }

        public DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors setSourceDedicatedHostId(String sourceDedicatedHostId) {
            this.sourceDedicatedHostId = sourceDedicatedHostId;
            return this;
        }
        public String getSourceDedicatedHostId() {
            return this.sourceDedicatedHostId;
        }

        public DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors setCpuUsageBeforeAction(Float cpuUsageBeforeAction) {
            this.cpuUsageBeforeAction = cpuUsageBeforeAction;
            return this;
        }
        public Float getCpuUsageBeforeAction() {
            return this.cpuUsageBeforeAction;
        }

    }

    public static class DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisors extends TeaModel {
        @NameInMap("ResourceAdvisors")
        public java.util.List<DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors> resourceAdvisors;

        public static DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisors build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisors self = new DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisors();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisors setResourceAdvisors(java.util.List<DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors> resourceAdvisors) {
            this.resourceAdvisors = resourceAdvisors;
            return this;
        }
        public java.util.List<DescribeDedicatedResourceAdvisorResponseBodyResourceAdvisorsResourceAdvisors> getResourceAdvisors() {
            return this.resourceAdvisors;
        }

    }

}
