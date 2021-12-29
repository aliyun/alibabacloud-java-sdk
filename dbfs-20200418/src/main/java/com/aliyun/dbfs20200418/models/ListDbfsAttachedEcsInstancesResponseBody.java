// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsAttachedEcsInstancesResponseBody extends TeaModel {
    @NameInMap("EcsLabelInfo")
    public java.util.List<ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo> ecsLabelInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDbfsAttachedEcsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDbfsAttachedEcsInstancesResponseBody self = new ListDbfsAttachedEcsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDbfsAttachedEcsInstancesResponseBody setEcsLabelInfo(java.util.List<ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo> ecsLabelInfo) {
        this.ecsLabelInfo = ecsLabelInfo;
        return this;
    }
    public java.util.List<ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo> getEcsLabelInfo() {
        return this.ecsLabelInfo;
    }

    public ListDbfsAttachedEcsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo extends TeaModel {
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("MountPoint")
        public String mountPoint;

        @NameInMap("MountedTime")
        public String mountedTime;

        @NameInMap("OSName")
        public String OSName;

        @NameInMap("label")
        public String label;

        @NameInMap("value")
        public String value;

        public static ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo self = new ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo();
            return TeaModel.build(map, self);
        }

        public ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo setMountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
            return this;
        }
        public String getMountPoint() {
            return this.mountPoint;
        }

        public ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo setMountedTime(String mountedTime) {
            this.mountedTime = mountedTime;
            return this;
        }
        public String getMountedTime() {
            return this.mountedTime;
        }

        public ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
