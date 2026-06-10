// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GenerateUserAccessTokenRequest extends TeaModel {
    /**
     * <p>The key of the business space. If you do not specify this parameter, the system accesses the default business space. You can obtain the key from the Business Management page of your main account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The user\&quot;s email address.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>This parameter is reserved. You do not need to specify it.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>Additional information formatted as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;xx&quot;: 123,
     *     &quot;yy&quot;: 22332,
     *     &quot;customerNameCard&quot;: [
     *         {
     *             &quot;key&quot;: &quot;姓名&quot;,
     *             &quot;value&quot;: &quot;张三&quot;
     *         },
     *         {
     *             &quot;key&quot;: &quot;等级&quot;,
     *             &quot;value&quot;: &quot;v2&quot;
     *         },
     *         {
     *             &quot;key&quot;: &quot;联系方式&quot;,
     *             &quot;value&quot;: &quot;123&quot;
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <p>The external user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8882022040000000171</p>
     */
    @NameInMap("ForeignId")
    public String foreignId;

    /**
     * <p>The visitor\&quot;s nickname.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("Nick")
    public String nick;

    /**
     * <p>The user\&quot;s telephone number.</p>
     */
    @NameInMap("Telephone")
    public String telephone;

    public static GenerateUserAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUserAccessTokenRequest self = new GenerateUserAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUserAccessTokenRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GenerateUserAccessTokenRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GenerateUserAccessTokenRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public GenerateUserAccessTokenRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public GenerateUserAccessTokenRequest setForeignId(String foreignId) {
        this.foreignId = foreignId;
        return this;
    }
    public String getForeignId() {
        return this.foreignId;
    }

    public GenerateUserAccessTokenRequest setNick(String nick) {
        this.nick = nick;
        return this;
    }
    public String getNick() {
        return this.nick;
    }

    public GenerateUserAccessTokenRequest setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

}
