// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class CustomerNoteListDetailRequest extends TeaModel {
    @NameInMap("NoteId")
    public Long noteId;

    public static CustomerNoteListDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomerNoteListDetailRequest self = new CustomerNoteListDetailRequest();
        return TeaModel.build(map, self);
    }

    public CustomerNoteListDetailRequest setNoteId(Long noteId) {
        this.noteId = noteId;
        return this;
    }
    public Long getNoteId() {
        return this.noteId;
    }

}
