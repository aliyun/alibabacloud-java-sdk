// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeAvailableDedicatedHostClassesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostClasses")
    public DescribeAvailableDedicatedHostClassesResponseBodyHostClasses hostClasses;

    public static DescribeAvailableDedicatedHostClassesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableDedicatedHostClassesResponseBody self = new DescribeAvailableDedicatedHostClassesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableDedicatedHostClassesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableDedicatedHostClassesResponseBody setHostClasses(DescribeAvailableDedicatedHostClassesResponseBodyHostClasses hostClasses) {
        this.hostClasses = hostClasses;
        return this;
    }
    public DescribeAvailableDedicatedHostClassesResponseBodyHostClasses getHostClasses() {
        return this.hostClasses;
    }

    public static class DescribeAvailableDedicatedHostClassesResponseBodyHostClassesHostClasses extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("HostClassName")
        public String hostClassName;

        public static DescribeAvailableDedicatedHostClassesResponseBodyHostClassesHostClasses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableDedicatedHostClassesResponseBodyHostClassesHostClasses self = new DescribeAvailableDedicatedHostClassesResponseBodyHostClassesHostClasses();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableDedicatedHostClassesResponseBodyHostClassesHostClasses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAvailableDedicatedHostClassesResponseBodyHostClassesHostClasses setHostClassName(String hostClassName) {
            this.hostClassName = hostClassName;
            return this;
        }
        public String getHostClassName() {
            return this.hostClassName;
        }

    }

    public static class DescribeAvailableDedicatedHostClassesResponseBodyHostClasses extends TeaModel {
        @NameInMap("HostClasses")
        public java.util.List<DescribeAvailableDedicatedHostClassesResponseBodyHostClassesHostClasses> hostClasses;

        public static DescribeAvailableDedicatedHostClassesResponseBodyHostClasses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableDedicatedHostClassesResponseBodyHostClasses self = new DescribeAvailableDedicatedHostClassesResponseBodyHostClasses();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableDedicatedHostClassesResponseBodyHostClasses setHostClasses(java.util.List<DescribeAvailableDedicatedHostClassesResponseBodyHostClassesHostClasses> hostClasses) {
            this.hostClasses = hostClasses;
            return this;
        }
        public java.util.List<DescribeAvailableDedicatedHostClassesResponseBodyHostClassesHostClasses> getHostClasses() {
            return this.hostClasses;
        }

    }

}
