// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudWebcallRequest extends TeaModel {
    /**
     * <p>是否开启amd；自动应答检查（传真机等），1.开启 0.不开启 默认为0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Amd")
    public Long amd;

    /**
     * <p>可传入企业中继号码或设置好的客户侧外显号码</p>
     * 
     * <strong>example:</strong>
     * <p>41008502</p>
     */
    @NameInMap("Clid")
    public String clid;

    /**
     * <p>客户侧外显指定地区号码，优先级低于clid</p>
     * 
     * <strong>example:</strong>
     * <p>010</p>
     */
    @NameInMap("ClidAreaCode")
    public String clidAreaCode;

    /**
     * <p>客户侧外显号码组；使用clidGroup需要账号支持按标识路由，优先级低于clid</p>
     * 
     * <strong>example:</strong>
     * <p>clidGroup</p>
     */
    @NameInMap("ClidGroup")
    public String clidGroup;

    /**
     * <p>指定本次外呼使用的客户侧外显号码集合，系统将根据号码调度策略选择可用号码进行外呼</p>
     * 
     * <strong>example:</strong>
     * <p>41008502</p>
     */
    @NameInMap("ClidList")
    public String clidList;

    /**
     * <p>外显导航标识</p>
     * 
     * <strong>example:</strong>
     * <p>33</p>
     */
    @NameInMap("CrnId")
    public String crnId;

    /**
     * <p>延迟时长；秒数，延迟多少秒呼叫 参数取值范围：0&lt;=delay&lt;=60 默认为0</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Delay")
    public Long delay;

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
     * <p>过期时间，精确到s，yyyy-MM-dd HH:mm:ss</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-20 10:00:00</p>
     */
    @NameInMap("ExpirTime")
    public String expirTime;

    /**
     * <p>回呼接通后进入的ivrId；如果不传此参数，使用后台配置的ivr</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("IvrId")
    public Long ivrId;

    /**
     * <p>多号码时呼叫延时；tel多个号码时，号码之间的呼叫延迟，最大120秒，默认0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MultiTelDelay")
    public Long multiTelDelay;

    /**
     * <p>多号码，是否每个号码呼叫都挂机推送；取值说明 0：只挂机推送一次； 1：每次呼叫都触发挂机推送；默认0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MultiTelPush")
    public Long multiTelPush;

    /**
     * <p>请求唯一标识；说明：长度不超过300个字节。1个汉字是3字节。此字段保存到通话记录requestUniqueId字段，后续接口查询使用。一次接口请求造成的多次呼叫requestUniqueId相同；如果是加密的号码，需要URLEncode后传入</p>
     * 
     * <strong>example:</strong>
     * <p>requset12345</p>
     */
    @NameInMap("RequestUniqueId")
    public String requestUniqueId;

    /**
     * <p>重试次数；最大5次，使用的企业需要开启webcall自动重试开关</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Retry")
    public Long retry;

    /**
     * <p>重试间隔，单位分钟，最小0分钟，最大59分钟</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RetryInterval")
    public Long retryInterval;

    /**
     * <p>电话号码；固话带区号，手机不加0；固话带分机的以\&quot;-\&quot;分隔；支持多个号码，多个直接用英文逗号’,’分隔；传多个号码时，若前面的号码没接通则会呼叫后面的号码，若接通则不会呼叫；<a href="../%E5%AD%97%E6%AE%B5%E5%AE%9A%E4%B9%89/%E6%8E%A5%E5%8F%A3%E9%83%A8%E5%88%86/%E5%8A%A0%E5%AF%86%E5%A4%96%E5%91%BC%E5%8F%B7%E7%A0%81%E5%8A%A0%E5%AF%86%E8%A7%84%E5%88%99.md">加密外呼</a>；如果是加密的号码，需要URLEncode后传入</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13312345678</p>
     */
    @NameInMap("Tel")
    public String tel;

    /**
     * <p>呼叫客户超时时间；说明：参数取值范围 0&lt;=timeout&lt;=60；不传入，默认30(单位:s)</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>用户自定义字段；说明：长度不超过250个字节。1个汉字是3字节。此字段保存到通话记录userField字段，后续接口查询使用。该字段需“动态附带参数”paramNames有值时方可生效。</p>
     * 
     * <strong>example:</strong>
     * <p>UserField</p>
     */
    @NameInMap("UserField")
    public String userField;

    /**
     * <p>用哪种语言播放ivr提示音；1.普通话 2.粤语 4.标贝TTS 5.普通话-甜美女音 默认为1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Vid")
    public String vid;

    public static CloudWebcallRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudWebcallRequest self = new CloudWebcallRequest();
        return TeaModel.build(map, self);
    }

    public CloudWebcallRequest setAmd(Long amd) {
        this.amd = amd;
        return this;
    }
    public Long getAmd() {
        return this.amd;
    }

    public CloudWebcallRequest setClid(String clid) {
        this.clid = clid;
        return this;
    }
    public String getClid() {
        return this.clid;
    }

    public CloudWebcallRequest setClidAreaCode(String clidAreaCode) {
        this.clidAreaCode = clidAreaCode;
        return this;
    }
    public String getClidAreaCode() {
        return this.clidAreaCode;
    }

    public CloudWebcallRequest setClidGroup(String clidGroup) {
        this.clidGroup = clidGroup;
        return this;
    }
    public String getClidGroup() {
        return this.clidGroup;
    }

    public CloudWebcallRequest setClidList(String clidList) {
        this.clidList = clidList;
        return this;
    }
    public String getClidList() {
        return this.clidList;
    }

    public CloudWebcallRequest setCrnId(String crnId) {
        this.crnId = crnId;
        return this;
    }
    public String getCrnId() {
        return this.crnId;
    }

    public CloudWebcallRequest setDelay(Long delay) {
        this.delay = delay;
        return this;
    }
    public Long getDelay() {
        return this.delay;
    }

    public CloudWebcallRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudWebcallRequest setExpirTime(String expirTime) {
        this.expirTime = expirTime;
        return this;
    }
    public String getExpirTime() {
        return this.expirTime;
    }

    public CloudWebcallRequest setIvrId(Long ivrId) {
        this.ivrId = ivrId;
        return this;
    }
    public Long getIvrId() {
        return this.ivrId;
    }

    public CloudWebcallRequest setMultiTelDelay(Long multiTelDelay) {
        this.multiTelDelay = multiTelDelay;
        return this;
    }
    public Long getMultiTelDelay() {
        return this.multiTelDelay;
    }

    public CloudWebcallRequest setMultiTelPush(Long multiTelPush) {
        this.multiTelPush = multiTelPush;
        return this;
    }
    public Long getMultiTelPush() {
        return this.multiTelPush;
    }

    public CloudWebcallRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public CloudWebcallRequest setRetry(Long retry) {
        this.retry = retry;
        return this;
    }
    public Long getRetry() {
        return this.retry;
    }

    public CloudWebcallRequest setRetryInterval(Long retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Long getRetryInterval() {
        return this.retryInterval;
    }

    public CloudWebcallRequest setTel(String tel) {
        this.tel = tel;
        return this;
    }
    public String getTel() {
        return this.tel;
    }

    public CloudWebcallRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public CloudWebcallRequest setUserField(String userField) {
        this.userField = userField;
        return this;
    }
    public String getUserField() {
        return this.userField;
    }

    public CloudWebcallRequest setVid(String vid) {
        this.vid = vid;
        return this;
    }
    public String getVid() {
        return this.vid;
    }

}
