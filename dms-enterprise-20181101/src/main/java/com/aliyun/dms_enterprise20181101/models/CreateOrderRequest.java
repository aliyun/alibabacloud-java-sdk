// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("PluginParam")
    public java.util.Map<String, ?> pluginParam;

    @NameInMap("RelatedUserList")
    public String relatedUserList;

    @NameInMap("PluginType")
    public String pluginType;

    @NameInMap("AttachmentKey")
    public String attachmentKey;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public CreateOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateOrderRequest setPluginParam(java.util.Map<String, ?> pluginParam) {
        this.pluginParam = pluginParam;
        return this;
    }
    public java.util.Map<String, ?> getPluginParam() {
        return this.pluginParam;
    }

    public CreateOrderRequest setRelatedUserList(String relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public String getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateOrderRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public CreateOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

}
