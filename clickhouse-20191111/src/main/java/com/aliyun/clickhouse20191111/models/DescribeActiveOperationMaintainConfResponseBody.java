// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationMaintainConfResponseBody extends TeaModel {
    /**
     * <p>The active O\&amp;M configuration items.</p>
     */
    @NameInMap("Config")
    public DescribeActiveOperationMaintainConfResponseBodyConfig config;

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
     * <p>1</p>
     */
    @NameInMap("HasConfig")
    public Integer hasConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A23C87D-87DF-4DA0-A50E-CB13F4F7923D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeActiveOperationMaintainConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationMaintainConfResponseBody self = new DescribeActiveOperationMaintainConfResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationMaintainConfResponseBody setConfig(DescribeActiveOperationMaintainConfResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribeActiveOperationMaintainConfResponseBodyConfig getConfig() {
        return this.config;
    }

    public DescribeActiveOperationMaintainConfResponseBody setHasConfig(Integer hasConfig) {
        this.hasConfig = hasConfig;
        return this;
    }
    public Integer getHasConfig() {
        return this.hasConfig;
    }

    public DescribeActiveOperationMaintainConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeActiveOperationMaintainConfResponseBodyConfig extends TeaModel {
        /**
         * <p>The time when the configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-18T06:51:11+08:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The day of the cycle.</p>
         * <ul>
         * <li><p>If CycleType is Month, this parameter returns one or more numbers from 1 to 28 that indicate the day of the month. Multiple numbers are separated by commas (,).</p>
         * </li>
         * <li><p>If CycleType is Week, this parameter returns one or more numbers from 1 to 7 that indicate the day of the week. Multiple numbers are separated by commas (,).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>Week</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <p>The end time of the maintenance window.</p>
         * 
         * <strong>example:</strong>
         * <p>22:00Z</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the maintenance window.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00Z</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The time when the configuration was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-27T07:12:53Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The status of the configuration. A value of 1 indicates that the configuration is enabled. A value of 2 indicates that the configuration is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeActiveOperationMaintainConfResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeActiveOperationMaintainConfResponseBodyConfig self = new DescribeActiveOperationMaintainConfResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setCycleTime(String cycleTime) {
            this.cycleTime = cycleTime;
            return this;
        }
        public String getCycleTime() {
            return this.cycleTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
            return this.cycleType;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeActiveOperationMaintainConfResponseBodyConfig setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
