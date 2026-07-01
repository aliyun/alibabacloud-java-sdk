// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsSignResponseBody extends TeaModel {
    /**
     * <p>APP-ICP备案实体id。</p>
     * 
     * <strong>example:</strong>
     * <p>1000009***123</p>
     */
    @NameInMap("AppIcpRecordId")
    public Long appIcpRecordId;

    /**
     * <p>应用场景内容。</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
     */
    @NameInMap("ApplyScene")
    public String applyScene;

    /**
     * <p>审核信息。</p>
     */
    @NameInMap("AuditInfo")
    public GetSmsSignResponseBodyAuditInfo auditInfo;

    /**
     * <p>委托授权书审核状态。取值：</p>
     * <ul>
     * <li>true：审核通过。</li>
     * <li>false：审核未通过（包含审核通过外的其他所有状态）。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthorizationLetterAuditPass")
    public Boolean authorizationLetterAuditPass;

    /**
     * <p>委托授权书ID。</p>
     * 
     * <strong>example:</strong>
     * <p>1000********1234</p>
     */
    @NameInMap("AuthorizationLetterId")
    public Long authorizationLetterId;

    /**
     * <p>请求状态码。取值：</p>
     * <ul>
     * <li>OK：代表请求成功。</li>
     * <li>其他错误码，请参见<a href="https://help.aliyun.com/document_detail/101346.html">API错误码</a>。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>短信签名的创建日期和时间。</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-03 10:02:34</p>
     */
    @NameInMap("CreateDate")
    public String createDate;

    /**
     * <p>更多资料信息，补充上传业务证明文件或业务截图文件列表。</p>
     */
    @NameInMap("FileUrlList")
    public java.util.List<String> fileUrlList;

    /**
     * <p>状态码的描述。</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>工单号。</p>
     * <p>审核人员查询审核时会用到此参数。您需要审核加急时需要提供此工单号。</p>
     * 
     * <strong>example:</strong>
     * <p>20044156924</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>资质ID。申请签名时关联的资质ID。</p>
     * 
     * <strong>example:</strong>
     * <p>2004393****</p>
     */
    @NameInMap("QualificationId")
    public Long qualificationId;

    /**
     * <p><strong>已废弃，请使用<code>SignIspRegisterDetailList</code>查看各运营商实名报备结果。</strong></p>
     * <p>签名实名制报备结果。取值：</p>
     * <ul>
     * <li>0：报备失败。</li>
     * <li>1：报备成功。</li>
     * <li>2：报备失效。</li>
     * <li>-1：无状态。</li>
     * </ul>
     * <p>建议您单击查看<a href="https://help.aliyun.com/document_detail/2873145.html">更多签名实名制报备内容及建议操作</a>。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegisterResult")
    public Integer registerResult;

    /**
     * <p>短信签名场景说明，长度不超过200个字符。</p>
     * 
     * <strong>example:</strong>
     * <p>登录场景验证码</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>本次调用请求的ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>短信签名Code。</p>
     * 
     * <strong>example:</strong>
     * <p>SIGN_100000077042023_17174665*****_ZM2kG</p>
     */
    @NameInMap("SignCode")
    public String signCode;

    /**
     * <p>运营商报备状态列表。获取此参数返回数据需要<a href="https://api.aliyun.com/api-tools/sdk/Dysmsapi?version=2017-05-25&language=java-tea&tab=primer-doc">更新SDK</a>至4.1.2版本或以上。</p>
     */
    @NameInMap("SignIspRegisterDetailList")
    public java.util.List<GetSmsSignResponseBodySignIspRegisterDetailList> signIspRegisterDetailList;

    /**
     * <p>短信签名名称。</p>
     * 
     * <strong>example:</strong>
     * <p>登录验证</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>签名审核状态。取值：</p>
     * <ul>
     * <li><strong>0</strong>：审核中。</li>
     * <li><strong>1</strong>：审核通过。</li>
     * <li><strong>2</strong>：审核失败，请在返回参数<code>AuditInfo.RejectInfo</code>中查看审核失败原因。</li>
     * <li><strong>10</strong>：取消审核。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SignStatus")
    public Long signStatus;

    /**
     * <p>签名标识。取值：</p>
     * <ul>
     * <li>2：用户自定义创建签名。</li>
     * <li>3：系统赠送签名。</li>
     * <li>4：测试签名。</li>
     * <li>5：试用签名。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SignTag")
    public String signTag;

    /**
     * <p>签名使用场景。</p>
     * 
     * <strong>example:</strong>
     * <p>已注册商标名称。</p>
     */
    @NameInMap("SignUsage")
    public String signUsage;

    /**
     * <p>签名为自用或他用。</p>
     * <ul>
     * <li><p>false：自用（默认值）。</p>
     * </li>
     * <li><p>true：他用。</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ThirdParty")
    public Boolean thirdParty;

    /**
     * <p>商标实体id。</p>
     * 
     * <strong>example:</strong>
     * <p>1000009081***</p>
     */
    @NameInMap("TrademarkId")
    public Long trademarkId;

    public static GetSmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmsSignResponseBody self = new GetSmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmsSignResponseBody setAppIcpRecordId(Long appIcpRecordId) {
        this.appIcpRecordId = appIcpRecordId;
        return this;
    }
    public Long getAppIcpRecordId() {
        return this.appIcpRecordId;
    }

    public GetSmsSignResponseBody setApplyScene(String applyScene) {
        this.applyScene = applyScene;
        return this;
    }
    public String getApplyScene() {
        return this.applyScene;
    }

    public GetSmsSignResponseBody setAuditInfo(GetSmsSignResponseBodyAuditInfo auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public GetSmsSignResponseBodyAuditInfo getAuditInfo() {
        return this.auditInfo;
    }

    public GetSmsSignResponseBody setAuthorizationLetterAuditPass(Boolean authorizationLetterAuditPass) {
        this.authorizationLetterAuditPass = authorizationLetterAuditPass;
        return this;
    }
    public Boolean getAuthorizationLetterAuditPass() {
        return this.authorizationLetterAuditPass;
    }

    public GetSmsSignResponseBody setAuthorizationLetterId(Long authorizationLetterId) {
        this.authorizationLetterId = authorizationLetterId;
        return this;
    }
    public Long getAuthorizationLetterId() {
        return this.authorizationLetterId;
    }

    public GetSmsSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmsSignResponseBody setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public GetSmsSignResponseBody setFileUrlList(java.util.List<String> fileUrlList) {
        this.fileUrlList = fileUrlList;
        return this;
    }
    public java.util.List<String> getFileUrlList() {
        return this.fileUrlList;
    }

    public GetSmsSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmsSignResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetSmsSignResponseBody setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public GetSmsSignResponseBody setRegisterResult(Integer registerResult) {
        this.registerResult = registerResult;
        return this;
    }
    public Integer getRegisterResult() {
        return this.registerResult;
    }

    public GetSmsSignResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public GetSmsSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmsSignResponseBody setSignCode(String signCode) {
        this.signCode = signCode;
        return this;
    }
    public String getSignCode() {
        return this.signCode;
    }

    public GetSmsSignResponseBody setSignIspRegisterDetailList(java.util.List<GetSmsSignResponseBodySignIspRegisterDetailList> signIspRegisterDetailList) {
        this.signIspRegisterDetailList = signIspRegisterDetailList;
        return this;
    }
    public java.util.List<GetSmsSignResponseBodySignIspRegisterDetailList> getSignIspRegisterDetailList() {
        return this.signIspRegisterDetailList;
    }

    public GetSmsSignResponseBody setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public GetSmsSignResponseBody setSignStatus(Long signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public Long getSignStatus() {
        return this.signStatus;
    }

    public GetSmsSignResponseBody setSignTag(String signTag) {
        this.signTag = signTag;
        return this;
    }
    public String getSignTag() {
        return this.signTag;
    }

    public GetSmsSignResponseBody setSignUsage(String signUsage) {
        this.signUsage = signUsage;
        return this;
    }
    public String getSignUsage() {
        return this.signUsage;
    }

    public GetSmsSignResponseBody setThirdParty(Boolean thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

    public GetSmsSignResponseBody setTrademarkId(Long trademarkId) {
        this.trademarkId = trademarkId;
        return this;
    }
    public Long getTrademarkId() {
        return this.trademarkId;
    }

    public static class GetSmsSignResponseBodyAuditInfo extends TeaModel {
        /**
         * <p>审核时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-03 12:02:34</p>
         */
        @NameInMap("AuditDate")
        public String auditDate;

        /**
         * <p>审批未通过的原因。</p>
         * 
         * <strong>example:</strong>
         * <p>通过资质信息，不能判断是否可以申请此签名。</p>
         */
        @NameInMap("RejectInfo")
        public String rejectInfo;

        public static GetSmsSignResponseBodyAuditInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSmsSignResponseBodyAuditInfo self = new GetSmsSignResponseBodyAuditInfo();
            return TeaModel.build(map, self);
        }

        public GetSmsSignResponseBodyAuditInfo setAuditDate(String auditDate) {
            this.auditDate = auditDate;
            return this;
        }
        public String getAuditDate() {
            return this.auditDate;
        }

        public GetSmsSignResponseBodyAuditInfo setRejectInfo(String rejectInfo) {
            this.rejectInfo = rejectInfo;
            return this;
        }
        public String getRejectInfo() {
            return this.rejectInfo;
        }

    }

    public static class GetSmsSignResponseBodySignIspRegisterDetailListRegisterStatusReasons extends TeaModel {
        /**
         * <p>报备状态原因码。取值：</p>
         * <ul>
         * <li><strong>UNBINDING_QUA</strong>：签名未关联资质；</li>
         * <li><strong>BINDING_INCOMPLETE_QUA</strong>：关联资质信息不全；</li>
         * <li><strong>NON_REGISTER</strong>：未发起报备；</li>
         * <li><strong>REGISTERING</strong>：签名报备中；</li>
         * <li><strong>DETECTING</strong>：未发起探测或探测中；</li>
         * <li><strong>DETECT_SUCCESS</strong>：报备成功；</li>
         * <li><strong>QUALIFICATION_ERROR</strong>：资质原因；</li>
         * <li><strong>SIGNATURE_ERROR</strong>：签名原因；</li>
         * <li><strong>SIGNATURE_QUALIFICATION_ERROR</strong>：签名与资质关系不符；</li>
         * <li><strong>ONE_CODE_MULTIPLE_SIGN</strong>：扩展码原因；</li>
         * <li><strong>OTHERS_ERROR</strong>：其他原因；</li>
         * <li><strong>REGISTER_TIMEOUT</strong>：报备超时；</li>
         * <li><strong>NO_SEND_RECORD</strong>：签名超过6个月无发送记录；</li>
         * <li><strong>EXT_CODE_RECYCLE</strong>：扩展码收回。</li>
         * <li><strong>SUBPORT_RECYCLE</strong>：子端口被运营商治理。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGISTER_TIMEOUT</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>原因说明列表。可能返回0个或者多个原因说明，返回原因码不一定会返回原因说明。</p>
         */
        @NameInMap("ReasonDescList")
        public java.util.List<String> reasonDescList;

        public static GetSmsSignResponseBodySignIspRegisterDetailListRegisterStatusReasons build(java.util.Map<String, ?> map) throws Exception {
            GetSmsSignResponseBodySignIspRegisterDetailListRegisterStatusReasons self = new GetSmsSignResponseBodySignIspRegisterDetailListRegisterStatusReasons();
            return TeaModel.build(map, self);
        }

        public GetSmsSignResponseBodySignIspRegisterDetailListRegisterStatusReasons setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public GetSmsSignResponseBodySignIspRegisterDetailListRegisterStatusReasons setReasonDescList(java.util.List<String> reasonDescList) {
            this.reasonDescList = reasonDescList;
            return this;
        }
        public java.util.List<String> getReasonDescList() {
            return this.reasonDescList;
        }

    }

    public static class GetSmsSignResponseBodySignIspRegisterDetailList extends TeaModel {
        /**
         * <p>运营商类型。取值：</p>
         * <ul>
         * <li><strong>mobile</strong>：中国移动；</li>
         * <li><strong>unicom</strong>：中国联通；</li>
         * <li><strong>telecom</strong>：中国电信。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        @NameInMap("OperatorCode")
        public String operatorCode;

        /**
         * <p>运营商反馈时间，格式为yyyy-MM-dd HH:mm:ss。</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-13 15:55:26</p>
         */
        @NameInMap("OperatorCompleteTime")
        public String operatorCompleteTime;

        /**
         * <p>报备状态。取值：</p>
         * <ul>
         * <li><strong>0</strong>：报备失败，原因可能为资质信息与工信注册信息不一致或运营商侧无法支持等。建议您登录<a href="https://dysms.console.aliyun.com/domestic/text/sign">短信服务控制台</a>查看具体失败原因，并依据提示进行操作；</li>
         * <li><strong>1</strong>：已报备待验证，当前至少有一个子端口号运营商已返回报备通过，建议您少量多次向不同运营商手机号发送验证码、通知短信进行验证；</li>
         * <li><strong>2</strong>：报备失效，签名超过 6 个月无发送记录时，报备结果失效。如您需要重新启用该签名，请在<a href="https://dysms.console.aliyun.com/domestic/text/sign">短信服务控制台</a>重新发起报备；</li>
         * <li><strong>3</strong>：报备成功，当前至少有一个子端口号运营商已返回报备通过，经验证短信发送成功率符合预期，建议您持续关注发送成功率；</li>
         * <li><strong>-1</strong>：报备中，当前尚未收到运营商反馈的报备结果，建议您等待签名报备状态变更为“已报备待验证”后再批量发送，当前可少量多次尝试使用该签名发送，观察短信发送效果；</li>
         * <li><strong>-2</strong>：未报备，原因可能为当前签名未关联实名资质或关联资质信息不全，建议您修改当前资质或编辑签名绑定其他资质以重新发起报备。</li>
         * </ul>
         * <p>建议您单击查看<a href="https://help.aliyun.com/document_detail/2873145.html">更多签名实名制报备内容及建议操作</a>。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RegisterStatus")
        public Integer registerStatus;

        /**
         * <p>报备状态原因列表。</p>
         */
        @NameInMap("RegisterStatusReasons")
        public java.util.List<GetSmsSignResponseBodySignIspRegisterDetailListRegisterStatusReasons> registerStatusReasons;

        public static GetSmsSignResponseBodySignIspRegisterDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetSmsSignResponseBodySignIspRegisterDetailList self = new GetSmsSignResponseBodySignIspRegisterDetailList();
            return TeaModel.build(map, self);
        }

        public GetSmsSignResponseBodySignIspRegisterDetailList setOperatorCode(String operatorCode) {
            this.operatorCode = operatorCode;
            return this;
        }
        public String getOperatorCode() {
            return this.operatorCode;
        }

        public GetSmsSignResponseBodySignIspRegisterDetailList setOperatorCompleteTime(String operatorCompleteTime) {
            this.operatorCompleteTime = operatorCompleteTime;
            return this;
        }
        public String getOperatorCompleteTime() {
            return this.operatorCompleteTime;
        }

        public GetSmsSignResponseBodySignIspRegisterDetailList setRegisterStatus(Integer registerStatus) {
            this.registerStatus = registerStatus;
            return this;
        }
        public Integer getRegisterStatus() {
            return this.registerStatus;
        }

        public GetSmsSignResponseBodySignIspRegisterDetailList setRegisterStatusReasons(java.util.List<GetSmsSignResponseBodySignIspRegisterDetailListRegisterStatusReasons> registerStatusReasons) {
            this.registerStatusReasons = registerStatusReasons;
            return this;
        }
        public java.util.List<GetSmsSignResponseBodySignIspRegisterDetailListRegisterStatusReasons> getRegisterStatusReasons() {
            return this.registerStatusReasons;
        }

    }

}
