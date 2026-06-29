// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListResourcePermissionOperationLogResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paging query result.</p>
     */
    @NameInMap("PageResult")
    public ListResourcePermissionOperationLogResponseBodyPageResult pageResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListResourcePermissionOperationLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcePermissionOperationLogResponseBody self = new ListResourcePermissionOperationLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcePermissionOperationLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListResourcePermissionOperationLogResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListResourcePermissionOperationLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListResourcePermissionOperationLogResponseBody setPageResult(ListResourcePermissionOperationLogResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListResourcePermissionOperationLogResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListResourcePermissionOperationLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourcePermissionOperationLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListResourcePermissionOperationLogResponseBodyPageResultDataAccount extends TeaModel {
        /**
         * <p>The account ID.</p>
         * <ul>
         * <li>Individual account: the userId on the Dataphin side.</li>
         * <li>Production account: the UserId obtained by calling the GetProjectProduceUser operation.</li>
         * <li>User group: the user group ID obtained by calling the ListUserGroup operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1212131</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The authorization account type. Valid values:</p>
         * <ul>
         * <li>PERSONAL: individual account</li>
         * <li>PRODUCE: production account</li>
         * <li>USER_GROUP: user group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListResourcePermissionOperationLogResponseBodyPageResultDataAccount build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionOperationLogResponseBodyPageResultDataAccount self = new ListResourcePermissionOperationLogResponseBodyPageResultDataAccount();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataAccount setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataAccount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourcePermissionOperationLogResponseBodyPageResultDataPeriod extends TeaModel {
        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1712000000000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The validity period type. Valid values:</p>
         * <ul>
         * <li>CUSTOM: custom</li>
         * <li>LONG_TERM: permanently valid</li>
         * <li>DAYS_30: valid for 30 days</li>
         * <li>DAYS_90: valid for 90 days</li>
         * <li>DAYS_180: valid for 180 days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListResourcePermissionOperationLogResponseBodyPageResultDataPeriod build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionOperationLogResponseBodyPageResultDataPeriod self = new ListResourcePermissionOperationLogResponseBodyPageResultDataPeriod();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataPeriod setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataPeriod setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoBizUnitInfo extends TeaModel {
        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The environment identifier. Valid values: </p>
         * <ul>
         * <li>DEV</li>
         * <li>PROD.</li>
         * </ul>
         * 
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
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoBizUnitInfo build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoBizUnitInfo self = new ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoBizUnitInfo();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoBizUnitInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoBizUnitInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoBizUnitInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoBizUnitInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoProjectInfo extends TeaModel {
        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The environment identifier. Valid values: </p>
         * <ul>
         * <li>DEV</li>
         * <li>PROD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1123131</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoProjectInfo self = new ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoProjectInfo();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoProjectInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoProjectInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoProjectInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoProjectInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo extends TeaModel {
        /**
         * <p>The business unit information.</p>
         */
        @NameInMap("BizUnitInfo")
        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoBizUnitInfo bizUnitInfo;

        /**
         * <p>The display name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>tb1</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The resource environment. Valid values:</p>
         * <ul>
         * <li>DEV</li>
         * <li>PROD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The permission resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a.tb1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The permission resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>tb1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The project information.</p>
         */
        @NameInMap("ProjectInfo")
        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoProjectInfo projectInfo;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>PHYSICAL_TABLE: physical table</li>
         * <li>PHYSICAL_VIEW: physical view</li>
         * <li>LOGICAL_TABLE: fact logical table</li>
         * <li>LOGICAL_VIEW: fact logical view</li>
         * <li>REALTIME_LOGICAL_TABLE: real-time meta table</li>
         * <li>REALTIME_MIRROR_TABLE: real-time meta table</li>
         * <li>DATASOURCE: datasource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PHYSICAL_TABLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo self = new ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo setBizUnitInfo(ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoBizUnitInfo bizUnitInfo) {
            this.bizUnitInfo = bizUnitInfo;
            return this;
        }
        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoBizUnitInfo getBizUnitInfo() {
            return this.bizUnitInfo;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo setProjectInfo(ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoProjectInfo projectInfo) {
            this.projectInfo = projectInfo;
            return this;
        }
        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfoProjectInfo getProjectInfo() {
            return this.projectInfo;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourcePermissionOperationLogResponseBodyPageResultDataTargetAccount extends TeaModel {
        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1212131</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The authorized account type.</p>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListResourcePermissionOperationLogResponseBodyPageResultDataTargetAccount build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionOperationLogResponseBodyPageResultDataTargetAccount self = new ListResourcePermissionOperationLogResponseBodyPageResultDataTargetAccount();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataTargetAccount setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataTargetAccount setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultDataTargetAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourcePermissionOperationLogResponseBodyPageResultData extends TeaModel {
        /**
         * <p>The operator.</p>
         */
        @NameInMap("Account")
        public ListResourcePermissionOperationLogResponseBodyPageResultDataAccount account;

        /**
         * <p>The authorization scope of the table. Valid values:</p>
         * <ul>
         * <li>selectTable: specified table</li>
         * <li>projectAllTable: all tables in the project</li>
         * <li>bizUnitAllLogicTable: all logical tables in the business unit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>selectTable</p>
         */
        @NameInMap("AuthScope")
        public String authScope;

        /**
         * <p>The operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123133</p>
         */
        @NameInMap("OperateId")
        public Long operateId;

        /**
         * <p>The operation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710012121000</p>
         */
        @NameInMap("OperateTime")
        public Long operateTime;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>APPLY: Apply for permissions.</li>
         * <li>GRANT: Grant permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPLY</p>
         */
        @NameInMap("OperateType")
        public String operateType;

        /**
         * <p>The validity period settings.</p>
         */
        @NameInMap("Period")
        public ListResourcePermissionOperationLogResponseBodyPageResultDataPeriod period;

        /**
         * <p>The reason.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The permission resource.</p>
         */
        @NameInMap("ResourceInfo")
        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo resourceInfo;

        /**
         * <p>The authorized object.</p>
         */
        @NameInMap("TargetAccount")
        public ListResourcePermissionOperationLogResponseBodyPageResultDataTargetAccount targetAccount;

        public static ListResourcePermissionOperationLogResponseBodyPageResultData build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionOperationLogResponseBodyPageResultData self = new ListResourcePermissionOperationLogResponseBodyPageResultData();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultData setAccount(ListResourcePermissionOperationLogResponseBodyPageResultDataAccount account) {
            this.account = account;
            return this;
        }
        public ListResourcePermissionOperationLogResponseBodyPageResultDataAccount getAccount() {
            return this.account;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultData setAuthScope(String authScope) {
            this.authScope = authScope;
            return this;
        }
        public String getAuthScope() {
            return this.authScope;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultData setOperateId(Long operateId) {
            this.operateId = operateId;
            return this;
        }
        public Long getOperateId() {
            return this.operateId;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultData setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultData setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultData setPeriod(ListResourcePermissionOperationLogResponseBodyPageResultDataPeriod period) {
            this.period = period;
            return this;
        }
        public ListResourcePermissionOperationLogResponseBodyPageResultDataPeriod getPeriod() {
            return this.period;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultData setResourceInfo(ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo resourceInfo) {
            this.resourceInfo = resourceInfo;
            return this;
        }
        public ListResourcePermissionOperationLogResponseBodyPageResultDataResourceInfo getResourceInfo() {
            return this.resourceInfo;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResultData setTargetAccount(ListResourcePermissionOperationLogResponseBodyPageResultDataTargetAccount targetAccount) {
            this.targetAccount = targetAccount;
            return this;
        }
        public ListResourcePermissionOperationLogResponseBodyPageResultDataTargetAccount getTargetAccount() {
            return this.targetAccount;
        }

    }

    public static class ListResourcePermissionOperationLogResponseBodyPageResult extends TeaModel {
        /**
         * <p>The paginated records.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListResourcePermissionOperationLogResponseBodyPageResultData> data;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>121</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListResourcePermissionOperationLogResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListResourcePermissionOperationLogResponseBodyPageResult self = new ListResourcePermissionOperationLogResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListResourcePermissionOperationLogResponseBodyPageResult setData(java.util.List<ListResourcePermissionOperationLogResponseBodyPageResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListResourcePermissionOperationLogResponseBodyPageResultData> getData() {
            return this.data;
        }

        public ListResourcePermissionOperationLogResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
