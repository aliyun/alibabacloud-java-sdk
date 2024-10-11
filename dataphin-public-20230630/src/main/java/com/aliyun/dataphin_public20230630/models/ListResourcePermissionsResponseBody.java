// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListResourcePermissionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageResult")
    public ListResourcePermissionsResponseBodyPageResult pageResult;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListResourcePermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcePermissionsResponseBody self = new ListResourcePermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcePermissionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListResourcePermissionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListResourcePermissionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListResourcePermissionsResponseBody setPageResult(ListResourcePermissionsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListResourcePermissionsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListResourcePermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourcePermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListResourcePermissionsResponseBodyPageResultDataPeriod extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1712000000000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListResourcePermissionsResponseBodyPageResultDataPeriod build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionsResponseBodyPageResultDataPeriod self = new ListResourcePermissionsResponseBodyPageResultDataPeriod();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionsResponseBodyPageResultDataPeriod setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListResourcePermissionsResponseBodyPageResultDataPeriod setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodListPeriod extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1712000000000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodListPeriod build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodListPeriod self = new ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodListPeriod();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodListPeriod setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodListPeriod setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodList extends TeaModel {
        @NameInMap("Period")
        public ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodListPeriod period;

        /**
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("PermissionType")
        public String permissionType;

        public static ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodList build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodList self = new ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodList();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodList setPeriod(ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodListPeriod period) {
            this.period = period;
            return this;
        }
        public ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodListPeriod getPeriod() {
            return this.period;
        }

        public ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodList setPermissionType(String permissionType) {
            this.permissionType = permissionType;
            return this;
        }
        public String getPermissionType() {
            return this.permissionType;
        }

    }

    public static class ListResourcePermissionsResponseBodyPageResultDataResourceInfoBizUnitInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>Id</p>
         * 
         * <strong>example:</strong>
         * <p>121323</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListResourcePermissionsResponseBodyPageResultDataResourceInfoBizUnitInfo build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionsResponseBodyPageResultDataResourceInfoBizUnitInfo self = new ListResourcePermissionsResponseBodyPageResultDataResourceInfoBizUnitInfo();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfoBizUnitInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfoBizUnitInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfoBizUnitInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfoBizUnitInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListResourcePermissionsResponseBodyPageResultDataResourceInfoProjectInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>1123131</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListResourcePermissionsResponseBodyPageResultDataResourceInfoProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionsResponseBodyPageResultDataResourceInfoProjectInfo self = new ListResourcePermissionsResponseBodyPageResultDataResourceInfoProjectInfo();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfoProjectInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfoProjectInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfoProjectInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfoProjectInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListResourcePermissionsResponseBodyPageResultDataResourceInfo extends TeaModel {
        @NameInMap("BizUnitInfo")
        public ListResourcePermissionsResponseBodyPageResultDataResourceInfoBizUnitInfo bizUnitInfo;

        /**
         * <strong>example:</strong>
         * <p>tb1</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>a.tb1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>tb1</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectInfo")
        public ListResourcePermissionsResponseBodyPageResultDataResourceInfoProjectInfo projectInfo;

        /**
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListResourcePermissionsResponseBodyPageResultDataResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionsResponseBodyPageResultDataResourceInfo self = new ListResourcePermissionsResponseBodyPageResultDataResourceInfo();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfo setBizUnitInfo(ListResourcePermissionsResponseBodyPageResultDataResourceInfoBizUnitInfo bizUnitInfo) {
            this.bizUnitInfo = bizUnitInfo;
            return this;
        }
        public ListResourcePermissionsResponseBodyPageResultDataResourceInfoBizUnitInfo getBizUnitInfo() {
            return this.bizUnitInfo;
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfo setProjectInfo(ListResourcePermissionsResponseBodyPageResultDataResourceInfoProjectInfo projectInfo) {
            this.projectInfo = projectInfo;
            return this;
        }
        public ListResourcePermissionsResponseBodyPageResultDataResourceInfoProjectInfo getProjectInfo() {
            return this.projectInfo;
        }

        public ListResourcePermissionsResponseBodyPageResultDataResourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourcePermissionsResponseBodyPageResultDataTargetAccount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1212131</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListResourcePermissionsResponseBodyPageResultDataTargetAccount build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionsResponseBodyPageResultDataTargetAccount self = new ListResourcePermissionsResponseBodyPageResultDataTargetAccount();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionsResponseBodyPageResultDataTargetAccount setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourcePermissionsResponseBodyPageResultDataTargetAccount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcePermissionsResponseBodyPageResultDataTargetAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourcePermissionsResponseBodyPageResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>selectTable</p>
         */
        @NameInMap("AuthScope")
        public String authScope;

        @NameInMap("Period")
        public ListResourcePermissionsResponseBodyPageResultDataPeriod period;

        @NameInMap("PermissionPeriodList")
        public java.util.List<ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodList> permissionPeriodList;

        /**
         * <strong>example:</strong>
         * <p>12123111</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("ResourceInfo")
        public ListResourcePermissionsResponseBodyPageResultDataResourceInfo resourceInfo;

        @NameInMap("TargetAccount")
        public ListResourcePermissionsResponseBodyPageResultDataTargetAccount targetAccount;

        public static ListResourcePermissionsResponseBodyPageResultData build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionsResponseBodyPageResultData self = new ListResourcePermissionsResponseBodyPageResultData();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionsResponseBodyPageResultData setAuthScope(String authScope) {
            this.authScope = authScope;
            return this;
        }
        public String getAuthScope() {
            return this.authScope;
        }

        public ListResourcePermissionsResponseBodyPageResultData setPeriod(ListResourcePermissionsResponseBodyPageResultDataPeriod period) {
            this.period = period;
            return this;
        }
        public ListResourcePermissionsResponseBodyPageResultDataPeriod getPeriod() {
            return this.period;
        }

        public ListResourcePermissionsResponseBodyPageResultData setPermissionPeriodList(java.util.List<ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodList> permissionPeriodList) {
            this.permissionPeriodList = permissionPeriodList;
            return this;
        }
        public java.util.List<ListResourcePermissionsResponseBodyPageResultDataPermissionPeriodList> getPermissionPeriodList() {
            return this.permissionPeriodList;
        }

        public ListResourcePermissionsResponseBodyPageResultData setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListResourcePermissionsResponseBodyPageResultData setResourceInfo(ListResourcePermissionsResponseBodyPageResultDataResourceInfo resourceInfo) {
            this.resourceInfo = resourceInfo;
            return this;
        }
        public ListResourcePermissionsResponseBodyPageResultDataResourceInfo getResourceInfo() {
            return this.resourceInfo;
        }

        public ListResourcePermissionsResponseBodyPageResultData setTargetAccount(ListResourcePermissionsResponseBodyPageResultDataTargetAccount targetAccount) {
            this.targetAccount = targetAccount;
            return this;
        }
        public ListResourcePermissionsResponseBodyPageResultDataTargetAccount getTargetAccount() {
            return this.targetAccount;
        }

    }

    public static class ListResourcePermissionsResponseBodyPageResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListResourcePermissionsResponseBodyPageResultData> data;

        /**
         * <strong>example:</strong>
         * <p>121</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListResourcePermissionsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionsResponseBodyPageResult self = new ListResourcePermissionsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionsResponseBodyPageResult setData(java.util.List<ListResourcePermissionsResponseBodyPageResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListResourcePermissionsResponseBodyPageResultData> getData() {
            return this.data;
        }

        public ListResourcePermissionsResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
