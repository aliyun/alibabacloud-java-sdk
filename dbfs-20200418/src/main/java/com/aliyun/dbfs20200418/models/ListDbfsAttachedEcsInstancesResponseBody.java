// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsAttachedEcsInstancesResponseBody extends TeaModel {
    @NameInMap("EcsLabelInfo")
    public java.util.List<ListDbfsAttachedEcsInstancesResponseBodyEcsLabelInfo> ecsLabelInfo;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>ecs.g7se</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <strong>example:</strong>
         * <p>/mnt/dbfs/dbfs-nUy1tb********BQ4X8Gpw</p>
         */
        @NameInMap("MountPoint")
        public String mountPoint;

        /**
         * <strong>example:</strong>
         * <p>1606290930000</p>
         */
        @NameInMap("MountedTime")
        public String mountedTime;

        /**
         * <strong>example:</strong>
         * <p>Alibaba Cloud Linux 2.1903 LTS 64 bit</p>
         */
        @NameInMap("OSName")
        public String OSName;

        /**
         * <strong>example:</strong>
         * <p>dbfs-test-01</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>i-bp10jb8mqajkmrejgo00</p>
         */
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
