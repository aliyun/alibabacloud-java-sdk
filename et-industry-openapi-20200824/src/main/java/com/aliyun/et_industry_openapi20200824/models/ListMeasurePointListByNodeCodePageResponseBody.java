// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class ListMeasurePointListByNodeCodePageResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListMeasurePointListByNodeCodePageResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListMeasurePointListByNodeCodePageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMeasurePointListByNodeCodePageResponseBody self = new ListMeasurePointListByNodeCodePageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMeasurePointListByNodeCodePageResponseBody setAccessDeniedDetail(ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListMeasurePointListByNodeCodePageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMeasurePointListByNodeCodePageResponseBody setData(ListMeasurePointListByNodeCodePageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMeasurePointListByNodeCodePageResponseBodyData getData() {
        return this.data;
    }

    public ListMeasurePointListByNodeCodePageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMeasurePointListByNodeCodePageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMeasurePointListByNodeCodePageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMeasurePointListByNodeCodePageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail extends TeaModel {
        @NameInMap("AuthAction")
        public String authAction;

        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        @NameInMap("NoPermissionType")
        public String noPermissionType;

        @NameInMap("PolicyType")
        public String policyType;

        public static ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail self = new ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListMeasurePointListByNodeCodePageResponseBodyDataDataList extends TeaModel {
        @NameInMap("AcqFreq")
        public String acqFreq;

        @NameInMap("AlarmAttribute")
        public String alarmAttribute;

        @NameInMap("AlarmLevel")
        public String alarmLevel;

        @NameInMap("CalcAttribute")
        public String calcAttribute;

        @NameInMap("CalcFormula")
        public String calcFormula;

        @NameInMap("CalcType")
        public String calcType;

        @NameInMap("Code")
        public String code;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DataSourceId")
        public String dataSourceId;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Description")
        public String description;

        @NameInMap("ErrMsgDetail")
        public String errMsgDetail;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModify")
        public Long gmtModify;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("InitValue")
        public String initValue;

        @NameInMap("IsEnable")
        public String isEnable;

        @NameInMap("LastUploadTime")
        public String lastUploadTime;

        @NameInMap("LatestValue")
        public String latestValue;

        @NameInMap("LowerLimit")
        public String lowerLimit;

        @NameInMap("MeasurePointState")
        public String measurePointState;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeCode")
        public String nodeCode;

        @NameInMap("NodeId")
        public Integer nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ParentFullName")
        public String parentFullName;

        @NameInMap("PayLoad")
        public String payLoad;

        @NameInMap("ProtocolConfig")
        public String protocolConfig;

        @NameInMap("SourcePoint")
        public String sourcePoint;

        @NameInMap("TenantCode")
        public String tenantCode;

        @NameInMap("Time")
        public String time;

        @NameInMap("Type")
        public String type;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("UpperLimit")
        public String upperLimit;

        public static ListMeasurePointListByNodeCodePageResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            ListMeasurePointListByNodeCodePageResponseBodyDataDataList self = new ListMeasurePointListByNodeCodePageResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setAcqFreq(String acqFreq) {
            this.acqFreq = acqFreq;
            return this;
        }
        public String getAcqFreq() {
            return this.acqFreq;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setAlarmAttribute(String alarmAttribute) {
            this.alarmAttribute = alarmAttribute;
            return this;
        }
        public String getAlarmAttribute() {
            return this.alarmAttribute;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setCalcAttribute(String calcAttribute) {
            this.calcAttribute = calcAttribute;
            return this;
        }
        public String getCalcAttribute() {
            return this.calcAttribute;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setCalcFormula(String calcFormula) {
            this.calcFormula = calcFormula;
            return this;
        }
        public String getCalcFormula() {
            return this.calcFormula;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setCalcType(String calcType) {
            this.calcType = calcType;
            return this;
        }
        public String getCalcType() {
            return this.calcType;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setErrMsgDetail(String errMsgDetail) {
            this.errMsgDetail = errMsgDetail;
            return this;
        }
        public String getErrMsgDetail() {
            return this.errMsgDetail;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setGmtModify(Long gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public Long getGmtModify() {
            return this.gmtModify;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setInitValue(String initValue) {
            this.initValue = initValue;
            return this;
        }
        public String getInitValue() {
            return this.initValue;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setIsEnable(String isEnable) {
            this.isEnable = isEnable;
            return this;
        }
        public String getIsEnable() {
            return this.isEnable;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setLastUploadTime(String lastUploadTime) {
            this.lastUploadTime = lastUploadTime;
            return this;
        }
        public String getLastUploadTime() {
            return this.lastUploadTime;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setLatestValue(String latestValue) {
            this.latestValue = latestValue;
            return this;
        }
        public String getLatestValue() {
            return this.latestValue;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setLowerLimit(String lowerLimit) {
            this.lowerLimit = lowerLimit;
            return this;
        }
        public String getLowerLimit() {
            return this.lowerLimit;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setMeasurePointState(String measurePointState) {
            this.measurePointState = measurePointState;
            return this;
        }
        public String getMeasurePointState() {
            return this.measurePointState;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setNodeCode(String nodeCode) {
            this.nodeCode = nodeCode;
            return this;
        }
        public String getNodeCode() {
            return this.nodeCode;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setNodeId(Integer nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Integer getNodeId() {
            return this.nodeId;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setParentFullName(String parentFullName) {
            this.parentFullName = parentFullName;
            return this;
        }
        public String getParentFullName() {
            return this.parentFullName;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setPayLoad(String payLoad) {
            this.payLoad = payLoad;
            return this;
        }
        public String getPayLoad() {
            return this.payLoad;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setProtocolConfig(String protocolConfig) {
            this.protocolConfig = protocolConfig;
            return this;
        }
        public String getProtocolConfig() {
            return this.protocolConfig;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setSourcePoint(String sourcePoint) {
            this.sourcePoint = sourcePoint;
            return this;
        }
        public String getSourcePoint() {
            return this.sourcePoint;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setTenantCode(String tenantCode) {
            this.tenantCode = tenantCode;
            return this;
        }
        public String getTenantCode() {
            return this.tenantCode;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyDataDataList setUpperLimit(String upperLimit) {
            this.upperLimit = upperLimit;
            return this;
        }
        public String getUpperLimit() {
            return this.upperLimit;
        }

    }

    public static class ListMeasurePointListByNodeCodePageResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("DataList")
        public java.util.List<ListMeasurePointListByNodeCodePageResponseBodyDataDataList> dataList;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListMeasurePointListByNodeCodePageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMeasurePointListByNodeCodePageResponseBodyData self = new ListMeasurePointListByNodeCodePageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMeasurePointListByNodeCodePageResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyData setDataList(java.util.List<ListMeasurePointListByNodeCodePageResponseBodyDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<ListMeasurePointListByNodeCodePageResponseBodyDataDataList> getDataList() {
            return this.dataList;
        }

        public ListMeasurePointListByNodeCodePageResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
