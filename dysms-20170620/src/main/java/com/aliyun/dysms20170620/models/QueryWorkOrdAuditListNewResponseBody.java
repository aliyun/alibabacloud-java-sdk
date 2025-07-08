// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryWorkOrdAuditListNewResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<QueryWorkOrdAuditListNewResponseBodyList> list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QueryWorkOrdAuditListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkOrdAuditListNewResponseBody self = new QueryWorkOrdAuditListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWorkOrdAuditListNewResponseBody setList(java.util.List<QueryWorkOrdAuditListNewResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryWorkOrdAuditListNewResponseBodyList> getList() {
        return this.list;
    }

    public QueryWorkOrdAuditListNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryWorkOrdAuditListNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryWorkOrdAuditListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWorkOrdAuditListNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QueryWorkOrdAuditListNewResponseBodyListParamAuditRemarkInfo extends TeaModel {
        @NameInMap("RejectDate")
        public String rejectDate;

        @NameInMap("RejectInfo")
        public String rejectInfo;

        @NameInMap("RejectSubInfo")
        public String rejectSubInfo;

        public static QueryWorkOrdAuditListNewResponseBodyListParamAuditRemarkInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkOrdAuditListNewResponseBodyListParamAuditRemarkInfo self = new QueryWorkOrdAuditListNewResponseBodyListParamAuditRemarkInfo();
            return TeaModel.build(map, self);
        }

        public QueryWorkOrdAuditListNewResponseBodyListParamAuditRemarkInfo setRejectDate(String rejectDate) {
            this.rejectDate = rejectDate;
            return this;
        }
        public String getRejectDate() {
            return this.rejectDate;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParamAuditRemarkInfo setRejectInfo(String rejectInfo) {
            this.rejectInfo = rejectInfo;
            return this;
        }
        public String getRejectInfo() {
            return this.rejectInfo;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParamAuditRemarkInfo setRejectSubInfo(String rejectSubInfo) {
            this.rejectSubInfo = rejectSubInfo;
            return this;
        }
        public String getRejectSubInfo() {
            return this.rejectSubInfo;
        }

    }

    public static class QueryWorkOrdAuditListNewResponseBodyListParamAuditState extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public Integer value;

        public static QueryWorkOrdAuditListNewResponseBodyListParamAuditState build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkOrdAuditListNewResponseBodyListParamAuditState self = new QueryWorkOrdAuditListNewResponseBodyListParamAuditState();
            return TeaModel.build(map, self);
        }

        public QueryWorkOrdAuditListNewResponseBodyListParamAuditState setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParamAuditState setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParamAuditState setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class QueryWorkOrdAuditListNewResponseBodyListParam extends TeaModel {
        @NameInMap("AuditInfo")
        public String auditInfo;

        @NameInMap("AuditRemarkInfo")
        public QueryWorkOrdAuditListNewResponseBodyListParamAuditRemarkInfo auditRemarkInfo;

        @NameInMap("AuditState")
        public QueryWorkOrdAuditListNewResponseBodyListParamAuditState auditState;

        @NameInMap("BusinessType")
        public Integer businessType;

        @NameInMap("ExtendMessage")
        public String extendMessage;

        @NameInMap("FileIds")
        public java.util.List<Long> fileIds;

        @NameInMap("FileUrlList")
        public java.util.List<String> fileUrlList;

        @NameInMap("GmtCreateStr")
        public String gmtCreateStr;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PartnerId")
        public Long partnerId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SceneType")
        public Integer sceneType;

        @NameInMap("SignName")
        public String signName;

        @NameInMap("SignType")
        public Integer signType;

        public static QueryWorkOrdAuditListNewResponseBodyListParam build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkOrdAuditListNewResponseBodyListParam self = new QueryWorkOrdAuditListNewResponseBodyListParam();
            return TeaModel.build(map, self);
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setAuditInfo(String auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }
        public String getAuditInfo() {
            return this.auditInfo;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setAuditRemarkInfo(QueryWorkOrdAuditListNewResponseBodyListParamAuditRemarkInfo auditRemarkInfo) {
            this.auditRemarkInfo = auditRemarkInfo;
            return this;
        }
        public QueryWorkOrdAuditListNewResponseBodyListParamAuditRemarkInfo getAuditRemarkInfo() {
            return this.auditRemarkInfo;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setAuditState(QueryWorkOrdAuditListNewResponseBodyListParamAuditState auditState) {
            this.auditState = auditState;
            return this;
        }
        public QueryWorkOrdAuditListNewResponseBodyListParamAuditState getAuditState() {
            return this.auditState;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setBusinessType(Integer businessType) {
            this.businessType = businessType;
            return this;
        }
        public Integer getBusinessType() {
            return this.businessType;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setExtendMessage(String extendMessage) {
            this.extendMessage = extendMessage;
            return this;
        }
        public String getExtendMessage() {
            return this.extendMessage;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setFileIds(java.util.List<Long> fileIds) {
            this.fileIds = fileIds;
            return this;
        }
        public java.util.List<Long> getFileIds() {
            return this.fileIds;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setFileUrlList(java.util.List<String> fileUrlList) {
            this.fileUrlList = fileUrlList;
            return this;
        }
        public java.util.List<String> getFileUrlList() {
            return this.fileUrlList;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setPartnerId(Long partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public Long getPartnerId() {
            return this.partnerId;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setSceneType(Integer sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public Integer getSceneType() {
            return this.sceneType;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public QueryWorkOrdAuditListNewResponseBodyListParam setSignType(Integer signType) {
            this.signType = signType;
            return this;
        }
        public Integer getSignType() {
            return this.signType;
        }

    }

    public static class QueryWorkOrdAuditListNewResponseBodyList extends TeaModel {
        @NameInMap("AuditRemark")
        public String auditRemark;

        @NameInMap("AuditResult")
        public String auditResult;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("OrdId")
        public String ordId;

        @NameInMap("OrdStatus")
        public String ordStatus;

        @NameInMap("Param")
        public QueryWorkOrdAuditListNewResponseBodyListParam param;

        public static QueryWorkOrdAuditListNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryWorkOrdAuditListNewResponseBodyList self = new QueryWorkOrdAuditListNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryWorkOrdAuditListNewResponseBodyList setAuditRemark(String auditRemark) {
            this.auditRemark = auditRemark;
            return this;
        }
        public String getAuditRemark() {
            return this.auditRemark;
        }

        public QueryWorkOrdAuditListNewResponseBodyList setAuditResult(String auditResult) {
            this.auditResult = auditResult;
            return this;
        }
        public String getAuditResult() {
            return this.auditResult;
        }

        public QueryWorkOrdAuditListNewResponseBodyList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryWorkOrdAuditListNewResponseBodyList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryWorkOrdAuditListNewResponseBodyList setOrdId(String ordId) {
            this.ordId = ordId;
            return this;
        }
        public String getOrdId() {
            return this.ordId;
        }

        public QueryWorkOrdAuditListNewResponseBodyList setOrdStatus(String ordStatus) {
            this.ordStatus = ordStatus;
            return this;
        }
        public String getOrdStatus() {
            return this.ordStatus;
        }

        public QueryWorkOrdAuditListNewResponseBodyList setParam(QueryWorkOrdAuditListNewResponseBodyListParam param) {
            this.param = param;
            return this;
        }
        public QueryWorkOrdAuditListNewResponseBodyListParam getParam() {
            return this.param;
        }

    }

}
