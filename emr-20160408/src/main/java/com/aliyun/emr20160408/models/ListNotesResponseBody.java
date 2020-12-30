// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListNotesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Notes")
    public ListNotesResponseBodyNotes notes;

    public static ListNotesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNotesResponseBody self = new ListNotesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNotesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNotesResponseBody setNotes(ListNotesResponseBodyNotes notes) {
        this.notes = notes;
        return this;
    }
    public ListNotesResponseBodyNotes getNotes() {
        return this.notes;
    }

    public static class ListNotesResponseBodyNotesNoteInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListNotesResponseBodyNotesNoteInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNotesResponseBodyNotesNoteInfo self = new ListNotesResponseBodyNotesNoteInfo();
            return TeaModel.build(map, self);
        }

        public ListNotesResponseBodyNotesNoteInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListNotesResponseBodyNotesNoteInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNotesResponseBodyNotesNoteInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListNotesResponseBodyNotes extends TeaModel {
        @NameInMap("NoteInfo")
        public java.util.List<ListNotesResponseBodyNotesNoteInfo> noteInfo;

        public static ListNotesResponseBodyNotes build(java.util.Map<String, ?> map) throws Exception {
            ListNotesResponseBodyNotes self = new ListNotesResponseBodyNotes();
            return TeaModel.build(map, self);
        }

        public ListNotesResponseBodyNotes setNoteInfo(java.util.List<ListNotesResponseBodyNotesNoteInfo> noteInfo) {
            this.noteInfo = noteInfo;
            return this;
        }
        public java.util.List<ListNotesResponseBodyNotesNoteInfo> getNoteInfo() {
            return this.noteInfo;
        }

    }

}
