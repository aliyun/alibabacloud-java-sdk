// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryStandardProtocolListNewResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<QueryStandardProtocolListNewResponseBodyList> list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QueryStandardProtocolListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStandardProtocolListNewResponseBody self = new QueryStandardProtocolListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStandardProtocolListNewResponseBody setList(java.util.List<QueryStandardProtocolListNewResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryStandardProtocolListNewResponseBodyList> getList() {
        return this.list;
    }

    public QueryStandardProtocolListNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryStandardProtocolListNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryStandardProtocolListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStandardProtocolListNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QueryStandardProtocolListNewResponseBodyList extends TeaModel {
        @NameInMap("AuditOrderId")
        public String auditOrderId;

        @NameInMap("CorpCode")
        public String corpCode;

        @NameInMap("EffIpWhiteList")
        public String effIpWhiteList;

        @NameInMap("FeatureCode")
        public Integer featureCode;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("IpAuditStatus")
        public Integer ipAuditStatus;

        @NameInMap("IpWhiteList")
        public String ipWhiteList;

        @NameInMap("PartnerId")
        public Long partnerId;

        @NameInMap("Port")
        public String port;

        @NameInMap("ProfileId")
        public Long profileId;

        @NameInMap("ProtocolType")
        public Integer protocolType;

        @NameInMap("ProtocolTypeStr")
        public String protocolTypeStr;

        @NameInMap("RealNameInsId")
        public Long realNameInsId;

        @NameInMap("ResCode")
        public String resCode;

        @NameInMap("SmsSign")
        public String smsSign;

        @NameInMap("SmsType")
        public String smsType;

        @NameInMap("SpCode")
        public String spCode;

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("UserLimit")
        public Integer userLimit;

        @NameInMap("UserMaxChannel")
        public Integer userMaxChannel;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserPwd")
        public String userPwd;

        public static QueryStandardProtocolListNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryStandardProtocolListNewResponseBodyList self = new QueryStandardProtocolListNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryStandardProtocolListNewResponseBodyList setAuditOrderId(String auditOrderId) {
            this.auditOrderId = auditOrderId;
            return this;
        }
        public String getAuditOrderId() {
            return this.auditOrderId;
        }

        public QueryStandardProtocolListNewResponseBodyList setCorpCode(String corpCode) {
            this.corpCode = corpCode;
            return this;
        }
        public String getCorpCode() {
            return this.corpCode;
        }

        public QueryStandardProtocolListNewResponseBodyList setEffIpWhiteList(String effIpWhiteList) {
            this.effIpWhiteList = effIpWhiteList;
            return this;
        }
        public String getEffIpWhiteList() {
            return this.effIpWhiteList;
        }

        public QueryStandardProtocolListNewResponseBodyList setFeatureCode(Integer featureCode) {
            this.featureCode = featureCode;
            return this;
        }
        public Integer getFeatureCode() {
            return this.featureCode;
        }

        public QueryStandardProtocolListNewResponseBodyList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryStandardProtocolListNewResponseBodyList setIpAuditStatus(Integer ipAuditStatus) {
            this.ipAuditStatus = ipAuditStatus;
            return this;
        }
        public Integer getIpAuditStatus() {
            return this.ipAuditStatus;
        }

        public QueryStandardProtocolListNewResponseBodyList setIpWhiteList(String ipWhiteList) {
            this.ipWhiteList = ipWhiteList;
            return this;
        }
        public String getIpWhiteList() {
            return this.ipWhiteList;
        }

        public QueryStandardProtocolListNewResponseBodyList setPartnerId(Long partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public Long getPartnerId() {
            return this.partnerId;
        }

        public QueryStandardProtocolListNewResponseBodyList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryStandardProtocolListNewResponseBodyList setProfileId(Long profileId) {
            this.profileId = profileId;
            return this;
        }
        public Long getProfileId() {
            return this.profileId;
        }

        public QueryStandardProtocolListNewResponseBodyList setProtocolType(Integer protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public Integer getProtocolType() {
            return this.protocolType;
        }

        public QueryStandardProtocolListNewResponseBodyList setProtocolTypeStr(String protocolTypeStr) {
            this.protocolTypeStr = protocolTypeStr;
            return this;
        }
        public String getProtocolTypeStr() {
            return this.protocolTypeStr;
        }

        public QueryStandardProtocolListNewResponseBodyList setRealNameInsId(Long realNameInsId) {
            this.realNameInsId = realNameInsId;
            return this;
        }
        public Long getRealNameInsId() {
            return this.realNameInsId;
        }

        public QueryStandardProtocolListNewResponseBodyList setResCode(String resCode) {
            this.resCode = resCode;
            return this;
        }
        public String getResCode() {
            return this.resCode;
        }

        public QueryStandardProtocolListNewResponseBodyList setSmsSign(String smsSign) {
            this.smsSign = smsSign;
            return this;
        }
        public String getSmsSign() {
            return this.smsSign;
        }

        public QueryStandardProtocolListNewResponseBodyList setSmsType(String smsType) {
            this.smsType = smsType;
            return this;
        }
        public String getSmsType() {
            return this.smsType;
        }

        public QueryStandardProtocolListNewResponseBodyList setSpCode(String spCode) {
            this.spCode = spCode;
            return this;
        }
        public String getSpCode() {
            return this.spCode;
        }

        public QueryStandardProtocolListNewResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryStandardProtocolListNewResponseBodyList setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public QueryStandardProtocolListNewResponseBodyList setUserLimit(Integer userLimit) {
            this.userLimit = userLimit;
            return this;
        }
        public Integer getUserLimit() {
            return this.userLimit;
        }

        public QueryStandardProtocolListNewResponseBodyList setUserMaxChannel(Integer userMaxChannel) {
            this.userMaxChannel = userMaxChannel;
            return this;
        }
        public Integer getUserMaxChannel() {
            return this.userMaxChannel;
        }

        public QueryStandardProtocolListNewResponseBodyList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public QueryStandardProtocolListNewResponseBodyList setUserPwd(String userPwd) {
            this.userPwd = userPwd;
            return this;
        }
        public String getUserPwd() {
            return this.userPwd;
        }

    }

}
