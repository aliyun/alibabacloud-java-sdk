// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaToSearchLibRequest extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MsgBody")
    public String msgBody;

    @NameInMap("SearchLibName")
    public String searchLibName;

    public static UpdateMediaToSearchLibRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaToSearchLibRequest self = new UpdateMediaToSearchLibRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaToSearchLibRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UpdateMediaToSearchLibRequest setMsgBody(String msgBody) {
        this.msgBody = msgBody;
        return this;
    }
    public String getMsgBody() {
        return this.msgBody;
    }

    public UpdateMediaToSearchLibRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
