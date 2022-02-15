// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHealthStatusResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public DescribeHealthStatusResponseBodyStatus status;

    public static DescribeHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthStatusResponseBody self = new DescribeHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthStatusResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeHealthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHealthStatusResponseBody setStatus(DescribeHealthStatusResponseBodyStatus status) {
        this.status = status;
        return this;
    }
    public DescribeHealthStatusResponseBodyStatus getStatus() {
        return this.status;
    }

    public static class DescribeHealthStatusResponseBodyStatusAdbgpSegmentDiskUsagePercentMax extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusAdbgpSegmentDiskUsagePercentMax build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusAdbgpSegmentDiskUsagePercentMax self = new DescribeHealthStatusResponseBodyStatusAdbgpSegmentDiskUsagePercentMax();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusAdbgpSegmentDiskUsagePercentMax setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthStatusResponseBodyStatusAdbgpSegmentDiskUsagePercentMax setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusAdbpgConnectionStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusAdbpgConnectionStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusAdbpgConnectionStatus self = new DescribeHealthStatusResponseBodyStatusAdbpgConnectionStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgConnectionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgConnectionStatus setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusAdbpgDiskStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusAdbpgDiskStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusAdbpgDiskStatus self = new DescribeHealthStatusResponseBodyStatusAdbpgDiskStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgDiskStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgDiskStatus setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusAdbpgDiskUsagePercent extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusAdbpgDiskUsagePercent build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusAdbpgDiskUsagePercent self = new DescribeHealthStatusResponseBodyStatusAdbpgDiskUsagePercent();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgDiskUsagePercent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgDiskUsagePercent setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax self = new DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusAdbpgStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusAdbpgStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusAdbpgStatus self = new DescribeHealthStatusResponseBodyStatusAdbpgStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgStatus setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusNodeMasterConnectionStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusNodeMasterConnectionStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusNodeMasterConnectionStatus self = new DescribeHealthStatusResponseBodyStatusNodeMasterConnectionStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusNodeMasterConnectionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthStatusResponseBodyStatusNodeMasterConnectionStatus setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusNodeMasterStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusNodeMasterStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusNodeMasterStatus self = new DescribeHealthStatusResponseBodyStatusNodeMasterStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusNodeMasterStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthStatusResponseBodyStatusNodeMasterStatus setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusNodeSegmentConnectionStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusNodeSegmentConnectionStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusNodeSegmentConnectionStatus self = new DescribeHealthStatusResponseBodyStatusNodeSegmentConnectionStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusNodeSegmentConnectionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthStatusResponseBodyStatusNodeSegmentConnectionStatus setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusNodeSegmentDiskStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusNodeSegmentDiskStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusNodeSegmentDiskStatus self = new DescribeHealthStatusResponseBodyStatusNodeSegmentDiskStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusNodeSegmentDiskStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthStatusResponseBodyStatusNodeSegmentDiskStatus setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatus extends TeaModel {
        @NameInMap("adbgp_segment_disk_usage_percent_max")
        public DescribeHealthStatusResponseBodyStatusAdbgpSegmentDiskUsagePercentMax adbgpSegmentDiskUsagePercentMax;

        @NameInMap("adbpg_connection_status")
        public DescribeHealthStatusResponseBodyStatusAdbpgConnectionStatus adbpgConnectionStatus;

        @NameInMap("adbpg_disk_status")
        public DescribeHealthStatusResponseBodyStatusAdbpgDiskStatus adbpgDiskStatus;

        @NameInMap("adbpg_disk_usage_percent")
        public DescribeHealthStatusResponseBodyStatusAdbpgDiskUsagePercent adbpgDiskUsagePercent;

        @NameInMap("adbpg_master_disk_usage_percent_max")
        public DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax;

        @NameInMap("adbpg_status")
        public DescribeHealthStatusResponseBodyStatusAdbpgStatus adbpgStatus;

        @NameInMap("node_master_connection_status")
        public DescribeHealthStatusResponseBodyStatusNodeMasterConnectionStatus nodeMasterConnectionStatus;

        @NameInMap("node_master_status")
        public DescribeHealthStatusResponseBodyStatusNodeMasterStatus nodeMasterStatus;

        @NameInMap("node_segment_connection_status")
        public DescribeHealthStatusResponseBodyStatusNodeSegmentConnectionStatus nodeSegmentConnectionStatus;

        @NameInMap("node_segment_disk_status")
        public DescribeHealthStatusResponseBodyStatusNodeSegmentDiskStatus nodeSegmentDiskStatus;

        public static DescribeHealthStatusResponseBodyStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatus self = new DescribeHealthStatusResponseBodyStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatus setAdbgpSegmentDiskUsagePercentMax(DescribeHealthStatusResponseBodyStatusAdbgpSegmentDiskUsagePercentMax adbgpSegmentDiskUsagePercentMax) {
            this.adbgpSegmentDiskUsagePercentMax = adbgpSegmentDiskUsagePercentMax;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusAdbgpSegmentDiskUsagePercentMax getAdbgpSegmentDiskUsagePercentMax() {
            return this.adbgpSegmentDiskUsagePercentMax;
        }

        public DescribeHealthStatusResponseBodyStatus setAdbpgConnectionStatus(DescribeHealthStatusResponseBodyStatusAdbpgConnectionStatus adbpgConnectionStatus) {
            this.adbpgConnectionStatus = adbpgConnectionStatus;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusAdbpgConnectionStatus getAdbpgConnectionStatus() {
            return this.adbpgConnectionStatus;
        }

        public DescribeHealthStatusResponseBodyStatus setAdbpgDiskStatus(DescribeHealthStatusResponseBodyStatusAdbpgDiskStatus adbpgDiskStatus) {
            this.adbpgDiskStatus = adbpgDiskStatus;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusAdbpgDiskStatus getAdbpgDiskStatus() {
            return this.adbpgDiskStatus;
        }

        public DescribeHealthStatusResponseBodyStatus setAdbpgDiskUsagePercent(DescribeHealthStatusResponseBodyStatusAdbpgDiskUsagePercent adbpgDiskUsagePercent) {
            this.adbpgDiskUsagePercent = adbpgDiskUsagePercent;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusAdbpgDiskUsagePercent getAdbpgDiskUsagePercent() {
            return this.adbpgDiskUsagePercent;
        }

        public DescribeHealthStatusResponseBodyStatus setAdbpgMasterDiskUsagePercentMax(DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax) {
            this.adbpgMasterDiskUsagePercentMax = adbpgMasterDiskUsagePercentMax;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax getAdbpgMasterDiskUsagePercentMax() {
            return this.adbpgMasterDiskUsagePercentMax;
        }

        public DescribeHealthStatusResponseBodyStatus setAdbpgStatus(DescribeHealthStatusResponseBodyStatusAdbpgStatus adbpgStatus) {
            this.adbpgStatus = adbpgStatus;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusAdbpgStatus getAdbpgStatus() {
            return this.adbpgStatus;
        }

        public DescribeHealthStatusResponseBodyStatus setNodeMasterConnectionStatus(DescribeHealthStatusResponseBodyStatusNodeMasterConnectionStatus nodeMasterConnectionStatus) {
            this.nodeMasterConnectionStatus = nodeMasterConnectionStatus;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusNodeMasterConnectionStatus getNodeMasterConnectionStatus() {
            return this.nodeMasterConnectionStatus;
        }

        public DescribeHealthStatusResponseBodyStatus setNodeMasterStatus(DescribeHealthStatusResponseBodyStatusNodeMasterStatus nodeMasterStatus) {
            this.nodeMasterStatus = nodeMasterStatus;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusNodeMasterStatus getNodeMasterStatus() {
            return this.nodeMasterStatus;
        }

        public DescribeHealthStatusResponseBodyStatus setNodeSegmentConnectionStatus(DescribeHealthStatusResponseBodyStatusNodeSegmentConnectionStatus nodeSegmentConnectionStatus) {
            this.nodeSegmentConnectionStatus = nodeSegmentConnectionStatus;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusNodeSegmentConnectionStatus getNodeSegmentConnectionStatus() {
            return this.nodeSegmentConnectionStatus;
        }

        public DescribeHealthStatusResponseBodyStatus setNodeSegmentDiskStatus(DescribeHealthStatusResponseBodyStatusNodeSegmentDiskStatus nodeSegmentDiskStatus) {
            this.nodeSegmentDiskStatus = nodeSegmentDiskStatus;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusNodeSegmentDiskStatus getNodeSegmentDiskStatus() {
            return this.nodeSegmentDiskStatus;
        }

    }

}
