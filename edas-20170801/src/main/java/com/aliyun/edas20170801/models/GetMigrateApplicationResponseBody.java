// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetMigrateApplicationResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Long code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetMigrateApplicationResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3b52155517851187240212426d0099</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static GetMigrateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMigrateApplicationResponseBody self = new GetMigrateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMigrateApplicationResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetMigrateApplicationResponseBody setData(GetMigrateApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMigrateApplicationResponseBodyData getData() {
        return this.data;
    }

    public GetMigrateApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMigrateApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMigrateApplicationResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetMigrateApplicationResponseBodyDataResultExtraInfo extends TeaModel {
        /**
         * <p>appJsonFile</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="https://edas-hz-secure.oss-cn-hangzhou.aliyuncs.com/edas-app-migration/1057288613002791/e7c2e7d9-5e87-46a2-99e9-2be0b577a3fd/edas-app.json?Expires=1791517039&OSSAccessKeyId=LTAIWLbjtAGvdMWX&Signature=HyZ2b3u5mlP56T8QgkARwWE5cQc%3D">https://edas-hz-secure.oss-cn-hangzhou.aliyuncs.com/edas-app-migration/1057288613002791/e7c2e7d9-5e87-46a2-99e9-2be0b577a3fd/edas-app.json?Expires=1791517039&amp;OSSAccessKeyId=LTAIWLbjtAGvdMWX&amp;Signature=HyZ2b3u5mlP56T8QgkARwWE5cQc%3D</a>&quot;</p>
         */
        @NameInMap("appJsonFile")
        public String appJsonFile;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("errorMsg")
        public String errorMsg;

        public static GetMigrateApplicationResponseBodyDataResultExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMigrateApplicationResponseBodyDataResultExtraInfo self = new GetMigrateApplicationResponseBodyDataResultExtraInfo();
            return TeaModel.build(map, self);
        }

        public GetMigrateApplicationResponseBodyDataResultExtraInfo setAppJsonFile(String appJsonFile) {
            this.appJsonFile = appJsonFile;
            return this;
        }
        public String getAppJsonFile() {
            return this.appJsonFile;
        }

        public GetMigrateApplicationResponseBodyDataResultExtraInfo setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class GetMigrateApplicationResponseBodyDataResult extends TeaModel {
        /**
         * <p>The detailed status of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;a259bc63-c1f4-48ba-89b1-d6a4591e946c\&quot;:{\&quot;app_name\&quot;:\&quot;prodoam1\&quot;,\&quot;cluster_name\&quot;:\&quot;hthoamtest\&quot;,\&quot;cluster_id\&quot;:\&quot;f68945a8-47af-4644-a951-0486d674f26e\&quot;,\&quot;error_msg\&quot;:\&quot;\&quot;,\&quot;is_multilingual_app\&quot;:false,\&quot;state\&quot;:\&quot;success\&quot;,\&quot;clusterId\&quot;:\&quot;f68945a8-47af-4644-a951-0486d674f26e\&quot;,\&quot;app_id\&quot;:\&quot;a259bc63-c1f4-48ba-89b1-d6a4591e946c\&quot;,\&quot;logical_region_id\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;k8sNamespace\&quot;:\&quot;default\&quot;},\&quot;c5a258ac-f02d-4035-b59f-cd7f4a34156a\&quot;:{\&quot;app_name\&quot;:\&quot;testoam1\&quot;,\&quot;cluster_name\&quot;:\&quot;hthoamtest\&quot;,\&quot;cluster_id\&quot;:\&quot;f68945a8-47af-4644-a951-0486d674f26e\&quot;,\&quot;error_msg\&quot;:\&quot;\&quot;,\&quot;is_multilingual_app\&quot;:false,\&quot;state\&quot;:\&quot;success\&quot;,\&quot;clusterId\&quot;:\&quot;f68945a8-47af-4644-a951-0486d674f26e\&quot;,\&quot;app_id\&quot;:\&quot;c5a258ac-f02d-4035-b59f-cd7f4a34156a\&quot;,\&quot;logical_region_id\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;k8sNamespace\&quot;:\&quot;default\&quot;},\&quot;d132c827-db2f-444e-bc9e-9182d8112806\&quot;:{\&quot;app_name\&quot;:\&quot;oam1\&quot;,\&quot;cluster_name\&quot;:\&quot;hthoamtest\&quot;,\&quot;cluster_id\&quot;:\&quot;f68945a8-47af-4644-a951-0486d674f26e\&quot;,\&quot;error_msg\&quot;:\&quot;\&quot;,\&quot;is_multilingual_app\&quot;:false,\&quot;state\&quot;:\&quot;success\&quot;,\&quot;clusterId\&quot;:\&quot;f68945a8-47af-4644-a951-0486d674f26e\&quot;,\&quot;app_id\&quot;:\&quot;d132c827-db2f-444e-bc9e-9182d8112806\&quot;,\&quot;logical_region_id\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;k8sNamespace\&quot;:\&quot;default\&quot;}}&quot;</p>
         */
        @NameInMap("appDetailState")
        public String appDetailState;

        /**
         * <p>Indicates whether binary resources are cleaned up. Valid values: 0: not cleaned up. 1: cleaned up.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("binaryCleaned")
        public Long binaryCleaned;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1791512615778</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The additional information.</p>
         */
        @NameInMap("extraInfo")
        public GetMigrateApplicationResponseBodyDataResultExtraInfo extraInfo;

        /**
         * <p>The migration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;e7c2e7d9-5e87-46a2-99e9-2be0b577a3fd&quot;</p>
         */
        @NameInMap("migrationId")
        public String migrationId;

        /**
         * <p>The operation type of the migration task. Valid values: 1: import. 2: export. 3: clone.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("migrationType")
        public Long migrationType;

        /**
         * <p>The executor.</p>
         * 
         * <strong>example:</strong>
         * <p>lvwan</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>regionId</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The application migration status. Valid values: failed: Failed. finished: Succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The task progress percentage, stored as a floating-point number. For example, if the API returns 0.33, the progress bar displays 33%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.33</p>
         */
        @NameInMap("statePercent")
        public String statePercent;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1791512615778</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        public static GetMigrateApplicationResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetMigrateApplicationResponseBodyDataResult self = new GetMigrateApplicationResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetMigrateApplicationResponseBodyDataResult setAppDetailState(String appDetailState) {
            this.appDetailState = appDetailState;
            return this;
        }
        public String getAppDetailState() {
            return this.appDetailState;
        }

        public GetMigrateApplicationResponseBodyDataResult setBinaryCleaned(Long binaryCleaned) {
            this.binaryCleaned = binaryCleaned;
            return this;
        }
        public Long getBinaryCleaned() {
            return this.binaryCleaned;
        }

        public GetMigrateApplicationResponseBodyDataResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMigrateApplicationResponseBodyDataResult setExtraInfo(GetMigrateApplicationResponseBodyDataResultExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public GetMigrateApplicationResponseBodyDataResultExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public GetMigrateApplicationResponseBodyDataResult setMigrationId(String migrationId) {
            this.migrationId = migrationId;
            return this;
        }
        public String getMigrationId() {
            return this.migrationId;
        }

        public GetMigrateApplicationResponseBodyDataResult setMigrationType(Long migrationType) {
            this.migrationType = migrationType;
            return this;
        }
        public Long getMigrationType() {
            return this.migrationType;
        }

        public GetMigrateApplicationResponseBodyDataResult setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetMigrateApplicationResponseBodyDataResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetMigrateApplicationResponseBodyDataResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetMigrateApplicationResponseBodyDataResult setStatePercent(String statePercent) {
            this.statePercent = statePercent;
            return this;
        }
        public String getStatePercent() {
            return this.statePercent;
        }

        public GetMigrateApplicationResponseBodyDataResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetMigrateApplicationResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("currentPage")
        public Long currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The list of results.</p>
         */
        @NameInMap("result")
        public java.util.List<GetMigrateApplicationResponseBodyDataResult> result;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("totalSize")
        public Long totalSize;

        public static GetMigrateApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMigrateApplicationResponseBodyData self = new GetMigrateApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMigrateApplicationResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetMigrateApplicationResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetMigrateApplicationResponseBodyData setResult(java.util.List<GetMigrateApplicationResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetMigrateApplicationResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetMigrateApplicationResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
