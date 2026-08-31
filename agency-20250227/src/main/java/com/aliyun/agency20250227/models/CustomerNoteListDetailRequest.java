// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class CustomerNoteListDetailRequest extends TeaModel {
    /**
     * <p>The note ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1620737</p>
     */
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
