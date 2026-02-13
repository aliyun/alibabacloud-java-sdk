// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatDocumentPageNum extends TeaModel {
    /**
     * <p>Page numbers of related documents.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("num")
    public Integer num;

    /**
     * <p>Location information of the document.</p>
     */
    @NameInMap("pos")
    public java.util.List<java.util.List<ChatRefDocPostion>> pos;

    public static ChatDocumentPageNum build(java.util.Map<String, ?> map) throws Exception {
        ChatDocumentPageNum self = new ChatDocumentPageNum();
        return TeaModel.build(map, self);
    }

    public ChatDocumentPageNum setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ChatDocumentPageNum setPos(java.util.List<java.util.List<ChatRefDocPostion>> pos) {
        this.pos = pos;
        return this;
    }
    public java.util.List<java.util.List<ChatRefDocPostion>> getPos() {
        return this.pos;
    }

}
