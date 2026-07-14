// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ArchiveChatappTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The archive type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ARCHIVED</p>
     */
    @NameInMap("ArchiveType")
    public String archiveType;

    /**
     * <p>The channel type. Valid values:</p>
     * <ul>
     * <li><strong>WHATSAPP</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>Only the WhatsApp channel type is supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The space ID of the ISV sub-customer or the instance ID of the direct customer. You can view the Space ID on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The template list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateList")
    public String templateListShrink;

    public static ArchiveChatappTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ArchiveChatappTemplateShrinkRequest self = new ArchiveChatappTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ArchiveChatappTemplateShrinkRequest setArchiveType(String archiveType) {
        this.archiveType = archiveType;
        return this;
    }
    public String getArchiveType() {
        return this.archiveType;
    }

    public ArchiveChatappTemplateShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ArchiveChatappTemplateShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ArchiveChatappTemplateShrinkRequest setTemplateListShrink(String templateListShrink) {
        this.templateListShrink = templateListShrink;
        return this;
    }
    public String getTemplateListShrink() {
        return this.templateListShrink;
    }

}
