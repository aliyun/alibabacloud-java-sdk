// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignLastRangeNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QuerySmsSignLastRangeNewResponseBodyList list;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySmsSignLastRangeNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignLastRangeNewResponseBody self = new QuerySmsSignLastRangeNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignLastRangeNewResponseBody setList(QuerySmsSignLastRangeNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QuerySmsSignLastRangeNewResponseBodyList getList() {
        return this.list;
    }

    public QuerySmsSignLastRangeNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySmsSignLastRangeNewResponseBodyListSmsSignFileIds extends TeaModel {
        @NameInMap("FileId")
        public java.util.List<Long> fileId;

        public static QuerySmsSignLastRangeNewResponseBodyListSmsSignFileIds build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignLastRangeNewResponseBodyListSmsSignFileIds self = new QuerySmsSignLastRangeNewResponseBodyListSmsSignFileIds();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSignFileIds setFileId(java.util.List<Long> fileId) {
            this.fileId = fileId;
            return this;
        }
        public java.util.List<Long> getFileId() {
            return this.fileId;
        }

    }

    public static class QuerySmsSignLastRangeNewResponseBodyListSmsSignFileUrlList extends TeaModel {
        @NameInMap("FileUrl")
        public java.util.List<String> fileUrl;

        public static QuerySmsSignLastRangeNewResponseBodyListSmsSignFileUrlList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignLastRangeNewResponseBodyListSmsSignFileUrlList self = new QuerySmsSignLastRangeNewResponseBodyListSmsSignFileUrlList();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSignFileUrlList setFileUrl(java.util.List<String> fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public java.util.List<String> getFileUrl() {
            return this.fileUrl;
        }

    }

    public static class QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailListSignSceneDetail extends TeaModel {
        @NameInMap("AuditState")
        public String auditState;

        @NameInMap("SceneType")
        public Integer sceneType;

        public static QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailListSignSceneDetail build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailListSignSceneDetail self = new QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailListSignSceneDetail();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailListSignSceneDetail setAuditState(String auditState) {
            this.auditState = auditState;
            return this;
        }
        public String getAuditState() {
            return this.auditState;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailListSignSceneDetail setSceneType(Integer sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public Integer getSceneType() {
            return this.sceneType;
        }

    }

    public static class QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailList extends TeaModel {
        @NameInMap("SignSceneDetail")
        public java.util.List<QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailListSignSceneDetail> signSceneDetail;

        public static QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailList self = new QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailList();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailList setSignSceneDetail(java.util.List<QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailListSignSceneDetail> signSceneDetail) {
            this.signSceneDetail = signSceneDetail;
            return this;
        }
        public java.util.List<QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailListSignSceneDetail> getSignSceneDetail() {
            return this.signSceneDetail;
        }

    }

    public static class QuerySmsSignLastRangeNewResponseBodyListSmsSign extends TeaModel {
        @NameInMap("AuditInfo")
        public String auditInfo;

        @NameInMap("AuditRemarkInfo")
        public String auditRemarkInfo;

        @NameInMap("AuditState")
        public String auditState;

        @NameInMap("ExtendMessage")
        public String extendMessage;

        @NameInMap("FileIds")
        public QuerySmsSignLastRangeNewResponseBodyListSmsSignFileIds fileIds;

        @NameInMap("FileUrlList")
        public QuerySmsSignLastRangeNewResponseBodyListSmsSignFileUrlList fileUrlList;

        @NameInMap("GmtCreateStr")
        public String gmtCreateStr;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsDefaultSign")
        public Boolean isDefaultSign;

        @NameInMap("OperateDateStr")
        public String operateDateStr;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SceneType")
        public Integer sceneType;

        @NameInMap("ServiceType")
        public Integer serviceType;

        @NameInMap("SignName")
        public String signName;

        @NameInMap("SignSceneDetailList")
        public QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailList signSceneDetailList;

        @NameInMap("SignType")
        public Integer signType;

        @NameInMap("SignUsageName")
        public String signUsageName;

        public static QuerySmsSignLastRangeNewResponseBodyListSmsSign build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignLastRangeNewResponseBodyListSmsSign self = new QuerySmsSignLastRangeNewResponseBodyListSmsSign();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setAuditInfo(String auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }
        public String getAuditInfo() {
            return this.auditInfo;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setAuditRemarkInfo(String auditRemarkInfo) {
            this.auditRemarkInfo = auditRemarkInfo;
            return this;
        }
        public String getAuditRemarkInfo() {
            return this.auditRemarkInfo;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setAuditState(String auditState) {
            this.auditState = auditState;
            return this;
        }
        public String getAuditState() {
            return this.auditState;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setExtendMessage(String extendMessage) {
            this.extendMessage = extendMessage;
            return this;
        }
        public String getExtendMessage() {
            return this.extendMessage;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setFileIds(QuerySmsSignLastRangeNewResponseBodyListSmsSignFileIds fileIds) {
            this.fileIds = fileIds;
            return this;
        }
        public QuerySmsSignLastRangeNewResponseBodyListSmsSignFileIds getFileIds() {
            return this.fileIds;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setFileUrlList(QuerySmsSignLastRangeNewResponseBodyListSmsSignFileUrlList fileUrlList) {
            this.fileUrlList = fileUrlList;
            return this;
        }
        public QuerySmsSignLastRangeNewResponseBodyListSmsSignFileUrlList getFileUrlList() {
            return this.fileUrlList;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setIsDefaultSign(Boolean isDefaultSign) {
            this.isDefaultSign = isDefaultSign;
            return this;
        }
        public Boolean getIsDefaultSign() {
            return this.isDefaultSign;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setOperateDateStr(String operateDateStr) {
            this.operateDateStr = operateDateStr;
            return this;
        }
        public String getOperateDateStr() {
            return this.operateDateStr;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setSceneType(Integer sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public Integer getSceneType() {
            return this.sceneType;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setServiceType(Integer serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Integer getServiceType() {
            return this.serviceType;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setSignSceneDetailList(QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailList signSceneDetailList) {
            this.signSceneDetailList = signSceneDetailList;
            return this;
        }
        public QuerySmsSignLastRangeNewResponseBodyListSmsSignSignSceneDetailList getSignSceneDetailList() {
            return this.signSceneDetailList;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setSignType(Integer signType) {
            this.signType = signType;
            return this;
        }
        public Integer getSignType() {
            return this.signType;
        }

        public QuerySmsSignLastRangeNewResponseBodyListSmsSign setSignUsageName(String signUsageName) {
            this.signUsageName = signUsageName;
            return this;
        }
        public String getSignUsageName() {
            return this.signUsageName;
        }

    }

    public static class QuerySmsSignLastRangeNewResponseBodyList extends TeaModel {
        @NameInMap("SmsSign")
        public java.util.List<QuerySmsSignLastRangeNewResponseBodyListSmsSign> smsSign;

        public static QuerySmsSignLastRangeNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsSignLastRangeNewResponseBodyList self = new QuerySmsSignLastRangeNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySmsSignLastRangeNewResponseBodyList setSmsSign(java.util.List<QuerySmsSignLastRangeNewResponseBodyListSmsSign> smsSign) {
            this.smsSign = smsSign;
            return this;
        }
        public java.util.List<QuerySmsSignLastRangeNewResponseBodyListSmsSign> getSmsSign() {
            return this.smsSign;
        }

    }

}
