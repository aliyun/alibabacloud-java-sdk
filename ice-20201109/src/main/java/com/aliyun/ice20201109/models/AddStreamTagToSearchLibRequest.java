// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddStreamTagToSearchLibRequest extends TeaModel {
    /**
     * <p>The ID of the media asset.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>b48fb04483915d4f2cd8</strong></strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The message body.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;startTime&quot;:1657684600793,&quot;endTime&quot;:1657684600793,&quot;userData&quot;:&quot;{}&quot;}</p>
     */
    @NameInMap("MsgBody")
    public String msgBody;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>name-1</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The search library.</p>
     * 
     * <strong>example:</strong>
     * <p>Stream_xxx</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    public static AddStreamTagToSearchLibRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStreamTagToSearchLibRequest self = new AddStreamTagToSearchLibRequest();
        return TeaModel.build(map, self);
    }

    public AddStreamTagToSearchLibRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public AddStreamTagToSearchLibRequest setMsgBody(String msgBody) {
        this.msgBody = msgBody;
        return this;
    }
    public String getMsgBody() {
        return this.msgBody;
    }

    public AddStreamTagToSearchLibRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AddStreamTagToSearchLibRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
