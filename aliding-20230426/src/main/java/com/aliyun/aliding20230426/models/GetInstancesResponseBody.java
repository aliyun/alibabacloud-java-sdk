// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstancesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetInstancesResponseBodyData> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static GetInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesResponseBody self = new GetInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstancesResponseBody setData(java.util.List<GetInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetInstancesResponseBodyData> getData() {
        return this.data;
    }

    public GetInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public GetInstancesResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetInstancesResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetInstancesResponseBodyDataActionExecutorName extends TeaModel {
        @NameInMap("NameInChinese")
        public String nameInChinese;

        @NameInMap("NameInEnglish")
        public String nameInEnglish;

        @NameInMap("Type")
        public String type;

        public static GetInstancesResponseBodyDataActionExecutorName build(java.util.Map<String, ?> map) throws Exception {
            GetInstancesResponseBodyDataActionExecutorName self = new GetInstancesResponseBodyDataActionExecutorName();
            return TeaModel.build(map, self);
        }

        public GetInstancesResponseBodyDataActionExecutorName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public GetInstancesResponseBodyDataActionExecutorName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        public GetInstancesResponseBodyDataActionExecutorName setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstancesResponseBodyDataActionExecutor extends TeaModel {
        @NameInMap("DeptName")
        public String deptName;

        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public GetInstancesResponseBodyDataActionExecutorName name;

        @NameInMap("UserId")
        public String userId;

        public static GetInstancesResponseBodyDataActionExecutor build(java.util.Map<String, ?> map) throws Exception {
            GetInstancesResponseBodyDataActionExecutor self = new GetInstancesResponseBodyDataActionExecutor();
            return TeaModel.build(map, self);
        }

        public GetInstancesResponseBodyDataActionExecutor setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public GetInstancesResponseBodyDataActionExecutor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetInstancesResponseBodyDataActionExecutor setName(GetInstancesResponseBodyDataActionExecutorName name) {
            this.name = name;
            return this;
        }
        public GetInstancesResponseBodyDataActionExecutorName getName() {
            return this.name;
        }

        public GetInstancesResponseBodyDataActionExecutor setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetInstancesResponseBodyDataOriginatorName extends TeaModel {
        @NameInMap("NameInChinese")
        public String nameInChinese;

        @NameInMap("NameInEnglish")
        public String nameInEnglish;

        @NameInMap("Type")
        public String type;

        public static GetInstancesResponseBodyDataOriginatorName build(java.util.Map<String, ?> map) throws Exception {
            GetInstancesResponseBodyDataOriginatorName self = new GetInstancesResponseBodyDataOriginatorName();
            return TeaModel.build(map, self);
        }

        public GetInstancesResponseBodyDataOriginatorName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public GetInstancesResponseBodyDataOriginatorName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        public GetInstancesResponseBodyDataOriginatorName setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstancesResponseBodyDataOriginator extends TeaModel {
        @NameInMap("DeptName")
        public String deptName;

        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public GetInstancesResponseBodyDataOriginatorName name;

        @NameInMap("UserId")
        public String userId;

        public static GetInstancesResponseBodyDataOriginator build(java.util.Map<String, ?> map) throws Exception {
            GetInstancesResponseBodyDataOriginator self = new GetInstancesResponseBodyDataOriginator();
            return TeaModel.build(map, self);
        }

        public GetInstancesResponseBodyDataOriginator setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public GetInstancesResponseBodyDataOriginator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetInstancesResponseBodyDataOriginator setName(GetInstancesResponseBodyDataOriginatorName name) {
            this.name = name;
            return this;
        }
        public GetInstancesResponseBodyDataOriginatorName getName() {
            return this.name;
        }

        public GetInstancesResponseBodyDataOriginator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetInstancesResponseBodyData extends TeaModel {
        @NameInMap("ActionExecutor")
        public java.util.List<GetInstancesResponseBodyDataActionExecutor> actionExecutor;

        @NameInMap("ApprovedResult")
        public String approvedResult;

        @NameInMap("CreateTimeGMT")
        public String createTimeGMT;

        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        @NameInMap("FormUuid")
        public String formUuid;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("ModifiedTimeGMT")
        public String modifiedTimeGMT;

        @NameInMap("Originator")
        public GetInstancesResponseBodyDataOriginator originator;

        @NameInMap("ProcessCode")
        public String processCode;

        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        @NameInMap("Title")
        public String title;

        @NameInMap("Version")
        public Long version;

        public static GetInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstancesResponseBodyData self = new GetInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstancesResponseBodyData setActionExecutor(java.util.List<GetInstancesResponseBodyDataActionExecutor> actionExecutor) {
            this.actionExecutor = actionExecutor;
            return this;
        }
        public java.util.List<GetInstancesResponseBodyDataActionExecutor> getActionExecutor() {
            return this.actionExecutor;
        }

        public GetInstancesResponseBodyData setApprovedResult(String approvedResult) {
            this.approvedResult = approvedResult;
            return this;
        }
        public String getApprovedResult() {
            return this.approvedResult;
        }

        public GetInstancesResponseBodyData setCreateTimeGMT(String createTimeGMT) {
            this.createTimeGMT = createTimeGMT;
            return this;
        }
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        public GetInstancesResponseBodyData setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public GetInstancesResponseBodyData setFormUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }
        public String getFormUuid() {
            return this.formUuid;
        }

        public GetInstancesResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetInstancesResponseBodyData setModifiedTimeGMT(String modifiedTimeGMT) {
            this.modifiedTimeGMT = modifiedTimeGMT;
            return this;
        }
        public String getModifiedTimeGMT() {
            return this.modifiedTimeGMT;
        }

        public GetInstancesResponseBodyData setOriginator(GetInstancesResponseBodyDataOriginator originator) {
            this.originator = originator;
            return this;
        }
        public GetInstancesResponseBodyDataOriginator getOriginator() {
            return this.originator;
        }

        public GetInstancesResponseBodyData setProcessCode(String processCode) {
            this.processCode = processCode;
            return this;
        }
        public String getProcessCode() {
            return this.processCode;
        }

        public GetInstancesResponseBodyData setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetInstancesResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetInstancesResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
