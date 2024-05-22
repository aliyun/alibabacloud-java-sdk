// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaFromSearchLibRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MsgBody")
    public String msgBody;

    @NameInMap("SearchLibName")
    public String searchLibName;

    public static DeleteMediaFromSearchLibRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaFromSearchLibRequest self = new DeleteMediaFromSearchLibRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMediaFromSearchLibRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public DeleteMediaFromSearchLibRequest setMsgBody(String msgBody) {
        this.msgBody = msgBody;
        return this;
    }
    public String getMsgBody() {
        return this.msgBody;
    }

    public DeleteMediaFromSearchLibRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
