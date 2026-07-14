// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ArchiveChatappTemplateRequest extends TeaModel {
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
    public java.util.List<ArchiveChatappTemplateRequestTemplateList> templateList;

    public static ArchiveChatappTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ArchiveChatappTemplateRequest self = new ArchiveChatappTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ArchiveChatappTemplateRequest setArchiveType(String archiveType) {
        this.archiveType = archiveType;
        return this;
    }
    public String getArchiveType() {
        return this.archiveType;
    }

    public ArchiveChatappTemplateRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ArchiveChatappTemplateRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ArchiveChatappTemplateRequest setTemplateList(java.util.List<ArchiveChatappTemplateRequestTemplateList> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<ArchiveChatappTemplateRequestTemplateList> getTemplateList() {
        return this.templateList;
    }

    public static class ArchiveChatappTemplateRequestTemplateList extends TeaModel {
        /**
         * <p>The template language. For detailed language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh_CN</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The template code. You can view the template code on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Template Design</strong> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>939938****</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static ArchiveChatappTemplateRequestTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ArchiveChatappTemplateRequestTemplateList self = new ArchiveChatappTemplateRequestTemplateList();
            return TeaModel.build(map, self);
        }

        public ArchiveChatappTemplateRequestTemplateList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ArchiveChatappTemplateRequestTemplateList setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

}
