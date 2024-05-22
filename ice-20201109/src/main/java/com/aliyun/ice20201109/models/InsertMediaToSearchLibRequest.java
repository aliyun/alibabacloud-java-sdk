// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class InsertMediaToSearchLibRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String input;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("MsgBody")
    public String msgBody;

    @NameInMap("SearchLibName")
    public String searchLibName;

    public static InsertMediaToSearchLibRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertMediaToSearchLibRequest self = new InsertMediaToSearchLibRequest();
        return TeaModel.build(map, self);
    }

    public InsertMediaToSearchLibRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public InsertMediaToSearchLibRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public InsertMediaToSearchLibRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public InsertMediaToSearchLibRequest setMsgBody(String msgBody) {
        this.msgBody = msgBody;
        return this;
    }
    public String getMsgBody() {
        return this.msgBody;
    }

    public InsertMediaToSearchLibRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
