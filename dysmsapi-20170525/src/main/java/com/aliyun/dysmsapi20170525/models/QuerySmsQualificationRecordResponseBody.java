// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsQualificationRecordResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySmsQualificationRecordResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>25D5AFDE-8EBC-132E-8909-1FDC071DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySmsQualificationRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsQualificationRecordResponseBody self = new QuerySmsQualificationRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsQualificationRecordResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySmsQualificationRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySmsQualificationRecordResponseBody setData(QuerySmsQualificationRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySmsQualificationRecordResponseBodyData getData() {
        return this.data;
    }

    public QuerySmsQualificationRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySmsQualificationRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsQualificationRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySmsQualificationRecordResponseBodyDataList extends TeaModel {
        /**
         * <p>审核备注</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("AuditRemark")
        public String auditRemark;

        /**
         * <p>审核时间</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-26 17:29:04</p>
         */
        @NameInMap("AuditTime")
        public String auditTime;

        /**
         * <p>公司名称或实人认证姓名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("CompanyName")
        public String companyName;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-20 11:59:30</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>资质组ID</p>
         * 
         * <strong>example:</strong>
         * <p>10000****</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>法人名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("LegalPersonName")
        public String legalPersonName;

        /**
         * <p>资质组名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("QualificationGroupName")
        public String qualificationGroupName;

        /**
         * <p>审核状态名</p>
         * 
         * <strong>example:</strong>
         * <p>INT</p>
         */
        @NameInMap("StateName")
        public String stateName;

        /**
         * <p>是否自用</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseBySelf")
        public String useBySelf;

        /**
         * <p>工单ID</p>
         * 
         * <strong>example:</strong>
         * <p>2001****</p>
         */
        @NameInMap("WorkOrderId")
        public Long workOrderId;

        public static QuerySmsQualificationRecordResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsQualificationRecordResponseBodyDataList self = new QuerySmsQualificationRecordResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySmsQualificationRecordResponseBodyDataList setAuditRemark(String auditRemark) {
            this.auditRemark = auditRemark;
            return this;
        }
        public String getAuditRemark() {
            return this.auditRemark;
        }

        public QuerySmsQualificationRecordResponseBodyDataList setAuditTime(String auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public String getAuditTime() {
            return this.auditTime;
        }

        public QuerySmsQualificationRecordResponseBodyDataList setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public QuerySmsQualificationRecordResponseBodyDataList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QuerySmsQualificationRecordResponseBodyDataList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QuerySmsQualificationRecordResponseBodyDataList setLegalPersonName(String legalPersonName) {
            this.legalPersonName = legalPersonName;
            return this;
        }
        public String getLegalPersonName() {
            return this.legalPersonName;
        }

        public QuerySmsQualificationRecordResponseBodyDataList setQualificationGroupName(String qualificationGroupName) {
            this.qualificationGroupName = qualificationGroupName;
            return this;
        }
        public String getQualificationGroupName() {
            return this.qualificationGroupName;
        }

        public QuerySmsQualificationRecordResponseBodyDataList setStateName(String stateName) {
            this.stateName = stateName;
            return this;
        }
        public String getStateName() {
            return this.stateName;
        }

        public QuerySmsQualificationRecordResponseBodyDataList setUseBySelf(String useBySelf) {
            this.useBySelf = useBySelf;
            return this;
        }
        public String getUseBySelf() {
            return this.useBySelf;
        }

        public QuerySmsQualificationRecordResponseBodyDataList setWorkOrderId(Long workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }
        public Long getWorkOrderId() {
            return this.workOrderId;
        }

    }

    public static class QuerySmsQualificationRecordResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QuerySmsQualificationRecordResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Total")
        public Long total;

        public static QuerySmsQualificationRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsQualificationRecordResponseBodyData self = new QuerySmsQualificationRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySmsQualificationRecordResponseBodyData setList(java.util.List<QuerySmsQualificationRecordResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QuerySmsQualificationRecordResponseBodyDataList> getList() {
            return this.list;
        }

        public QuerySmsQualificationRecordResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QuerySmsQualificationRecordResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QuerySmsQualificationRecordResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
