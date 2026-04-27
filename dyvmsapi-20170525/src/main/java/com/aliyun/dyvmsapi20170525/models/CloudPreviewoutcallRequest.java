// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudPreviewoutcallRequest extends TeaModel {
    /**
     * <p>备用外呼号码；tel没呼通时呼叫备用号码，最多支持5个号码，多个之间用逗号分隔</p>
     * 
     * <strong>example:</strong>
     * <p>41008502</p>
     */
    @NameInMap("BackupTels")
    public String backupTels;

    /**
     * <p>通道变量可以在以下场景中使用：1. 事件推送，作为推送字段使用2. 通话记录中，将字段存储在自定义字段3. 通过SIP-Header方式将字段传到呼叫的下游链路格式如: [{&quot;name&quot;:&quot;mainUniqueId&quot;,&quot;value&quot;:&quot;cdr_main_unique_id&quot;,&quot;type&quot;:&quot;2&quot;},{&quot;name&quot;:&quot;callType&quot;,&quot;value&quot;:&quot;cdr_call_type&quot;,&quot;type&quot;:&quot;2&quot;}]name：变量名称value：变量值type：变量类型，1.普通变量 2.PJSIP_HEADER变量（用于将变量通过SIP-Header方式传到客户侧，最多支持5个）</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;mainUniqueId&quot;,&quot;value&quot;:&quot;cdr_main_unique_id&quot;,&quot;type&quot;:&quot;2&quot;},{&quot;name&quot;:&quot;callType&quot;,&quot;value&quot;:&quot;cdr_call_type&quot;,&quot;type&quot;:&quot;2&quot;}]</p>
     */
    @NameInMap("CallVariables")
    public String callVariables;

    /**
     * <p>此次通话录音是否进行ASR转写；0.不进行 1.进行 默认：1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CdrIsAsr")
    public Long cdrIsAsr;

    /**
     * <p>外显号码集合, 格式如: [{&quot;clid&quot;:&quot;1708587xxxx&quot;,&quot;priority&quot;:1},{&quot;clid&quot;:&quot;1304412xxxx&quot;,&quot;priority&quot;:2},{&quot;clid&quot;:&quot;0107990xxxx&quot;,&quot;priority&quot;:3}] clid：外显号码（String类型）（必填）priority：优先级（Integer类型）（非必填） 特别说明： 一次呼叫最多允许传10个指定号码；若指定了号码优先级，要求所有传入的号码都必传</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;clid&quot;:&quot;1708587xxxx&quot;,&quot;priority&quot;:1},{&quot;clid&quot;:&quot;1304412xxxx&quot;,&quot;priority&quot;:2},{&quot;clid&quot;:&quot;0107990xxxx&quot;,&quot;priority&quot;:3}]</p>
     */
    @NameInMap("ClidList")
    public String clidList;

    /**
     * <p>座席工号；3-10位数字</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("Cno")
    public String cno;

    /**
     * <p>外显导航标识</p>
     * 
     * <strong>example:</strong>
     * <p>12333</p>
     */
    @NameInMap("CrnId")
    public String crnId;

    /**
     * <p>呼叫客户侧超时时间；取值范围 5&lt;=dialTelTimeout&lt;=60，默认45(单位:s)</p>
     * 
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("DialTelTimeout")
    public Long dialTelTimeout;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>是否满意度调查；0.不进行满意度调查 1.进行满意度调查，默认：取企业配置</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsInvestigation")
    public Long isInvestigation;

    /**
     * <p>可传入企业中继号码或设置好的客户侧外显号码</p>
     * 
     * <strong>example:</strong>
     * <p>41008502</p>
     */
    @NameInMap("ObClid")
    public String obClid;

    /**
     * <p>指定外显区号；传入区号，在指定区号下外显号码；如果obClid和obClidAreaCode都传的情况下，按照obClid外显</p>
     * 
     * <strong>example:</strong>
     * <p>010</p>
     */
    @NameInMap("ObClidAreaCode")
    public String obClidAreaCode;

    /**
     * <p>客户侧外显号码组；使用clidGroup需要账号支持按标识路由，使用此参数时clid参数无效</p>
     * 
     * <strong>example:</strong>
     * <p>333</p>
     */
    @NameInMap("ObClidGroup")
    public String obClidGroup;

    /**
     * <p>请求唯一id；取值：如果没有传入值则系统会生产。如果是加密的号码，需要URLEncode后传入</p>
     * 
     * <strong>example:</strong>
     * <p>req1234567</p>
     */
    @NameInMap("RequestUniqueId")
    public String requestUniqueId;

    /**
     * <p>需要进行呼叫的客户方电话号码，固话带区号，手机不加0。 当开启号码隐藏设置时，可从弹屏事件中获取customerNumberKey的值，进行外呼；<a href="../%E5%AD%97%E6%AE%B5%E5%AE%9A%E4%B9%89/%E6%8E%A5%E5%8F%A3%E9%83%A8%E5%88%86/%E5%8A%A0%E5%AF%86%E5%A4%96%E5%91%BC%E5%8F%B7%E7%A0%81%E5%8A%A0%E5%AF%86%E8%A7%84%E5%88%99.md">加密外呼</a>；如果是加密的号码，需要URLEncode后传入；当外呼相关配置-支持分机号外呼开启后，此字段可支持传手机号-分机号格式</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1774821736</p>
     */
    @NameInMap("Tel")
    public String tel;

    /**
     * <p>呼叫座席侧超时时间；取值范围 5&lt;=timeout&lt;=60，默认30(单位:s)</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    public static CloudPreviewoutcallRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudPreviewoutcallRequest self = new CloudPreviewoutcallRequest();
        return TeaModel.build(map, self);
    }

    public CloudPreviewoutcallRequest setBackupTels(String backupTels) {
        this.backupTels = backupTels;
        return this;
    }
    public String getBackupTels() {
        return this.backupTels;
    }

    public CloudPreviewoutcallRequest setCallVariables(String callVariables) {
        this.callVariables = callVariables;
        return this;
    }
    public String getCallVariables() {
        return this.callVariables;
    }

    public CloudPreviewoutcallRequest setCdrIsAsr(Long cdrIsAsr) {
        this.cdrIsAsr = cdrIsAsr;
        return this;
    }
    public Long getCdrIsAsr() {
        return this.cdrIsAsr;
    }

    public CloudPreviewoutcallRequest setClidList(String clidList) {
        this.clidList = clidList;
        return this;
    }
    public String getClidList() {
        return this.clidList;
    }

    public CloudPreviewoutcallRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public CloudPreviewoutcallRequest setCrnId(String crnId) {
        this.crnId = crnId;
        return this;
    }
    public String getCrnId() {
        return this.crnId;
    }

    public CloudPreviewoutcallRequest setDialTelTimeout(Long dialTelTimeout) {
        this.dialTelTimeout = dialTelTimeout;
        return this;
    }
    public Long getDialTelTimeout() {
        return this.dialTelTimeout;
    }

    public CloudPreviewoutcallRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudPreviewoutcallRequest setIsInvestigation(Long isInvestigation) {
        this.isInvestigation = isInvestigation;
        return this;
    }
    public Long getIsInvestigation() {
        return this.isInvestigation;
    }

    public CloudPreviewoutcallRequest setObClid(String obClid) {
        this.obClid = obClid;
        return this;
    }
    public String getObClid() {
        return this.obClid;
    }

    public CloudPreviewoutcallRequest setObClidAreaCode(String obClidAreaCode) {
        this.obClidAreaCode = obClidAreaCode;
        return this;
    }
    public String getObClidAreaCode() {
        return this.obClidAreaCode;
    }

    public CloudPreviewoutcallRequest setObClidGroup(String obClidGroup) {
        this.obClidGroup = obClidGroup;
        return this;
    }
    public String getObClidGroup() {
        return this.obClidGroup;
    }

    public CloudPreviewoutcallRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public CloudPreviewoutcallRequest setTel(String tel) {
        this.tel = tel;
        return this;
    }
    public String getTel() {
        return this.tel;
    }

    public CloudPreviewoutcallRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
