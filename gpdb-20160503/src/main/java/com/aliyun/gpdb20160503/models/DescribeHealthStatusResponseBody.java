// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHealthStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D97B4191-104D-10CE-8BC5-53**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried performance metrics. Each performance metric consists of the parameter name, status, and metric value. The metric information is returned only for the performance parameters specified by <strong>Key</strong>. For example, if you set <strong>Key</strong> to <strong>adbpg_status</strong>, only the metric information of <strong>adbpg_status</strong> is returned.</p>
     * <p>For more information about performance parameters, see <a href="https://help.aliyun.com/document_detail/86943.html">Performance parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;node_master_connection_status&quot;:{&quot;Status&quot;:&quot;healthy&quot;,&quot;Value&quot;:1.6}}</p>
     */
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
        /**
         * <p>The status corresponding to the maximum storage usage among all compute nodes. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: The compute node storage usage is greater than or equal to 90%. In this case, the instance is locked.</li>
         * <li><strong>warning</strong>: The compute node storage usage is greater than or equal to 80% and less than 90%.</li>
         * <li><strong>healthy</strong>: The compute node storage usage is less than 80%.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The metric value of maximum compute node storage usage.</p>
         * <p>Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>1.52</p>
         */
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
        /**
         * <p>The connection health status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: The instance connection usage is greater than 95%. In this case, this metric is marked in red in the console.</li>
         * <li><strong>warning</strong>: The instance connection usage is greater than 90% and less than or equal to 95%. In this case, this metric is marked in yellow in the console.</li>
         * <li><strong>healthy</strong>: The instance connection usage is less than or equal to 90%. In this case, this metric is marked in green in the console.</li>
         * </ul>
         * <blockquote>
         * <p> The instance connection usage is the maximum connection usage among all the coordinator and compute nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The metric value of instance connection usage.</p>
         * <p>Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>1.71</p>
         */
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
        /**
         * <p>The storage status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: The instance storage usage is greater than or equal to 90%. In this case, this metric is marked in red in the console and the instance is locked.</li>
         * <li><strong>warning</strong>: The instance storage usage is greater than or equal to 70% and less than 90%. In this case, this metric is marked in yellow in the console.</li>
         * <li><strong>healthy</strong>: The instance storage usage is less than 70%. In this case, this metric is marked in green in the console.</li>
         * </ul>
         * <blockquote>
         * <p> The instance storage usage is the average storage usage of all compute nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The metric value of instance storage usage.</p>
         * <p>Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>1.52</p>
         */
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
        /**
         * <p>The status corresponding to the storage usage of the instance. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: The instance storage usage is greater than or equal to 90%. In this case, the instance is locked.</li>
         * <li><strong>warning</strong>: The instance storage usage is greater than or equal to 70% and less than 90%.</li>
         * <li><strong>healthy</strong>: The instance storage usage is less than 70%.</li>
         * </ul>
         * <blockquote>
         * <p> The instance storage usage is the average storage usage of all compute nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The metric value of instance storage usage.</p>
         * <p>Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>1.52</p>
         */
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

    public static class DescribeHealthStatusResponseBodyStatusAdbpgInstanceColdDataGb extends TeaModel {
        /**
         * <p>The total amount of cold data storage. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusAdbpgInstanceColdDataGb build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusAdbpgInstanceColdDataGb self = new DescribeHealthStatusResponseBodyStatusAdbpgInstanceColdDataGb();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgInstanceColdDataGb setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusAdbpgInstanceHotDataGb extends TeaModel {
        /**
         * <p>The total amount of hot data storage. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>4.1</p>
         */
        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusAdbpgInstanceHotDataGb build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusAdbpgInstanceHotDataGb self = new DescribeHealthStatusResponseBodyStatusAdbpgInstanceHotDataGb();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgInstanceHotDataGb setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusAdbpgInstanceTotalDataGb extends TeaModel {
        /**
         * <p>The total amount of data storage of the instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>4.1</p>
         */
        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusAdbpgInstanceTotalDataGb build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusAdbpgInstanceTotalDataGb self = new DescribeHealthStatusResponseBodyStatusAdbpgInstanceTotalDataGb();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgInstanceTotalDataGb setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax extends TeaModel {
        /**
         * <p>The status corresponding to the maximum storage usage of the coordinator node. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: The coordinator node storage usage is greater than or equal to 90%. In this case, the instance is locked.</li>
         * <li><strong>warning</strong>: The coordinator node storage usage is greater than or equal to 70% and less than 90%.</li>
         * <li><strong>healthy</strong>: The coordinator node storage usage is less than 70%.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The metric value of maximum coordinator node storage usage.</p>
         * <p>Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>1.34</p>
         */
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

    public static class DescribeHealthStatusResponseBodyStatusAdbpgMasterStatus extends TeaModel {
        /**
         * <p>The availability status of the coordinator node. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: Both the primary and standby coordinator nodes are unavailable. In this case, this metric is marked in red in the console.</li>
         * <li><strong>warning</strong>: The primary or standby coordinator node is unavailable. In this case, this metric is marked in yellow in the console.</li>
         * <li><strong>healthy</strong>: Both the primary and standby coordinator nodes are available. In this case, this metric is marked in green in the console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The metric value of coordinator node availability status. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusAdbpgMasterStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusAdbpgMasterStatus self = new DescribeHealthStatusResponseBodyStatusAdbpgMasterStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgMasterStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgMasterStatus setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusAdbpgSegmentStatus extends TeaModel {
        /**
         * <p>The availability status of compute nodes. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: All the primary and secondary compute nodes are unavailable. In this case, this metric is marked in red in the console.</li>
         * <li><strong>warning</strong>: Fifty percent or more than fifty percent of compute nodes are unavailable. In this case, this metric is marked in yellow in the console.</li>
         * <li><strong>healthy</strong>: All compute nodes are available. In this case, this metric is marked in green in the console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The metric value of compute node availability status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public Float value;

        public static DescribeHealthStatusResponseBodyStatusAdbpgSegmentStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyStatusAdbpgSegmentStatus self = new DescribeHealthStatusResponseBodyStatusAdbpgSegmentStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgSegmentStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthStatusResponseBodyStatusAdbpgSegmentStatus setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeHealthStatusResponseBodyStatusAdbpgStatus extends TeaModel {
        /**
         * <p>The health status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: The coordinator node or a compute node is unavailable. In this case, this metric is marked in red in the console.</li>
         * <li><strong>healthy</strong>: All nodes are available. In this case, this metric is marked in green in the console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The metric value of instance health status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: healthy</li>
         * <li><strong>0</strong>: critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The connection health status of the coordinator node. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: The coordinator node connection usage is greater than 95%. In this case, this metric is marked in red in the console.</li>
         * <li><strong>warning</strong>: The coordinator node connection usage is greater than or equal to 90% and less than 95%. In this case, this metric is marked in yellow in the console.</li>
         * <li><strong>healthy</strong>: The coordinator node connection usage is less than 90%. In this case, this metric is marked in green in the console.</li>
         * </ul>
         * <blockquote>
         * <p> The coordinator node connection usage is the maximum connection usage of the coordinator node.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The metric value of coordinator node connection usage.</p>
         * <p>Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>1.71</p>
         */
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
        /**
         * <p>The health status of the coordinator node. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: The primary or standby coordinator node is unavailable. In this case, this metric is marked in red in the console.</li>
         * <li><strong>healthy</strong>: Both the primary and standby coordinator nodes are available. In this case, this metric is marked in green in the console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The metric value of coordinator node health status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: healthy</li>
         * <li><strong>0</strong>: critical</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The connection health status of compute nodes. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: The compute node connection usage is greater than or equal to 95%. In this case, this metric is marked in red in the console.</li>
         * <li><strong>warning</strong>: The compute node connection usage is greater than or equal to 90% and less than 95%. In this case, this metric is marked in yellow in the console.</li>
         * <li><strong>healthy</strong>: The compute node connection usage is less than 90%. In this case, this metric is marked in green in the console.</li>
         * </ul>
         * <blockquote>
         * <p> The compute node connection usage is the maximum connection usage among all compute nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The metric value of maximum compute node connection usage.</p>
         * <p>Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>0.48</p>
         */
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
        /**
         * <p>The storage status of compute nodes. Valid values:</p>
         * <ul>
         * <li><strong>critical</strong>: The compute node storage usage is greater than or equal to 90%. In this case, this metric is marked in red in the console and the instance is locked.</li>
         * <li><strong>warning</strong>: The compute node storage usage is greater than or equal to 80% and less than 90%. In this case, this metric is marked in yellow in the console.</li>
         * <li><strong>healthy</strong>: The compute node storage usage is less than 80%. In this case, this metric is marked in green in the console.</li>
         * </ul>
         * <blockquote>
         * <p> The compute node storage usage is the maximum storage usage among all compute nodes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The metric value of maximum compute node storage usage.</p>
         * <p>Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>1.52</p>
         */
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
        /**
         * <p>The information of maximum compute node storage usage.</p>
         * <blockquote>
         * <p> This parameter value is returned only for instances in elastic storage mode.</p>
         * </blockquote>
         */
        @NameInMap("adbgp_segment_disk_usage_percent_max")
        public DescribeHealthStatusResponseBodyStatusAdbgpSegmentDiskUsagePercentMax adbgpSegmentDiskUsagePercentMax;

        /**
         * <p>The information of instance connection health status.</p>
         */
        @NameInMap("adbpg_connection_status")
        public DescribeHealthStatusResponseBodyStatusAdbpgConnectionStatus adbpgConnectionStatus;

        /**
         * <p>The information of instance storage status.</p>
         * <blockquote>
         * <p> This parameter value is returned only for instances in elastic storage mode.</p>
         * </blockquote>
         */
        @NameInMap("adbpg_disk_status")
        public DescribeHealthStatusResponseBodyStatusAdbpgDiskStatus adbpgDiskStatus;

        /**
         * <p>The information of instance storage usage.</p>
         * <blockquote>
         * <p> This parameter value is returned only for instances in elastic storage mode.</p>
         * </blockquote>
         */
        @NameInMap("adbpg_disk_usage_percent")
        public DescribeHealthStatusResponseBodyStatusAdbpgDiskUsagePercent adbpgDiskUsagePercent;

        /**
         * <p>The total amount of cold data storage.</p>
         */
        @NameInMap("adbpg_instance_cold_data_gb")
        public DescribeHealthStatusResponseBodyStatusAdbpgInstanceColdDataGb adbpgInstanceColdDataGb;

        /**
         * <p>The total amount of hot data storage.</p>
         */
        @NameInMap("adbpg_instance_hot_data_gb")
        public DescribeHealthStatusResponseBodyStatusAdbpgInstanceHotDataGb adbpgInstanceHotDataGb;

        /**
         * <p>The total amount of data storage of the instance.</p>
         */
        @NameInMap("adbpg_instance_total_data_gb")
        public DescribeHealthStatusResponseBodyStatusAdbpgInstanceTotalDataGb adbpgInstanceTotalDataGb;

        /**
         * <p>The information of maximum coordinator node storage usage.</p>
         * <blockquote>
         * <p> This parameter value is returned only for instances in elastic storage mode.</p>
         * </blockquote>
         */
        @NameInMap("adbpg_master_disk_usage_percent_max")
        public DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax;

        /**
         * <p>The information of coordinator node availability status.</p>
         */
        @NameInMap("adbpg_master_status")
        public DescribeHealthStatusResponseBodyStatusAdbpgMasterStatus adbpgMasterStatus;

        /**
         * <p>The information of compute node availability status.</p>
         */
        @NameInMap("adbpg_segment_status")
        public DescribeHealthStatusResponseBodyStatusAdbpgSegmentStatus adbpgSegmentStatus;

        /**
         * <p>The information of instance health status.</p>
         */
        @NameInMap("adbpg_status")
        public DescribeHealthStatusResponseBodyStatusAdbpgStatus adbpgStatus;

        /**
         * <p>The information of coordinator node connection health status.</p>
         */
        @NameInMap("node_master_connection_status")
        public DescribeHealthStatusResponseBodyStatusNodeMasterConnectionStatus nodeMasterConnectionStatus;

        /**
         * <p>The information of coordinator node health status.</p>
         */
        @NameInMap("node_master_status")
        public DescribeHealthStatusResponseBodyStatusNodeMasterStatus nodeMasterStatus;

        /**
         * <p>The information of compute node connection health status.</p>
         */
        @NameInMap("node_segment_connection_status")
        public DescribeHealthStatusResponseBodyStatusNodeSegmentConnectionStatus nodeSegmentConnectionStatus;

        /**
         * <p>The information of compute node storage status.</p>
         * <blockquote>
         * <p> This parameter value is returned only for instances in elastic storage mode.</p>
         * </blockquote>
         */
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

        public DescribeHealthStatusResponseBodyStatus setAdbpgInstanceColdDataGb(DescribeHealthStatusResponseBodyStatusAdbpgInstanceColdDataGb adbpgInstanceColdDataGb) {
            this.adbpgInstanceColdDataGb = adbpgInstanceColdDataGb;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusAdbpgInstanceColdDataGb getAdbpgInstanceColdDataGb() {
            return this.adbpgInstanceColdDataGb;
        }

        public DescribeHealthStatusResponseBodyStatus setAdbpgInstanceHotDataGb(DescribeHealthStatusResponseBodyStatusAdbpgInstanceHotDataGb adbpgInstanceHotDataGb) {
            this.adbpgInstanceHotDataGb = adbpgInstanceHotDataGb;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusAdbpgInstanceHotDataGb getAdbpgInstanceHotDataGb() {
            return this.adbpgInstanceHotDataGb;
        }

        public DescribeHealthStatusResponseBodyStatus setAdbpgInstanceTotalDataGb(DescribeHealthStatusResponseBodyStatusAdbpgInstanceTotalDataGb adbpgInstanceTotalDataGb) {
            this.adbpgInstanceTotalDataGb = adbpgInstanceTotalDataGb;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusAdbpgInstanceTotalDataGb getAdbpgInstanceTotalDataGb() {
            return this.adbpgInstanceTotalDataGb;
        }

        public DescribeHealthStatusResponseBodyStatus setAdbpgMasterDiskUsagePercentMax(DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax adbpgMasterDiskUsagePercentMax) {
            this.adbpgMasterDiskUsagePercentMax = adbpgMasterDiskUsagePercentMax;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusAdbpgMasterDiskUsagePercentMax getAdbpgMasterDiskUsagePercentMax() {
            return this.adbpgMasterDiskUsagePercentMax;
        }

        public DescribeHealthStatusResponseBodyStatus setAdbpgMasterStatus(DescribeHealthStatusResponseBodyStatusAdbpgMasterStatus adbpgMasterStatus) {
            this.adbpgMasterStatus = adbpgMasterStatus;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusAdbpgMasterStatus getAdbpgMasterStatus() {
            return this.adbpgMasterStatus;
        }

        public DescribeHealthStatusResponseBodyStatus setAdbpgSegmentStatus(DescribeHealthStatusResponseBodyStatusAdbpgSegmentStatus adbpgSegmentStatus) {
            this.adbpgSegmentStatus = adbpgSegmentStatus;
            return this;
        }
        public DescribeHealthStatusResponseBodyStatusAdbpgSegmentStatus getAdbpgSegmentStatus() {
            return this.adbpgSegmentStatus;
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
