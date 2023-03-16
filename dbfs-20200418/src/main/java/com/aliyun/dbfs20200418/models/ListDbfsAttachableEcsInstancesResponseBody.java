// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsAttachableEcsInstancesResponseBody extends TeaModel {
    @NameInMap("EcsLabelInfo")
    public java.util.List<ListDbfsAttachableEcsInstancesResponseBodyEcsLabelInfo> ecsLabelInfo;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("OSName")
        public String OSName;

        @NameInMap("Status")
        public String status;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("label")
        public String label;

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
