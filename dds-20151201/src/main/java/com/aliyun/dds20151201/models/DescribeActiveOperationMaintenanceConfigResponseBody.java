// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationMaintenanceConfigResponseBody extends TeaModel {
    /**
     * <p>The details of the configuration.</p>
     */
    @NameInMap("Config")
    public DescribeActiveOperationMaintenanceConfigResponseBodyConfig config;

    /**
     * <p>Indicates whether a configuration is set.</p>
     * <ul>
     * <li><p>1: A configuration is set.</p>
     * </li>
     * <li><p>0: No configuration is set.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HasConfig")
    public Integer hasConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>72651AF9-7897-41A7-8B67-6C15C7F26A0A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeActiveOperationMaintenanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationMaintenanceConfigResponseBody self = new DescribeActiveOperationMaintenanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationMaintenanceConfigResponseBody setConfig(DescribeActiveOperationMaintenanceConfigResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribeActiveOperationMaintenanceConfigResponseBodyConfig getConfig() {
        return this.config;
    }

    public DescribeActiveOperationMaintenanceConfigResponseBody setHasConfig(Integer hasConfig) {
        this.hasConfig = hasConfig;
        return this;
    }
    public Integer getHasConfig() {
        return this.hasConfig;
    }

    public DescribeActiveOperationMaintenanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeActiveOperationMaintenanceConfigResponseBodyConfig extends TeaModel {
        /**
         * <p>The time when the O\&amp;M task configuration was created. The time is in the <em>yyyy-mm-dd</em>T<em>hh:mm:ss</em>Z format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-05-30T14:30:00Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The days of the cycle.</p>
         * <ul>
         * <li><p>If CycleType is set to Month, this parameter returns the days of the month. Valid values: 1 to 28. Multiple values are separated by commas (,).</p>
         * </li>
         * <li><p>If CycleType is set to Week, this parameter returns the days of the week. Valid values: 1 to 7. Multiple values are separated by commas (,).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        @NameInMap("CycleTime")
        public String cycleTime;

        /**
         * <p>The cycle type.</p>
         * <ul>
         * <li><p>Month</p>
         * </li>
         * <li><p>Week</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <p>The end time of the O\&amp;M time window. The time is in the <em>hh:mm:ss</em>Z format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>20:00:00Z</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the O\&amp;M time window. The time is in the <em>hh:mm:ss</em>Z format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00:00Z</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The time when the operations and maintenance (O\&amp;M) task configuration was modified. The time is in the <em>yyyy-mm-dd</em>T<em>hh:mm:ss</em>Z format and is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-30T14:30:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>Indicates whether the configuration is enabled.</p>
         * <ul>
         * <li><p>1: Enabled</p>
         * </li>
         * <li><p>2: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeActiveOperationMaintenanceConfigResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveOperationMaintenanceConfigResponseBodyConfig self = new DescribeActiveOperationMaintenanceConfigResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setCycleTime(String cycleTime) {
            this.cycleTime = cycleTime;
            return this;
        }
        public String getCycleTime() {
            return this.cycleTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
            return this.cycleType;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeActiveOperationMaintenanceConfigResponseBodyConfig setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
