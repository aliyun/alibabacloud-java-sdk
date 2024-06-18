// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstanceByIdResponseBody extends TeaModel {
    @NameInMap("actionExecutor")
    public java.util.List<GetInstanceByIdResponseBodyActionExecutor> actionExecutor;

    /**
     * <strong>example:</strong>
     * <p>agree</p>
     */
    @NameInMap("approvedResult")
    public String approvedResult;

    /**
     * <strong>example:</strong>
     * <p>2021-05-01</p>
     */
    @NameInMap("createTimeGMT")
    public String createTimeGMT;

    @NameInMap("data")
    public java.util.Map<String, ?> data;

    /**
     * <strong>example:</strong>
     * <p>FORM-EF6Y4xxx</p>
     */
    @NameInMap("formUuid")
    public String formUuid;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("instanceStatus")
    public String instanceStatus;

    /**
     * <strong>example:</strong>
     * <p>2021-05-01</p>
     */
    @NameInMap("modifiedTimeGMT")
    public String modifiedTimeGMT;

    @NameInMap("originator")
    public GetInstanceByIdResponseBodyOriginator originator;

    /**
     * <strong>example:</strong>
     * <p>TPROC--X1Gxxx</p>
     */
    @NameInMap("processCode")
    public String processCode;

    /**
     * <strong>example:</strong>
     * <p>f30233fb-72e1-4xxx</p>
     */
    @NameInMap("processInstanceId")
    public String processInstanceId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>李四发起的请购单</p>
     */
    @NameInMap("title")
    public String title;

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

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Long version;

    public static GetInstanceByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceByIdResponseBody self = new GetInstanceByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceByIdResponseBody setActionExecutor(java.util.List<GetInstanceByIdResponseBodyActionExecutor> actionExecutor) {
        this.actionExecutor = actionExecutor;
        return this;
    }
    public java.util.List<GetInstanceByIdResponseBodyActionExecutor> getActionExecutor() {
        return this.actionExecutor;
    }

    public GetInstanceByIdResponseBody setApprovedResult(String approvedResult) {
        this.approvedResult = approvedResult;
        return this;
    }
    public String getApprovedResult() {
        return this.approvedResult;
    }

    public GetInstanceByIdResponseBody setCreateTimeGMT(String createTimeGMT) {
        this.createTimeGMT = createTimeGMT;
        return this;
    }
    public String getCreateTimeGMT() {
        return this.createTimeGMT;
    }

    public GetInstanceByIdResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetInstanceByIdResponseBody setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public GetInstanceByIdResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public GetInstanceByIdResponseBody setModifiedTimeGMT(String modifiedTimeGMT) {
        this.modifiedTimeGMT = modifiedTimeGMT;
        return this;
    }
    public String getModifiedTimeGMT() {
        return this.modifiedTimeGMT;
    }

    public GetInstanceByIdResponseBody setOriginator(GetInstanceByIdResponseBodyOriginator originator) {
        this.originator = originator;
        return this;
    }
    public GetInstanceByIdResponseBodyOriginator getOriginator() {
        return this.originator;
    }

    public GetInstanceByIdResponseBody setProcessCode(String processCode) {
        this.processCode = processCode;
        return this;
    }
    public String getProcessCode() {
        return this.processCode;
    }

    public GetInstanceByIdResponseBody setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public GetInstanceByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceByIdResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetInstanceByIdResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetInstanceByIdResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public GetInstanceByIdResponseBody setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public static class GetInstanceByIdResponseBodyActionExecutorName extends TeaModel {
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

        public static GetInstanceByIdResponseBodyActionExecutorName build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceByIdResponseBodyActionExecutorName self = new GetInstanceByIdResponseBodyActionExecutorName();
            return TeaModel.build(map, self);
        }

        public GetInstanceByIdResponseBodyActionExecutorName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public GetInstanceByIdResponseBodyActionExecutorName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        public GetInstanceByIdResponseBodyActionExecutorName setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstanceByIdResponseBodyActionExecutor extends TeaModel {
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
        public GetInstanceByIdResponseBodyActionExecutorName name;

        /**
         * <strong>example:</strong>
         * <p>manager123</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetInstanceByIdResponseBodyActionExecutor build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceByIdResponseBodyActionExecutor self = new GetInstanceByIdResponseBodyActionExecutor();
            return TeaModel.build(map, self);
        }

        public GetInstanceByIdResponseBodyActionExecutor setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public GetInstanceByIdResponseBodyActionExecutor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetInstanceByIdResponseBodyActionExecutor setName(GetInstanceByIdResponseBodyActionExecutorName name) {
            this.name = name;
            return this;
        }
        public GetInstanceByIdResponseBodyActionExecutorName getName() {
            return this.name;
        }

        public GetInstanceByIdResponseBodyActionExecutor setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetInstanceByIdResponseBodyOriginatorName extends TeaModel {
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

        public static GetInstanceByIdResponseBodyOriginatorName build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceByIdResponseBodyOriginatorName self = new GetInstanceByIdResponseBodyOriginatorName();
            return TeaModel.build(map, self);
        }

        public GetInstanceByIdResponseBodyOriginatorName setNameInChinese(String nameInChinese) {
            this.nameInChinese = nameInChinese;
            return this;
        }
        public String getNameInChinese() {
            return this.nameInChinese;
        }

        public GetInstanceByIdResponseBodyOriginatorName setNameInEnglish(String nameInEnglish) {
            this.nameInEnglish = nameInEnglish;
            return this;
        }
        public String getNameInEnglish() {
            return this.nameInEnglish;
        }

        public GetInstanceByIdResponseBodyOriginatorName setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstanceByIdResponseBodyOriginator extends TeaModel {
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
        public GetInstanceByIdResponseBodyOriginatorName name;

        /**
         * <strong>example:</strong>
         * <p>manager123</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetInstanceByIdResponseBodyOriginator build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceByIdResponseBodyOriginator self = new GetInstanceByIdResponseBodyOriginator();
            return TeaModel.build(map, self);
        }

        public GetInstanceByIdResponseBodyOriginator setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public GetInstanceByIdResponseBodyOriginator setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetInstanceByIdResponseBodyOriginator setName(GetInstanceByIdResponseBodyOriginatorName name) {
            this.name = name;
            return this;
        }
        public GetInstanceByIdResponseBodyOriginatorName getName() {
            return this.name;
        }

        public GetInstanceByIdResponseBodyOriginator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
