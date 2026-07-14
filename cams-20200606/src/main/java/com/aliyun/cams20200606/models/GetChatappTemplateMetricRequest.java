// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateMetricRequest extends TeaModel {
    /**
     * <p>The space ID or instance ID of the ISV sub-customer, which is also the channel ID. You can view it on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a> interface.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-************</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The end time of the query. This value is a timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1693407714687</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The metric granularity. Valid values:</p>
     * <ul>
     * <li>DAILY: collects metrics on a daily basis.</li>
     * <li>HALF_HOUR: collects metrics every half hour.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DAILY</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The ISV verification code, which is used to verify whether the RAM user is authorized by the ISV.</p>
     * 
     * <strong>example:</strong>
     * <p>skdi3kksloslikd****</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The template language. For more languages, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time of the query. This value is a timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1693107714687</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>The template code. You can view the template code on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Template Design</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1100***************</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The templatetype. Valid values:</p>
     * <ul>
     * <li>WHATSAPP</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the default value is WHATSAPP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static GetChatappTemplateMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatappTemplateMetricRequest self = new GetChatappTemplateMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetChatappTemplateMetricRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetChatappTemplateMetricRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetChatappTemplateMetricRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public GetChatappTemplateMetricRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public GetChatappTemplateMetricRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetChatappTemplateMetricRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetChatappTemplateMetricRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetChatappTemplateMetricRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetChatappTemplateMetricRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public GetChatappTemplateMetricRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public GetChatappTemplateMetricRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
