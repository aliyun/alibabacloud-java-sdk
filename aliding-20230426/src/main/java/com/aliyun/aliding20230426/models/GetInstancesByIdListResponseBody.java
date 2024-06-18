// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstancesByIdListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<GetInstancesByIdListResponseBodyResult> result;

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

    public static GetInstancesByIdListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesByIdListResponseBody self = new GetInstancesByIdListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstancesByIdListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstancesByIdListResponseBody setResult(java.util.List<GetInstancesByIdListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetInstancesByIdListResponseBodyResult> getResult() {
        return this.result;
    }

    public GetInstancesByIdListResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetInstancesByIdListResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetInstancesByIdListResponseBodyResultActionExecutorName extends TeaModel {
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

        public static GetInstancesByIdListResponseBodyResultActionExecutorName build(java.util.Map<String, ?> map) throws Exception {
            GetInstancesByIdListResponseBodyResultActionExecutorName self = new GetInstancesByIdListResponseBodyResultActionExecutorName();
            return TeaModel.build(map, self);
        }

        public GetInstancesByIdListResponseBodyResultActionExecutorName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public GetInstancesByIdListResponseBodyResultActionExecutorName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        public GetInstancesByIdListResponseBodyResultActionExecutorName setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstancesByIdListResponseBodyResultActionExecutor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>开发部</p>
         */
        @NameInMap("DepartmentName")
        public String departmentName;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:abc@alimail.com">abc@alimail.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public GetInstancesByIdListResponseBodyResultActionExecutorName name;

        /**
         * <strong>example:</strong>
         * <p>manager123</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetInstancesByIdListResponseBodyResultActionExecutor build(java.util.Map<String, ?> map) throws Exception {
            GetInstancesByIdListResponseBodyResultActionExecutor self = new GetInstancesByIdListResponseBodyResultActionExecutor();
            return TeaModel.build(map, self);
        }

        public GetInstancesByIdListResponseBodyResultActionExecutor setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public GetInstancesByIdListResponseBodyResultActionExecutor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetInstancesByIdListResponseBodyResultActionExecutor setName(GetInstancesByIdListResponseBodyResultActionExecutorName name) {
            this.name = name;
            return this;
        }
        public GetInstancesByIdListResponseBodyResultActionExecutorName getName() {
            return this.name;
        }

        public GetInstancesByIdListResponseBodyResultActionExecutor setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetInstancesByIdListResponseBodyResultOriginatorName extends TeaModel {
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

        public static GetInstancesByIdListResponseBodyResultOriginatorName build(java.util.Map<String, ?> map) throws Exception {
            GetInstancesByIdListResponseBodyResultOriginatorName self = new GetInstancesByIdListResponseBodyResultOriginatorName();
            return TeaModel.build(map, self);
        }

        public GetInstancesByIdListResponseBodyResultOriginatorName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public GetInstancesByIdListResponseBodyResultOriginatorName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        public GetInstancesByIdListResponseBodyResultOriginatorName setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstancesByIdListResponseBodyResultOriginator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>开发部</p>
         */
        @NameInMap("DepartmentName")
        public String departmentName;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:abc@alimail.com">abc@alimail.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public GetInstancesByIdListResponseBodyResultOriginatorName name;

        /**
         * <strong>example:</strong>
         * <p>manager123</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetInstancesByIdListResponseBodyResultOriginator build(java.util.Map<String, ?> map) throws Exception {
            GetInstancesByIdListResponseBodyResultOriginator self = new GetInstancesByIdListResponseBodyResultOriginator();
            return TeaModel.build(map, self);
        }

        public GetInstancesByIdListResponseBodyResultOriginator setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public GetInstancesByIdListResponseBodyResultOriginator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetInstancesByIdListResponseBodyResultOriginator setName(GetInstancesByIdListResponseBodyResultOriginatorName name) {
            this.name = name;
            return this;
        }
        public GetInstancesByIdListResponseBodyResultOriginatorName getName() {
            return this.name;
        }

        public GetInstancesByIdListResponseBodyResultOriginator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetInstancesByIdListResponseBodyResult extends TeaModel {
        @NameInMap("ActionExecutor")
        public java.util.List<GetInstancesByIdListResponseBodyResultActionExecutor> actionExecutor;

        /**
         * <strong>example:</strong>
         * <p>agree</p>
         */
        @NameInMap("ApprovedResult")
        public String approvedResult;

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

        @NameInMap("Originator")
        public GetInstancesByIdListResponseBodyResultOriginator originator;

        /**
         * <strong>example:</strong>
         * <p>TPROC--X1Gxxx</p>
         */
        @NameInMap("ProcessCode")
        public String processCode;

        /**
         * <strong>example:</strong>
         * <p>f30233fb-72e1-4xxx</p>
         */
        @NameInMap("ProcessInstanceId")
        public String processInstanceId;

        /**
         * <strong>example:</strong>
         * <p>李四发起的请购单</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetInstancesByIdListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetInstancesByIdListResponseBodyResult self = new GetInstancesByIdListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetInstancesByIdListResponseBodyResult setActionExecutor(java.util.List<GetInstancesByIdListResponseBodyResultActionExecutor> actionExecutor) {
            this.actionExecutor = actionExecutor;
            return this;
        }
        public java.util.List<GetInstancesByIdListResponseBodyResultActionExecutor> getActionExecutor() {
            return this.actionExecutor;
        }

        public GetInstancesByIdListResponseBodyResult setApprovedResult(String approvedResult) {
            this.approvedResult = approvedResult;
            return this;
        }
        public String getApprovedResult() {
            return this.approvedResult;
        }

        public GetInstancesByIdListResponseBodyResult setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public GetInstancesByIdListResponseBodyResult setFormUuid(String formUuid) {
            this.formUuid = formUuid;
            return this;
        }
        public String getFormUuid() {
            return this.formUuid;
        }

        public GetInstancesByIdListResponseBodyResult setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetInstancesByIdListResponseBodyResult setOriginator(GetInstancesByIdListResponseBodyResultOriginator originator) {
            this.originator = originator;
            return this;
        }
        public GetInstancesByIdListResponseBodyResultOriginator getOriginator() {
            return this.originator;
        }

        public GetInstancesByIdListResponseBodyResult setProcessCode(String processCode) {
            this.processCode = processCode;
            return this;
        }
        public String getProcessCode() {
            return this.processCode;
        }

        public GetInstancesByIdListResponseBodyResult setProcessInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        public GetInstancesByIdListResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
