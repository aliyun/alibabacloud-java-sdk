// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListBackupDataResponseBody extends TeaModel {
    @NameInMap("BackupDataList")
    public java.util.List<ListBackupDataResponseBodyBackupDataList> backupDataList;

    /**
     * <strong>example:</strong>
     * <p>4AA0C48F-B5BB-5FF9-A43B-6B91E0715D46</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBackupDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBackupDataResponseBody self = new ListBackupDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBackupDataResponseBody setBackupDataList(java.util.List<ListBackupDataResponseBodyBackupDataList> backupDataList) {
        this.backupDataList = backupDataList;
        return this;
    }
    public java.util.List<ListBackupDataResponseBodyBackupDataList> getBackupDataList() {
        return this.backupDataList;
    }

    public ListBackupDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBackupDataResponseBodyBackupDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>redundant</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <strong>example:</strong>
         * <p>32413521</p>
         */
        @NameInMap("ColdDataSize")
        public Long coldDataSize;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("DataDesc")
        public String dataDesc;

        /**
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("DataGran")
        public String dataGran;

        /**
         * <strong>example:</strong>
         * <p>76085723136</p>
         */
        @NameInMap("DataSize")
        public Long dataSize;

        /**
         * <strong>example:</strong>
         * <p>2024-10-28T12:23:37.000+00:00</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <strong>example:</strong>
         * <p>2024-10-28T12:27:34.000+00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1780805690994479105</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>hgpostcn-cn-pe33jdxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>my-hologres-dw</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("InstanceRegion")
        public String instanceRegion;

        /**
         * <strong>example:</strong>
         * <p>Warehouse</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("InstanceZoneId")
        public String instanceZoneId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SnapshotRegion")
        public String snapshotRegion;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("SnapshotZoneId")
        public String snapshotZoneId;

        /**
         * <strong>example:</strong>
         * <p>2024-10-28T11:19:56.000+00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>scheduled</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static ListBackupDataResponseBodyBackupDataList build(java.util.Map<String, ?> map) throws Exception {
            ListBackupDataResponseBodyBackupDataList self = new ListBackupDataResponseBodyBackupDataList();
            return TeaModel.build(map, self);
        }

        public ListBackupDataResponseBodyBackupDataList setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public ListBackupDataResponseBodyBackupDataList setColdDataSize(Long coldDataSize) {
            this.coldDataSize = coldDataSize;
            return this;
        }
        public Long getColdDataSize() {
            return this.coldDataSize;
        }

        public ListBackupDataResponseBodyBackupDataList setDataDesc(String dataDesc) {
            this.dataDesc = dataDesc;
            return this;
        }
        public String getDataDesc() {
            return this.dataDesc;
        }

        public ListBackupDataResponseBodyBackupDataList setDataGran(String dataGran) {
            this.dataGran = dataGran;
            return this;
        }
        public String getDataGran() {
            return this.dataGran;
        }

        public ListBackupDataResponseBodyBackupDataList setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public ListBackupDataResponseBodyBackupDataList setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public ListBackupDataResponseBodyBackupDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListBackupDataResponseBodyBackupDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListBackupDataResponseBodyBackupDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListBackupDataResponseBodyBackupDataList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListBackupDataResponseBodyBackupDataList setInstanceRegion(String instanceRegion) {
            this.instanceRegion = instanceRegion;
            return this;
        }
        public String getInstanceRegion() {
            return this.instanceRegion;
        }

        public ListBackupDataResponseBodyBackupDataList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListBackupDataResponseBodyBackupDataList setInstanceZoneId(String instanceZoneId) {
            this.instanceZoneId = instanceZoneId;
            return this;
        }
        public String getInstanceZoneId() {
            return this.instanceZoneId;
        }

        public ListBackupDataResponseBodyBackupDataList setSnapshotRegion(String snapshotRegion) {
            this.snapshotRegion = snapshotRegion;
            return this;
        }
        public String getSnapshotRegion() {
            return this.snapshotRegion;
        }

        public ListBackupDataResponseBodyBackupDataList setSnapshotZoneId(String snapshotZoneId) {
            this.snapshotZoneId = snapshotZoneId;
            return this;
        }
        public String getSnapshotZoneId() {
            return this.snapshotZoneId;
        }

        public ListBackupDataResponseBodyBackupDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListBackupDataResponseBodyBackupDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBackupDataResponseBodyBackupDataList setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
