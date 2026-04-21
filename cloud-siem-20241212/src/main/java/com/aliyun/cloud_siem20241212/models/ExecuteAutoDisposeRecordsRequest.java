// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ExecuteAutoDisposeRecordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SelectedEntityList")
    public java.util.List<ExecuteAutoDisposeRecordsRequestSelectedEntityList> selectedEntityList;

    @NameInMap("UnSelectedEntityList")
    public java.util.List<ExecuteAutoDisposeRecordsRequestUnSelectedEntityList> unSelectedEntityList;

    public static ExecuteAutoDisposeRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAutoDisposeRecordsRequest self = new ExecuteAutoDisposeRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAutoDisposeRecordsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExecuteAutoDisposeRecordsRequest setSelectedEntityList(java.util.List<ExecuteAutoDisposeRecordsRequestSelectedEntityList> selectedEntityList) {
        this.selectedEntityList = selectedEntityList;
        return this;
    }
    public java.util.List<ExecuteAutoDisposeRecordsRequestSelectedEntityList> getSelectedEntityList() {
        return this.selectedEntityList;
    }

    public ExecuteAutoDisposeRecordsRequest setUnSelectedEntityList(java.util.List<ExecuteAutoDisposeRecordsRequestUnSelectedEntityList> unSelectedEntityList) {
        this.unSelectedEntityList = unSelectedEntityList;
        return this;
    }
    public java.util.List<ExecuteAutoDisposeRecordsRequestUnSelectedEntityList> getUnSelectedEntityList() {
        return this.unSelectedEntityList;
    }

    public static class ExecuteAutoDisposeRecordsRequestSelectedEntityList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0000089b040b8935fed2e24ca2ec8335</p>
         */
        @NameInMap("AutoDisposeRecordId")
        public String autoDisposeRecordId;

        /**
         * <strong>example:</strong>
         * <p>9938fc2708ddc7b7651f3a19e4f09962</p>
         */
        @NameInMap("EntityUuid")
        public String entityUuid;

        public static ExecuteAutoDisposeRecordsRequestSelectedEntityList build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAutoDisposeRecordsRequestSelectedEntityList self = new ExecuteAutoDisposeRecordsRequestSelectedEntityList();
            return TeaModel.build(map, self);
        }

        public ExecuteAutoDisposeRecordsRequestSelectedEntityList setAutoDisposeRecordId(String autoDisposeRecordId) {
            this.autoDisposeRecordId = autoDisposeRecordId;
            return this;
        }
        public String getAutoDisposeRecordId() {
            return this.autoDisposeRecordId;
        }

        public ExecuteAutoDisposeRecordsRequestSelectedEntityList setEntityUuid(String entityUuid) {
            this.entityUuid = entityUuid;
            return this;
        }
        public String getEntityUuid() {
            return this.entityUuid;
        }

    }

    public static class ExecuteAutoDisposeRecordsRequestUnSelectedEntityList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0000089b040b8935fed2e24ca2ec8335</p>
         */
        @NameInMap("AutoDisposeRecordId")
        public String autoDisposeRecordId;

        /**
         * <strong>example:</strong>
         * <p>ae6ac3e1c9ada174eb8dadd029a2e9d1</p>
         */
        @NameInMap("EntityUuid")
        public String entityUuid;

        public static ExecuteAutoDisposeRecordsRequestUnSelectedEntityList build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAutoDisposeRecordsRequestUnSelectedEntityList self = new ExecuteAutoDisposeRecordsRequestUnSelectedEntityList();
            return TeaModel.build(map, self);
        }

        public ExecuteAutoDisposeRecordsRequestUnSelectedEntityList setAutoDisposeRecordId(String autoDisposeRecordId) {
            this.autoDisposeRecordId = autoDisposeRecordId;
            return this;
        }
        public String getAutoDisposeRecordId() {
            return this.autoDisposeRecordId;
        }

        public ExecuteAutoDisposeRecordsRequestUnSelectedEntityList setEntityUuid(String entityUuid) {
            this.entityUuid = entityUuid;
            return this;
        }
        public String getEntityUuid() {
            return this.entityUuid;
        }

    }

}
