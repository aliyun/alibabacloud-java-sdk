// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateNoteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Paragraph")
    public String paragraph;

    public static CreateNoteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNoteResponseBody self = new CreateNoteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNoteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNoteResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateNoteResponseBody setParagraph(String paragraph) {
        this.paragraph = paragraph;
        return this;
    }
    public String getParagraph() {
        return this.paragraph;
    }

}
