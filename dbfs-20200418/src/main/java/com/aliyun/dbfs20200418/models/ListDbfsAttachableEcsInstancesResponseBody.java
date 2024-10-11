// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsAttachableEcsInstancesResponseBody extends TeaModel {
    @NameInMap("EcsLabelInfo")
    public java.util.List<ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo> ecsLabelInfo;

    /**
     * <strong>example:</strong>
     * <p>3724CFEF-02DA-578B-AED6-67EE80671B4A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDbfsAttachableEcsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDbfsAttachableEcsInstancesResponseBody self = new ListDbfsAttachableEcsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDbfsAttachableEcsInstancesResponseBody setEcsLabelInfo(java.util.List<ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo> ecsLabelInfo) {
        this.ecsLabelInfo = ecsLabelInfo;
        return this;
    }
    public java.util.List<ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo> getEcsLabelInfo() {
        return this.ecsLabelInfo;
    }

    public ListDbfsAttachableEcsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDbfsAttachableEcsInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>m-bp67acfmxazb4p****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>ecs.g7se</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <strong>example:</strong>
         * <p>Alibaba Cloud Linux 2.1903 LTS 64 bit</p>
         */
        @NameInMap("OSName")
        public String OSName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

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

        public static ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo self = new ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo();
            return TeaModel.build(map, self);
        }

        public ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
