// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstancesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetInstancesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("NameInChinese")
        public String nameInChinese;

        /**
         * <strong>example:</strong>
         * <p>ZhangSan</p>
         */
        @NameInMap("NameInEnglish")
        public String nameInEnglish;

        /**
         * <strong>example:</strong>
         * <p>i18n</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>开发部</p>
         */
        @NameInMap("DeptName")
        public String deptName;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:abc@alimail.com">abc@alimail.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public GetInstancesResponseBodyDataActionExecutorName name;

        /**
         * <strong>example:</strong>
         * <p>manager123</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("NameInChinese")
        public String nameInChinese;

        /**
         * <strong>example:</strong>
         * <p>ZhangSan</p>
         */
        @NameInMap("NameInEnglish")
        public String nameInEnglish;

        /**
         * <strong>example:</strong>
         * <p>i18n</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>开发部</p>
         */
        @NameInMap("DeptName")
        public String deptName;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:abc@alimail.com">abc@alimail.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public GetInstancesResponseBodyDataOriginatorName name;

        /**
         * <strong>example:</strong>
         * <p>manager123</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>agree</p>
         */
        @NameInMap("ApprovedResult")
        public String approvedResult;

        /**
         * <strong>example:</strong>
         * <p>2021-05-01</p>
         */
        @NameInMap("CreateTimeGMT")
        public String createTimeGMT;

        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        /**
         * <strong>example:</strong>
         * <p>FORM-EF6Y4G8WO2FN0SUB43TDQ3CGC3FMFQ1G9400RCJ3</p>
         */
        @NameInMap("FormUuid")
        public String formUuid;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <strong>example:</strong>
         * <p>2021-05-01</p>
         */
        @NameInMap("ModifiedTimeGMT")
        public String modifiedTimeGMT;

        @NameInMap("Originator")
        public GetInstancesResponseBodyDataOriginator originator;

        /**
         * <strong>example:</strong>
         * <p>TPROC--X1Gxxx</p>
         */
        @NameInMap("ProcessCode")
        public String processCode;

        /**
         * <strong>example:</strong>
         * <p>f30233fb-72e1-4af4-8cb8-c7e0ea9ee530</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <strong>example:</strong>
         * <p>小红发起的请购单</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
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
